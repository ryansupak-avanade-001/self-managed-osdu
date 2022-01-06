/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * FileListRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T21:59:16.916Z")
public class FileListRequest {
  @SerializedName("TimeFrom")
  private String timeFrom = null;

  @SerializedName("TimeTo")
  private String timeTo = null;

  @SerializedName("PageNum")
  private Integer pageNum = null;

  @SerializedName("Items")
  private Integer items = null;

  @SerializedName("UserID")
  private String userID = null;

  public FileListRequest timeFrom(String timeFrom) {
    this.timeFrom = timeFrom;
    return this;
  }

   /**
   * Get timeFrom
   * @return timeFrom
  **/
  @ApiModelProperty(value = "")
  public String getTimeFrom() {
    return timeFrom;
  }

  public void setTimeFrom(String timeFrom) {
    this.timeFrom = timeFrom;
  }

  public FileListRequest timeTo(String timeTo) {
    this.timeTo = timeTo;
    return this;
  }

   /**
   * Get timeTo
   * @return timeTo
  **/
  @ApiModelProperty(value = "")
  public String getTimeTo() {
    return timeTo;
  }

  public void setTimeTo(String timeTo) {
    this.timeTo = timeTo;
  }

  public FileListRequest pageNum(Integer pageNum) {
    this.pageNum = pageNum;
    return this;
  }

   /**
   * Get pageNum
   * @return pageNum
  **/
  @ApiModelProperty(value = "")
  public Integer getPageNum() {
    return pageNum;
  }

  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  public FileListRequest items(Integer items) {
    this.items = items;
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public Integer getItems() {
    return items;
  }

  public void setItems(Integer items) {
    this.items = items;
  }

  public FileListRequest userID(String userID) {
    this.userID = userID;
    return this;
  }

   /**
   * Get userID
   * @return userID
  **/
  @ApiModelProperty(value = "")
  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileListRequest fileListRequest = (FileListRequest) o;
    return Objects.equals(this.timeFrom, fileListRequest.timeFrom) &&
        Objects.equals(this.timeTo, fileListRequest.timeTo) &&
        Objects.equals(this.pageNum, fileListRequest.pageNum) &&
        Objects.equals(this.items, fileListRequest.items) &&
        Objects.equals(this.userID, fileListRequest.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeFrom, timeTo, pageNum, items, userID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileListRequest {\n");
    
    sb.append("    timeFrom: ").append(toIndentedString(timeFrom)).append("\n");
    sb.append("    timeTo: ").append(toIndentedString(timeTo)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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

