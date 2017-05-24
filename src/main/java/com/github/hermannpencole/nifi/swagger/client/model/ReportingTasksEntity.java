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
import com.github.hermannpencole.nifi.swagger.client.model.ReportingTaskEntity;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ReportingTasksEntity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T23:49:37.943+02:00")
public class ReportingTasksEntity {
  @SerializedName("reportingTasks")
  private List<ReportingTaskEntity> reportingTasks = new ArrayList<ReportingTaskEntity>();

  public ReportingTasksEntity reportingTasks(List<ReportingTaskEntity> reportingTasks) {
    this.reportingTasks = reportingTasks;
    return this;
  }

  public ReportingTasksEntity addReportingTasksItem(ReportingTaskEntity reportingTasksItem) {
    this.reportingTasks.add(reportingTasksItem);
    return this;
  }

   /**
   * Get reportingTasks
   * @return reportingTasks
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ReportingTaskEntity> getReportingTasks() {
    return reportingTasks;
  }

  public void setReportingTasks(List<ReportingTaskEntity> reportingTasks) {
    this.reportingTasks = reportingTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTasksEntity reportingTasksEntity = (ReportingTasksEntity) o;
    return Objects.equals(this.reportingTasks, reportingTasksEntity.reportingTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTasksEntity {\n");
    
    sb.append("    reportingTasks: ").append(toIndentedString(reportingTasks)).append("\n");
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
