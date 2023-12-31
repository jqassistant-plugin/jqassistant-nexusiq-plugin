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
 * ApiArtifactoryConnectionStatusRequestDTO
 */
@JsonPropertyOrder({
    ApiArtifactoryConnectionStatusRequestDTO.JSON_PROPERTY_ALLOW_OVERRIDE,
    ApiArtifactoryConnectionStatusRequestDTO.JSON_PROPERTY_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiArtifactoryConnectionStatusRequestDTO {
    public static final String JSON_PROPERTY_ALLOW_OVERRIDE = "allowOverride";
    public static final String JSON_PROPERTY_ENABLED = "enabled";
    private Boolean allowOverride;
    private Boolean enabled;

    public ApiArtifactoryConnectionStatusRequestDTO() {
    }

    public ApiArtifactoryConnectionStatusRequestDTO allowOverride(Boolean allowOverride) {
        this.allowOverride = allowOverride;
        return this;
    }

    /**
     * Get allowOverride
     *
     * @return allowOverride
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ALLOW_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getAllowOverride() {
        return allowOverride;
    }


    @JsonProperty(JSON_PROPERTY_ALLOW_OVERRIDE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAllowOverride(Boolean allowOverride) {
        this.allowOverride = allowOverride;
    }


    public ApiArtifactoryConnectionStatusRequestDTO enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getEnabled() {
        return enabled;
    }


    @JsonProperty(JSON_PROPERTY_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Return true if this ApiArtifactoryConnectionStatusRequestDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiArtifactoryConnectionStatusRequestDTO apiArtifactoryConnectionStatusRequestDTO = (ApiArtifactoryConnectionStatusRequestDTO) o;
        return Objects.equals(this.allowOverride, apiArtifactoryConnectionStatusRequestDTO.allowOverride) &&
            Objects.equals(this.enabled, apiArtifactoryConnectionStatusRequestDTO.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowOverride, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiArtifactoryConnectionStatusRequestDTO {\n");
        sb.append("    allowOverride: ").append(toIndentedString(allowOverride)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

