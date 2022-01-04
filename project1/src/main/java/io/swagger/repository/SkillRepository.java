package io.swagger.repository;

import io.swagger.model.Skill;
import java.util.List;

public interface SkillRepository {

    List<Skill> getSkills();

    Skill getSkillById(Long id);

    Skill addSkill(Skill skill);

    List<Skill> addSkills(List<Skill> skills);

    Skill updateSkill(Skill skill);

    void deleteSkill(Long id);

}
