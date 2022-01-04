package io.swagger.dao;

import io.swagger.model.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle, Long> {
}
