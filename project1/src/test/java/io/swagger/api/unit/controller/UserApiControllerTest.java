package io.swagger.api.unit.controller;

import io.swagger.api.UserApiController;
import io.swagger.repository.FakeUserRepository;
import io.swagger.model.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/*DOCUMENTATION
*
* This file contains 4 tests in the following order:
*
* 1. postEndpoint_itShouldAdd_nonExistingSkill_toUser_successfully(): This test case guarantees that when you add a skill
*    to the user, the skill is in fact being added. The logic that gives this assurance is that the number of skills a user has
*    after adding one skill should be equal to the number of skills a user has before adding that skill +1.
*
* 2. postEndpoint_itShouldNot_Add_anAlreadyExistingSkill_toUser(): This test case guarantees that when you add a skill
*    to a user that already has that skill, the skill will not be added. The logic that provides this assurance is that
*    the number of skills a user has before and after the addition of a skill must be equal.
*
* 3. getEndpoint_itShouldFindUsers_withCertainSkillSet_successfully(): This test case guarantees that when you try to find
*    a user that has certain skill-set, that you in fact get the user who satisfies your searching condition. In this case
*    find by skill.

* 4. putEndpoint_itShouldModifyTheSkillLevel_ofUser_successfully(): This test case guarantees that when you modify the
     skill proficiency of a user, the proficiency is in fact being modified.
*
* For these test cases, we are using the user with userId 1 who is the first object in a list of users. This list of users
* is located in the FakeUserRepository class. Every object that collaborates with user object is in the FakeUserRepository
* class. To better understand the Database simulation, see FakeUserRepository class which is located in a package named repository.
*
* */


@WebMvcTest(UserApiController.class)
public class UserApiControllerTest {

    @Autowired
    UserApiController userApiController;

    @Test
    public void postEndpoint_itShouldAdd_nonExistingSkill_toUser_successfully() {

       /* The user you want to add skills to.
        This user is pre-loaded in the list of users in-memory database. See Database class*/
        int userId = 1;
        Optional<User> user = FakeUserRepository.users.stream().filter(u-> u.getUserId()==userId).findFirst();

        int numberOfSkillsBeforeAdd = user.get().getSkills().size();
        int expectedNumberOfSkillsAfterAdd = numberOfSkillsBeforeAdd + 1;

        //Skills you want to add to the user.
        List<SkillInput> skillInputList = new ArrayList<>();
        SkillInput skillInput = new SkillInput(8, 1, 1);
        skillInputList.add(skillInput);

        //call the method that will add the skills to the user with userId 1 and pass the skills you want.
        ResponseEntity<User> actualReturnedUser = userApiController.addUserSkill(1, skillInputList);
        int actualNumberOfSkills = Objects.requireNonNull(actualReturnedUser.getBody()).getSkills().size();
        actualReturnedUser.getStatusCode();

        assertEquals(expectedNumberOfSkillsAfterAdd, actualNumberOfSkills);
    }

    @Test
    public void postEndpoint_itShouldNot_Add_anAlreadyExistingSkill_toUser(){

        /* The user you want to add skills to.
        This user is pre-loaded in the list of users in-memory database. See Database class*/
        int userId = 1;
        Optional<User> user = FakeUserRepository.users.stream().filter(u-> u.getUserId()==userId).findFirst();

        int numberOfSkillsBeforeAdd = user.get().getSkills().size();

        //Skills you want to add to the user.
        List<SkillInput> skillInputList = new ArrayList<>();
        SkillInput skillInput = new SkillInput(1, 1, 1);
        skillInputList.add(skillInput);

        //Call the method that will add the skills to the user with userId 1 and pass the skills you want.
        ResponseEntity<User> actualReturnedUser = userApiController.addUserSkill(1, skillInputList);
        int numberOfSkillsAfterAdd = Objects.requireNonNull(actualReturnedUser.getBody()).getSkills().size();
        actualReturnedUser.getStatusCode();

        assertEquals(numberOfSkillsBeforeAdd, numberOfSkillsAfterAdd);
    }

    @Test
    public void getEndpoint_itShouldFindUsers_withCertainSkillSet_successfully() {
        List<String> searchList = new ArrayList<>();
        searchList.add("java");
        searchList.add("javascript");

        ResponseEntity<List<User>> matches = userApiController.findUsersBySkill(searchList);

        assertEquals(2, matches.getBody().size());
    }

    @Test
    public void putEndpoint_itShouldModifyTheSkillLevel_ofUser_successfully() {
        //Find the skill level of the user with userId 1.
        UserSkill userskill = null;
        int userId = 1;
        int skillId = 1;
        for (User u : FakeUserRepository.users){
            if (u.getUserId()==userId){
                for (UserSkill usersk: u.getSkills()){
                    if (usersk.getSkill().getSkillId()==skillId){
                        userskill = usersk;
                    }
                }
            }
        }

        int skillLevelBeforeModification = 0;

        //Here we expect that user with userId has skill level with value 3. Aso here userSkill should not be null, too.
        try {
            assert userskill != null;
            if (userskill.getSkillLevel() == 3)
                skillLevelBeforeModification = userskill.getSkillLevel();
        } catch (Exception e) {
            System.out.println("skill level of user with userId 1 is not 3");
        }

        List<SkillInput> skillInputList = new ArrayList<>();
        SkillInput skillInput = new SkillInput(1, 1, 1);
        skillInputList.add(skillInput);

        ResponseEntity<User> modifiedUser = userApiController.updateUserSkill(1, skillInputList);
        int skillLevelAfterModification = modifiedUser.getBody().getSkills().get(0).getSkillLevel();

        assertNotEquals(skillLevelBeforeModification, skillLevelAfterModification);
    }
}