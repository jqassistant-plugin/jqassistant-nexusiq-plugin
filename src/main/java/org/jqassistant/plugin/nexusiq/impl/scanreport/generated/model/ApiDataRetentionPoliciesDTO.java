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

import java.util.Objects;


/**
 * ApiDataRetentionPoliciesDTO
 */
@JsonPropertyOrder({
    ApiDataRetentionPoliciesDTO.JSON_PROPERTY_APPLICATION_REPORTS,
    ApiDataRetentionPoliciesDTO.JSON_PROPERTY_SUCCESS_METRICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiDataRetentionPoliciesDTO {
    public static final String JSON_PROPERTY_APPLICATION_REPORTS = "applicationReports";
    public static final String JSON_PROPERTY_SUCCESS_METRICS = "successMetrics";
    private ApiReportRetentionPoliciesDTO applicationReports;
    private ApiSuccessMetricsRetentionPolicyDTO successMetrics;

    public ApiDataRetentionPoliciesDTO() {
    }

    public ApiDataRetentionPoliciesDTO applicationReports(ApiReportRetentionPoliciesDTO applicationReports) {
        this.applicationReports = applicationReports;
        return this;
    }

    /**
     * Get applicationReports
     *
     * @return applicationReports
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_REPORTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiReportRetentionPoliciesDTO getApplicationReports() {
        return applicationReports;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_REPORTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationReports(ApiReportRetentionPoliciesDTO applicationReports) {
        this.applicationReports = applicationReports;
    }


    public ApiDataRetentionPoliciesDTO successMetrics(ApiSuccessMetricsRetentionPolicyDTO successMetrics) {
        this.successMetrics = successMetrics;
        return this;
    }

    /**
     * Get successMetrics
     *
     * @return successMetrics
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SUCCESS_METRICS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiSuccessMetricsRetentionPolicyDTO getSuccessMetrics() {
        return successMetrics;
    }


    @JsonProperty(JSON_PROPERTY_SUCCESS_METRICS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuccessMetrics(ApiSuccessMetricsRetentionPolicyDTO successMetrics) {
        this.successMetrics = successMetrics;
    }


    /**
     * Return true if this ApiDataRetentionPoliciesDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiDataRetentionPoliciesDTO apiDataRetentionPoliciesDTO = (ApiDataRetentionPoliciesDTO) o;
        return Objects.equals(this.applicationReports, apiDataRetentionPoliciesDTO.applicationReports) &&
            Objects.equals(this.successMetrics, apiDataRetentionPoliciesDTO.successMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationReports, successMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiDataRetentionPoliciesDTO {\n");
        sb.append("    applicationReports: ").append(toIndentedString(applicationReports)).append("\n");
        sb.append("    successMetrics: ").append(toIndentedString(successMetrics)).append("\n");
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
