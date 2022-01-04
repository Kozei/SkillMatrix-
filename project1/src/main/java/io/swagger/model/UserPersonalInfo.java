package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserPersonalInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


public class UserPersonalInfo   {
  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("mobileNumber")
  private Integer mobileNumber = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("aboutMe")
  private String aboutMe = null;

  @JsonProperty("birthDate")
  private OffsetDateTime birthDate = null;

  public UserPersonalInfo firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(example = "elon", required = true, description = "")
      @NotNull

    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserPersonalInfo lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(example = "musk", required = true, description = "")
      @NotNull

    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserPersonalInfo email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(example = "elon-musk@gmail.com", required = true, description = "")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserPersonalInfo mobileNumber(Integer mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
   **/
  @Schema(example = "17621505142", required = true, description = "")
      @NotNull

    public Integer getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(Integer mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public UserPersonalInfo location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
   **/
  @Schema(example = "leipzig", required = true, description = "")
      @NotNull

    public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public UserPersonalInfo aboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
    return this;
  }

  /**
   * Get aboutMe
   * @return aboutMe
   **/
  @Schema(example = "java developer from Leipzig", required = true, description = "")
      @NotNull

    public String getAboutMe() {
    return aboutMe;
  }

  public void setAboutMe(String aboutMe) {
    this.aboutMe = aboutMe;
  }

  public UserPersonalInfo birthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public OffsetDateTime getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(OffsetDateTime birthDate) {
    this.birthDate = birthDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPersonalInfo userPersonalInfo = (UserPersonalInfo) o;
    return Objects.equals(this.firstName, userPersonalInfo.firstName) &&
        Objects.equals(this.lastName, userPersonalInfo.lastName) &&
        Objects.equals(this.email, userPersonalInfo.email) &&
        Objects.equals(this.mobileNumber, userPersonalInfo.mobileNumber) &&
        Objects.equals(this.location, userPersonalInfo.location) &&
        Objects.equals(this.aboutMe, userPersonalInfo.aboutMe) &&
        Objects.equals(this.birthDate, userPersonalInfo.birthDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, mobileNumber, location, aboutMe, birthDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPersonalInfo {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    aboutMe: ").append(toIndentedString(aboutMe)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
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
