package io.swagger.api;

import io.swagger.model.Department;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.repository.DepartmentRepository;
import io.swagger.repository.DepartmentRepositoryImpl;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@RestController
public class DepartmentApiController implements DepartmentApi {

    private static final Logger log = LoggerFactory.getLogger(DepartmentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final DepartmentRepositoryImpl departmentRepositoryImpl;

    @org.springframework.beans.factory.annotation.Autowired
    public DepartmentApiController(ObjectMapper objectMapper, HttpServletRequest request,DepartmentRepositoryImpl departmentRepositoryImpl) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.departmentRepositoryImpl = departmentRepositoryImpl;
    }

    public ResponseEntity<Department> addDepartment(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody Department body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Department>(objectMapper.readValue("{\n  \"departmentId\" : 1,\n  \"department\" : \"application\"\n}", Department.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Department>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<Department>(departmentRepositoryImpl.addDepartment(body), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteDepartment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("departmentId") Long departmentId) {
        //String accept = request.getHeader("Accept");
        departmentRepositoryImpl.deleteDepartment(departmentId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Department> getDepartmentById(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("departmentId") Long departmentId) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Department>(objectMapper.readValue("{\n  \"departmentId\" : 1,\n  \"department\" : \"application\"\n}", Department.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Department>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<Department>(departmentRepositoryImpl.getDepartmentById(departmentId), HttpStatus.OK);
    }

    public ResponseEntity<List<Department>> getDepartments() {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<Department>>(objectMapper.readValue("[ {\n  \"departmentId\" : 1,\n  \"department\" : \"application\"\n}, {\n  \"departmentId\" : 1,\n  \"department\" : \"application\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<Department>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<List<Department>>(departmentRepositoryImpl.getDepartments(), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateDepartment(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("departmentId") Long departmentId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody Department body) {
        //String accept = request.getHeader("Accept");
        departmentRepositoryImpl.updateDepartment(departmentId, body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/departments")
    public ResponseEntity<List<Department>> addSkills(@RequestBody List<Department> departments){
        departmentRepositoryImpl.addDepartments(departments);
        return new ResponseEntity<List<Department>>(HttpStatus.OK);
    }

}
