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
import com.github.hermannpencole.nifi.swagger.client.model.PositionDTO;
import com.github.hermannpencole.nifi.swagger.client.model.VersionControlInformationDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProcessGroupDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-03T16:29:45.931+01:00")
public class ProcessGroupDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("versionedComponentId")
  private String versionedComponentId = null;

  @SerializedName("parentGroupId")
  private String parentGroupId = null;

  @SerializedName("position")
  private PositionDTO position = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("variables")
  private Map<String, String> variables = null;

  @SerializedName("versionControlInformation")
  private VersionControlInformationDTO versionControlInformation = null;

  @SerializedName("runningCount")
  private Integer runningCount = null;

  @SerializedName("stoppedCount")
  private Integer stoppedCount = null;

  @SerializedName("invalidCount")
  private Integer invalidCount = null;

  @SerializedName("disabledCount")
  private Integer disabledCount = null;

  @SerializedName("activeRemotePortCount")
  private Integer activeRemotePortCount = null;

  @SerializedName("inactiveRemotePortCount")
  private Integer inactiveRemotePortCount = null;

  @SerializedName("upToDateCount")
  private Integer upToDateCount = null;

  @SerializedName("locallyModifiedCount")
  private Integer locallyModifiedCount = null;

  @SerializedName("staleCount")
  private Integer staleCount = null;

  @SerializedName("locallyModifiedAndStaleCount")
  private Integer locallyModifiedAndStaleCount = null;

  @SerializedName("syncFailureCount")
  private Integer syncFailureCount = null;

  @SerializedName("inputPortCount")
  private Integer inputPortCount = null;

  @SerializedName("outputPortCount")
  private Integer outputPortCount = null;

  @SerializedName("contents")
  private FlowSnippetDTO contents = null;

  public ProcessGroupDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @ApiModelProperty(value = "The id of the component.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProcessGroupDTO versionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @ApiModelProperty(value = "The ID of the corresponding component that is under version control")
  public String getVersionedComponentId() {
    return versionedComponentId;
  }

  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }

  public ProcessGroupDTO parentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")
  public String getParentGroupId() {
    return parentGroupId;
  }

  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }

  public ProcessGroupDTO position(PositionDTO position) {
    this.position = position;
    return this;
  }

   /**
   * The position of this component in the UI if applicable.
   * @return position
  **/
  @ApiModelProperty(value = "The position of this component in the UI if applicable.")
  public PositionDTO getPosition() {
    return position;
  }

  public void setPosition(PositionDTO position) {
    this.position = position;
  }

  public ProcessGroupDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the process group.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the process group.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProcessGroupDTO comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * The comments for the process group.
   * @return comments
  **/
  @ApiModelProperty(value = "The comments for the process group.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

   /**
   * The variables that are configured for the Process Group. Note that this map contains only those variables that are defined on this Process Group and not any variables that are defined in the parent Process Group, etc. I.e., this Map will not contain all variables that are accessible by components in this Process Group by rather only the variables that are defined for this Process Group itself.
   * @return variables
  **/
  @ApiModelProperty(value = "The variables that are configured for the Process Group. Note that this map contains only those variables that are defined on this Process Group and not any variables that are defined in the parent Process Group, etc. I.e., this Map will not contain all variables that are accessible by components in this Process Group by rather only the variables that are defined for this Process Group itself.")
  public Map<String, String> getVariables() {
    return variables;
  }

  public ProcessGroupDTO versionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
    return this;
  }

   /**
   * The Version Control information that indicates which Flow Registry, and where in the Flow Registry, this Process Group is tracking to; or null if this Process Group is not under version control
   * @return versionControlInformation
  **/
  @ApiModelProperty(value = "The Version Control information that indicates which Flow Registry, and where in the Flow Registry, this Process Group is tracking to; or null if this Process Group is not under version control")
  public VersionControlInformationDTO getVersionControlInformation() {
    return versionControlInformation;
  }

  public void setVersionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
  }

  public ProcessGroupDTO runningCount(Integer runningCount) {
    this.runningCount = runningCount;
    return this;
  }

   /**
   * The number of running components in this process group.
   * @return runningCount
  **/
  @ApiModelProperty(value = "The number of running components in this process group.")
  public Integer getRunningCount() {
    return runningCount;
  }

  public void setRunningCount(Integer runningCount) {
    this.runningCount = runningCount;
  }

  public ProcessGroupDTO stoppedCount(Integer stoppedCount) {
    this.stoppedCount = stoppedCount;
    return this;
  }

   /**
   * The number of stopped components in the process group.
   * @return stoppedCount
  **/
  @ApiModelProperty(value = "The number of stopped components in the process group.")
  public Integer getStoppedCount() {
    return stoppedCount;
  }

  public void setStoppedCount(Integer stoppedCount) {
    this.stoppedCount = stoppedCount;
  }

  public ProcessGroupDTO invalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
    return this;
  }

   /**
   * The number of invalid components in the process group.
   * @return invalidCount
  **/
  @ApiModelProperty(value = "The number of invalid components in the process group.")
  public Integer getInvalidCount() {
    return invalidCount;
  }

  public void setInvalidCount(Integer invalidCount) {
    this.invalidCount = invalidCount;
  }

  public ProcessGroupDTO disabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
    return this;
  }

   /**
   * The number of disabled components in the process group.
   * @return disabledCount
  **/
  @ApiModelProperty(value = "The number of disabled components in the process group.")
  public Integer getDisabledCount() {
    return disabledCount;
  }

  public void setDisabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
  }

  public ProcessGroupDTO activeRemotePortCount(Integer activeRemotePortCount) {
    this.activeRemotePortCount = activeRemotePortCount;
    return this;
  }

   /**
   * The number of active remote ports in the process group.
   * @return activeRemotePortCount
  **/
  @ApiModelProperty(value = "The number of active remote ports in the process group.")
  public Integer getActiveRemotePortCount() {
    return activeRemotePortCount;
  }

  public void setActiveRemotePortCount(Integer activeRemotePortCount) {
    this.activeRemotePortCount = activeRemotePortCount;
  }

  public ProcessGroupDTO inactiveRemotePortCount(Integer inactiveRemotePortCount) {
    this.inactiveRemotePortCount = inactiveRemotePortCount;
    return this;
  }

   /**
   * The number of inactive remote ports in the process group.
   * @return inactiveRemotePortCount
  **/
  @ApiModelProperty(value = "The number of inactive remote ports in the process group.")
  public Integer getInactiveRemotePortCount() {
    return inactiveRemotePortCount;
  }

  public void setInactiveRemotePortCount(Integer inactiveRemotePortCount) {
    this.inactiveRemotePortCount = inactiveRemotePortCount;
  }

  public ProcessGroupDTO upToDateCount(Integer upToDateCount) {
    this.upToDateCount = upToDateCount;
    return this;
  }

   /**
   * The number of up to date versioned process groups in the process group.
   * @return upToDateCount
  **/
  @ApiModelProperty(value = "The number of up to date versioned process groups in the process group.")
  public Integer getUpToDateCount() {
    return upToDateCount;
  }

  public void setUpToDateCount(Integer upToDateCount) {
    this.upToDateCount = upToDateCount;
  }

  public ProcessGroupDTO locallyModifiedCount(Integer locallyModifiedCount) {
    this.locallyModifiedCount = locallyModifiedCount;
    return this;
  }

   /**
   * The number of locally modified versioned process groups in the process group.
   * @return locallyModifiedCount
  **/
  @ApiModelProperty(value = "The number of locally modified versioned process groups in the process group.")
  public Integer getLocallyModifiedCount() {
    return locallyModifiedCount;
  }

  public void setLocallyModifiedCount(Integer locallyModifiedCount) {
    this.locallyModifiedCount = locallyModifiedCount;
  }

  public ProcessGroupDTO staleCount(Integer staleCount) {
    this.staleCount = staleCount;
    return this;
  }

   /**
   * The number of stale versioned process groups in the process group.
   * @return staleCount
  **/
  @ApiModelProperty(value = "The number of stale versioned process groups in the process group.")
  public Integer getStaleCount() {
    return staleCount;
  }

  public void setStaleCount(Integer staleCount) {
    this.staleCount = staleCount;
  }

  public ProcessGroupDTO locallyModifiedAndStaleCount(Integer locallyModifiedAndStaleCount) {
    this.locallyModifiedAndStaleCount = locallyModifiedAndStaleCount;
    return this;
  }

   /**
   * The number of locally modified and stale versioned process groups in the process group.
   * @return locallyModifiedAndStaleCount
  **/
  @ApiModelProperty(value = "The number of locally modified and stale versioned process groups in the process group.")
  public Integer getLocallyModifiedAndStaleCount() {
    return locallyModifiedAndStaleCount;
  }

  public void setLocallyModifiedAndStaleCount(Integer locallyModifiedAndStaleCount) {
    this.locallyModifiedAndStaleCount = locallyModifiedAndStaleCount;
  }

  public ProcessGroupDTO syncFailureCount(Integer syncFailureCount) {
    this.syncFailureCount = syncFailureCount;
    return this;
  }

   /**
   * The number of versioned process groups in the process group that are unable to sync to a registry.
   * @return syncFailureCount
  **/
  @ApiModelProperty(value = "The number of versioned process groups in the process group that are unable to sync to a registry.")
  public Integer getSyncFailureCount() {
    return syncFailureCount;
  }

  public void setSyncFailureCount(Integer syncFailureCount) {
    this.syncFailureCount = syncFailureCount;
  }

  public ProcessGroupDTO inputPortCount(Integer inputPortCount) {
    this.inputPortCount = inputPortCount;
    return this;
  }

   /**
   * The number of input ports in the process group.
   * @return inputPortCount
  **/
  @ApiModelProperty(value = "The number of input ports in the process group.")
  public Integer getInputPortCount() {
    return inputPortCount;
  }

  public void setInputPortCount(Integer inputPortCount) {
    this.inputPortCount = inputPortCount;
  }

  public ProcessGroupDTO outputPortCount(Integer outputPortCount) {
    this.outputPortCount = outputPortCount;
    return this;
  }

   /**
   * The number of output ports in the process group.
   * @return outputPortCount
  **/
  @ApiModelProperty(value = "The number of output ports in the process group.")
  public Integer getOutputPortCount() {
    return outputPortCount;
  }

  public void setOutputPortCount(Integer outputPortCount) {
    this.outputPortCount = outputPortCount;
  }

  public ProcessGroupDTO contents(FlowSnippetDTO contents) {
    this.contents = contents;
    return this;
  }

   /**
   * The contents of this process group.
   * @return contents
  **/
  @ApiModelProperty(value = "The contents of this process group.")
  public FlowSnippetDTO getContents() {
    return contents;
  }

  public void setContents(FlowSnippetDTO contents) {
    this.contents = contents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupDTO processGroupDTO = (ProcessGroupDTO) o;
    return Objects.equals(this.id, processGroupDTO.id) &&
        Objects.equals(this.versionedComponentId, processGroupDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, processGroupDTO.parentGroupId) &&
        Objects.equals(this.position, processGroupDTO.position) &&
        Objects.equals(this.name, processGroupDTO.name) &&
        Objects.equals(this.comments, processGroupDTO.comments) &&
        Objects.equals(this.variables, processGroupDTO.variables) &&
        Objects.equals(this.versionControlInformation, processGroupDTO.versionControlInformation) &&
        Objects.equals(this.runningCount, processGroupDTO.runningCount) &&
        Objects.equals(this.stoppedCount, processGroupDTO.stoppedCount) &&
        Objects.equals(this.invalidCount, processGroupDTO.invalidCount) &&
        Objects.equals(this.disabledCount, processGroupDTO.disabledCount) &&
        Objects.equals(this.activeRemotePortCount, processGroupDTO.activeRemotePortCount) &&
        Objects.equals(this.inactiveRemotePortCount, processGroupDTO.inactiveRemotePortCount) &&
        Objects.equals(this.upToDateCount, processGroupDTO.upToDateCount) &&
        Objects.equals(this.locallyModifiedCount, processGroupDTO.locallyModifiedCount) &&
        Objects.equals(this.staleCount, processGroupDTO.staleCount) &&
        Objects.equals(this.locallyModifiedAndStaleCount, processGroupDTO.locallyModifiedAndStaleCount) &&
        Objects.equals(this.syncFailureCount, processGroupDTO.syncFailureCount) &&
        Objects.equals(this.inputPortCount, processGroupDTO.inputPortCount) &&
        Objects.equals(this.outputPortCount, processGroupDTO.outputPortCount) &&
        Objects.equals(this.contents, processGroupDTO.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, name, comments, variables, versionControlInformation, runningCount, stoppedCount, invalidCount, disabledCount, activeRemotePortCount, inactiveRemotePortCount, upToDateCount, locallyModifiedCount, staleCount, locallyModifiedAndStaleCount, syncFailureCount, inputPortCount, outputPortCount, contents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    versionControlInformation: ").append(toIndentedString(versionControlInformation)).append("\n");
    sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
    sb.append("    stoppedCount: ").append(toIndentedString(stoppedCount)).append("\n");
    sb.append("    invalidCount: ").append(toIndentedString(invalidCount)).append("\n");
    sb.append("    disabledCount: ").append(toIndentedString(disabledCount)).append("\n");
    sb.append("    activeRemotePortCount: ").append(toIndentedString(activeRemotePortCount)).append("\n");
    sb.append("    inactiveRemotePortCount: ").append(toIndentedString(inactiveRemotePortCount)).append("\n");
    sb.append("    upToDateCount: ").append(toIndentedString(upToDateCount)).append("\n");
    sb.append("    locallyModifiedCount: ").append(toIndentedString(locallyModifiedCount)).append("\n");
    sb.append("    staleCount: ").append(toIndentedString(staleCount)).append("\n");
    sb.append("    locallyModifiedAndStaleCount: ").append(toIndentedString(locallyModifiedAndStaleCount)).append("\n");
    sb.append("    syncFailureCount: ").append(toIndentedString(syncFailureCount)).append("\n");
    sb.append("    inputPortCount: ").append(toIndentedString(inputPortCount)).append("\n");
    sb.append("    outputPortCount: ").append(toIndentedString(outputPortCount)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

