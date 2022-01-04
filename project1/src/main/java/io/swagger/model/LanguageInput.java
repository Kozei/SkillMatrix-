package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LanguageInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


public class LanguageInput   {
  @JsonProperty("languageId")
  private Integer languageId = null;

  @JsonProperty("languageLevel")
  private Integer languageLevel = null;

  public LanguageInput languageId(Integer languageId) {
    this.languageId = languageId;
    return this;
  }

  /**
   * Get languageId
   * @return languageId
   **/
  @Schema(example = "1", description = "")
  
    public Integer getLanguageId() {
    return languageId;
  }

  public void setLanguageId(Integer languageId) {
    this.languageId = languageId;
  }

  public LanguageInput languageLevel(Integer languageLevel) {
    this.languageLevel = languageLevel;
    return this;
  }

  /**
   * Get languageLevel
   * @return languageLevel
   **/
  @Schema(example = "1", description = "")
  
    public Integer getLanguageLevel() {
    return languageLevel;
  }

  public void setLanguageLevel(Integer languageLevel) {
    this.languageLevel = languageLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LanguageInput languageInput = (LanguageInput) o;
    return Objects.equals(this.languageId, languageInput.languageId) &&
        Objects.equals(this.languageLevel, languageInput.languageLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageId, languageLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageInput {\n");
    
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    languageLevel: ").append(toIndentedString(languageLevel)).append("\n");
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
