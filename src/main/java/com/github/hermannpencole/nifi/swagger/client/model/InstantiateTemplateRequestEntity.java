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
import com.github.hermannpencole.nifi.swagger.client.model.FlowSnippetDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InstantiateTemplateRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class InstantiateTemplateRequestEntity {
  @SerializedName("originX")
  private Double originX = null;

  @SerializedName("originY")
  private Double originY = null;

  @SerializedName("templateId")
  private String templateId = null;

  @SerializedName("encodingVersion")
  private String encodingVersion = null;

  @SerializedName("snippet")
  private FlowSnippetDTO snippet = null;

  public InstantiateTemplateRequestEntity originX(Double originX) {
    this.originX = originX;
    return this;
  }

   /**
   * The x coordinate of the origin of the bounding box where the new components will be placed.
   * @return originX
  **/
  @ApiModelProperty(value = "The x coordinate of the origin of the bounding box where the new components will be placed.")
  public Double getOriginX() {
    return originX;
  }

  public void setOriginX(Double originX) {
    this.originX = originX;
  }

  public InstantiateTemplateRequestEntity originY(Double originY) {
    this.originY = originY;
    return this;
  }

   /**
   * The y coordinate of the origin of the bounding box where the new components will be placed.
   * @return originY
  **/
  @ApiModelProperty(value = "The y coordinate of the origin of the bounding box where the new components will be placed.")
  public Double getOriginY() {
    return originY;
  }

  public void setOriginY(Double originY) {
    this.originY = originY;
  }

  public InstantiateTemplateRequestEntity templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * The identifier of the template.
   * @return templateId
  **/
  @ApiModelProperty(value = "The identifier of the template.")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public InstantiateTemplateRequestEntity encodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
    return this;
  }

   /**
   * The encoding version of the flow snippet. If not specified, this is automatically populated by the node receiving the user request. If the snippet is specified, the version will be the latest. If the snippet is not specified, the version will come from the underlying template. These details need to be replicated throughout the cluster to ensure consistency.
   * @return encodingVersion
  **/
  @ApiModelProperty(value = "The encoding version of the flow snippet. If not specified, this is automatically populated by the node receiving the user request. If the snippet is specified, the version will be the latest. If the snippet is not specified, the version will come from the underlying template. These details need to be replicated throughout the cluster to ensure consistency.")
  public String getEncodingVersion() {
    return encodingVersion;
  }

  public void setEncodingVersion(String encodingVersion) {
    this.encodingVersion = encodingVersion;
  }

  public InstantiateTemplateRequestEntity snippet(FlowSnippetDTO snippet) {
    this.snippet = snippet;
    return this;
  }

   /**
   * A flow snippet of the template contents. If not specified, this is automatically populated by the node receiving the user request. These details need to be replicated throughout the cluster to ensure consistency.
   * @return snippet
  **/
  @ApiModelProperty(value = "A flow snippet of the template contents. If not specified, this is automatically populated by the node receiving the user request. These details need to be replicated throughout the cluster to ensure consistency.")
  public FlowSnippetDTO getSnippet() {
    return snippet;
  }

  public void setSnippet(FlowSnippetDTO snippet) {
    this.snippet = snippet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstantiateTemplateRequestEntity instantiateTemplateRequestEntity = (InstantiateTemplateRequestEntity) o;
    return Objects.equals(this.originX, instantiateTemplateRequestEntity.originX) &&
        Objects.equals(this.originY, instantiateTemplateRequestEntity.originY) &&
        Objects.equals(this.templateId, instantiateTemplateRequestEntity.templateId) &&
        Objects.equals(this.encodingVersion, instantiateTemplateRequestEntity.encodingVersion) &&
        Objects.equals(this.snippet, instantiateTemplateRequestEntity.snippet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originX, originY, templateId, encodingVersion, snippet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstantiateTemplateRequestEntity {\n");
    
    sb.append("    originX: ").append(toIndentedString(originX)).append("\n");
    sb.append("    originY: ").append(toIndentedString(originY)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    encodingVersion: ").append(toIndentedString(encodingVersion)).append("\n");
    sb.append("    snippet: ").append(toIndentedString(snippet)).append("\n");
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

