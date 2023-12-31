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
 * ApiHashComponentIdentifiersDTO
 */
@JsonPropertyOrder({
    ApiHashComponentIdentifiersDTO.JSON_PROPERTY_COMPONENT_CLAIMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiHashComponentIdentifiersDTO {
    public static final String JSON_PROPERTY_COMPONENT_CLAIMS = "componentClaims";
    private List<ApiHashComponentIdentifierDTO> componentClaims = null;

    public ApiHashComponentIdentifiersDTO() {
    }

    public ApiHashComponentIdentifiersDTO componentClaims(List<ApiHashComponentIdentifierDTO> componentClaims) {
        this.componentClaims = componentClaims;
        return this;
    }

    public ApiHashComponentIdentifiersDTO addComponentClaimsItem(ApiHashComponentIdentifierDTO componentClaimsItem) {
        if (this.componentClaims == null) {
            this.componentClaims = new ArrayList<>();
        }
        this.componentClaims.add(componentClaimsItem);
        return this;
    }

    /**
     * Get componentClaims
     *
     * @return componentClaims
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENT_CLAIMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiHashComponentIdentifierDTO> getComponentClaims() {
        return componentClaims;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENT_CLAIMS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponentClaims(List<ApiHashComponentIdentifierDTO> componentClaims) {
        this.componentClaims = componentClaims;
    }


    /**
     * Return true if this ApiHashComponentIdentifiersDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiHashComponentIdentifiersDTO apiHashComponentIdentifiersDTO = (ApiHashComponentIdentifiersDTO) o;
        return Objects.equals(this.componentClaims, apiHashComponentIdentifiersDTO.componentClaims);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentClaims);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiHashComponentIdentifiersDTO {\n");
        sb.append("    componentClaims: ").append(toIndentedString(componentClaims)).append("\n");
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

