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


import com.example.togowos.model.LocationList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationApi {
    private ApiClient apiClient;

    public LocationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LocationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getAllStops
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAllStopsCall(String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/location.allstops";

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
    private com.squareup.okhttp.Call getAllStopsValidateBeforeCall(String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getAllStopsCall(format, jsonpCallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of all stops available in the journey planner.
     * Returns a list of all stops available in the journey planner. Be aware that a call of this service is very time consuming and should be only requested when it is really needed.
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return LocationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LocationList getAllStops(String format, String jsonpCallback) throws ApiException {
        ApiResponse<LocationList> resp = getAllStopsWithHttpInfo(format, jsonpCallback);
        return resp.getData();
    }

    /**
     * Returns a list of all stops available in the journey planner.
     * Returns a list of all stops available in the journey planner. Be aware that a call of this service is very time consuming and should be only requested when it is really needed.
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return ApiResponse&lt;LocationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LocationList> getAllStopsWithHttpInfo(String format, String jsonpCallback) throws ApiException {
        com.squareup.okhttp.Call call = getAllStopsValidateBeforeCall(format, jsonpCallback, null, null);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of all stops available in the journey planner. (asynchronously)
     * Returns a list of all stops available in the journey planner. Be aware that a call of this service is very time consuming and should be only requested when it is really needed.
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAllStopsAsync(String format, String jsonpCallback, final ApiCallback<LocationList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAllStopsValidateBeforeCall(format, jsonpCallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getLocationByName
     * @param input a string with the user input (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getLocationByNameCall(String input, String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/location.name";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (input != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("input", input));
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
    private com.squareup.okhttp.Call getLocationByNameValidateBeforeCall(String input, String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {


        com.squareup.okhttp.Call call = getLocationByNameCall(input, format, jsonpCallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of possible matches in the journey planner database
     * Performs a pattern matching of a user input to retrieve a list of possible matches in the journey planner database. Possible matches might be stops/stations, points of interest and addresses.
     * @param input a string with the user input (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return LocationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LocationList getLocationByName(String input, String format, String jsonpCallback) throws ApiException {
        ApiResponse<LocationList> resp = getLocationByNameWithHttpInfo(input, format, jsonpCallback);
        return resp.getData();
    }

    /**
     * Returns a list of possible matches in the journey planner database
     * Performs a pattern matching of a user input to retrieve a list of possible matches in the journey planner database. Possible matches might be stops/stations, points of interest and addresses.
     * @param input a string with the user input (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return ApiResponse&lt;LocationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LocationList> getLocationByNameWithHttpInfo(String input, String format, String jsonpCallback) throws ApiException {
        com.squareup.okhttp.Call call = getLocationByNameValidateBeforeCall(input, format, jsonpCallback, null, null);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of possible matches in the journey planner database (asynchronously)
     * Performs a pattern matching of a user input to retrieve a list of possible matches in the journey planner database. Possible matches might be stops/stations, points of interest and addresses.
     * @param input a string with the user input (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLocationByNameAsync(String input, String format, String jsonpCallback, final ApiCallback<LocationList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLocationByNameValidateBeforeCall(input, format, jsonpCallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNearbyAddress
     * @param originCoordLat latitude of coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of coordinate in the WGS84 system (required)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNearbyAddressCall(Double originCoordLat, Double originCoordLong, String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/location.nearbyaddress";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (originCoordLat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("originCoordLat", originCoordLat));
        if (originCoordLong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("originCoordLong", originCoordLong));
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
    private com.squareup.okhttp.Call getNearbyAddressValidateBeforeCall(Double originCoordLat, Double originCoordLong, String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'originCoordLat' is set
        if (originCoordLat == null) {
            throw new ApiException("Missing the required parameter 'originCoordLat' when calling getNearbyAddress(Async)");
        }

        // verify the required parameter 'originCoordLong' is set
        if (originCoordLong == null) {
            throw new ApiException("Missing the required parameter 'originCoordLong' when calling getNearbyAddress(Async)");
        }


        com.squareup.okhttp.Call call = getNearbyAddressCall(originCoordLat, originCoordLong, format, jsonpCallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns the address nearest a given coordinate.
     *
     * @param originCoordLat latitude of coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of coordinate in the WGS84 system (required)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return LocationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LocationList getNearbyAddress(Double originCoordLat, Double originCoordLong, String format, String jsonpCallback) throws ApiException {
        ApiResponse<LocationList> resp = getNearbyAddressWithHttpInfo(originCoordLat, originCoordLong, format, jsonpCallback);
        return resp.getData();
    }

    /**
     * Returns the address nearest a given coordinate.
     *
     * @param originCoordLat latitude of coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of coordinate in the WGS84 system (required)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return ApiResponse&lt;LocationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LocationList> getNearbyAddressWithHttpInfo(Double originCoordLat, Double originCoordLong, String format, String jsonpCallback) throws ApiException {
        com.squareup.okhttp.Call call = getNearbyAddressValidateBeforeCall(originCoordLat, originCoordLong, format, jsonpCallback, null, null);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns the address nearest a given coordinate. (asynchronously)
     *
     * @param originCoordLat latitude of coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of coordinate in the WGS84 system (required)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNearbyAddressAsync(Double originCoordLat, Double originCoordLong, String format, String jsonpCallback, final ApiCallback<LocationList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNearbyAddressValidateBeforeCall(originCoordLat, originCoordLong, format, jsonpCallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getNearbyStops
     * @param originCoordLat latitude of center coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of center coordinate in the WGS84 system (required)
     * @param maxNo maximum number of returned stops (optional)
     * @param maxDist maximum distance from the center coordinate (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNearbyStopsCall(Double originCoordLat, Double originCoordLong, Integer maxNo, Integer maxDist, String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/location.nearbystops";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (originCoordLat != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("originCoordLat", originCoordLat));
        if (originCoordLong != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("originCoordLong", originCoordLong));
        if (maxNo != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxNo", maxNo));
        if (maxDist != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("maxDist", maxDist));
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
    private com.squareup.okhttp.Call getNearbyStopsValidateBeforeCall(Double originCoordLat, Double originCoordLong, Integer maxNo, Integer maxDist, String format, String jsonpCallback, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {

        // verify the required parameter 'originCoordLat' is set
        if (originCoordLat == null) {
            throw new ApiException("Missing the required parameter 'originCoordLat' when calling getNearbyStops(Async)");
        }

        // verify the required parameter 'originCoordLong' is set
        if (originCoordLong == null) {
            throw new ApiException("Missing the required parameter 'originCoordLong' when calling getNearbyStops(Async)");
        }


        com.squareup.okhttp.Call call = getNearbyStopsCall(originCoordLat, originCoordLong, maxNo, maxDist, format, jsonpCallback, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Returns a list of stops around a given center coordinate.
     * Returns a list of stops around a given center coordinate. The returned results are ordered by their distance to the center coordinate.
     * @param originCoordLat latitude of center coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of center coordinate in the WGS84 system (required)
     * @param maxNo maximum number of returned stops (optional)
     * @param maxDist maximum distance from the center coordinate (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return LocationList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LocationList getNearbyStops(Double originCoordLat, Double originCoordLong, Integer maxNo, Integer maxDist, String format, String jsonpCallback) throws ApiException {
        ApiResponse<LocationList> resp = getNearbyStopsWithHttpInfo(originCoordLat, originCoordLong, maxNo, maxDist, format, jsonpCallback);
        return resp.getData();
    }

    /**
     * Returns a list of stops around a given center coordinate.
     * Returns a list of stops around a given center coordinate. The returned results are ordered by their distance to the center coordinate.
     * @param originCoordLat latitude of center coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of center coordinate in the WGS84 system (required)
     * @param maxNo maximum number of returned stops (optional)
     * @param maxDist maximum distance from the center coordinate (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @return ApiResponse&lt;LocationList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LocationList> getNearbyStopsWithHttpInfo(Double originCoordLat, Double originCoordLong, Integer maxNo, Integer maxDist, String format, String jsonpCallback) throws ApiException {
        com.squareup.okhttp.Call call = getNearbyStopsValidateBeforeCall(originCoordLat, originCoordLong, maxNo, maxDist, format, jsonpCallback, null, null);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Returns a list of stops around a given center coordinate. (asynchronously)
     * Returns a list of stops around a given center coordinate. The returned results are ordered by their distance to the center coordinate.
     * @param originCoordLat latitude of center coordinate in the WGS84 system (required)
     * @param originCoordLong longitude of center coordinate in the WGS84 system (required)
     * @param maxNo maximum number of returned stops (optional)
     * @param maxDist maximum distance from the center coordinate (optional)
     * @param format the required response format (optional)
     * @param jsonpCallback If JSONP response format is needed, you can append an additional parameter to specify the name of a callback function, and the JSON object will be wrapped by a function call with this name. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNearbyStopsAsync(Double originCoordLat, Double originCoordLong, Integer maxNo, Integer maxDist, String format, String jsonpCallback, final ApiCallback<LocationList> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNearbyStopsValidateBeforeCall(originCoordLat, originCoordLong, maxNo, maxDist, format, jsonpCallback, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LocationList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}