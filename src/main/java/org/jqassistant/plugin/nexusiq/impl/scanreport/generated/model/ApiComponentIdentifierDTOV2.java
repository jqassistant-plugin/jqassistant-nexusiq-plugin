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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * ApiComponentIdentifierDTOV2
 */
@JsonPropertyOrder({
    ApiComponentIdentifierDTOV2.JSON_PROPERTY_COORDINATES,
    ApiComponentIdentifierDTOV2.JSON_PROPERTY_FORMAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentIdentifierDTOV2 {
    public static final String JSON_PROPERTY_COORDINATES = "coordinates";
    public static final String JSON_PROPERTY_FORMAT = "format";
    private Map<String, String> coordinates = null;
    private String format;

    public ApiComponentIdentifierDTOV2() {
    }

    public ApiComponentIdentifierDTOV2 coordinates(Map<String, String> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public ApiComponentIdentifierDTOV2 putCoordinatesItem(String key, String coordinatesItem) {
        if (this.coordinates == null) {
            this.coordinates = new HashMap<>();
        }
        this.coordinates.put(key, coordinatesItem);
        return this;
    }

    /**
     * Get coordinates
     *
     * @return coordinates
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COORDINATES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, String> getCoordinates() {
        return coordinates;
    }


    @JsonProperty(JSON_PROPERTY_COORDINATES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCoordinates(Map<String, String> coordinates) {
        this.coordinates = coordinates;
    }


    public ApiComponentIdentifierDTOV2 format(String format) {
        this.format = format;
        return this;
    }

    /**
     * Get format
     *
     * @return format
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getFormat() {
        return format;
    }


    @JsonProperty(JSON_PROPERTY_FORMAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormat(String format) {
        this.format = format;
    }


    /**
     * Return true if this ApiComponentIdentifierDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentIdentifierDTOV2 apiComponentIdentifierDTOV2 = (ApiComponentIdentifierDTOV2) o;
        return Objects.equals(this.coordinates, apiComponentIdentifierDTOV2.coordinates) &&
            Objects.equals(this.format, apiComponentIdentifierDTOV2.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentIdentifierDTOV2 {\n");
        sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
