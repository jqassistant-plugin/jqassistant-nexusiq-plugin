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
 * ApiCompositeValueDTOString
 */
@JsonPropertyOrder({
    ApiCompositeValueDTOString.JSON_PROPERTY_PARENT_NAME,
    ApiCompositeValueDTOString.JSON_PROPERTY_PARENT_VALUE,
    ApiCompositeValueDTOString.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiCompositeValueDTOString {
    public static final String JSON_PROPERTY_PARENT_NAME = "parentName";
    public static final String JSON_PROPERTY_PARENT_VALUE = "parentValue";
    public static final String JSON_PROPERTY_VALUE = "value";
    private String parentName;
    private String parentValue;
    private String value;

    public ApiCompositeValueDTOString() {
    }

    public ApiCompositeValueDTOString parentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * Get parentName
     *
     * @return parentName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARENT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getParentName() {
        return parentName;
    }


    @JsonProperty(JSON_PROPERTY_PARENT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }


    public ApiCompositeValueDTOString parentValue(String parentValue) {
        this.parentValue = parentValue;
        return this;
    }

    /**
     * Get parentValue
     *
     * @return parentValue
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARENT_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getParentValue() {
        return parentValue;
    }


    @JsonProperty(JSON_PROPERTY_PARENT_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParentValue(String parentValue) {
        this.parentValue = parentValue;
    }


    public ApiCompositeValueDTOString value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getValue() {
        return value;
    }


    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Return true if this ApiCompositeValueDTOString object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiCompositeValueDTOString apiCompositeValueDTOString = (ApiCompositeValueDTOString) o;
        return Objects.equals(this.parentName, apiCompositeValueDTOString.parentName) &&
            Objects.equals(this.parentValue, apiCompositeValueDTOString.parentValue) &&
            Objects.equals(this.value, apiCompositeValueDTOString.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentName, parentValue, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiCompositeValueDTOString {\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    parentValue: ").append(toIndentedString(parentValue)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

