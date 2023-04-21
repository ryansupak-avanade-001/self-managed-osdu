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


package osdu.client.api;

import osdu.client.ApiCallback;
import osdu.client.ApiClient;
import osdu.client.ApiException;
import osdu.client.ApiResponse;
import osdu.client.Configuration;
import osdu.client.Pair;
import osdu.client.ProgressRequestBody;
import osdu.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import osdu.client.model.NotificationResponseEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationApi {
    private ApiClient apiClient;

    public NotificationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for recordChangedUsingPOST
     * @param dataPartitionId tenant (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call recordChangedUsingPOSTCall(String dataPartitionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/notification/v1/push-handlers/records-changed";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (dataPartitionId != null)
        localVarHeaderParams.put("data-partition-id", apiClient.parameterToString(dataPartitionId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Bearer" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call recordChangedUsingPOSTValidateBeforeCall(String dataPartitionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'dataPartitionId' is set
        if (dataPartitionId == null) {
            throw new ApiException("Missing the required parameter 'dataPartitionId' when calling recordChangedUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = recordChangedUsingPOSTCall(dataPartitionId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Notifies subscribers that records have changed
     * 
     * @param dataPartitionId tenant (required)
     * @return NotificationResponseEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public NotificationResponseEntity recordChangedUsingPOST(String dataPartitionId) throws ApiException {
        ApiResponse<NotificationResponseEntity> resp = recordChangedUsingPOSTWithHttpInfo(dataPartitionId);
        return resp.getData();
    }

    /**
     * Notifies subscribers that records have changed
     * 
     * @param dataPartitionId tenant (required)
     * @return ApiResponse&lt;NotificationResponseEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<NotificationResponseEntity> recordChangedUsingPOSTWithHttpInfo(String dataPartitionId) throws ApiException {
        com.squareup.okhttp.Call call = recordChangedUsingPOSTValidateBeforeCall(dataPartitionId, null, null);
        Type localVarReturnType = new TypeToken<NotificationResponseEntity>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Notifies subscribers that records have changed (asynchronously)
     * 
     * @param dataPartitionId tenant (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call recordChangedUsingPOSTAsync(String dataPartitionId, final ApiCallback<NotificationResponseEntity> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = recordChangedUsingPOSTValidateBeforeCall(dataPartitionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<NotificationResponseEntity>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}