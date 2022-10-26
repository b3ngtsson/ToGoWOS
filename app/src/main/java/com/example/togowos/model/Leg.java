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
import com.example.togowos.model.Destination;
import com.example.togowos.model.GeometryRef;
import com.example.togowos.model.JourneyDetailRef;
import com.example.togowos.model.Notes;
import com.example.togowos.model.Origin;
import java.io.IOException;

/**
 * Leg
 */
public class Leg {
  @SerializedName("fgColor")
  private String fgColor = null;

  @SerializedName("booking")
  private Boolean booking = null;

  @SerializedName("direction")
  private String direction = null;

  @SerializedName("JourneyDetailRef")
  private JourneyDetailRef journeyDetailRef = null;

  @SerializedName("cancelled")
  private Boolean cancelled = null;

  @SerializedName("kcal")
  private Float kcal = null;

  @SerializedName("Origin")
  private Origin origin = null;

  @SerializedName("sname")
  private String sname = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("GeometryRef")
  private GeometryRef geometryRef = null;

  @SerializedName("bgColor")
  private String bgColor = null;

  @SerializedName("Notes")
  private Notes notes = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("stroke")
  private String stroke = null;

  @SerializedName("reachable")
  private Boolean reachable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("night")
  private Boolean night = null;

  @SerializedName("Destination")
  private Destination destination = null;

  @SerializedName("percentBikeRoad")
  private Float percentBikeRoad = null;

  @SerializedName("accessibility")
  private String accessibility = null;

  public Leg fgColor(String fgColor) {
    this.fgColor = fgColor;
    return this;
  }

   /**
   * Foregroundcolor of this line
   * @return fgColor
  **/
  @ApiModelProperty(value = "Foregroundcolor of this line")
  public String getFgColor() {
    return fgColor;
  }

  public void setFgColor(String fgColor) {
    this.fgColor = fgColor;
  }

  public Leg booking(Boolean booking) {
    this.booking = booking;
    return this;
  }

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

