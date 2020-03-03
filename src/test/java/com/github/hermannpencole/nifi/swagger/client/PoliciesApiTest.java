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
import com.github.hermannpencole.nifi.swagger.client.model.AccessPolicyEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PoliciesApi
 */
@Ignore
public class PoliciesApiTest {

    private final PoliciesApi api = new PoliciesApi();

    
    /**
     * Creates an access policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccessPolicyTest() throws ApiException {
        AccessPolicyEntity body = null;
        AccessPolicyEntity response = api.createAccessPolicy(body);

        // TODO: test validations
    }
    
    /**
     * Gets an access policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessPolicyTest() throws ApiException {
        String id = null;
        AccessPolicyEntity response = api.getAccessPolicy(id);

        // TODO: test validations
    }
    
    /**
     * Gets an access policy for the specified action and resource
     *
     * Will return the effective policy if no component specific policy exists for the specified action and resource. Must have Read permissions to the policy with the desired action and resource. Permissions for the policy that is returned will be indicated in the response. This means the client could be authorized to get the policy for a given component but the effective policy may be inherited from an ancestor Process Group. If the client does not have permissions to that policy, the response will not include the policy and the permissions in the response will be marked accordingly. If the client does not have permissions to the policy of the desired action and resource a 403 response will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccessPolicyForResourceTest() throws ApiException {
        String action = null;
        String resource = null;
        AccessPolicyEntity response = api.getAccessPolicyForResource(action, resource);

        // TODO: test validations
    }
    
    /**
     * Deletes an access policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeAccessPolicyTest() throws ApiException {
        String id = null;
        String version = null;
        String clientId = null;
        AccessPolicyEntity response = api.removeAccessPolicy(id, version, clientId);

        // TODO: test validations
    }
    
    /**
     * Updates a access policy
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccessPolicyTest() throws ApiException {
        String id = null;
        AccessPolicyEntity body = null;
        AccessPolicyEntity response = api.updateAccessPolicy(id, body);

        // TODO: test validations
    }
    
}
