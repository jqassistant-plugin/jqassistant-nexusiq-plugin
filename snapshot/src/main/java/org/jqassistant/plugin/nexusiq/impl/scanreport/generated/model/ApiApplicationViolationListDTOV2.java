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
 * ApiApplicationViolationListDTOV2
 */
@JsonPropertyOrder({
    ApiApplicationViolationListDTOV2.JSON_PROPERTY_APPLICATION_VIOLATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiApplicationViolationListDTOV2 {
    public static final String JSON_PROPERTY_APPLICATION_VIOLATIONS = "applicationViolations";
    private List<ApiApplicationViolationDTOV2> applicationViolations = null;

    public ApiApplicationViolationListDTOV2() {
    }

    public ApiApplicationViolationListDTOV2 applicationViolations(List<ApiApplicationViolationDTOV2> applicationViolations) {
        this.applicationViolations = applicationViolations;
        return this;
    }

    public ApiApplicationViolationListDTOV2 addApplicationViolationsItem(ApiApplicationViolationDTOV2 applicationViolationsItem) {
        if (this.applicationViolations == null) {
            this.applicationViolations = new ArrayList<>();
        }
        this.applicationViolations.add(applicationViolationsItem);
        return this;
    }

    /**
     * Get applicationViolations
     *
     * @return applicationViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiApplicationViolationDTOV2> getApplicationViolations() {
        return applicationViolations;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationViolations(List<ApiApplicationViolationDTOV2> applicationViolations) {
        this.applicationViolations = applicationViolations;
    }


    /**
     * Return true if this ApiApplicationViolationListDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiApplicationViolationListDTOV2 apiApplicationViolationListDTOV2 = (ApiApplicationViolationListDTOV2) o;
        return Objects.equals(this.applicationViolations, apiApplicationViolationListDTOV2.applicationViolations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationViolations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiApplicationViolationListDTOV2 {\n");
        sb.append("    applicationViolations: ").append(toIndentedString(applicationViolations)).append("\n");
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

