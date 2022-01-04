package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Category;
import io.swagger.model.Skill;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;


import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserSkill
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


@Entity
@Table(name = "USERSKILL_TABLE")
public class UserSkill   {

  public UserSkill(Integer skillLevel, Skill skill, Category category) {
    this.skillLevel = skillLevel;
    this.skill = skill;
    this.category = category;
  }

  @JsonProperty("userSkillId")
  @Column(name = "userskill_id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userSkillId = null;

  @JsonProperty("skillLevel")
  private Integer skillLevel = null;

  @JsonProperty("skill")
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "skill_id")
  private Skill skill = null;

  public Long getUserSkillId() {
    return userSkillId;
  }

  public void setUserSkillId(Long userSkillId) {
    this.userSkillId = userSkillId;
  }

  @JsonProperty("category")
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "category_id")
  private Category category = null;




  public UserSkill skillLevel(Integer skillLevel) {
    this.skillLevel = skillLevel;
    return this;
  }

  /**
   * Get skillLevel
   * @return skillLevel
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(Integer skillLevel) {
    this.skillLevel = skillLevel;
  }

  public UserSkill skill(Skill skill) {
    this.skill = skill;
    return this;
  }

  /**
   * Get skill
   * @return skill
   **/
  @Schema(description = "")
  
    @Valid
    public Skill getSkill() {
    return skill;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  public UserSkill category(Category category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSkill userSkill = (UserSkill) o;
    return Objects.equals(this.skillLevel, userSkill.skillLevel) &&
        Objects.equals(this.skill, userSkill.skill) &&
        Objects.equals(this.category, userSkill.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillLevel, skill, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSkill {\n");
    
    sb.append("    skillLevel: ").append(toIndentedString(skillLevel)).append("\n");
    sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
