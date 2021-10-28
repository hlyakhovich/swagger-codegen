/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.28-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Animal;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
public interface AnimalApi {

    AnimalApiDelegate getDelegate();

    @Operation(summary = "Add a new animal to the store", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/animal",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> addAnimal(@Parameter(in = ParameterIn.DEFAULT, description = "Animal object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Animal body) {
        return getDelegate().addAnimal(body);
    }


    @Operation(summary = "Deletes a animal", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid animal value") })
    @RequestMapping(value = "/animal/{animalId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteAnimal(@Parameter(in = ParameterIn.PATH, description = "Animal id to delete", required=true, schema=@Schema()) @PathVariable("animalId") Long animalId, @Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="api_key", required=false) String apiKey) {
        return getDelegate().deleteAnimal(animalId, apiKey);
    }


    @Operation(summary = "Find animal by ID", description = "Returns a single animal", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/xml", schema = @Schema(implementation = Animal.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Pet not found") })
    @RequestMapping(value = "/animal/{animalId}",
        produces = { "application/xml", "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Animal> getAnimalById(@Parameter(in = ParameterIn.PATH, description = "ID of pet to return", required=true, schema=@Schema()) @PathVariable("animalId") Long animalId) {
        return getDelegate().getAnimalById(animalId);
    }


    @Operation(summary = "Update an existing animal", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Animal not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/animal",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<Void> updateAnimal(@Parameter(in = ParameterIn.DEFAULT, description = "Animal object that needs to be added.", required=true, schema=@Schema()) @Valid @RequestBody Animal body) {
        return getDelegate().updateAnimal(body);
    }


    @Operation(summary = "Updates a animal", description = "", tags={ "animal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/animal/{animalId}",
        consumes = { "application/x-www-form-urlencoded" }, 
        method = RequestMethod.POST)
    default ResponseEntity<Void> updateAnimalWithForm(@Parameter(in = ParameterIn.PATH, description = "ID of animal that needs to be updated", required=true, schema=@Schema()) @PathVariable("animalId") Long animalId, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="name", required=false)  String name, @Parameter(in = ParameterIn.DEFAULT, description = "",schema=@Schema()) @RequestParam(value="status", required=false)  String status) {
        return getDelegate().updateAnimalWithForm(animalId, name, status);
    }

}
