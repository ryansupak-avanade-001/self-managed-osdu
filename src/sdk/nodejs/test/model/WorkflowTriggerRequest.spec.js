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
    describe('WorkflowTriggerRequest', function() {
      beforeEach(function() {
        instance = new SelfManagedOsdu.WorkflowTriggerRequest();
      });

      it('should create an instance of WorkflowTriggerRequest', function() {
        // TODO: update the code to test WorkflowTriggerRequest
        expect(instance).to.be.a(SelfManagedOsdu.WorkflowTriggerRequest);
      });

      it('should have the property runId (base name: "runId")', function() {
        // TODO: update the code to test the property runId
        expect(instance).to.have.property('runId');
        // expect(instance.runId).to.be(expectedValueLiteral);
      });

      it('should have the property executionContext (base name: "executionContext")', function() {
        // TODO: update the code to test the property executionContext
        expect(instance).to.have.property('executionContext');
        // expect(instance.executionContext).to.be(expectedValueLiteral);
      });

    });
  });

}));