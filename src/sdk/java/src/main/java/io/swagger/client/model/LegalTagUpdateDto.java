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
 * The model to update an existing LegalTag
 */
@ApiModel(description = "The model to update an existing LegalTag")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T21:59:16.916Z")
public class LegalTagUpdateDto {
  @SerializedName("name")
  private String name = null;

  @SerializedName("contractId")
  private String contractId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expirationDate")
  private String expirationDate = null;

  public LegalTagUpdateDto name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the LegalTag.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the LegalTag.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LegalTagUpdateDto contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * The Id of the physical contract associated with the data being ingested.
   * @return contractId
  **/
  @ApiModelProperty(example = "No Contract Related", required = true, value = "The Id of the physical contract associated with the data being ingested.")
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public LegalTagUpdateDto description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The optional description if the LegalTag to allow for easier discoverability of Legaltags overtime.
   * @return description
  **/
  @ApiModelProperty(value = "The optional description if the LegalTag to allow for easier discoverability of Legaltags overtime.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LegalTagUpdateDto expirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The optional expiration date of the contract in the format YYYY-MM-DD
   * @return expirationDate
  **/
  @ApiModelProperty(example = "2025-12-25", value = "The optional expiration date of the contract in the format YYYY-MM-DD")
  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LegalTagUpdateDto legalTagUpdateDto = (LegalTagUpdateDto) o;
    return Objects.equals(this.name, legalTagUpdateDto.name) &&
        Objects.equals(this.contractId, legalTagUpdateDto.contractId) &&
        Objects.equals(this.description, legalTagUpdateDto.description) &&
        Objects.equals(this.expirationDate, legalTagUpdateDto.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contractId, description, expirationDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalTagUpdateDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

