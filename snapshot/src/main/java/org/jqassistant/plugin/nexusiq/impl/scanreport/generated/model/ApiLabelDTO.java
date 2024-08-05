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
 * ApiLabelDTO
 */
@JsonPropertyOrder({
    ApiLabelDTO.JSON_PROPERTY_COLOR,
    ApiLabelDTO.JSON_PROPERTY_DESCRIPTION,
    ApiLabelDTO.JSON_PROPERTY_ID,
    ApiLabelDTO.JSON_PROPERTY_LABEL,
    ApiLabelDTO.JSON_PROPERTY_OWNER_ID,
    ApiLabelDTO.JSON_PROPERTY_OWNER_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiLabelDTO {
    public static final String JSON_PROPERTY_COLOR = "color";
    public static final String JSON_PROPERTY_DESCRIPTION = "description";
    public static final String JSON_PROPERTY_ID = "id";
    public static final String JSON_PROPERTY_LABEL = "label";
    public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
    public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
    private String color;
    private String description;
    private String id;
    private String label;
    private String ownerId;
    private String ownerType;

    public ApiLabelDTO() {
    }

    public ApiLabelDTO color(String color) {
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

    public String getColor() {
        return color;
    }


    @JsonProperty(JSON_PROPERTY_COLOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setColor(String color) {
        this.color = color;
    }


    public ApiLabelDTO description(String description) {
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


    public ApiLabelDTO id(String id) {
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


    public ApiLabelDTO label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LABEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLabel() {
        return label;
    }


    @JsonProperty(JSON_PROPERTY_LABEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLabel(String label) {
        this.label = label;
    }


    public ApiLabelDTO ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Get ownerId
     *
     * @return ownerId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OWNER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOwnerId() {
        return ownerId;
    }


    @JsonProperty(JSON_PROPERTY_OWNER_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }


    public ApiLabelDTO ownerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }

    /**
     * Get ownerType
     *
     * @return ownerType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OWNER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOwnerType() {
        return ownerType;
    }


    @JsonProperty(JSON_PROPERTY_OWNER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }


    /**
     * Return true if this ApiLabelDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiLabelDTO apiLabelDTO = (ApiLabelDTO) o;
        return Objects.equals(this.color, apiLabelDTO.color) &&
            Objects.equals(this.description, apiLabelDTO.description) &&
            Objects.equals(this.id, apiLabelDTO.id) &&
            Objects.equals(this.label, apiLabelDTO.label) &&
            Objects.equals(this.ownerId, apiLabelDTO.ownerId) &&
            Objects.equals(this.ownerType, apiLabelDTO.ownerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, description, id, label, ownerId, ownerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiLabelDTO {\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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
