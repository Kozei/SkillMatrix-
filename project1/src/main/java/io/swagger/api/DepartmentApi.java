/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.27).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Department;
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
public interface DepartmentApi {

    @Operation(summary = "add a department to the database", description = "", tags={ "department" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Department.class))),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/department",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Department> addDepartment(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Department body);


    @Operation(summary = "delete a department by id", description = "", tags={ "department" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "deleted"),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/department/{departmentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteDepartment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("departmentId") Long departmentId);


    @Operation(summary = "find a department by id", description = "", tags={ "department" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Department.class))),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/department/{departmentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Department> getDepartmentById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("departmentId") Long departmentId);


    @Operation(summary = "fetch all departments from the database", description = "", tags={ "department" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Department.class)))),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/department",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Department>> getDepartments();


    @Operation(summary = "update a department by id", description = "", tags={ "department" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "item created"),
        
        @ApiResponse(responseCode = "4XX", description = "problem caused by the user"),
        
        @ApiResponse(responseCode = "5XX", description = "problem caused by the server") })
    @RequestMapping(value = "/department/{departmentId}",
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateDepartment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("departmentId") Long departmentId, @Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Department body);

}

