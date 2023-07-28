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
 * ApiComponentRemediationDTO
 */
@JsonPropertyOrder({
    ApiComponentRemediationDTO.JSON_PROPERTY_REMEDIATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentRemediationDTO {
    public static final String JSON_PROPERTY_REMEDIATION = "remediation";
    private ApiComponentRemediationValueDTO remediation;

    public ApiComponentRemediationDTO() {
    }

    public ApiComponentRemediationDTO remediation(ApiComponentRemediationValueDTO remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * Get remediation
     *
     * @return remediation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REMEDIATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentRemediationValueDTO getRemediation() {
        return remediation;
    }


    @JsonProperty(JSON_PROPERTY_REMEDIATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRemediation(ApiComponentRemediationValueDTO remediation) {
        this.remediation = remediation;
    }


    /**
     * Return true if this ApiComponentRemediationDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentRemediationDTO apiComponentRemediationDTO = (ApiComponentRemediationDTO) o;
        return Objects.equals(this.remediation, apiComponentRemediationDTO.remediation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remediation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentRemediationDTO {\n");
        sb.append("    remediation: ").append(toIndentedString(remediation)).append("\n");
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
