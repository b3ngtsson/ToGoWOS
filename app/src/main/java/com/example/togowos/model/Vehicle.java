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

import java.io.IOException;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Vehicle
 */
public class Vehicle {
  @SerializedName("lcolor")
  private String lcolor = null;

  /**
   * Product class
   */
  @JsonAdapter(ProdClassEnum.Adapter.class)
  public enum ProdClassEnum {
    VAS("VAS"),

    LDT("LDT"),

    REG("REG"),

    BUS("BUS"),

    BOAT("BOAT"),

    TRAM("TRAM"),

    TAXI("TAXI");

    private String value;

    ProdClassEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProdClassEnum fromValue(String text) {
      for (ProdClassEnum b : ProdClassEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProdClassEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProdClassEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProdClassEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProdClassEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("prodClass")
  private ProdClassEnum prodClass = null;

  @SerializedName("bcolor")
  private String bcolor = null;

  @SerializedName("direction")
  private Integer direction = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("gid")
  private String gid = null;

  @SerializedName("delay")
  private Integer delay = null;

  @SerializedName("y")
  private Double y = null;

  @SerializedName("x")
  private Double x = null;

  public Vehicle lcolor(String lcolor) {
    this.lcolor = lcolor;
    return this;
  }

   /**
   * Line color of the journey
   * @return lcolor
  **/
  @ApiModelProperty(required = true, value = "Line color of the journey")
  public String getLcolor() {
    return lcolor;
  }

  public void setLcolor(String lcolor) {
    this.lcolor = lcolor;
  }

  public Vehicle prodClass(ProdClassEnum prodClass) {
    this.prodClass = prodClass;
    return this;
  }

   /**
   * Product class
   * @return prodClass
  **/
  @ApiModelProperty(required = true, value = "Product class")
  public ProdClassEnum getProdClass() {
    return prodClass;
  }

  public void setProdClass(ProdClassEnum prodClass) {
    this.prodClass = prodClass;
  }

  public Vehicle bcolor(String bcolor) {
    this.bcolor = bcolor;
    return this;
  }

   /**
   * Background color of the journey
   * @return bcolor
  **/
  @ApiModelProperty(required = true, value = "Background color of the journey")
  public String getBcolor() {
    return bcolor;
  }

  public void setBcolor(String bcolor) {
    this.bcolor = bcolor;
  }

  public Vehicle direction(Integer direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction of the vehicle. This is a value between 0 and 31 which is describing a direction vector
   * @return direction
  **/
  @ApiModelProperty(required = true, value = "Direction of the vehicle. This is a value between 0 and 31 which is describing a direction vector")
  public Integer getDirection() {
    return direction;
  }

  public void setDirection(Integer direction) {
    this.direction = direction;
  }

  public Vehicle name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Journey name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Journey name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle gid(String gid) {
    this.gid = gid;
    return this;
  }

   /**
   * Service GID
   * @return gid
  **/
  @ApiModelProperty(required = true, value = "Service GID")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public Vehicle delay(Integer delay) {
    this.delay = delay;
    return this;
  }

   /**
   * Current delay of the vehicle in minutes, can be negative, zero or positive
   * @return delay
  **/
  @ApiModelProperty(required = true, value = "Current delay of the vehicle in minutes, can be negative, zero or positive")
  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public Vehicle y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * Y coordinate (latitude) of the position in WGS84 * 1000000
   * @return y
  **/
  @ApiModelProperty(required = true, value = "Y coordinate (latitude) of the position in WGS84 * 1000000")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public Vehicle x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * X coordinate (longitude) of the position in WGS84 * 1000000
   * @return x
  **/
  @ApiModelProperty(required = true, value = "X coordinate (longitude) of the position in WGS84 * 1000000")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vehicle vehicle = (Vehicle) o;
    return Objects.equals(this.lcolor, vehicle.lcolor) &&
        Objects.equals(this.prodClass, vehicle.prodClass) &&
        Objects.equals(this.bcolor, vehicle.bcolor) &&
        Objects.equals(this.direction, vehicle.direction) &&
        Objects.equals(this.name, vehicle.name) &&
        Objects.equals(this.gid, vehicle.gid) &&
        Objects.equals(this.delay, vehicle.delay) &&
        Objects.equals(this.y, vehicle.y) &&
        Objects.equals(this.x, vehicle.x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lcolor, prodClass, bcolor, direction, name, gid, delay, y, x);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vehicle {\n");

    sb.append("    lcolor: ").append(toIndentedString(lcolor)).append("\n");
    sb.append("    prodClass: ").append(toIndentedString(prodClass)).append("\n");
    sb.append("    bcolor: ").append(toIndentedString(bcolor)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
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

