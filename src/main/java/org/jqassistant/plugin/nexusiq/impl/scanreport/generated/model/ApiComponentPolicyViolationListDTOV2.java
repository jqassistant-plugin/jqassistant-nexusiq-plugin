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
 * ApiComponentPolicyViolationListDTOV2
 */
@JsonPropertyOrder({
    ApiComponentPolicyViolationListDTOV2.JSON_PROPERTY_POLICY_VIOLATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentPolicyViolationListDTOV2 {
    public static final String JSON_PROPERTY_POLICY_VIOLATIONS = "policyViolations";
    private List<ApiPolicyViolationDTOV2> policyViolations = null;

    public ApiComponentPolicyViolationListDTOV2() {
    }

    public ApiComponentPolicyViolationListDTOV2 policyViolations(List<ApiPolicyViolationDTOV2> policyViolations) {
        this.policyViolations = policyViolations;
        return this;
    }

    public ApiComponentPolicyViolationListDTOV2 addPolicyViolationsItem(ApiPolicyViolationDTOV2 policyViolationsItem) {
        if (this.policyViolations == null) {
            this.policyViolations = new ArrayList<>();
        }
        this.policyViolations.add(policyViolationsItem);
        return this;
    }

    /**
     * Get policyViolations
     *
     * @return policyViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiPolicyViolationDTOV2> getPolicyViolations() {
        return policyViolations;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyViolations(List<ApiPolicyViolationDTOV2> policyViolations) {
        this.policyViolations = policyViolations;
    }


    /**
     * Return true if this ApiComponentPolicyViolationListDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentPolicyViolationListDTOV2 apiComponentPolicyViolationListDTOV2 = (ApiComponentPolicyViolationListDTOV2) o;
        return Objects.equals(this.policyViolations, apiComponentPolicyViolationListDTOV2.policyViolations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyViolations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentPolicyViolationListDTOV2 {\n");
        sb.append("    policyViolations: ").append(toIndentedString(policyViolations)).append("\n");
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

