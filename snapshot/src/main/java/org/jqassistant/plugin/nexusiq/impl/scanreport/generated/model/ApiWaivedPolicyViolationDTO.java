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
 * ApiWaivedPolicyViolationDTO
 */
@JsonPropertyOrder({
    ApiWaivedPolicyViolationDTO.JSON_PROPERTY_CONSTRAINT_VIOLATIONS,
    ApiWaivedPolicyViolationDTO.JSON_PROPERTY_POLICY_ID,
    ApiWaivedPolicyViolationDTO.JSON_PROPERTY_POLICY_NAME,
    ApiWaivedPolicyViolationDTO.JSON_PROPERTY_POLICY_VIOLATION_ID,
    ApiWaivedPolicyViolationDTO.JSON_PROPERTY_POLICY_WAIVER,
    ApiWaivedPolicyViolationDTO.JSON_PROPERTY_THREAT_LEVEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiWaivedPolicyViolationDTO {
    public static final String JSON_PROPERTY_CONSTRAINT_VIOLATIONS = "constraintViolations";
    public static final String JSON_PROPERTY_POLICY_ID = "policyId";
    public static final String JSON_PROPERTY_POLICY_NAME = "policyName";
    public static final String JSON_PROPERTY_POLICY_VIOLATION_ID = "policyViolationId";
    public static final String JSON_PROPERTY_POLICY_WAIVER = "policyWaiver";
    public static final String JSON_PROPERTY_THREAT_LEVEL = "threatLevel";
    private List<ApiConstraintViolationDTO> constraintViolations = null;
    private String policyId;
    private String policyName;
    private String policyViolationId;
    private ApiPolicyWaiverDTO policyWaiver;
    private Integer threatLevel;

    public ApiWaivedPolicyViolationDTO() {
    }

    public ApiWaivedPolicyViolationDTO constraintViolations(List<ApiConstraintViolationDTO> constraintViolations) {
        this.constraintViolations = constraintViolations;
        return this;
    }

    public ApiWaivedPolicyViolationDTO addConstraintViolationsItem(ApiConstraintViolationDTO constraintViolationsItem) {
        if (this.constraintViolations == null) {
            this.constraintViolations = new ArrayList<>();
        }
        this.constraintViolations.add(constraintViolationsItem);
        return this;
    }

    /**
     * Get constraintViolations
     *
     * @return constraintViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONSTRAINT_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiConstraintViolationDTO> getConstraintViolations() {
        return constraintViolations;
    }


    @JsonProperty(JSON_PROPERTY_CONSTRAINT_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstraintViolations(List<ApiConstraintViolationDTO> constraintViolations) {
        this.constraintViolations = constraintViolations;
    }


    public ApiWaivedPolicyViolationDTO policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get policyId
     *
     * @return policyId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyId() {
        return policyId;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }


    public ApiWaivedPolicyViolationDTO policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get policyName
     *
     * @return policyName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyName() {
        return policyName;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    public ApiWaivedPolicyViolationDTO policyViolationId(String policyViolationId) {
        this.policyViolationId = policyViolationId;
        return this;
    }

    /**
     * Get policyViolationId
     *
     * @return policyViolationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_VIOLATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyViolationId() {
        return policyViolationId;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_VIOLATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyViolationId(String policyViolationId) {
        this.policyViolationId = policyViolationId;
    }


    public ApiWaivedPolicyViolationDTO policyWaiver(ApiPolicyWaiverDTO policyWaiver) {
        this.policyWaiver = policyWaiver;
        return this;
    }

    /**
     * Get policyWaiver
     *
     * @return policyWaiver
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_WAIVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiPolicyWaiverDTO getPolicyWaiver() {
        return policyWaiver;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_WAIVER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyWaiver(ApiPolicyWaiverDTO policyWaiver) {
        this.policyWaiver = policyWaiver;
    }


    public ApiWaivedPolicyViolationDTO threatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }

    /**
     * Get threatLevel
     *
     * @return threatLevel
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getThreatLevel() {
        return threatLevel;
    }


    @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setThreatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
    }


    /**
     * Return true if this ApiWaivedPolicyViolationDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiWaivedPolicyViolationDTO apiWaivedPolicyViolationDTO = (ApiWaivedPolicyViolationDTO) o;
        return Objects.equals(this.constraintViolations, apiWaivedPolicyViolationDTO.constraintViolations) &&
            Objects.equals(this.policyId, apiWaivedPolicyViolationDTO.policyId) &&
            Objects.equals(this.policyName, apiWaivedPolicyViolationDTO.policyName) &&
            Objects.equals(this.policyViolationId, apiWaivedPolicyViolationDTO.policyViolationId) &&
            Objects.equals(this.policyWaiver, apiWaivedPolicyViolationDTO.policyWaiver) &&
            Objects.equals(this.threatLevel, apiWaivedPolicyViolationDTO.threatLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(constraintViolations, policyId, policyName, policyViolationId, policyWaiver, threatLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiWaivedPolicyViolationDTO {\n");
        sb.append("    constraintViolations: ").append(toIndentedString(constraintViolations)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyViolationId: ").append(toIndentedString(policyViolationId)).append("\n");
        sb.append("    policyWaiver: ").append(toIndentedString(policyWaiver)).append("\n");
        sb.append("    threatLevel: ").append(toIndentedString(threatLevel)).append("\n");
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

