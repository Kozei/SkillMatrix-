package io.swagger.api;

import io.swagger.model.Skill;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.repository.SkillRepositoryImpl;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@RestController
public class SkillApiController implements SkillApi {

    private static final Logger log = LoggerFactory.getLogger(SkillApiController.class);
    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;
    private final SkillRepositoryImpl skillRepositoryImpl;

    @Autowired
    public SkillApiController(ObjectMapper objectMapper, HttpServletRequest request, SkillRepositoryImpl skillRepositoryImpl) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.skillRepositoryImpl = skillRepositoryImpl;
    }

    public ResponseEntity<Skill> addSkill(@Parameter(in = ParameterIn.DEFAULT, description = "",
                                          schema=@Schema()) @Valid @RequestBody Skill body) {

        String accept = request.getHeader("Accept");
            if (accept != null && accept.contains("application/json")) {
                try {
                    return new ResponseEntity<Skill>(objectMapper.readValue("{\n  \"skillName\" : \"java\",\n  \"skillId\" : 1\n}", Skill.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<Skill>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        skillRepositoryImpl.addSkill(body);
        return new ResponseEntity<Skill>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteSkill(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("skillId") Long skillId) {
        String accept = request.getHeader("Accept");
        skillRepositoryImpl.deleteSkill(skillId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Skill> getSkillById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("skillId") Long skillId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Skill>(objectMapper.readValue("{\n  \"skillName\" : \"java\",\n  \"skillId\" : 1\n}", Skill.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Skill>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Skill>(skillRepositoryImpl.getSkillById(skillId), HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Skill>> getSkills() {
/*        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                return new ResponseEntity<List<Skill>>(objectMapper.readValue("[ {\n  \"skillName\" : \"java\",\n  \"skillId\" : 1\n}, {\n  \"skillName\" : \"java\",\n  \"skillId\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Skill>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }*/
        return new ResponseEntity<List<Skill>>(skillRepositoryImpl.getSkills(), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateSkill(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Skill body) {
        String accept = request.getHeader("Accept");
        skillRepositoryImpl.updateSkill(body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/skills")
    public ResponseEntity<List<Skill>> addSkills(@RequestBody List<Skill> skills){
        skillRepositoryImpl.addSkills(skills);
        return new ResponseEntity<List<Skill>>(HttpStatus.OK);
    }

}
