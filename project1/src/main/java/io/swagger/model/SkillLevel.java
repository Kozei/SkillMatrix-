package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SkillLevel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


public class SkillLevel   {
  @JsonProperty("SkillLevelId")
  private Integer skillLevelId = null;

  /**
   * Gets or Sets skillLevel
   */
  public enum SkillLevelEnum {
    BEGINNER("beginner"),
    
    INTERMEDIATE("intermediate"),
    
    EXPERT("expert");

    private String value;

    SkillLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SkillLevelEnum fromValue(String text) {
      for (SkillLevelEnum b : SkillLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("skillLevel")
  private SkillLevelEnum skillLevel = null;

  public SkillLevel skillLevelId(Integer skillLevelId) {
    this.skillLevelId = skillLevelId;
    return this;
  }

  /**
   * Get skillLevelId
   * @return skillLevelId
   **/
  @Schema(example = "1", description = "")
  
    public Integer getSkillLevelId() {
    return skillLevelId;
  }

  public void setSkillLevelId(Integer skillLevelId) {
    this.skillLevelId = skillLevelId;
  }

  public SkillLevel skillLevel(SkillLevelEnum skillLevel) {
    this.skillLevel = skillLevel;
    return this;
  }

  /**
   * Get skillLevel
   * @return skillLevel
   **/
  @Schema(description = "")
  
    public SkillLevelEnum getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(SkillLevelEnum skillLevel) {
    this.skillLevel = skillLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillLevel skillLevel = (SkillLevel) o;
    return Objects.equals(this.skillLevelId, skillLevel.skillLevelId) &&
        Objects.equals(this.skillLevel, skillLevel.skillLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillLevelId, skillLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillLevel {\n");
    
    sb.append("    skillLevelId: ").append(toIndentedString(skillLevelId)).append("\n");
    sb.append("    skillLevel: ").append(toIndentedString(skillLevel)).append("\n");
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
