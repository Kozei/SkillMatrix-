package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JobTitle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")

@Entity
@Table(name = "JOBTITLE_TABLE")
public class JobTitle   {
  @JsonProperty("jobTitleId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long jobTitleId = null;

  /**
   * Gets or Sets jobTitle
   */

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  public JobTitle jobTitleId(Long jobTitleId) {
    this.jobTitleId = jobTitleId;
    return this;
  }

  /**
   * Get jobTitleId
   * @return jobTitleId
   **/
  @Schema(example = "1", description = "")
  
    public Long getJobTitleId() {
    return jobTitleId;
  }

  public void setJobTitleId(Long jobTitleId) {
    this.jobTitleId = jobTitleId;
  }

/*  public JobTitle jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }*/

  /**
   * Get jobTitle
   * @return jobTitle
   **/
  @Schema(description = "")
  
    public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobTitle jobTitle = (JobTitle) o;
    return Objects.equals(this.jobTitleId, jobTitle.jobTitleId) &&
        Objects.equals(this.jobTitle, jobTitle.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTitleId, jobTitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTitle {\n");
    
    sb.append("    jobTitleId: ").append(toIndentedString(jobTitleId)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
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
