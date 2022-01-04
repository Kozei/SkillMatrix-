package io.swagger.api.unit.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.api.UserApiController;
import io.swagger.model.*;

import java.util.*;

import io.swagger.repository.UserRepositoryImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*DOCUMENTATION
*
* This file contains 1 implemented test to demonstrate mocking the userRepository dependency via mockito:
*
* 1. postEndpoint_itShouldAdd_nonExistingSkill_toUser_successfully(): This test case guarantees that when you add a skill
*    to the user, the skill is in fact being added. The logic that gives this assurance is that the actual result should
*    contain the exact skill name that was added to a mockUser.
*
* */

@WebMvcTest(UserApiController.class)
public class UserApiControllerTestMockito {

    @Autowired
    UserApiController userApiController;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserRepositoryImpl userRepositoryImpl;

    @Test
    public void postEndpoint_itShouldAdd_nonExistingSkill_toUser_successfully() throws Exception {

        //Expected mocked user.
        User mockUser = new User();

        Skill skill1 = new Skill(1L, "java");
        Skill skill2 = new Skill(2L, "javascript");
        Category category1 = new Category(1L, "programming");

        UserSkill userSkill1 = new UserSkill(3, skill1, category1);
        UserSkill userSkill2 = new UserSkill(1, skill2, category1);
        List<UserSkill> listOfUserSkills = new ArrayList<>();
        listOfUserSkills.add(userSkill1);
        listOfUserSkills.add(userSkill2);

        //This is the expected mock user who will have 2 skills. java and javascript.
        mockUser.setSkills(listOfUserSkills);

        //The skill we want to add to the user is javascript. Java already exists in this user.
        List<SkillInput> payload = new ArrayList<>();
        SkillInput skill = new SkillInput(2, 1, 1);
        payload.add(skill);

        //Converting payload to string
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(payload);

        //Here we know that this method should return our pre-defined mocked user given the provided parameters. And we return it.
        Mockito.when(userRepositoryImpl.addSkillsToUser(1, payload)).thenReturn(mockUser);

        //Hitting the endpoint and expecting proper status and confirmation for the newly added skill.
        mockMvc.perform(MockMvcRequestBuilders.post("/user/1/skill/")
                        .content(json)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.jsonPath("$.skills[1].skill.skillName").value("javascript"))
                .andExpect(status().isCreated())
                .andDo(print());

    }

}




