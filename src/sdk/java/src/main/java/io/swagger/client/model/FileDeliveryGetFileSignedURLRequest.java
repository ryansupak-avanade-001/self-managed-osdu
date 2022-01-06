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
import java.util.ArrayList;
import java.util.List;

/**
 * FileDeliveryGetFileSignedURLRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:03:41.621Z")
public class FileDeliveryGetFileSignedURLRequest {
  @SerializedName("srn")
  private List<String> srn = null;

  public FileDeliveryGetFileSignedURLRequest srn(List<String> srn) {
    this.srn = srn;
    return this;
  }

  public FileDeliveryGetFileSignedURLRequest addSrnItem(String srnItem) {
    if (this.srn == null) {
      this.srn = new ArrayList<String>();
    }
    this.srn.add(srnItem);
    return this;
  }

   /**
   * A list of SRNs to fetch
   * @return srn
  **/
  @ApiModelProperty(value = "A list of SRNs to fetch")
  public List<String> getSrn() {
    return srn;
  }

  public void setSrn(List<String> srn) {
    this.srn = srn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileDeliveryGetFileSignedURLRequest fileDeliveryGetFileSignedURLRequest = (FileDeliveryGetFileSignedURLRequest) o;
    return Objects.equals(this.srn, fileDeliveryGetFileSignedURLRequest.srn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(srn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileDeliveryGetFileSignedURLRequest {\n");
    
    sb.append("    srn: ").append(toIndentedString(srn)).append("\n");
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

