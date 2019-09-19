/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Dog;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DogApi
 */
@Ignore
public class DogApiTest {

    private final DogApi api = new DogApi();

    /**
     * Add a new dog to the store
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDogTest() throws ApiException {
        Dog body = null;
        api.addDog(body);

        // TODO: test validations
    }
    /**
     * Deletes a dog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDogTest() throws ApiException {
        Long dogId = null;
        String apiKey = null;
        api.deleteDog(dogId, apiKey);

        // TODO: test validations
    }
    /**
     * Find dog by ID
     *
     * Returns a single dog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogByIdTest() throws ApiException {
        Long dogId = null;
        Dog response = api.getDogById(dogId);

        // TODO: test validations
    }
    /**
     * Update an existing dog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDogTest() throws ApiException {
        Dog body = null;
        api.updateDog(body);

        // TODO: test validations
    }
    /**
     * Updates a dog
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDogWithFormTest() throws ApiException {
        Long animalId = null;
        String name = null;
        String status = null;
        api.updateDogWithForm(animalId, name, status);

        // TODO: test validations
    }
}