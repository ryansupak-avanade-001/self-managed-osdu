/* 
 * self-managed-osdu
 *
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing NotificationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class NotificationApiTests
    {
        private NotificationApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new NotificationApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of NotificationApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' NotificationApi
            //Assert.IsInstanceOfType(typeof(NotificationApi), instance, "instance is a NotificationApi");
        }

        
        /// <summary>
        /// Test RecordChangedUsingPOST
        /// </summary>
        [Test]
        public void RecordChangedUsingPOSTTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string dataPartitionId = null;
            //var response = instance.RecordChangedUsingPOST(dataPartitionId);
            //Assert.IsInstanceOf<NotificationResponseEntity> (response, "response is NotificationResponseEntity");
        }
        
    }

}