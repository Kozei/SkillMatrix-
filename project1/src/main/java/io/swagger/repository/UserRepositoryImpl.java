package io.swagger.repository;

import io.swagger.dao.DepartmentDao;
import io.swagger.dao.JobTitleDao;
import io.swagger.dao.UserDao;
import io.swagger.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserDao userDao;

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private JobTitleDao jobTitleDao;

    @Autowired
    private SkillRepository skillRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public List<User> retrieveAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User addUser(User user) {
        List<UserSkill> userSkillsList=user.getSkills();
        for(UserSkill i:userSkillsList){
            if(skillRepository.getSkillById(i.getSkill().getSkillId() )!= null && (categoryRepository.getCategoryById(i.getCategory().getCategoryId()) !=null)){

                i.setSkill(skillRepository.getSkillById(i.getSkill().getSkillId()));
                i.setCategory(categoryRepository.getCategoryById(i.getCategory().getCategoryId()));
            }
            else{
                return null;
            }
        }

        Department existingDepartment = departmentDao.findById(user.getDeparment().getDepartmentId())
                .orElse(null);
        user.setDeparment(existingDepartment);

        JobTitle existingJobTitle = jobTitleDao.findById(user.getJobTitle().getJobTitleId())
                .orElse(null);
        user.setJobTitle(existingJobTitle);

        return userDao.save(user);
        //int userSize = FakeUserRepository.users.size();
        //user.setUserId((long) userSize);
    }

    @Override
    public void deleteUserById(Integer userId) {
        FakeUserRepository.users.removeIf(user -> Objects.equals(user.getUserId(), userId));

    }

    @Override
    public User addSkillsToUser(Integer userId, List<SkillInput> skillInputList) {

        User user = null;
        Skill skill = null;
        Category category = null;

        for (SkillInput skillInput : skillInputList) {
            for (Skill mockSkill : FakeUserRepository.skillList) {
                if (skillInput.getSkillId().equals(mockSkill.getSkillId())) {
                    skill = mockSkill;
                }
            }
            for (Category mockCategory : FakeUserRepository.categoryList) {
                if (skillInput.getCategoryId().equals(mockCategory.getCategoryId())) {
                    category = mockCategory;
                }
            }

            UserSkill userSkillToAdd = new UserSkill(skillInput.getSkillLevel(), skill, category);

            for (User userObject : FakeUserRepository.users) {
                if (userObject.getUserId().equals(userId)) {
                    for (UserSkill skillObject : userObject.getSkills()) {
                        if (Objects.equals(skillObject.getSkill().getSkillId(), userSkillToAdd.getSkill().getSkillId())) {
                            return userObject;
                        }
                    }
                    userObject.getSkills().add(userSkillToAdd);
                    user = userObject;
                }
            }
        }
        return user;
    }

    @Override
    public User updateUserSkill(Integer userId, List<SkillInput> skillInputList) {

        int index = -1;
        Skill skillToUpdate = null;
        Category categoryToUpdate = null;
        User userToReturn = null;

        //if user exist
        Optional<User> userToUpdateOptional = FakeUserRepository.users.stream().filter(user -> user.getUserId().equals(userId)).findFirst();

        if (!userToUpdateOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        User userToUpdate = userToUpdateOptional.get();

        for (SkillInput skillInput : skillInputList) {
            for (UserSkill userSkill : userToUpdate.getSkills()) {
                //if skill exist in the user
                if (Objects.equals(userSkill.getSkill().getSkillId(), skillInput.getSkillId())) {
                    List<Skill> skillToUpdateOptionalList = FakeUserRepository.skillList.stream()
                            .filter(skill -> skill.getSkillId().equals(skillInput.getSkillId())).collect(Collectors.toList());
                    skillToUpdate = skillToUpdateOptionalList.get(0);

                    List<Category> categoryToUpdateList = FakeUserRepository.categoryList.stream().filter(categoryItem -> categoryItem.getCategoryId().equals(skillInput.getCategoryId()))
                            .collect(Collectors.toList());
                    categoryToUpdate = categoryToUpdateList.get(0);
                }
            }

            //Construct a new userSkill to replace the old
            UserSkill userSkillToUpdate = new UserSkill(skillInput.getSkillLevel(), skillToUpdate, categoryToUpdate);

            for (User userObject : FakeUserRepository.users) {
                if (userObject.getUserId().equals(userId)) {
                    for (UserSkill userSkill : userObject.getSkills()) {
                        index++;
                        if (userSkill.getSkill().getSkillId().equals(skillInput.getSkillId())) {

                            userObject.getSkills().set(index, userSkillToUpdate);
                            userToReturn = userObject;
                        }
                    }
                }
            }
        }
        return userToReturn;
    }

    @Override
    public void deleteUserSkillById(Integer userId, Integer skillId) {

        //if user exist
        Optional<User> userToUpdateOptional = FakeUserRepository.users.stream().filter(user -> user.getUserId().equals(userId)).findFirst();

        if (!userToUpdateOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        FakeUserRepository.users.forEach(user -> user.getSkills().removeIf(userSkill -> userSkill.getSkill().getSkillId().equals(skillId)));

    }

    @Override
    public List<User> findUserBySkill(List<String> inputSkill) {

        List<User> filteredUsers = new ArrayList<>();

        List<UserSkill> matchedUserSkills = new ArrayList<>();

        for (User user : FakeUserRepository.users) {
            matchedUserSkills = user.getSkills().stream()
                    .filter(skill -> inputSkill.stream()
                            .anyMatch(skillName -> skillName.equalsIgnoreCase(skill.getSkill().getSkillName())))
                    .collect(Collectors.toList());

            if (matchedUserSkills.size() == inputSkill.size()) {
                filteredUsers.add(user);
            }
        }
        System.out.println(matchedUserSkills);

        return filteredUsers;
    }

    @Override
    public List<LanguageInput> addUserLanguage(Integer userId, List<LanguageInput> languageInputList) {

        Language language = null;

        for (LanguageInput languageInput : languageInputList) {
            for (Language mockLanguage : FakeUserRepository.languageList) {
                if (languageInput.getLanguageId().equals(mockLanguage.getLanguageId())) {
                    language = mockLanguage;
                }
            }

            UserLanguage userLanguageToAdd = new UserLanguage(languageInput.getLanguageLevel(), language);

            for (User user : FakeUserRepository.users) {
                if (user.getUserId().equals(userId)) {
                    user.getLanguages().add(userLanguageToAdd);
                }
            }

        }
        return languageInputList;
    }
}
