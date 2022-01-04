package io.swagger.api;

import io.swagger.model.Category;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Skill;
import io.swagger.repository.CategoryRepository;
import io.swagger.repository.CategoryRepositoryImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Generated;
import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@RestController
public class CategoryApiController implements CategoryApi {

    private static final Logger log = LoggerFactory.getLogger(CategoryApiController.class);
    private final ObjectMapper objectMapper;
    private final HttpServletRequest request;
    private final CategoryRepositoryImpl categoryRepositoryImpl;



    @Autowired
    public CategoryApiController(ObjectMapper objectMapper, HttpServletRequest request, CategoryRepositoryImpl categoryRepositoryImpl) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.categoryRepositoryImpl = categoryRepositoryImpl;
    }

    public ResponseEntity<Category> addCategory(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Category body) {
       /* String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Category>(objectMapper.readValue("{\n  \"categoryName\" : \"framework\",\n  \"categoryId\" : 1\n}", Category.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }*/

        return new ResponseEntity<Category>(categoryRepositoryImpl.addCategory(body), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteCategory(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("categoryId") Long categoryId) {
        //String accept = request.getHeader("Accept");
        categoryRepositoryImpl.deleteCategory(categoryId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Category> getCategoryById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("categoryId") Long categoryId) {
     /*   String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Category>(objectMapper.readValue("{\n  \"categoryName\" : \"framework\",\n  \"categoryId\" : 1\n}", Category.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }*/
        return new ResponseEntity<Category>(categoryRepositoryImpl.getCategoryById(categoryId), HttpStatus.OK);
    }

    public ResponseEntity<List<Category>> getSkillCategory() {
     /*   String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Category>>(objectMapper.readValue("[ {\n  \"categoryName\" : \"framework\",\n  \"categoryId\" : 1\n}, {\n  \"categoryName\" : \"framework\",\n  \"categoryId\" : 1\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Category>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }*/
        return new ResponseEntity<List<Category>>(categoryRepositoryImpl.getCategories(), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateCategory(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("categoryId") Long categoryId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Category body) {
        //String accept = request.getHeader("Accept");
        categoryRepositoryImpl.updateCategory(categoryId, body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/categories")
    public ResponseEntity<List<Category>> addSkills(@RequestBody List<Category> categories){
        categoryRepositoryImpl.addCategories(categories);
        return new ResponseEntity<List<Category>>(HttpStatus.OK);
    }

}
