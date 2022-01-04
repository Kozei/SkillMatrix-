/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Skill;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@Validated
public interface SkillApi {

    @Operation(summary = "Add a skill to the database", description = "", tags={ "skill" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "skill created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Skill.class))),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/skill",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Skill> addSkill(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Skill body);


    @Operation(summary = "delete a skill by id", description = "", tags={ "skill" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "skill deleted"),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/skill/{skillId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSkill(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("skillId") Long skillId);


    @Operation(summary = "find a skill by id", description = "", tags={ "skill" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Skill.class))),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/skill/{skillId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Skill> getSkillById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("skillId") Long skillId);


    @Operation(summary = "fetch all skills from the database", description = "", tags={ "skill" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Skill.class)))),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/skill",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Skill>> getSkills();


    @Operation(summary = "update a skill by id", description = "", tags={ "skill" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "created"),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/skill",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateSkill(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Skill body);

}

