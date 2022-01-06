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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SelfManagedOsdu);
  }
}(this, function(expect, SelfManagedOsdu) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('FileDeliveryGetFileSignedURLRequest', function() {
      beforeEach(function() {
        instance = new SelfManagedOsdu.FileDeliveryGetFileSignedURLRequest();
      });

      it('should create an instance of FileDeliveryGetFileSignedURLRequest', function() {
        // TODO: update the code to test FileDeliveryGetFileSignedURLRequest
        expect(instance).to.be.a(SelfManagedOsdu.FileDeliveryGetFileSignedURLRequest);
      });

      it('should have the property srn (base name: "srn")', function() {
        // TODO: update the code to test the property srn
        expect(instance).to.have.property('srn');
        // expect(instance.srn).to.be(expectedValueLiteral);
      });

    });
  });

}));
