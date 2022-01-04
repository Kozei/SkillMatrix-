package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SkillInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


public class SkillInput   {
  @JsonProperty("skillId")
  private Integer skillId = null;

  @JsonProperty("skillLevel")
  private Integer skillLevel = null;

  @JsonProperty("categoryId")
  private Integer categoryId = null;

  public SkillInput(Integer skillId, Integer skillLevel, Integer categoryId) {
    this.skillId = skillId;
    this.skillLevel = skillLevel;
    this.categoryId = categoryId;
  }

  public SkillInput skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

  /**
   * Get skillId
   * @return skillId
   **/
  @Schema(example = "1", description = "")
  
    public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public SkillInput skillLevel(Integer skillLevel) {
    this.skillLevel = skillLevel;
    return this;
  }

  /**
   * Get skillLevel
   * @return skillLevel
   **/
  @Schema(example = "1", description = "")
  
    public Integer getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(Integer skillLevel) {
    this.skillLevel = skillLevel;
  }

  public SkillInput categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
   **/
  @Schema(example = "1", description = "")
  
    public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillInput skillInput = (SkillInput) o;
    return Objects.equals(this.skillId, skillInput.skillId) &&
        Objects.equals(this.skillLevel, skillInput.skillLevel) &&
        Objects.equals(this.categoryId, skillInput.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillId, skillLevel, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillInput {\n");
    
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillLevel: ").append(toIndentedString(skillLevel)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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
