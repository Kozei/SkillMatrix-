package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Language;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserLanguage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")

@Entity
@Table(name = "USERLANGUAGE_TABLE")
public class UserLanguage   {

  public UserLanguage() {
  }

  public UserLanguage(Integer languageLevel, Language language) {
    this.languageLevel = languageLevel;
    this.language = language;
  }

  @JsonProperty("userLanguageId")
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userLanguageId = null;

  @JsonProperty("languageLevel")
  private Integer languageLevel = null;

  @JsonProperty("language")
  private transient Language language = null;


  public UserLanguage languageLevel(Integer languageLevel) {
    this.languageLevel = languageLevel;
    return this;
  }

  /**
   * Get languageLevel
   * @return languageLevel
   **/
  @Schema(example = "1", required = true, description = "")
      @NotNull

    public Integer getLanguageLevel() {
    return languageLevel;
  }

  public void setLanguageLevel(Integer languageLevel) {
    this.languageLevel = languageLevel;
  }

  public UserLanguage language(Language language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Language getLanguage() {
    return language;
  }

  public void setLanguage(Language language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLanguage userLanguage = (UserLanguage) o;
    return Objects.equals(this.languageLevel, userLanguage.languageLevel) &&
        Objects.equals(this.language, userLanguage.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageLevel, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLanguage {\n");
    
    sb.append("    languageLevel: ").append(toIndentedString(languageLevel)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
