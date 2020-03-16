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
import com.github.hermannpencole.nifi.swagger.client.model.Link;
import com.github.hermannpencole.nifi.swagger.client.model.Permissions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Bucket
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class Bucket {
  @SerializedName("link")
  private Link link = null;

  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createdTimestamp")
  private Long createdTimestamp = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("permissions")
  private Permissions permissions = null;

   /**
   * An WebLink to this entity.
   * @return link
  **/
  @ApiModelProperty(value = "An WebLink to this entity.")
  public Link getLink() {
    return link;
  }

  public Bucket identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * An ID to uniquely identify this object.
   * @return identifier
  **/
  @ApiModelProperty(value = "An ID to uniquely identify this object.")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Bucket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the bucket.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the bucket.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bucket createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The timestamp of when the bucket was first created. This is set by the server at creation time.
   * minimum: 1
   * @return createdTimestamp
  **/
  @ApiModelProperty(value = "The timestamp of when the bucket was first created. This is set by the server at creation time.")
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }

  public Bucket description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the bucket.
   * @return description
  **/
  @ApiModelProperty(value = "A description of the bucket.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The access that the current user has to this bucket.
   * @return permissions
  **/
  @ApiModelProperty(value = "The access that the current user has to this bucket.")
  public Permissions getPermissions() {
    return permissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bucket bucket = (Bucket) o;
    return Objects.equals(this.link, bucket.link) &&
        Objects.equals(this.identifier, bucket.identifier) &&
        Objects.equals(this.name, bucket.name) &&
        Objects.equals(this.createdTimestamp, bucket.createdTimestamp) &&
        Objects.equals(this.description, bucket.description) &&
        Objects.equals(this.permissions, bucket.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, identifier, name, createdTimestamp, description, permissions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bucket {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
