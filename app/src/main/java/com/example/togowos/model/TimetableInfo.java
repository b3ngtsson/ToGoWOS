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

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * TimetableInfo
 */
public class TimetableInfo {
  @SerializedName("TimeTableData")
  private TimeTableData timeTableData = null;

  @SerializedName("TimeTablePeriod")
  private TimeTablePeriod timeTablePeriod = null;

  public TimetableInfo timeTableData(TimeTableData timeTableData) {
    this.timeTableData = timeTableData;
    return this;
  }

   /**
   * Get timeTableData
   * @return timeTableData
  **/
  @ApiModelProperty(required = true, value = "")
  public TimeTableData getTimeTableData() {
    return timeTableData;
  }

  public void setTimeTableData(TimeTableData timeTableData) {
    this.timeTableData = timeTableData;
  }

  public TimetableInfo timeTablePeriod(TimeTablePeriod timeTablePeriod) {
    this.timeTablePeriod = timeTablePeriod;
    return this;
  }

   /**
   * Get timeTablePeriod
   * @return timeTablePeriod
  **/
  @ApiModelProperty(required = true, value = "")
  public TimeTablePeriod getTimeTablePeriod() {
    return timeTablePeriod;
  }

  public void setTimeTablePeriod(TimeTablePeriod timeTablePeriod) {
    this.timeTablePeriod = timeTablePeriod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimetableInfo timetableInfo = (TimetableInfo) o;
    return Objects.equals(this.timeTableData, timetableInfo.timeTableData) &&
        Objects.equals(this.timeTablePeriod, timetableInfo.timeTablePeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeTableData, timeTablePeriod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimetableInfo {\n");

    sb.append("    timeTableData: ").append(toIndentedString(timeTableData)).append("\n");
    sb.append("    timeTablePeriod: ").append(toIndentedString(timeTablePeriod)).append("\n");
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

