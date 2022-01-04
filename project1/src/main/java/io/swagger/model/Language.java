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
 * Language
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


public class Language   {


  public Language(Integer languageId, LanguageNameEnum languageName) {
    this.languageId = languageId;
    this.languageName = languageName;
  }

  @JsonProperty("languageId")
  private Integer languageId = null;

  /**
   * Gets or Sets languageName
   */
  public enum LanguageNameEnum {
    ENGLISH("english"),
    
    GERMAN("german"),
    
    GREEK("greek");

    private String value;

    LanguageNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LanguageNameEnum fromValue(String text) {
      for (LanguageNameEnum b : LanguageNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("languageName")
  private LanguageNameEnum languageName = null;

  public Language languageId(Integer languageId) {
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

  public Language languageName(LanguageNameEnum languageName) {
    this.languageName = languageName;
    return this;
  }

  /**
   * Get languageName
   * @return languageName
   **/
  @Schema(description = "")
  
    public LanguageNameEnum getLanguageName() {
    return languageName;
  }

  public void setLanguageName(LanguageNameEnum languageName) {
    this.languageName = languageName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Language language = (Language) o;
    return Objects.equals(this.languageId, language.languageId) &&
        Objects.equals(this.languageName, language.languageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageId, languageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Language {\n");
    
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
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
