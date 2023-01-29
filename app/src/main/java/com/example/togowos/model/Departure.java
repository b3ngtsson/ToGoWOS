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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.threeten.bp.LocalDate;

import java.io.IOException;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Departure
 */
public class Departure {
  @SerializedName("fgColor")
  private String fgColor = null;

  @SerializedName("stop")
  private String stop = null;

  @SerializedName("booking")
  private Boolean booking = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("JourneyDetailRef")
  private JourneyDetailRef journeyDetailRef = null;

  @SerializedName("track")
  private String track = null;

  @SerializedName("rtTrack")
  private String rtTrack = null;

  @SerializedName("sname")
  private String sname = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("bgColor")
  private String bgColor = null;

  @SerializedName("stroke")
  private String stroke = null;

  @SerializedName("rtDate")
  private LocalDate rtDate = null;

  @SerializedName("time")
  private String time = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("rtTime")
  private String rtTime = null;

  @SerializedName("night")
  private Boolean night = null;

  @SerializedName("stopid")
  private String stopid = null;

  @SerializedName("journeyid")
  private String journeyid = null;

  private String timediff = null;

  /**
   * will only be set if the vehicle has wheelchair + ramp/lift or lowfloor according to realtime data
   */
  @JsonAdapter(AccessibilityEnum.Adapter.class)
  public enum AccessibilityEnum {
    WHEELCHAIR("wheelChair"),

    LOWFLOOR("lowFloor");

    private String value;

    AccessibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessibilityEnum fromValue(String text) {
      for (AccessibilityEnum b : AccessibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("accessibility")
  private AccessibilityEnum accessibility = null;

  public Departure fgColor(String fgColor) {
    this.fgColor = fgColor;
    return this;
  }

   /**
   * Foregroundcolor of this line
   * @return fgColor
  **/
  @ApiModelProperty(required = true, value = "Foregroundcolor of this line")
  public String getFgColor() {
    return fgColor;
  }

  public void setFgColor(String fgColor) {
    this.fgColor = fgColor;
  }

  public Departure stop(String stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Contains the name of the stop/station
   * @return stop
  **/
  @ApiModelProperty(required = true, value = "Contains the name of the stop/station")
  public String getStop() {
    return stop;
  }

  public void setStop(String stop) {
    this.stop = stop;
  }

  public Departure booking(Boolean booking) {
    this.booking = booking;
    return this;
  }

  public String getTimediff(){return timediff;}

  public void setTimediff(String timediff){this.timediff = timediff;}
   /**
   * Will be true if this journey needs to be booked
   * @return booking
  **/
  @ApiModelProperty(value = "Will be true if this journey needs to be booked")
  public Boolean isBooking() {
    return booking;
  }

  public void setBooking(Boolean booking) {
    this.booking = booking;
  }

  public Departure direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction information
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "Direction information")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public Departure journeyDetailRef(JourneyDetailRef journeyDetailRef) {
    this.journeyDetailRef = journeyDetailRef;
    return this;
  }

   /**
   * Get journeyDetailRef
   * @return journeyDetailRef
  **/
  @ApiModelProperty(required = true, value = "")
  public JourneyDetailRef getJourneyDetailRef() {
    return journeyDetailRef;
  }

  public void setJourneyDetailRef(JourneyDetailRef journeyDetailRef) {
    this.journeyDetailRef = journeyDetailRef;
  }

  public Departure track(String track) {
    this.track = track;
    return this;
  }

   /**
   * Track information, if available
   * @return track
  **/
  @ApiModelProperty(required = true, value = "Track information, if available")
  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
  }

  public Departure rtTrack(String rtTrack) {
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

  public Departure sname(String sname) {
    this.sname = sname;
    return this;
  }

   /**
   * Short name of the leg
   * @return sname
  **/
  @ApiModelProperty(required = true, value = "Short name of the leg")
  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public Departure type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The attribute type specifies the type of the departing journey. Valid values are VAS, LDT (Long Distance Train), REG (Regional train), BUS , BOAT, TRAM, TAXI (Taxi/Telebus)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The attribute type specifies the type of the departing journey. Valid values are VAS, LDT (Long Distance Train), REG (Regional train), BUS , BOAT, TRAM, TAXI (Taxi/Telebus)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Departure date(LocalDate date) {
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

  public Departure bgColor(String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

   /**
   * Backgroundcolor of this line
   * @return bgColor
  **/
  @ApiModelProperty(required = true, value = "Backgroundcolor of this line")
  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  public Departure stroke(String stroke) {
    this.stroke = stroke;
    return this;
  }

   /**
   * Stroke style of this line
   * @return stroke
  **/
  @ApiModelProperty(required = true, value = "Stroke style of this line")
  public String getStroke() {
    return stroke;
  }

  public void setStroke(String stroke) {
    this.stroke = stroke;
  }

  public Departure rtDate(LocalDate rtDate) {
    this.rtDate = rtDate;
    return this;
  }

   /**
   * Realtime date in format YYYY-MM-DD, if available
   * @return rtDate
  **/
  @ApiModelProperty(required = true, value = "Realtime date in format YYYY-MM-DD, if available")
  public LocalDate getRtDate() {
    return rtDate;
  }

  public void setRtDate(LocalDate rtDate) {
    this.rtDate = rtDate;
  }

  public Departure time(String time) {
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

  public Departure name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The attribute name specifies the name of the departing journey
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The attribute name specifies the name of the departing journey")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Departure rtTime(String rtTime) {
    this.rtTime = rtTime;
    return this;
  }

   /**
   * Realtime time in format HH:MM if available
   * @return rtTime
  **/
  @ApiModelProperty(required = true, value = "Realtime time in format HH:MM if available")
  public String getRtTime() {
    return rtTime;
  }

  public void setRtTime(String rtTime) {
    this.rtTime = rtTime;
  }

  public Departure night(Boolean night) {
    this.night = night;
    return this;
  }

   /**
   * Will be true if this journey is a night journey
   * @return night
  **/
  @ApiModelProperty(value = "Will be true if this journey is a night journey")
  public Boolean isNight() {
    return night;
  }

  public void setNight(Boolean night) {
    this.night = night;
  }

  public Departure stopid(String stopid) {
    this.stopid = stopid;
    return this;
  }

   /**
   * Contains the id of the stop/station
   * @return stopid
  **/
  @ApiModelProperty(required = true, value = "Contains the id of the stop/station")
  public String getStopid() {
    return stopid;
  }

  public void setStopid(String stopid) {
    this.stopid = stopid;
  }

  public Departure journeyid(String journeyid) {
    this.journeyid = journeyid;
    return this;
  }

   /**
   * Contains the id of the journey
   * @return journeyid
  **/
  @ApiModelProperty(required = true, value = "Contains the id of the journey")
  public String getJourneyid() {
    return journeyid;
  }

  public void setJourneyid(String journeyid) {
    this.journeyid = journeyid;
  }

  public Departure accessibility(AccessibilityEnum accessibility) {
    this.accessibility = accessibility;
    return this;
  }

   /**
   * will only be set if the vehicle has wheelchair + ramp/lift or lowfloor according to realtime data
   * @return accessibility
  **/
  @ApiModelProperty(required = true, value = "will only be set if the vehicle has wheelchair + ramp/lift or lowfloor according to realtime data")
  public AccessibilityEnum getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(AccessibilityEnum accessibility) {
    this.accessibility = accessibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Departure departure = (Departure) o;
    return Objects.equals(this.fgColor, departure.fgColor) &&
        Objects.equals(this.stop, departure.stop) &&
        Objects.equals(this.booking, departure.booking) &&
        Objects.equals(this.direction, departure.direction) &&
        Objects.equals(this.journeyDetailRef, departure.journeyDetailRef) &&
        Objects.equals(this.track, departure.track) &&
        Objects.equals(this.rtTrack, departure.rtTrack) &&
        Objects.equals(this.sname, departure.sname) &&
        Objects.equals(this.type, departure.type) &&
        Objects.equals(this.date, departure.date) &&
        Objects.equals(this.bgColor, departure.bgColor) &&
        Objects.equals(this.stroke, departure.stroke) &&
        Objects.equals(this.rtDate, departure.rtDate) &&
        Objects.equals(this.time, departure.time) &&
        Objects.equals(this.name, departure.name) &&
        Objects.equals(this.rtTime, departure.rtTime) &&
        Objects.equals(this.night, departure.night) &&
        Objects.equals(this.stopid, departure.stopid) &&
        Objects.equals(this.journeyid, departure.journeyid) &&
        Objects.equals(this.accessibility, departure.accessibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fgColor, stop, booking, direction, journeyDetailRef, track, rtTrack, sname, type, date, bgColor, stroke, rtDate, time, name, rtTime, night, stopid, journeyid, accessibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Departure {\n");

    sb.append("    fgColor: ").append(toIndentedString(fgColor)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    journeyDetailRef: ").append(toIndentedString(journeyDetailRef)).append("\n");
    sb.append("    track: ").append(toIndentedString(track)).append("\n");
    sb.append("    rtTrack: ").append(toIndentedString(rtTrack)).append("\n");
    sb.append("    sname: ").append(toIndentedString(sname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
    sb.append("    rtDate: ").append(toIndentedString(rtDate)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rtTime: ").append(toIndentedString(rtTime)).append("\n");
    sb.append("    night: ").append(toIndentedString(night)).append("\n");
    sb.append("    stopid: ").append(toIndentedString(stopid)).append("\n");
    sb.append("    journeyid: ").append(toIndentedString(journeyid)).append("\n");
    sb.append("    accessibility: ").append(toIndentedString(accessibility)).append("\n");
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

