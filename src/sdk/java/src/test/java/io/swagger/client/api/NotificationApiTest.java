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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.NotificationResponseEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationApi
 */
@Ignore
public class NotificationApiTest {

    private final NotificationApi api = new NotificationApi();

    
    /**
     * Notifies subscribers that records have changed
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recordChangedUsingPOSTTest() throws ApiException {
        String dataPartitionId = null;
        NotificationResponseEntity response = api.recordChangedUsingPOST(dataPartitionId);

        // TODO: test validations
    }
    
}
