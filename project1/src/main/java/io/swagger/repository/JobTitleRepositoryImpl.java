package io.swagger.repository;

import io.swagger.dao.JobTitleDao;
import io.swagger.model.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleRepositoryImpl implements JobTitleRepository{

    @Autowired
    private JobTitleDao jobTitleDao;

    @Override
    public List<JobTitle> getJobTitles() {
        return jobTitleDao.findAll();
    }

    @Override
    public JobTitle getJobTitleById(Long id) {
        return jobTitleDao.findById(id).orElse(null);
    }

    @Override
    public JobTitle addJobTitle(JobTitle jobTitle) {
        return jobTitleDao.save(jobTitle);
    }

    @Override
    public List<JobTitle> addJobTitles(List<JobTitle> jobTitles) {
        return jobTitleDao.saveAll(jobTitles);
    }

    @Override
    public JobTitle updateJobTitle(Long id, JobTitle jobTitle) {
        JobTitle existingJobTitle = jobTitleDao.findById(id).orElse(null);
        existingJobTitle.setJobTitle(jobTitle.getJobTitle());
        return jobTitleDao.save(existingJobTitle);

    }

    @Override
    public void deleteJobTitle(Long id) {
        jobTitleDao.deleteById(id);
    }
}
