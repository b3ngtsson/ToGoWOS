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

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.example.togowos.model.Geometry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeometryApi {
    private ApiClient apiClient;

    public GeometryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GeometryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getGeometry
     * @param ref the ref query parameter, URL decoded, from a URL retrieved as a result of a trip or JourneyDetail request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getGeometryCall(String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/geometry";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (ref != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("ref", ref));

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
    private com.squareup.okhttp.Call getGeometryValidateBeforeCall(String ref, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'ref' is set
        if (ref == null) {
            throw new ApiException("Missing the required parameter 'ref' when calling getGeometry(Async)");
        }


        com.squareup.okhttp.Call call = getGeometryCall(ref, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the polyline for a leg.
     * Returns the polyline for a leg. This service can not be called directly but only by reference URLs in a result of a trip or JourneyDetail request. The result contains a list of WGS84 coordinates which can be used to display the polyline on a map.If the parameter needItinerary&#x3D;1 is passed in the URL of the trip request that contained the reference to the Geometry service, the geometry reference link will also contain an itinerary for walk, bike and car legs, that can be used to generate turn-by-turn instructions.
     * @param ref the ref query parameter, URL decoded, from a URL retrieved as a result of a trip or JourneyDetail request (required)
     * @return Geometry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Geometry getGeometry(String ref) throws ApiException {
        ApiResponse<Geometry> resp = getGeometryWithHttpInfo(ref);
        return resp.getData();
    }

    /**
     * Returns the polyline for a leg.
     * Returns the polyline for a leg. This service can not be called directly but only by reference URLs in a result of a trip or JourneyDetail request. The result contains a list of WGS84 coordinates which can be used to display the polyline on a map.If the parameter needItinerary&#x3D;1 is passed in the URL of the trip request that contained the reference to the Geometry service, the geometry reference link will also contain an itinerary for walk, bike and car legs, that can be used to generate turn-by-turn instructions.
     * @param ref the ref query parameter, URL decoded, from a URL retrieved as a result of a trip or JourneyDetail request (required)
     * @return ApiResponse&lt;Geometry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Geometry> getGeometryWithHttpInfo(String ref) throws ApiException {
        com.squareup.okhttp.Call call = getGeometryValidateBeforeCall(ref, null, null);
        Type localVarReturnType = new TypeToken<Geometry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the polyline for a leg. (asynchronously)
     * Returns the polyline for a leg. This service can not be called directly but only by reference URLs in a result of a trip or JourneyDetail request. The result contains a list of WGS84 coordinates which can be used to display the polyline on a map.If the parameter needItinerary&#x3D;1 is passed in the URL of the trip request that contained the reference to the Geometry service, the geometry reference link will also contain an itinerary for walk, bike and car legs, that can be used to generate turn-by-turn instructions.
     * @param ref the ref query parameter, URL decoded, from a URL retrieved as a result of a trip or JourneyDetail request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getGeometryAsync(String ref, final ApiCallback<Geometry> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getGeometryValidateBeforeCall(ref, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Geometry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}