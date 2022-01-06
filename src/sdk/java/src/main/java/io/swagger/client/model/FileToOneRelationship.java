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
import java.math.BigDecimal;

/**
 * A relationship from this entity to one other entity either by natural key (name) or id, optionally classified by confidence level
 */
@ApiModel(description = "A relationship from this entity to one other entity either by natural key (name) or id, optionally classified by confidence level")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T20:03:41.621Z")
public class FileToOneRelationship {
  @SerializedName("confidence")
  private BigDecimal confidence = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private BigDecimal version = null;

  public FileToOneRelationship confidence(BigDecimal confidence) {
    this.confidence = confidence;
    return this;
  }

   /**
   * The confidence of the relationship. If the property is absent a well-known relation is implied.
   * @return confidence
  **/
  @ApiModelProperty(example = "1.0", value = "The confidence of the relationship. If the property is absent a well-known relation is implied.")
  public BigDecimal getConfidence() {
    return confidence;
  }

  public void setConfidence(BigDecimal confidence) {
    this.confidence = confidence;
  }

  public FileToOneRelationship id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the related object in the Data Ecosystem. If set, the id has priority over the natural key in the name property.
   * @return id
  **/
  @ApiModelProperty(example = "data_partition:namespace:entity_845934c40e8d922bc57b678990d55722", value = "The id of the related object in the Data Ecosystem. If set, the id has priority over the natural key in the name property.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileToOneRelationship name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name or natural key of the related object. This property is required if the target object id could not (yet) be identified.
   * @return name
  **/
  @ApiModelProperty(example = "Survey ST2016", value = "The name or natural key of the related object. This property is required if the target object id could not (yet) be identified.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FileToOneRelationship version(BigDecimal version) {
    this.version = version;
    return this;
  }

   /**
   * The version number of the related entity. If no version number is specified, the last version is implied.
   * @return version
  **/
  @ApiModelProperty(value = "The version number of the related entity. If no version number is specified, the last version is implied.")
  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileToOneRelationship fileToOneRelationship = (FileToOneRelationship) o;
    return Objects.equals(this.confidence, fileToOneRelationship.confidence) &&
        Objects.equals(this.id, fileToOneRelationship.id) &&
        Objects.equals(this.name, fileToOneRelationship.name) &&
        Objects.equals(this.version, fileToOneRelationship.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confidence, id, name, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileToOneRelationship {\n");
    
    sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