  public Leg direction(String direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction information
   * @return direction
  **/
  @ApiModelProperty(value = "Direction information")
  public String getDirection() {
    return direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public Leg journeyDetailRef(JourneyDetailRef journeyDetailRef) {
    this.journeyDetailRef = journeyDetailRef;
    return this;
  }

   /**
   * Get journeyDetailRef
   * @return journeyDetailRef
  **/
  @ApiModelProperty(value = "")
  public JourneyDetailRef getJourneyDetailRef() {
    return journeyDetailRef;
  }

  public void setJourneyDetailRef(JourneyDetailRef journeyDetailRef) {
    this.journeyDetailRef = journeyDetailRef;
  }

  public Leg cancelled(Boolean cancelled) {
    this.cancelled = cancelled;
    return this;
  }

   /**
   * Will be true if this journey is cancelled
   * @return cancelled
  **/
  @ApiModelProperty(value = "Will be true if this journey is cancelled")
  public Boolean isCancelled() {
    return cancelled;
  }

  public void setCancelled(Boolean cancelled) {
    this.cancelled = cancelled;
  }

  public Leg kcal(Float kcal) {
    this.kcal = kcal;
    return this;
  }

   /**
   * Energy use
   * @return kcal
  **/
  @ApiModelProperty(value = "Energy use")
  public Float getKcal() {
    return kcal;
  }

  public void setKcal(Float kcal) {
    this.kcal = kcal;
  }

  public Leg origin(Origin origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  public Leg sname(String sname) {
    this.sname = sname;
    return this;
  }

   /**
   * Short name of the leg
   * @return sname
  **/
  @ApiModelProperty(value = "Short name of the leg")
  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public Leg type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The attribute type specifies the type of the leg. Valid values are VAS, LDT (Long Distance Train), REG (Regional train), BUS , BOAT, TRAM, TAXI (Taxi/Telebus). Furthermore it can be of type WALK, BIKE and CAR if these legs are routes on the street network
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The attribute type specifies the type of the leg. Valid values are VAS, LDT (Long Distance Train), REG (Regional train), BUS , BOAT, TRAM, TAXI (Taxi/Telebus). Furthermore it can be of type WALK, BIKE and CAR if these legs are routes on the street network")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Leg geometryRef(GeometryRef geometryRef) {
    this.geometryRef = geometryRef;
    return this;
  }

   /**
   * Get geometryRef
   * @return geometryRef
  **/
  @ApiModelProperty(value = "")
  public GeometryRef getGeometryRef() {
    return geometryRef;
  }

  public void setGeometryRef(GeometryRef geometryRef) {
    this.geometryRef = geometryRef;
  }

  public Leg bgColor(String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

   /**
   * Backgroundcolor of this line
   * @return bgColor
  **/
  @ApiModelProperty(value = "Backgroundcolor of this line")
  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  public Leg notes(Notes notes) {
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

  public Leg id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the journey
   * @return id
  **/
  @ApiModelProperty(value = "ID of the journey")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Leg stroke(String stroke) {
    this.stroke = stroke;
    return this;
  }

   /**
   * Stroke style of this line
   * @return stroke
  **/
  @ApiModelProperty(value = "Stroke style of this line")
  public String getStroke() {
    return stroke;
  }

  public void setStroke(String stroke) {
    this.stroke = stroke;
  }

  public Leg reachable(Boolean reachable) {
    this.reachable = reachable;
    return this;
  }

   /**
   * Will be true if this journey is not reachable due to delay of the feeder
   * @return reachable
  **/
  @ApiModelProperty(value = "Will be true if this journey is not reachable due to delay of the feeder")
  public Boolean isReachable() {
    return reachable;
  }

  public void setReachable(Boolean reachable) {
    this.reachable = reachable;
  }

  public Leg name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The attribute name specifies the name of the leg
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The attribute name specifies the name of the leg")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Leg night(Boolean night) {
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

  public Leg destination(Destination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  public Leg percentBikeRoad(Float percentBikeRoad) {
    this.percentBikeRoad = percentBikeRoad;
    return this;
  }

   /**
   * Percentage of the route that is made up of bike roads
   * @return percentBikeRoad
  **/
  @ApiModelProperty(value = "Percentage of the route that is made up of bike roads")
  public Float getPercentBikeRoad() {
    return percentBikeRoad;
  }

  public void setPercentBikeRoad(Float percentBikeRoad) {
    this.percentBikeRoad = percentBikeRoad;
  }

  public Leg accessibility(String accessibility) {
    this.accessibility = accessibility;
    return this;
  }

   /**
   * will only be set if the vehicle has wheelchair + ramp/lift or lowfloor according to realtime data
   * @return accessibility
  **/
  @ApiModelProperty(value = "will only be set if the vehicle has wheelchair + ramp/lift or lowfloor according to realtime data")
  public String getAccessibility() {
    return accessibility;
  }

  public void setAccessibility(String accessibility) {
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
    Leg leg = (Leg) o;
    return Objects.equals(this.fgColor, leg.fgColor) &&
        Objects.equals(this.booking, leg.booking) &&
        Objects.equals(this.direction, leg.direction) &&
        Objects.equals(this.journeyDetailRef, leg.journeyDetailRef) &&
        Objects.equals(this.cancelled, leg.cancelled) &&
        Objects.equals(this.kcal, leg.kcal) &&
        Objects.equals(this.origin, leg.origin) &&
        Objects.equals(this.sname, leg.sname) &&
        Objects.equals(this.type, leg.type) &&
        Objects.equals(this.geometryRef, leg.geometryRef) &&
        Objects.equals(this.bgColor, leg.bgColor) &&
        Objects.equals(this.notes, leg.notes) &&
        Objects.equals(this.id, leg.id) &&
        Objects.equals(this.stroke, leg.stroke) &&
        Objects.equals(this.reachable, leg.reachable) &&
        Objects.equals(this.name, leg.name) &&
        Objects.equals(this.night, leg.night) &&
        Objects.equals(this.destination, leg.destination) &&
        Objects.equals(this.percentBikeRoad, leg.percentBikeRoad) &&
        Objects.equals(this.accessibility, leg.accessibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fgColor, booking, direction, journeyDetailRef, cancelled, kcal, origin, sname, type, geometryRef, bgColor, notes, id, stroke, reachable, name, night, destination, percentBikeRoad, accessibility);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Leg {\n");

    sb.append("    fgColor: ").append(toIndentedString(fgColor)).append("\n");
    sb.append("    booking: ").append(toIndentedString(booking)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    journeyDetailRef: ").append(toIndentedString(journeyDetailRef)).append("\n");
    sb.append("    cancelled: ").append(toIndentedString(cancelled)).append("\n");
    sb.append("    kcal: ").append(toIndentedString(kcal)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    sname: ").append(toIndentedString(sname)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    geometryRef: ").append(toIndentedString(geometryRef)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stroke: ").append(toIndentedString(stroke)).append("\n");
    sb.append("    reachable: ").append(toIndentedString(reachable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    night: ").append(toIndentedString(night)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    percentBikeRoad: ").append(toIndentedString(percentBikeRoad)).append("\n");
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
