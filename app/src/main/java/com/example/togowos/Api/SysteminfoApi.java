/*
 * Reseplaneraren
 * Provides access to Västtrafik journey planner
 *
 * OpenAPI spec version: 1.10.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.togowos.Api;

import com.example.togowos.ApiCallback;
import com.example.togowos.ApiClient;
import com.example.togowos.ApiException;
import com.example.togowos.ApiResponse;
import com.example.togowos.Configuration;
import com.example.togowos.Pair;
import com.example.togowos.ProgressRequestBody;
import com.example.togowos.ProgressResponseBody;
import com.example.togowos.model.SystemInfo;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysteminfoApi {
    private ApiClient apiClient;

    public SysteminfoApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SysteminfoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getSystemInfo
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSystemInfoCall(String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/systeminfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (jsonpCallback != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("jsonpCallback", jsonpCallback));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSystemInfoValidateBeforeCall(String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getSystemInfoCall(format, jsonpCallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Provides information about the journey planner and the underlying data
     * Provides information about the journey planner and underlying data. It will return the begin of end of the timetable period and the creation date of the timetable data.
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return SystemInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemInfo getSystemInfo(String format, String jsonpCallback) throws ApiException {
        ApiResponse<SystemInfo> resp = getSystemInfoWithHttpInfo(format, jsonpCallback);
        return resp.getData();
    }

    /**
     * Provides information about the journey planner and the underlying data
     * Provides information about the journey planner and underlying data. It will return the begin of end of the timetable period and the creation date of the timetable data.
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return ApiResponse&lt;SystemInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemInfo> getSystemInfoWithHttpInfo(String format, String jsonpCallback) throws ApiException {
        com.squareup.okhttp.Call call = getSystemInfoValidateBeforeCall(format, jsonpCallback, null, null);
        Type localVarReturnType = new TypeToken<SystemInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Provides information about the journey planner and the underlying data (asynchronously)
     * Provides information about the journey planner and underlying data. It will return the begin of end of the timetable period and the creation date of the timetable data.
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemInfoAsync(String format, String jsonpCallback, final ApiCallback<SystemInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemInfoValidateBeforeCall(format, jsonpCallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
