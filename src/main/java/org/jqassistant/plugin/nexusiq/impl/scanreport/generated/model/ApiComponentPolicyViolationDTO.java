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
 * ApiComponentPolicyViolationDTO
 */
@JsonPropertyOrder({
    ApiComponentPolicyViolationDTO.JSON_PROPERTY_COMPONENT,
    ApiComponentPolicyViolationDTO.JSON_PROPERTY_WAIVED_POLICY_VIOLATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentPolicyViolationDTO {
    public static final String JSON_PROPERTY_COMPONENT = "component";
    public static final String JSON_PROPERTY_WAIVED_POLICY_VIOLATIONS = "waivedPolicyViolations";
    private ApiComponentDTOV2 component;
    private List<ApiWaivedPolicyViolationDTO> waivedPolicyViolations = null;

    public ApiComponentPolicyViolationDTO() {
    }

    public ApiComponentPolicyViolationDTO component(ApiComponentDTOV2 component) {
        this.component = component;
        return this;
    }

    /**
     * Get component
     *
     * @return component
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentDTOV2 getComponent() {
        return component;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponent(ApiComponentDTOV2 component) {
        this.component = component;
    }


    public ApiComponentPolicyViolationDTO waivedPolicyViolations(List<ApiWaivedPolicyViolationDTO> waivedPolicyViolations) {
        this.waivedPolicyViolations = waivedPolicyViolations;
        return this;
    }

    public ApiComponentPolicyViolationDTO addWaivedPolicyViolationsItem(ApiWaivedPolicyViolationDTO waivedPolicyViolationsItem) {
        if (this.waivedPolicyViolations == null) {
            this.waivedPolicyViolations = new ArrayList<>();
        }
        this.waivedPolicyViolations.add(waivedPolicyViolationsItem);
        return this;
    }

    /**
     * Get waivedPolicyViolations
     *
     * @return waivedPolicyViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WAIVED_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiWaivedPolicyViolationDTO> getWaivedPolicyViolations() {
        return waivedPolicyViolations;
    }


    @JsonProperty(JSON_PROPERTY_WAIVED_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWaivedPolicyViolations(List<ApiWaivedPolicyViolationDTO> waivedPolicyViolations) {
        this.waivedPolicyViolations = waivedPolicyViolations;
    }


    /**
     * Return true if this ApiComponentPolicyViolationDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentPolicyViolationDTO apiComponentPolicyViolationDTO = (ApiComponentPolicyViolationDTO) o;
        return Objects.equals(this.component, apiComponentPolicyViolationDTO.component) &&
            Objects.equals(this.waivedPolicyViolations, apiComponentPolicyViolationDTO.waivedPolicyViolations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, waivedPolicyViolations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentPolicyViolationDTO {\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    waivedPolicyViolations: ").append(toIndentedString(waivedPolicyViolations)).append("\n");
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

