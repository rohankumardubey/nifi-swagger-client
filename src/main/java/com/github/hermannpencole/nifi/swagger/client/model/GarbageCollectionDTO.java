/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.5.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GarbageCollectionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class GarbageCollectionDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("collectionCount")
  private Long collectionCount = null;

  @SerializedName("collectionTime")
  private String collectionTime = null;

  @SerializedName("collectionMillis")
  private Long collectionMillis = null;

  public GarbageCollectionDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the garbage collector.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the garbage collector.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GarbageCollectionDTO collectionCount(Long collectionCount) {
    this.collectionCount = collectionCount;
    return this;
  }

   /**
   * The number of times garbage collection has run.
   * @return collectionCount
  **/
  @ApiModelProperty(value = "The number of times garbage collection has run.")
  public Long getCollectionCount() {
    return collectionCount;
  }

  public void setCollectionCount(Long collectionCount) {
    this.collectionCount = collectionCount;
  }

  public GarbageCollectionDTO collectionTime(String collectionTime) {
    this.collectionTime = collectionTime;
    return this;
  }

   /**
   * The total amount of time spent garbage collecting.
   * @return collectionTime
  **/
  @ApiModelProperty(value = "The total amount of time spent garbage collecting.")
  public String getCollectionTime() {
    return collectionTime;
  }

  public void setCollectionTime(String collectionTime) {
    this.collectionTime = collectionTime;
  }

  public GarbageCollectionDTO collectionMillis(Long collectionMillis) {
    this.collectionMillis = collectionMillis;
    return this;
  }

   /**
   * The total number of milliseconds spent garbage collecting.
   * @return collectionMillis
  **/
  @ApiModelProperty(value = "The total number of milliseconds spent garbage collecting.")
  public Long getCollectionMillis() {
    return collectionMillis;
  }

  public void setCollectionMillis(Long collectionMillis) {
    this.collectionMillis = collectionMillis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GarbageCollectionDTO garbageCollectionDTO = (GarbageCollectionDTO) o;
    return Objects.equals(this.name, garbageCollectionDTO.name) &&
        Objects.equals(this.collectionCount, garbageCollectionDTO.collectionCount) &&
        Objects.equals(this.collectionTime, garbageCollectionDTO.collectionTime) &&
        Objects.equals(this.collectionMillis, garbageCollectionDTO.collectionMillis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, collectionCount, collectionTime, collectionMillis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GarbageCollectionDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    collectionCount: ").append(toIndentedString(collectionCount)).append("\n");
    sb.append("    collectionTime: ").append(toIndentedString(collectionTime)).append("\n");
    sb.append("    collectionMillis: ").append(toIndentedString(collectionMillis)).append("\n");
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

