/*
 * Reseplaneraren
 * Provides access to Västtrafik journey planner
 *
 * OpenAPI spec version: 1.10.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.togowos.model;

import com.google.gson.annotations.SerializedName;

import org.threeten.bp.LocalDate;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * DateBegin
 */
public class DateBegin {
  @SerializedName("$")
  private LocalDate value = null;

  public DateBegin value(LocalDate value) {
    this.value = value;
    return this;
  }

   /**
   * Begin of timetable period in format YYYY-MM-DD
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Begin of timetable period in format YYYY-MM-DD")
  public LocalDate getValue() {
    return value;
  }

  public void setValue(LocalDate value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DateBegin dateBegin = (DateBegin) o;
    return Objects.equals(this.value, dateBegin.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateBegin {\n");

    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

