package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Department
 */
@Validated
@Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-12-01T09:17:33.513Z[GMT]")


@Entity
@Table(name = "DEPARTMENT_TABLE")
public class Department   {
  @JsonProperty("departmentId")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long departmentId = null;

  /**
   * Gets or Sets department
   */

  @JsonProperty("department")
  private String department = null;

  public Department departmentId(Long departmentId) {
    this.departmentId = departmentId;
    return this;
  }

  /**
   * Get departmentId
   * @return departmentId
   **/
  @Schema(example = "1", description = "")
  
    public Long getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(Long departmentId) {
    this.departmentId = departmentId;
  }


  /**
   * Get department
   * @return department
   **/
  @Schema(description = "")
  
    public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Department department = (Department) o;
    return Objects.equals(this.departmentId, department.departmentId) &&
        Objects.equals(this.department, department.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentId, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Department {\n");
    
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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
