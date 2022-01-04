package io.swagger.repository;

import com.flextrade.jfixture.JFixture;
import io.swagger.model.*;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/*DOCUMENTATION
* This file contains an in-memory database. Here I store data.
*
* This file contains a lot of lists right from the beginning. The reason behind this, is that in order to construct a
* user object, list of UserSkills and languages are required.
*
* In order to construct a UserSkill, skill and category objects are required.
* In order to construct a UserLanguage, a language object is required.
*
* The objects that don't depend on other objects are created first. The user object that has the most dependencies
* (including nested dependencies) for example is created last.
*
* IMPORTANT POINTS:
* 1. The list of users is public. It is being accessed from UserRepository and UserApiControllerTest as well.
* 2. The rest of the lists are package private. They still need to be accessed by the UserRepository that is within the same
*    package.
* 3. Data is initialized within the static block when you launch the program or when you run the test cases.
* 4. Lists are pre-populated with objects.
* 5. The last block of code at the bottom of static block is a demonstration of JFixture in java. JFixture instantiates
*    an object and populates the constructor with random fields. In my example userId and skills are being set explicitly.
*    These are the values that are important for testing for example and therefore are manually set.
*
* */

@Component
public class FakeUserRepository {

    static List<Category> categoryList = new ArrayList<>();
    static List<Skill> skillList = new ArrayList<>();
    static List<UserSkill> userSkillList = new ArrayList<>();
    static List<Language> languageList = new ArrayList<>();
    static List<UserLanguage> userLanguageList = new ArrayList<>();

    public static List<User> users = new ArrayList<>();


    static {

        //initialize data.
        Skill skill1 = new Skill(1L, "java");
        Skill skill2 = new Skill(2L, "javascript");
        Skill skill3 = new Skill(3L, "python");
        Skill skill4 = new Skill(4L, "go");
        Skill skill5 = new Skill(5L, "angular");
        Skill skill6 = new Skill(6L, "react");
        Skill skill7 = new Skill(7L, "java");
        Skill skill8 = new Skill(8L, "kotlin");
        Skill skill9 = new Skill(9L, "spring");

        skillList.add(skill1);
        skillList.add(skill2);
        skillList.add(skill3);
        skillList.add(skill4);
        skillList.add(skill5);
        skillList.add(skill6);
        skillList.add(skill7);
        skillList.add(skill8);
        skillList.add(skill9);

        Category category1 = new Category(1L, "programming");
        Category category2 = new Category(2L, "framework");

        categoryList.add(category1);
        categoryList.add(category2);

        //To construct a userSkill we need a skill and a category.
        UserSkill userSkill1 = new UserSkill(3, skill1, category1);
        UserSkill userSkill2 = new UserSkill(2, skill2, category1);
        UserSkill userSkill3 = new UserSkill(1, skill3, category1);
        UserSkill userSkill4 = new UserSkill(3, skill4, category1);
        UserSkill userSkill5 = new UserSkill(1, skill5, category2);
        UserSkill userSkill6 = new UserSkill(2, skill6, category2);
        UserSkill userSkill7 = new UserSkill(1, skill7, category1);
        UserSkill userSkill8 = new UserSkill(1, skill8, category1);
        UserSkill userSkill9 = new UserSkill(3, skill9, category2);

        //populate the skillsList with 9 userSkills constructed above.
        userSkillList.add(userSkill1);
        userSkillList.add(userSkill2);
        userSkillList.add(userSkill3);
        userSkillList.add(userSkill4);
        userSkillList.add(userSkill5);
        userSkillList.add(userSkill6);
        userSkillList.add(userSkill7);
        userSkillList.add(userSkill8);
        userSkillList.add(userSkill9);


        Language language1 = new Language(1, Language.LanguageNameEnum.ENGLISH);
        Language language2 = new Language(2, Language.LanguageNameEnum.GERMAN);
        Language language3 = new Language(3, Language.LanguageNameEnum.GREEK);

        languageList.add(language1);
        languageList.add(language2);
        languageList.add(language3);

        //To construct a userLanguage we need a language.
        UserLanguage userLanguage1 = new UserLanguage(3, language1);
        UserLanguage userLanguage2 = new UserLanguage(1, language2);
        UserLanguage userLanguage3 = new UserLanguage(2, language3);

        //populate the languagesList with 3 languages constructed above.
        userLanguageList.add(userLanguage1);
        userLanguageList.add(userLanguage2);
        userLanguageList.add(userLanguage3);

        //initialize skills for users
        List<UserSkill> skillsOfUser1 = new ArrayList<>();
        skillsOfUser1.add(userSkillList.get(0));

        List<UserSkill> skillsOfUser2 = new ArrayList<>();
        skillsOfUser2.add(userSkillList.get(0));
        skillsOfUser2.add(userSkillList.get(1));
        skillsOfUser2.add(userSkillList.get(5));

        List<UserSkill> skillsOfUser3 = new ArrayList<>();
        skillsOfUser3.add(userSkillList.get(0));
        skillsOfUser3.add(userSkillList.get(1));
        skillsOfUser3.add(userSkillList.get(2));

        //initialize languages for users
        List<UserLanguage> languagesOfUser1 = new ArrayList<>();
        languagesOfUser1.add(userLanguageList.get(0));

        List<UserLanguage> languagesOfUser2 = new ArrayList<>();
        languagesOfUser2.add(userLanguageList.get(0));
        languagesOfUser2.add(userLanguageList.get(1));

        List<UserLanguage> languagesOfUser3 = new ArrayList<>();
        languagesOfUser3.add(userLanguageList.get(0));
        languagesOfUser3.add(userLanguageList.get(1));
        languagesOfUser3.add(userLanguageList.get(2));

        //Construct users
        User user1 = new User(1L, "elon", "musk", "elon@gmail.com",
                                "2176215", "leipzig", "hello world",
                24390L, skillsOfUser1, languagesOfUser1);

        User user2 = new User(2L, "george", "brown", "brown@gmail.com",
                                "2176215", "frankfurt", "hello world",
                12490L, skillsOfUser2, languagesOfUser2);

        User user3 = new User(3L, "natalia", "muller", "muller@gmail.com",
                                "2176215", "berlin", "hello world",
                                15490L, skillsOfUser3, languagesOfUser3);



        users.add(user1);
        users.add(user2);
        users.add(user3);

        //Construct a user object with JFixture
        JFixture fixture = new JFixture();
        User user4 = fixture.create(User.class);
        user4.setUserId(4L); //data I care about
        user4.setSkills(skillsOfUser1); //data I care about
        users.add(user4);
    }
}
