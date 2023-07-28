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
 * ApiTagDTO
 */
@JsonPropertyOrder({
    ApiTagDTO.JSON_PROPERTY_COLOR,
    ApiTagDTO.JSON_PROPERTY_DESCRIPTION,
    ApiTagDTO.JSON_PROPERTY_ID,
    ApiTagDTO.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiTagDTO {
    public static final String JSON_PROPERTY_COLOR = "color";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_ID = "id";
    public static final String JSON_PROPERTY_NAME = "name";
    private ColorEnum color;
    private String description;
    private String id;
    private String name;
    public ApiTagDTO() {
    }

    public ApiTagDTO color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * Get color
     *
     * @return color
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ColorEnum getColor() {
        return color;
    }

    @JsonProperty(JSON_PROPERTY_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public ApiTagDTO description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getDescription() {
        return description;
    }

    @JsonProperty(JSON_PROPERTY_DESCRIPTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDescription(String description) {
        this.description = description;
    }

    public ApiTagDTO id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(String id) {
        this.id = id;
    }

    public ApiTagDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Return true if this ApiTagDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiTagDTO apiTagDTO = (ApiTagDTO) o;
        return Objects.equals(this.color, apiTagDTO.color) &&
            Objects.equals(this.description, apiTagDTO.description) &&
            Objects.equals(this.id, apiTagDTO.id) &&
            Objects.equals(this.name, apiTagDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, description, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiTagDTO {\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
     * Gets or Sets color
     */
    public enum ColorEnum {
        WHITE("white"),

        GREY("grey"),

        BLACK("black"),

        GREEN("green"),

        YELLOW("yellow"),

        ORANGE("orange"),

        RED("red"),

        BLUE("blue"),

        LIGHT_RED("light-red"),

        LIGHT_GREEN("light-green"),

        LIGHT_BLUE("light-blue"),

        LIGHT_PURPLE("light-purple"),

        DARK_RED("dark-red"),

        DARK_GREEN("dark-green"),

        DARK_BLUE("dark-blue"),

        DARK_PURPLE("dark-purple");

        private String value;

        ColorEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ColorEnum fromValue(String value) {
            for (ColorEnum b : ColorEnum.values()) {
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
