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
import com.example.togowos.model.Leg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Trip
 */
public class Trip {
  @SerializedName("Leg")
  private List<Leg> leg = null;

  @SerializedName("travelWarranty")
  private Boolean travelWarranty = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("alternative")
  private Boolean alternative = null;

  /**
   * Type of trip
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    WALK("WALK"),

    BIKE("BIKE"),

    CAR("CAR");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public Trip leg(List<Leg> leg) {
    this.leg = leg;
    return this;
  }

  public Trip addLegItem(Leg legItem) {
    if (this.leg == null) {
      this.leg = new ArrayList<Leg>();
    }
    this.leg.add(legItem);
    return this;
  }

   /**
   * Get leg
   * @return leg
  **/
  @ApiModelProperty(value = "")
  public List<Leg> getLeg() {
    return leg;
  }

  public void setLeg(List<Leg> leg) {
    this.leg = leg;
  }

  public Trip travelWarranty(Boolean travelWarranty) {
    this.travelWarranty = travelWarranty;
    return this;
  }

   /**
   * IMPORTANT NOTE: journeys that are presented when the default change margin has been disregarded are not covered by V�sttrafiks travel warranty (Swedish: resegaranti).
   * @return travelWarranty
  **/
  @ApiModelProperty(value = "IMPORTANT NOTE: journeys that are presented when the default change margin has been disregarded are not covered by V�sttrafiks travel warranty (Swedish: resegaranti).")
  public Boolean isTravelWarranty() {
    return travelWarranty;
  }

  public void setTravelWarranty(Boolean travelWarranty) {
    this.travelWarranty = travelWarranty;
  }

  public Trip valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * The state indicates if the trip is still possible to ride based on the current realtime situation
   * @return valid
  **/
  @ApiModelProperty(value = "The state indicates if the trip is still possible to ride based on the current realtime situation")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Trip alternative(Boolean alternative) {
    this.alternative = alternative;
    return this;
  }

   /**
   * The type indicates whether this is an original connection or an realtime alternative
   * @return alternative
  **/
  @ApiModelProperty(required = true, value = "The type indicates whether this is an original connection or an realtime alternative")
  public Boolean isAlternative() {
    return alternative;
  }

  public void setAlternative(Boolean alternative) {
    this.alternative = alternative;
  }

  public Trip type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of trip
   * @return type
  **/
  @ApiModelProperty(value = "Type of trip")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    Trip trip = (Trip) o;
    return Objects.equals(this.leg, trip.leg) &&
        Objects.equals(this.travelWarranty, trip.travelWarranty) &&
        Objects.equals(this.valid, trip.valid) &&
        Objects.equals(this.alternative, trip.alternative) &&
        Objects.equals(this.type, trip.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leg, travelWarranty, valid, alternative, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trip {\n");

    sb.append("    leg: ").append(toIndentedString(leg)).append("\n");
    sb.append("    travelWarranty: ").append(toIndentedString(travelWarranty)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    alternative: ").append(toIndentedString(alternative)).append("\n");
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
