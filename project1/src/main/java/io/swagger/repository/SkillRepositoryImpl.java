package io.swagger.repository;

import io.swagger.dao.SkillDao;
import io.swagger.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillRepositoryImpl implements SkillRepository{

    @Autowired
    private SkillDao skillDao;

    @Override
    public List<Skill> getSkills() {
        return skillDao.findAll();
    }

    @Override
    public Skill getSkillById(Long id) {

        return skillDao.findById(id).orElse(null);
    }

    @Override
    public Skill addSkill(Skill skill) {
        return skillDao.save(skill);
    }

    @Override
    public List<Skill> addSkills(List<Skill> skills) {
        return skillDao.saveAll(skills);
    }

    @Override
    public Skill updateSkill(Skill skill) {

        Skill existingSkill = skillDao.findById(skill.getSkillId()).orElse(null);

        existingSkill.setSkillName(skill.getSkillName());
        skillDao.save(existingSkill);
        return existingSkill;
    }

    @Override
    public void deleteSkill(Long id) {
        skillDao.deleteById(id);
    }
}
