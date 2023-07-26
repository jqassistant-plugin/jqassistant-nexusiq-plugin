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
 * ApiComponentsInQuarantineDTO
 */
@JsonPropertyOrder({
    ApiComponentsInQuarantineDTO.JSON_PROPERTY_COMPONENTS_IN_QUARANTINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentsInQuarantineDTO {
    public static final String JSON_PROPERTY_COMPONENTS_IN_QUARANTINE = "componentsInQuarantine";
    private List<ApiRepositoryComponentsInQuarantineDTO> componentsInQuarantine = null;

    public ApiComponentsInQuarantineDTO() {
    }

    public ApiComponentsInQuarantineDTO componentsInQuarantine(List<ApiRepositoryComponentsInQuarantineDTO> componentsInQuarantine) {
        this.componentsInQuarantine = componentsInQuarantine;
        return this;
    }

    public ApiComponentsInQuarantineDTO addComponentsInQuarantineItem(ApiRepositoryComponentsInQuarantineDTO componentsInQuarantineItem) {
        if (this.componentsInQuarantine == null) {
            this.componentsInQuarantine = new ArrayList<>();
        }
        this.componentsInQuarantine.add(componentsInQuarantineItem);
        return this;
    }

    /**
     * Get componentsInQuarantine
     *
     * @return componentsInQuarantine
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENTS_IN_QUARANTINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiRepositoryComponentsInQuarantineDTO> getComponentsInQuarantine() {
        return componentsInQuarantine;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENTS_IN_QUARANTINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponentsInQuarantine(List<ApiRepositoryComponentsInQuarantineDTO> componentsInQuarantine) {
        this.componentsInQuarantine = componentsInQuarantine;
    }


    /**
     * Return true if this ApiComponentsInQuarantineDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentsInQuarantineDTO apiComponentsInQuarantineDTO = (ApiComponentsInQuarantineDTO) o;
        return Objects.equals(this.componentsInQuarantine, apiComponentsInQuarantineDTO.componentsInQuarantine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentsInQuarantine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentsInQuarantineDTO {\n");
        sb.append("    componentsInQuarantine: ").append(toIndentedString(componentsInQuarantine)).append("\n");
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

