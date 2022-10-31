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
 * JourneyType
 */
public class JourneyType {
  @SerializedName("routeIdxTo")
  private Integer routeIdxTo = null;

  @SerializedName("routeIdxFrom")
  private Integer routeIdxFrom = null;

  @SerializedName("type")
  private String type = null;

  public JourneyType routeIdxTo(Integer routeIdxTo) {
    this.routeIdxTo = routeIdxTo;
    return this;
  }

   /**
   * End of validity on total route.
   * @return routeIdxTo
  **/
  @ApiModelProperty(required = true, value = "End of validity on total route.")
  public Integer getRouteIdxTo() {
    return routeIdxTo;
  }

  public void setRouteIdxTo(Integer routeIdxTo) {
    this.routeIdxTo = routeIdxTo;
  }

  public JourneyType routeIdxFrom(Integer routeIdxFrom) {
    this.routeIdxFrom = routeIdxFrom;
    return this;
  }

   /**
   * Start of validity on total route
   * @return routeIdxFrom
  **/
  @ApiModelProperty(required = true, value = "Start of validity on total route")
  public Integer getRouteIdxFrom() {
    return routeIdxFrom;
  }

  public void setRouteIdxFrom(Integer routeIdxFrom) {
    this.routeIdxFrom = routeIdxFrom;
  }

  public JourneyType type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The attribute type specifies the type of the journey. Valid values are VAS, LDT (Long Distance Train), REG (Regional train), BUS , BOAT, TRAM, TAXI (Taxi/Telebus)
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The attribute type specifies the type of the journey. Valid values are VAS, LDT (Long Distance Train), REG (Regional train), BUS , BOAT, TRAM, TAXI (Taxi/Telebus)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyType journeyType = (JourneyType) o;
    return Objects.equals(this.routeIdxTo, journeyType.routeIdxTo) &&
        Objects.equals(this.routeIdxFrom, journeyType.routeIdxFrom) &&
        Objects.equals(this.type, journeyType.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeIdxTo, routeIdxFrom, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyType {\n");

    sb.append("    routeIdxTo: ").append(toIndentedString(routeIdxTo)).append("\n");
    sb.append("    routeIdxFrom: ").append(toIndentedString(routeIdxFrom)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

