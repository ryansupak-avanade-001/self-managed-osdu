/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.22
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SelfManagedOsdu) {
      root.SelfManagedOsdu = {};
    }
    root.SelfManagedOsdu.FileMetaItem = factory(root.SelfManagedOsdu.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * The FileMetaItem model module.
   * @module model/FileMetaItem
   * @version 0.11.0
   */

  /**
   * Constructs a new <code>FileMetaItem</code>.
   * A meta data item, which allows the association of named properties or property values to a Unit/Measurement/CRS/Azimuth/Time context.
   * @alias module:model/FileMetaItem
   * @class
   * @param kind {module:model/FileMetaItem.KindEnum} The kind of reference, unit, measurement, CRS or azimuth reference.
   * @param persistableReference {String} The persistable reference string uniquely identifying the CRS or Unit
   */
  var exports = function(kind, persistableReference) {
    this.kind = kind;
    this.persistableReference = persistableReference;
  };

  /**
   * Constructs a <code>FileMetaItem</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FileMetaItem} obj Optional instance to populate.
   * @return {module:model/FileMetaItem} The populated <code>FileMetaItem</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('kind'))
        obj.kind = ApiClient.convertToType(data['kind'], 'String');
      if (data.hasOwnProperty('name'))
        obj.name = ApiClient.convertToType(data['name'], 'String');
      if (data.hasOwnProperty('persistableReference'))
        obj.persistableReference = ApiClient.convertToType(data['persistableReference'], 'String');
      if (data.hasOwnProperty('propertyNames'))
        obj.propertyNames = ApiClient.convertToType(data['propertyNames'], ['String']);
      if (data.hasOwnProperty('propertyValues'))
        obj.propertyValues = ApiClient.convertToType(data['propertyValues'], ['String']);
      if (data.hasOwnProperty('uncertainty'))
        obj.uncertainty = ApiClient.convertToType(data['uncertainty'], 'Number');
    }
    return obj;
  }

  /**
   * The kind of reference, unit, measurement, CRS or azimuth reference.
   * @member {module:model/FileMetaItem.KindEnum} kind
   */
  exports.prototype.kind = undefined;

  /**
   * The name of the CRS or the symbol/name of the unit
   * @member {String} name
   */
  exports.prototype.name = undefined;

  /**
   * The persistable reference string uniquely identifying the CRS or Unit
   * @member {String} persistableReference
   */
  exports.prototype.persistableReference = undefined;

  /**
   * The list of property names, to which this meta data item provides Unit/CRS context to. Data structures, which come in a single frame of reference, can register the property name, others require a full path like \"data.structureA.propertyB\" to define a unique context.
   * @member {Array.<String>} propertyNames
   */
  exports.prototype.propertyNames = undefined;

  /**
   * The list of property values, to which this meta data item provides Unit/CRS context to. Typically a unit symbol is a value to a data structure; this symbol is then registered in this propertyValues array and the persistableReference provides the absolute reference.
   * @member {Array.<String>} propertyValues
   */
  exports.prototype.propertyValues = undefined;

  /**
   * The uncertainty of the values measured given the unit or CRS unit.
   * @member {Number} uncertainty
   */
  exports.prototype.uncertainty = undefined;



  /**
   * Allowed values for the <code>kind</code> property.
   * @enum {String}
   * @readonly
   */
  exports.KindEnum = {
    /**
     * value: "CRS"
     * @const
     */
    CRS: "CRS",

    /**
     * value: "Unit"
     * @const
     */
    unit: "Unit",

    /**
     * value: "Measurement"
     * @const
     */
    measurement: "Measurement",

    /**
     * value: "AzimuthReference"
     * @const
     */
    azimuthReference: "AzimuthReference",

    /**
     * value: "DateTime"
     * @const
     */
    dateTime: "DateTime"
  };

  return exports;

}));