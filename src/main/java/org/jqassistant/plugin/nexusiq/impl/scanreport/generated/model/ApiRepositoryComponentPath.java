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
 * ApiRepositoryComponentPath
 */
@JsonPropertyOrder({
    ApiRepositoryComponentPath.JSON_PROPERTY_PATHNAME,
    ApiRepositoryComponentPath.JSON_PROPERTY_QUARANTINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiRepositoryComponentPath {
    public static final String JSON_PROPERTY_PATHNAME = "pathname";
    public static final String JSON_PROPERTY_QUARANTINE = "quarantine";
    private String pathname;
    private Boolean quarantine;

    public ApiRepositoryComponentPath() {
    }

    public ApiRepositoryComponentPath pathname(String pathname) {
        this.pathname = pathname;
        return this;
    }

    /**
     * Get pathname
     *
     * @return pathname
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PATHNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPathname() {
        return pathname;
    }


    @JsonProperty(JSON_PROPERTY_PATHNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPathname(String pathname) {
        this.pathname = pathname;
    }


    public ApiRepositoryComponentPath quarantine(Boolean quarantine) {
        this.quarantine = quarantine;
        return this;
    }

    /**
     * Get quarantine
     *
     * @return quarantine
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_QUARANTINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getQuarantine() {
        return quarantine;
    }


    @JsonProperty(JSON_PROPERTY_QUARANTINE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }


    /**
     * Return true if this ApiRepositoryComponentPath object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiRepositoryComponentPath apiRepositoryComponentPath = (ApiRepositoryComponentPath) o;
        return Objects.equals(this.pathname, apiRepositoryComponentPath.pathname) &&
            Objects.equals(this.quarantine, apiRepositoryComponentPath.quarantine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathname, quarantine);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRepositoryComponentPath {\n");
        sb.append("    pathname: ").append(toIndentedString(pathname)).append("\n");
        sb.append("    quarantine: ").append(toIndentedString(quarantine)).append("\n");
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

