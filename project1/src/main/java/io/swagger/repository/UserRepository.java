package io.swagger.repository;

import io.swagger.model.LanguageInput;
import io.swagger.model.SkillInput;
import io.swagger.model.User;

import java.util.List;

public interface UserRepository {

    List<User> retrieveAllUsers();

    User addUser(User user);

    void deleteUserById(Integer userId);

    User addSkillsToUser(Integer userId, List<SkillInput> skillInputList);

    List<User> findUserBySkill(List<String> inputSkill);

    void deleteUserSkillById(Integer userId, Integer skillId);

    List<LanguageInput> addUserLanguage(Integer userId, List<LanguageInput> languageInputList);

    User updateUserSkill(Integer userId, List<SkillInput> skillInputList);
}
