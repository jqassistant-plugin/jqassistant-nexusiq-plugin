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
 * ApiSuccessMetricsRetentionPolicyDTO
 */
@JsonPropertyOrder({
    ApiSuccessMetricsRetentionPolicyDTO.JSON_PROPERTY_ENABLE_PURGING,
    ApiSuccessMetricsRetentionPolicyDTO.JSON_PROPERTY_INHERIT_POLICY,
    ApiSuccessMetricsRetentionPolicyDTO.JSON_PROPERTY_MAX_AGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiSuccessMetricsRetentionPolicyDTO {
    public static final String JSON_PROPERTY_ENABLE_PURGING = "enablePurging";
    public static final String JSON_PROPERTY_INHERIT_POLICY = "inheritPolicy";
    public static final String JSON_PROPERTY_MAX_AGE = "maxAge";
    private Boolean enablePurging;
    private Boolean inheritPolicy;
    private String maxAge;

    public ApiSuccessMetricsRetentionPolicyDTO() {
    }

    public ApiSuccessMetricsRetentionPolicyDTO enablePurging(Boolean enablePurging) {
        this.enablePurging = enablePurging;
        return this;
    }

    /**
     * Get enablePurging
     *
     * @return enablePurging
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ENABLE_PURGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getEnablePurging() {
        return enablePurging;
    }


    @JsonProperty(JSON_PROPERTY_ENABLE_PURGING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnablePurging(Boolean enablePurging) {
        this.enablePurging = enablePurging;
    }


    public ApiSuccessMetricsRetentionPolicyDTO inheritPolicy(Boolean inheritPolicy) {
        this.inheritPolicy = inheritPolicy;
        return this;
    }

    /**
     * Get inheritPolicy
     *
     * @return inheritPolicy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INHERIT_POLICY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getInheritPolicy() {
        return inheritPolicy;
    }


    @JsonProperty(JSON_PROPERTY_INHERIT_POLICY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInheritPolicy(Boolean inheritPolicy) {
        this.inheritPolicy = inheritPolicy;
    }


    public ApiSuccessMetricsRetentionPolicyDTO maxAge(String maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * Get maxAge
     *
     * @return maxAge
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MAX_AGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getMaxAge() {
        return maxAge;
    }


    @JsonProperty(JSON_PROPERTY_MAX_AGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxAge(String maxAge) {
        this.maxAge = maxAge;
    }


    /**
     * Return true if this ApiSuccessMetricsRetentionPolicyDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiSuccessMetricsRetentionPolicyDTO apiSuccessMetricsRetentionPolicyDTO = (ApiSuccessMetricsRetentionPolicyDTO) o;
        return Objects.equals(this.enablePurging, apiSuccessMetricsRetentionPolicyDTO.enablePurging) &&
            Objects.equals(this.inheritPolicy, apiSuccessMetricsRetentionPolicyDTO.inheritPolicy) &&
            Objects.equals(this.maxAge, apiSuccessMetricsRetentionPolicyDTO.maxAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enablePurging, inheritPolicy, maxAge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSuccessMetricsRetentionPolicyDTO {\n");
        sb.append("    enablePurging: ").append(toIndentedString(enablePurging)).append("\n");
        sb.append("    inheritPolicy: ").append(toIndentedString(inheritPolicy)).append("\n");
        sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
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
