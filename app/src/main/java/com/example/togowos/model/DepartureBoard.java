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
import com.example.togowos.model.Departure;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * DepartureBoard
 */
public class DepartureBoard {
  @SerializedName("errorText")
  private String errorText = null;

  @SerializedName("Departure")
  private List<Departure> departure = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("serverdate")
  private LocalDate serverdate = null;

  @SerializedName("servertime")
  private String servertime = null;

  @SerializedName("noNamespaceSchemaLocation")
  private String noNamespaceSchemaLocation = null;

  public DepartureBoard errorText(String errorText) {
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

  public DepartureBoard departure(List<Departure> departure) {
    this.departure = departure;
    return this;
  }

  public DepartureBoard addDepartureItem(Departure departureItem) {
    if (this.departure == null) {
      this.departure = new ArrayList<Departure>();
    }
    this.departure.add(departureItem);
    return this;
  }

   /**
   * Get departure
   * @return departure
  **/
  @ApiModelProperty(value = "")
  public List<Departure> getDeparture() {
    return departure;
  }

  public void setDeparture(List<Departure> departure) {
    this.departure = departure;
  }

  public DepartureBoard error(String error) {
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

  public DepartureBoard serverdate(LocalDate serverdate) {
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

  public DepartureBoard servertime(String servertime) {
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

  public DepartureBoard noNamespaceSchemaLocation(String noNamespaceSchemaLocation) {
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
    DepartureBoard departureBoard = (DepartureBoard) o;
    return Objects.equals(this.errorText, departureBoard.errorText) &&
        Objects.equals(this.departure, departureBoard.departure) &&
        Objects.equals(this.error, departureBoard.error) &&
        Objects.equals(this.serverdate, departureBoard.serverdate) &&
        Objects.equals(this.servertime, departureBoard.servertime) &&
        Objects.equals(this.noNamespaceSchemaLocation, departureBoard.noNamespaceSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorText, departure, error, serverdate, servertime, noNamespaceSchemaLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepartureBoard {\n");

    sb.append("    errorText: ").append(toIndentedString(errorText)).append("\n");
    sb.append("    departure: ").append(toIndentedString(departure)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    serverdate: ").append(toIndentedString(serverdate)).append("\n");
    sb.append("    servertime: ").append(toIndentedString(servertime)).append("\n");
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
