package io.swagger.repository;

import io.swagger.model.Category;
import io.swagger.model.JobTitle;

import java.util.List;

public interface JobTitleRepository {

    List<JobTitle> getJobTitles();

    JobTitle getJobTitleById(Long id);

    JobTitle addJobTitle(JobTitle jobTitle);

    List<JobTitle> addJobTitles(List<JobTitle> jobTitles);

    JobTitle updateJobTitle(Long id, JobTitle jobTitle);

    void deleteJobTitle(Long id);
}
