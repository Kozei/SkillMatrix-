package io.swagger.api;

import io.swagger.model.Department;
import io.swagger.model.JobTitle;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.repository.JobTitleRepository;
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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")
@RestController
public class JobTitleApiController implements JobTitleApi {

    private static final Logger log = LoggerFactory.getLogger(JobTitleApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final JobTitleRepository jobTitleRepository;

    @org.springframework.beans.factory.annotation.Autowired
    public JobTitleApiController(ObjectMapper objectMapper, HttpServletRequest request, JobTitleRepository jobTitleRepository) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.jobTitleRepository = jobTitleRepository;
    }

    public ResponseEntity<JobTitle> addJobTitle(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody JobTitle body) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<JobTitle>(objectMapper.readValue("{\n  \"jobTitleId\" : 1,\n  \"jobTitle\" : \"developer\"\n}", JobTitle.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<JobTitle>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<JobTitle>(jobTitleRepository.addJobTitle(body), HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteJobTitle(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("job-titleId") Long jobTitleId) {
//        String accept = request.getHeader("Accept");
//        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//    public ResponseEntity<JobTitle> getJobTitleById(@Parameter(in = ParameterIn.PATH, description = "id of job-title to return", required=true, schema=@Schema()) @PathVariable("job-titleId") Integer jobTitleId) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<JobTitle>(objectMapper.readValue("{\n  \"jobTitleId\" : 1,\n  \"jobTitle\" : \"developer\"\n}", JobTitle.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<JobTitle>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
        jobTitleRepository.deleteJobTitle(jobTitleId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<JobTitle>> getJobTitles() {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<JobTitle>>(objectMapper.readValue("[ {\n  \"jobTitleId\" : 1,\n  \"jobTitle\" : \"developer\"\n}, {\n  \"jobTitleId\" : 1,\n  \"jobTitle\" : \"developer\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<JobTitle>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }

        return new ResponseEntity<List<JobTitle>>(jobTitleRepository.getJobTitles(), HttpStatus.OK);
    }

    public ResponseEntity<Void> updateJobTitle(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("job-titleId") Long jobTitleId,@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody JobTitle body) {
        //String accept = request.getHeader("Accept");
        jobTitleRepository.updateJobTitle(jobTitleId, body);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<JobTitle> getJobTitleById(Long jobTitleId) {
        return new ResponseEntity<JobTitle>(jobTitleRepository.getJobTitleById(jobTitleId), HttpStatus.OK);
    }

    @PostMapping("/job-titles")
    public ResponseEntity<List<JobTitle>> addSkills(@RequestBody List<JobTitle> JobTitles){

        return new ResponseEntity<List<JobTitle>>(jobTitleRepository.addJobTitles(JobTitles), HttpStatus.OK);
    }

}
