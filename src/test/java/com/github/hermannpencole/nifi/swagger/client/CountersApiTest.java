/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.5.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.hermannpencole.nifi.swagger.client;

import com.github.hermannpencole.nifi.swagger.ApiException;
import com.github.hermannpencole.nifi.swagger.client.model.CounterEntity;
import com.github.hermannpencole.nifi.swagger.client.model.CountersEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CountersApi
 */
@Ignore
public class CountersApiTest {

    private final CountersApi api = new CountersApi();

    
    /**
     * Gets the current counters for this NiFi
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCountersTest() throws ApiException {
        Boolean nodewise = null;
        String clusterNodeId = null;
        CountersEntity response = api.getCounters(nodewise, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Updates the specified counter. This will reset the counter value to 0
     *
     * Note: This endpoint is subject to change as NiFi and it&#39;s REST API evolve.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCounterTest() throws ApiException {
        String id = null;
        CounterEntity response = api.updateCounter(id);

        // TODO: test validations
    }
    
}
