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


package io.swagger.client.api;

import com.example.togowos.Api.SysteminfoApi;
import com.example.togowos.model.SystemInfo;


import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SysteminfoApi
 */
@Ignore
public class SysteminfoApiTest {

    private final SysteminfoApi api = new SysteminfoApi();


    /**
     * Provides information about the journey planner and the underlying data
     *
     * Provides information about the journey planner and underlying data. It will return the begin of end of the timetable period and the creation date of the timetable data.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSystemInfoTest() throws Exception {
        String format = null;
        String jsonpCallback = null;
        SystemInfo response = api.getSystemInfo(format, jsonpCallback);

        // TODO: test validations
    }

}
