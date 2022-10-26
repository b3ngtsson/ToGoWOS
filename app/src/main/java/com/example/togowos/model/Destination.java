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
import com.example.togowos.model.Notes;
import java.io.IOException;
import org.threeten.bp.LocalDate;

/**
 * Destination
 */
public class Destination {
  @SerializedName("routeIdx")
  private String routeIdx = null;

  @SerializedName("$")
  private String value = null;

  @SerializedName("cancelled")
  private Boolean cancelled = null;

  @SerializedName("track")
  private String track = null;

  @SerializedName("rtTrack")
  private String rtTrack = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("Notes")
  private Notes notes = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("rtDate")
  private LocalDate rtDate = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("directdate")
  private LocalDate directdate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rtTime")
  private String rtTime = null;

  @SerializedName("directtime")
  private String directtime = null;

  public Destination routeIdx(String routeIdx) {
    this.routeIdx = routeIdx;
    return this;
  }

   /**
   * Route index of a stop/station. Can be used as a reference of the stop/station in a journeyDetail response
   * @return routeIdx
  **/
  @ApiModelProperty(value = "Route index of a stop/station. Can be used as a reference of the stop/station in a journeyDetail response")
  public String getRouteIdx() {
    return routeIdx;
  }

  public void setRouteIdx(String routeIdx) {
    this.routeIdx = routeIdx;
  }

  public Destination value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(required = true, value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public Destination cancelled(Boolean cancelled) {
    this.cancelled = cancelled;
    return this;
  }

   /**
   * Will be set to true if departure/arrival at this stop is cancelled
   * @return cancelled
  **/
  @ApiModelProperty(value = "Will be set to true if departure/arrival at this stop is cancelled")
  public Boolean isCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public Destination track(String track) {
    this.track = track;
    return this;
  }

   /**
   * Track information, if available
   * @return track
  **/
  @ApiModelProperty(value = "Track information, if available")
  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
  }

  public Destination rtTrack(String rtTrack) {
    this.rtTrack = rtTrack;
    return this;
  }

   /**
   * Realtime track information, if available
   * @return rtTrack
  **/
  @ApiModelProperty(value = "Realtime track information, if available")
  public String getRtTrack() {
    return rtTrack;
  }

  public void setRtTrack(String rtTrack) {
    this.rtTrack = rtTrack;
  }

  public Destination type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The attribute type specifies the type of location. Valid values are ST (stop/station), ADR (address) or POI (point of interest)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The attribute type specifies the type of location. Valid values are ST (stop/station), ADR (address) or POI (point of interest)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Destination date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date in format YYYY-MM-DD
   * @return date
  **/
  @ApiModelProperty(required = true, value = "Date in format YYYY-MM-DD")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public Destination notes(Notes notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public Notes getNotes() {
    return notes;
  }

  public void setNotes(Notes notes) {
    this.notes = notes;
  }

  public Destination id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of this stop
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID of this stop")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Destination rtDate(LocalDate rtDate) {
    this.rtDate = rtDate;
    return this;
  }

   /**
   * Realtime date in format YYYY-MM-DD, if available
   * @return rtDate
  **/
  @ApiModelProperty(value = "Realtime date in format YYYY-MM-DD, if available")
  public LocalDate getRtDate() {
    return rtDate;
  }

  public void setRtDate(LocalDate rtDate) {
    this.rtDate = rtDate;
  }

  public Destination time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Time in format HH:MM
   * @return time
  **/
  @ApiModelProperty(required = true, value = "Time in format HH:MM")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Destination directdate(LocalDate directdate) {
    this.directdate = directdate;
    return this;
  }

   /**
   * Date in format YYYY-MM-DD.  Based on the direct travel time
   * @return directdate
  **/
  @ApiModelProperty(value = "Date in format YYYY-MM-DD.  Based on the direct travel time")
  public LocalDate getDirectdate() {
    return directdate;
  }

  public void setDirectdate(LocalDate directdate) {
    this.directdate = directdate;
  }

  public Destination name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Contains the name of the location
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Contains the name of the location")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Destination rtTime(String rtTime) {
    this.rtTime = rtTime;
    return this;
  }

   /**
   * Realtime time in format HH:MM if available
   * @return rtTime
  **/
  @ApiModelProperty(value = "Realtime time in format HH:MM if available")
  public String getRtTime() {
    return rtTime;
  }

  public void setRtTime(String rtTime) {
    this.rtTime = rtTime;
  }

  public Destination directtime(String directtime) {
    this.directtime = directtime;
    return this;
  }

   /**
   * Direct Time format HH:MM. Based on the direct travel time
   * @return directtime
  **/
  @ApiModelProperty(value = "Direct Time format HH:MM. Based on the direct travel time")
  public String getDirecttime() {
    return directtime;
  }

  public void setDirecttime(String directtime) {
    this.directtime = directtime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Destination destination = (Destination) o;
    return Objects.equals(this.routeIdx, destination.routeIdx) &&
        Objects.equals(this.value, destination.value) &&
        Objects.equals(this.cancelled, destination.cancelled) &&
        Objects.equals(this.track, destination.track) &&
        Objects.equals(this.rtTrack, destination.rtTrack) &&
        Objects.equals(this.type, destination.type) &&
        Objects.equals(this.date, destination.date) &&
        Objects.equals(this.notes, destination.notes) &&
        Objects.equals(this.id, destination.id) &&
        Objects.equals(this.rtDate, destination.rtDate) &&
        Objects.equals(this.time, destination.time) &&
        Objects.equals(this.directdate, destination.directdate) &&
        Objects.equals(this.name, destination.name) &&
        Objects.equals(this.rtTime, destination.rtTime) &&
        Objects.equals(this.directtime, destination.directtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeIdx, value, cancelled, track, rtTrack, type, date, notes, id, rtDate, time, directdate, name, rtTime, directtime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Destination {\n");

    sb.append("    routeIdx: ").append(toIndentedString(routeIdx)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
    sb.append("    rtTrack: ").append(toIndentedString(rtTrack)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rtDate: ").append(toIndentedString(rtDate)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    directdate: ").append(toIndentedString(directdate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rtTime: ").append(toIndentedString(rtTime)).append("\n");
    sb.append("    directtime: ").append(toIndentedString(directtime)).append("\n");
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
