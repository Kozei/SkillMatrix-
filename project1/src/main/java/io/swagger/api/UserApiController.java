package io.swagger.api;

import io.swagger.repository.UserRepositoryImpl;
import io.swagger.model.LanguageInput;
import io.swagger.model.SkillInput;
import io.swagger.model.User;
import io.swagger.model.UserLanguageInputArray;
import io.swagger.model.UserPersonalInfo;
import io.swagger.model.UserSkillInputArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@RestController
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final UserRepositoryImpl userRepositoryImpl;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request, UserRepositoryImpl userRepositoryImpl) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.userRepositoryImpl = userRepositoryImpl;
    }

    public ResponseEntity<User> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody User body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                User user = objectMapper.readValue("{\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}", User.class)
//                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<User>(userRepositoryImpl.addUser(body), HttpStatus.CREATED);
    }

    public ResponseEntity<List<LanguageInput>> addUserLanguage(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody List<LanguageInput> body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<UserLanguageInputArray>(objectMapper.readValue("[ {\n  \"languageLevel\" : 1,\n  \"languageId\" : 1\n}, {\n  \"languageLevel\" : 1,\n  \"languageId\" : 1\n} ]", UserLanguageInputArray.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<UserLanguageInputArray>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<List<LanguageInput>>(userRepositoryImpl.addUserLanguage(userId,body),HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserPersonalInfo> addUserPersonalInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserPersonalInfo body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserPersonalInfo>(objectMapper.readValue("{\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}", UserPersonalInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserPersonalInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserPersonalInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> addUserSkill(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId, @Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody  List<SkillInput> body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<UserSkillInputArray>(objectMapper.readValue("[ {\n  \"skillId\" : 1,\n  \"skillLevel\" : 1,\n  \"categoryId\" : 1\n}, {\n  \"skillId\" : 1,\n  \"skillLevel\" : 1,\n  \"categoryId\" : 1\n} ]", UserSkillInputArray.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<UserSkillInputArray>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<UserSkillInputArray>(HttpStatus.NOT_IMPLEMENTED);

        User user = userRepositoryImpl.addSkillsToUser(userId, body);
          return new ResponseEntity<User>(user, HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId) {
//        String accept = request.getHeader("Accept");
//        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
        userRepositoryImpl.deleteUserById(userId);
            return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUserLanguage(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("languageId") Integer languageId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUserPersonalInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("personalInfoId") Integer personalInfoId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteUserSkill(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("skillId") Integer skillId) {
        //String accept = request.getHeader("Accept");
        userRepositoryImpl.deleteUserSkillById(userId,skillId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<User>> findUsersByDepartment(@NotNull @Parameter(in = ParameterIn.QUERY, description = "department values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "application", "sales", "marketing" }
)) @Valid @RequestParam(value = "department", required = true) List<String> department) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> findUsersByJobTitle(@NotNull @Parameter(in = ParameterIn.QUERY, description = "job-title values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "developer", "manager", "administrator" }
)) @Valid @RequestParam(value = "job-title", required = true) List<String> jobTitle) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> findUsersByLanguageAndLanguageLevel(@NotNull @Parameter(in = ParameterIn.QUERY, description = "language values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "english", "german", "greek" }
)) @Valid @RequestParam(value = "language", required = true) List<String> language,@NotNull @Parameter(in = ParameterIn.QUERY, description = "language-level values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "a1", "a2", "b1", "b2", "c1", "c2" }
)) @Valid @RequestParam(value = "language-level", required = true) List<String> languageLevel) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> findUsersByLocation(@NotNull @Parameter(in = ParameterIn.QUERY, description = "location values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "leipzig", "frankfurt", "athens" }
)) @Valid @RequestParam(value = "location", required = true) List<String> location) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> findUsersBySkill(@NotNull @Parameter(in = ParameterIn.QUERY, description = "skill values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "java", "javascript", "python" }
)) @Valid @RequestParam(value = "skill", required = true) List<String> skill) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<List<User>>(userRepositoryImpl.findUserBySkill(skill), HttpStatus.OK);
    }

    public ResponseEntity<List<User>> findUsersBySkillAndSkillLevel(@NotNull @Parameter(in = ParameterIn.QUERY, description = "Skill values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "java", "javascript", "python" }
)) @Valid @RequestParam(value = "skill", required = true) List<String> skill,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Skill level values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "beginner", "intermediate", "expert" }
)) @Valid @RequestParam(value = "skill-level", required = true) List<String> skillLevel) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> findUsersBySkillCategory(@NotNull @Parameter(in = ParameterIn.QUERY, description = "location values that need to be considered for filter" ,required=true,schema=@Schema(allowableValues={ "framework", "cloud", "programming" }
)) @Valid @RequestParam(value = "skill-category", required = true) List<String> skillCategory) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<User> getUserById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<User>(objectMapper.readValue("{\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}", User.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserLanguageInputArray> getUserLanguages(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserLanguageInputArray>(objectMapper.readValue("[ {\n  \"languageLevel\" : 1,\n  \"languageId\" : 1\n}, {\n  \"languageLevel\" : 1,\n  \"languageId\" : 1\n} ]", UserLanguageInputArray.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserLanguageInputArray>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserLanguageInputArray>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserPersonalInfo> getUserPersonalInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserPersonalInfo>(objectMapper.readValue("{\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}", UserPersonalInfo.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserPersonalInfo>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserPersonalInfo>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<UserSkillInputArray> getUserSkills(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<UserSkillInputArray>(objectMapper.readValue("[ {\n  \"skillId\" : 1,\n  \"skillLevel\" : 1,\n  \"categoryId\" : 1\n}, {\n  \"skillId\" : 1,\n  \"skillLevel\" : 1,\n  \"categoryId\" : 1\n} ]", UserSkillInputArray.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<UserSkillInputArray>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<UserSkillInputArray>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> getUsers() {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n}, {\n  \"skills\" : [ {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  }, {\n    \"skill\" : {\n      \"skillName\" : \"java\",\n      \"skillId\" : 1\n    },\n    \"category\" : {\n      \"categoryName\" : \"framework\",\n      \"categoryId\" : 1\n    },\n    \"skillLevel\" : 1\n  } ],\n  \"firstName\" : \"elon\",\n  \"lastName\" : \"musk\",\n  \"languages\" : [ {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  }, {\n    \"languageLevel\" : 1,\n    \"language\" : {\n      \"languageId\" : 1,\n      \"languageName\" : \"english\"\n    }\n  } ],\n  \"mobileNumber\" : 17621505142,\n  \"location\" : \"leipzig\",\n  \"userId\" : 1,\n  \"birthDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"email\" : \"elon-musk@gmail.com\",\n  \"aboutMe\" : \"java developer from Leipzig\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);

          return new ResponseEntity<List<User>>(userRepositoryImpl.retrieveAllUsers(),HttpStatus.OK);
    }

    public ResponseEntity<Void> updateUser(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUserLanguage(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody LanguageInput body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateUserPersonalInfo(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody UserPersonalInfo body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity <User> updateUserSkill(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("userId") Integer userId,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody List<SkillInput> body) {
        //String accept = request.getHeader("Accept");
        return new ResponseEntity <User>(userRepositoryImpl.updateUserSkill(userId,body), HttpStatus.NOT_IMPLEMENTED);
    }

}
