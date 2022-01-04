package io.swagger.dao;

import io.swagger.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillDao extends JpaRepository<Skill, Long> {

}
