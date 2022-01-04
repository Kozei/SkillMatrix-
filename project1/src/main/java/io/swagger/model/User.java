package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.UserLanguage;
import io.swagger.model.UserSkill;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")

@Entity
@Table(name = "USER_TABLE")
public class User   {

  public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public User() {}

  public User(Long userId, String firstName, String lastName, String email,
              String mobileNumber, String location, String aboutMe, Long birthDate,
              List<UserSkill> skills, List<UserLanguage> languages) {
    this.userId = userId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.mobileNumber = mobileNumber;
    this.location = location;
    this.aboutMe = aboutMe;
    this.birthDate = birthDate;
    this.skills = skills;
    this.languages = languages;
  }

  @JsonProperty("userId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("location")
  private String location = null;

  @JsonProperty("aboutMe")
  private String aboutMe = null;

  @JsonProperty("birthDate")
  private Long birthDate = null;

  @JsonProperty("department")
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "department_id")
  private Department deparment;

  public Department getDeparment() {
    return deparment;
  }

  public void setDeparment(Department deparment) {
    this.deparment = deparment;
  }

  @JsonProperty("jobTitle")
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "jobTitle_id")
  private JobTitle jobTitle;

  public JobTitle getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(JobTitle jobTitle) {
    this.jobTitle = jobTitle;
  }

  @JsonProperty("skills")
  @Valid
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  private List<UserSkill> skills;

  @JsonProperty("languages")
  @Valid
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  private List<UserLanguage> languages;


  public User userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
   **/
  @Schema(example = "1", description = "")
  
    public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public User firstName(String firstName) {
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

  public User lastName(String lastName) {
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

  public User email(String email) {
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

  public User mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
   **/
  @Schema(example = "17621505142", required = true, description = "")
      @NotNull

    public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public User location(String location) {
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

  public User aboutMe(String aboutMe) {
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

  public User birthDate(Long birthDate) {
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
    public Long getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Long birthDate) {
    this.birthDate = birthDate;
  }

  public User skills(List<UserSkill> skills) {
    this.skills = skills;
    return this;
  }

  public User addSkillsItem(UserSkill skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Get skills
   * @return skills
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<UserSkill> getSkills() {
    return skills;
  }

  public void setSkills(List<UserSkill> skills) {
    this.skills = skills;
  }

  public User languages(List<UserLanguage> languages) {
    this.languages = languages;
    return this;
  }

  public User addLanguagesItem(UserLanguage languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

  /**
   * Get languages
   * @return languages
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<UserLanguage> getLanguages() {
    return languages;
  }

  public void setLanguages(List<UserLanguage> languages) {
    this.languages = languages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userId, user.userId) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.mobileNumber, user.mobileNumber) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.aboutMe, user.aboutMe) &&
        Objects.equals(this.birthDate, user.birthDate) &&
        Objects.equals(this.skills, user.skills) &&
        Objects.equals(this.languages, user.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, lastName, email, mobileNumber, location, aboutMe, birthDate, skills, languages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    aboutMe: ").append(toIndentedString(aboutMe)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
