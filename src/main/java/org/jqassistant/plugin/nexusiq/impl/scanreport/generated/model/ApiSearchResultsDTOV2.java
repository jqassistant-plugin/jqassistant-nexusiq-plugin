/*
 * Sonatype IQ Server
 * This documents the available APIs into [Sonatype IQ Server](https://www.sonatype.com/products/open-source-security-dependency-management).
 *
 * The version of the OpenAPI document: 164
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ApiSearchResultsDTOV2
 */
@JsonPropertyOrder({
    ApiSearchResultsDTOV2.JSON_PROPERTY_CRITERIA,
    ApiSearchResultsDTOV2.JSON_PROPERTY_RESULTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiSearchResultsDTOV2 {
    public static final String JSON_PROPERTY_CRITERIA = "criteria";
    public static final String JSON_PROPERTY_RESULTS = "results";
    private ApiSearchCriteriaDTOV2 criteria;
    private List<ApiSearchResultDTOV2> results = null;

    public ApiSearchResultsDTOV2() {
    }

    public ApiSearchResultsDTOV2 criteria(ApiSearchCriteriaDTOV2 criteria) {
        this.criteria = criteria;
        return this;
    }

    /**
     * Get criteria
     *
     * @return criteria
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CRITERIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiSearchCriteriaDTOV2 getCriteria() {
        return criteria;
    }


    @JsonProperty(JSON_PROPERTY_CRITERIA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCriteria(ApiSearchCriteriaDTOV2 criteria) {
        this.criteria = criteria;
    }


    public ApiSearchResultsDTOV2 results(List<ApiSearchResultDTOV2> results) {
        this.results = results;
        return this;
    }

    public ApiSearchResultsDTOV2 addResultsItem(ApiSearchResultDTOV2 resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    /**
     * Get results
     *
     * @return results
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiSearchResultDTOV2> getResults() {
        return results;
    }


    @JsonProperty(JSON_PROPERTY_RESULTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setResults(List<ApiSearchResultDTOV2> results) {
        this.results = results;
    }


    /**
     * Return true if this ApiSearchResultsDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiSearchResultsDTOV2 apiSearchResultsDTOV2 = (ApiSearchResultsDTOV2) o;
        return Objects.equals(this.criteria, apiSearchResultsDTOV2.criteria) &&
            Objects.equals(this.results, apiSearchResultsDTOV2.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteria, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSearchResultsDTOV2 {\n");
        sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

