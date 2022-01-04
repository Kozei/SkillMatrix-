package io.swagger.model;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Skill
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")

@Entity
@Table(name = "SKILL_TABLE")
public class Skill   {

  public Skill() {
  }

  public Skill(Long skillId, String skillName) {
    this.skillId = skillId;
    this.skillName = skillName;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @JsonProperty("skillId")
  private Long skillId = null;

  @Column(name = "skill_name")
  @JsonProperty("skillName")
  private String skillName = null;

/*  @OneToMany(targetEntity = UserSkill.class, cascade = CascadeType.ALL)
  @JoinColumn(name = "skill_id", referencedColumnName = "skillId")
  private List<UserSkill> userSkills;*/

  public Skill skillId(Long skillId) {
    this.skillId = skillId;
    return this;
  }

  /**
   * Get skillId
   * @return skillId
   **/
  @Schema(example = "1", description = "")
  
    public Long getSkillId() {
    return skillId;
  }

  public void setSkillId(Long skillId) {
    this.skillId = skillId;
  }

  public Skill skillName(String skillName) {
    this.skillName = skillName;
    return this;
  }

  /**
   * Get skillName
   * @return skillName
   **/
  @Schema(example = "java", description = "")
  
    public String getSkillName() {
    return skillName;
  }

  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Skill skill = (Skill) o;
    return Objects.equals(this.skillId, skill.skillId) &&
        Objects.equals(this.skillName, skill.skillName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillId, skillName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Skill {\n");
    
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillName: ").append(toIndentedString(skillName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
