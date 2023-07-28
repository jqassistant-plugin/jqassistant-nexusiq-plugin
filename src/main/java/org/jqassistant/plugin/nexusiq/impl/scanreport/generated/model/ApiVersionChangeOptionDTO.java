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

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;


/**
 * ApiVersionChangeOptionDTO
 */
@JsonPropertyOrder({
    ApiVersionChangeOptionDTO.JSON_PROPERTY_DATA,
    ApiVersionChangeOptionDTO.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiVersionChangeOptionDTO {
    public static final String JSON_PROPERTY_DATA = "data";
    public static final String JSON_PROPERTY_TYPE = "type";
    private ApiComponentChangeActionDTO data;
    private TypeEnum type;
    public ApiVersionChangeOptionDTO() {
    }

    public ApiVersionChangeOptionDTO data(ApiComponentChangeActionDTO data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentChangeActionDTO getData() {
        return data;
    }

    @JsonProperty(JSON_PROPERTY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setData(ApiComponentChangeActionDTO data) {
        this.data = data;
    }

    public ApiVersionChangeOptionDTO type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Return true if this ApiVersionChangeOptionDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiVersionChangeOptionDTO apiVersionChangeOptionDTO = (ApiVersionChangeOptionDTO) o;
        return Objects.equals(this.data, apiVersionChangeOptionDTO.data) &&
            Objects.equals(this.type, apiVersionChangeOptionDTO.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiVersionChangeOptionDTO {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        NO_VIOLATIONS("next-no-violations"),

        NON_FAILING("next-non-failing"),

        NO_VIOLATIONS_WITH_DEPENDENCIES("next-no-violations-with-dependencies"),

        NON_FAILING_WITH_DEPENDENCIES("next-non-failing-with-dependencies");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}
