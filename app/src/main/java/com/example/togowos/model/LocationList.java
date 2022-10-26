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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.example.togowos.Api.*;
import io.swagger.annotations.ApiModelProperty;
import com.example.togowos.model.CoordLocation;
import com.example.togowos.model.StopLocation;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * LocationList
 */
public class LocationList {
  @SerializedName("errorText")
  private String errorText = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("serverdate")
  private LocalDate serverdate = null;

  @SerializedName("servertime")
  private String servertime = null;

  @SerializedName("StopLocation")
  private List<StopLocation> stopLocation = null;

  @SerializedName("CoordLocation")
  private List<CoordLocation> coordLocation = null;

  @SerializedName("noNamespaceSchemaLocation")
  private String noNamespaceSchemaLocation = null;

  public LocationList errorText(String errorText) {
    this.errorText = errorText;
    return this;
  }

   /**
   * Get errorText
   * @return errorText
  **/
  @ApiModelProperty(value = "")
  public String getErrorText() {
    return errorText;
  }

  public void setErrorText(String errorText) {
    this.errorText = errorText;
  }

  public LocationList error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public LocationList serverdate(LocalDate serverdate) {
    this.serverdate = serverdate;
    return this;
  }

   /**
   * Get serverdate
   * @return serverdate
  **/
  @ApiModelProperty(value = "")
  public LocalDate getServerdate() {
    return serverdate;
  }

  public void setServerdate(LocalDate serverdate) {
    this.serverdate = serverdate;
  }

  public LocationList servertime(String servertime) {
    this.servertime = servertime;
    return this;
  }

   /**
   * Current server time in format HH:MM
   * @return servertime
  **/
  @ApiModelProperty(value = "Current server time in format HH:MM")
  public String getServertime() {
    return servertime;
  }

  public void setServertime(String servertime) {
    this.servertime = servertime;
  }

  public LocationList stopLocation(List<StopLocation> stopLocation) {
    this.stopLocation = stopLocation;
    return this;
  }

  public LocationList addStopLocationItem(StopLocation stopLocationItem) {
    if (this.stopLocation == null) {
      this.stopLocation = new ArrayList<StopLocation>();
    }
    this.stopLocation.add(stopLocationItem);
    return this;
  }

   /**
   * Get stopLocation
   * @return stopLocation
  **/
  @ApiModelProperty(value = "")
  public List<StopLocation> getStopLocation() {
    return stopLocation;
  }

  public void setStopLocation(List<StopLocation> stopLocation) {
    this.stopLocation = stopLocation;
  }

  public LocationList coordLocation(List<CoordLocation> coordLocation) {
    this.coordLocation = coordLocation;
    return this;
  }

  public LocationList addCoordLocationItem(CoordLocation coordLocationItem) {
    if (this.coordLocation == null) {
      this.coordLocation = new ArrayList<CoordLocation>();
    }
    this.coordLocation.add(coordLocationItem);
    return this;
  }

   /**
   * Get coordLocation
   * @return coordLocation
  **/
  @ApiModelProperty(value = "")
  public List<CoordLocation> getCoordLocation() {
    return coordLocation;
  }

  public void setCoordLocation(List<CoordLocation> coordLocation) {
    this.coordLocation = coordLocation;
  }

  public LocationList noNamespaceSchemaLocation(String noNamespaceSchemaLocation) {
    this.noNamespaceSchemaLocation = noNamespaceSchemaLocation;
    return this;
  }

   /**
   * Get noNamespaceSchemaLocation
   * @return noNamespaceSchemaLocation
  **/
  @ApiModelProperty(required = true, value = "")
  public String getNoNamespaceSchemaLocation() {
    return noNamespaceSchemaLocation;
  }

  public void setNoNamespaceSchemaLocation(String noNamespaceSchemaLocation) {
    this.noNamespaceSchemaLocation = noNamespaceSchemaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationList locationList = (LocationList) o;
    return Objects.equals(this.errorText, locationList.errorText) &&
        Objects.equals(this.error, locationList.error) &&
        Objects.equals(this.serverdate, locationList.serverdate) &&
        Objects.equals(this.servertime, locationList.servertime) &&
        Objects.equals(this.stopLocation, locationList.stopLocation) &&
        Objects.equals(this.coordLocation, locationList.coordLocation) &&
        Objects.equals(this.noNamespaceSchemaLocation, locationList.noNamespaceSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorText, error, serverdate, servertime, stopLocation, coordLocation, noNamespaceSchemaLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationList {\n");

    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    serverdate: ").append(toIndentedString(serverdate)).append("\n");
    sb.append("    servertime: ").append(toIndentedString(servertime)).append("\n");
    sb.append("    stopLocation: ").append(toIndentedString(stopLocation)).append("\n");
    sb.append("    coordLocation: ").append(toIndentedString(coordLocation)).append("\n");
    sb.append("    noNamespaceSchemaLocation: ").append(toIndentedString(noNamespaceSchemaLocation)).append("\n");
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
