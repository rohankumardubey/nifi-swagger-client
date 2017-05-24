/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.1.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateTemplateRequestEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T23:49:37.943+02:00")
public class CreateTemplateRequestEntity {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("snippetId")
  private String snippetId = null;

  public CreateTemplateRequestEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the template.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The name of the template.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateTemplateRequestEntity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the template.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "The description of the template.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateTemplateRequestEntity snippetId(String snippetId) {
    this.snippetId = snippetId;
    return this;
  }

   /**
   * The identifier of the snippet.
   * @return snippetId
  **/
  @ApiModelProperty(example = "null", value = "The identifier of the snippet.")
  public String getSnippetId() {
    return snippetId;
  }

  public void setSnippetId(String snippetId) {
    this.snippetId = snippetId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTemplateRequestEntity createTemplateRequestEntity = (CreateTemplateRequestEntity) o;
    return Objects.equals(this.name, createTemplateRequestEntity.name) &&
        Objects.equals(this.description, createTemplateRequestEntity.description) &&
        Objects.equals(this.snippetId, createTemplateRequestEntity.snippetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, snippetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTemplateRequestEntity {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    snippetId: ").append(toIndentedString(snippetId)).append("\n");
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
