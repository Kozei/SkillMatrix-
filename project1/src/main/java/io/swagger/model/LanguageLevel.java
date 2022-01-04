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
 * LanguageLevel
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


public class LanguageLevel   {
  @JsonProperty("LanguageLevelId")
  private Integer languageLevelId = null;

  /**
   * Gets or Sets languageLevel
   */
  public enum LanguageLevelEnum {
    A1("a1"),
    
    A2("a2"),
    
    B1("b1"),
    
    B2("b2"),
    
    C1("c1"),
    
    C2("c2");

    private String value;

    LanguageLevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageLevelEnum fromValue(String text) {
      for (LanguageLevelEnum b : LanguageLevelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("languageLevel")
  private LanguageLevelEnum languageLevel = null;

  public LanguageLevel languageLevelId(Integer languageLevelId) {
    this.languageLevelId = languageLevelId;
    return this;
  }

  /**
   * Get languageLevelId
   * @return languageLevelId
   **/
  @Schema(example = "1", description = "")
  
    public Integer getLanguageLevelId() {
    return languageLevelId;
  }

  public void setLanguageLevelId(Integer languageLevelId) {
    this.languageLevelId = languageLevelId;
  }

  public LanguageLevel languageLevel(LanguageLevelEnum languageLevel) {
    this.languageLevel = languageLevel;
    return this;
  }

  /**
   * Get languageLevel
   * @return languageLevel
   **/
  @Schema(description = "")
  
    public LanguageLevelEnum getLanguageLevel() {
    return languageLevel;
  }

  public void setLanguageLevel(LanguageLevelEnum languageLevel) {
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
    LanguageLevel languageLevel = (LanguageLevel) o;
    return Objects.equals(this.languageLevelId, languageLevel.languageLevelId) &&
        Objects.equals(this.languageLevel, languageLevel.languageLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageLevelId, languageLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageLevel {\n");
    
    sb.append("    languageLevelId: ").append(toIndentedString(languageLevelId)).append("\n");
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
