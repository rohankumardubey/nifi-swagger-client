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
 * StatusDescriptorDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class StatusDescriptorDTO {
  @SerializedName("field")
  private String field = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("formatter")
  private String formatter = null;

  public StatusDescriptorDTO field(String field) {
    this.field = field;
    return this;
  }

   /**
   * The name of the status field.
   * @return field
  **/
  @ApiModelProperty(value = "The name of the status field.")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public StatusDescriptorDTO label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label for the status field.
   * @return label
  **/
  @ApiModelProperty(value = "The label for the status field.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public StatusDescriptorDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the status field.
   * @return description
  **/
  @ApiModelProperty(value = "The description of the status field.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StatusDescriptorDTO formatter(String formatter) {
    this.formatter = formatter;
    return this;
  }

   /**
   * The formatter for the status descriptor.
   * @return formatter
  **/
  @ApiModelProperty(value = "The formatter for the status descriptor.")
  public String getFormatter() {
    return formatter;
  }

  public void setFormatter(String formatter) {
    this.formatter = formatter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusDescriptorDTO statusDescriptorDTO = (StatusDescriptorDTO) o;
    return Objects.equals(this.field, statusDescriptorDTO.field) &&
        Objects.equals(this.label, statusDescriptorDTO.label) &&
        Objects.equals(this.description, statusDescriptorDTO.description) &&
        Objects.equals(this.formatter, statusDescriptorDTO.formatter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, label, description, formatter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusDescriptorDTO {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formatter: ").append(toIndentedString(formatter)).append("\n");
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

