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
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * BodyPartMediaType
 */
@JsonPropertyOrder({
    BodyPartMediaType.JSON_PROPERTY_PARAMETERS,
    BodyPartMediaType.JSON_PROPERTY_SUBTYPE,
    BodyPartMediaType.JSON_PROPERTY_TYPE,
    BodyPartMediaType.JSON_PROPERTY_WILDCARD_SUBTYPE,
    BodyPartMediaType.JSON_PROPERTY_WILDCARD_TYPE
})
@JsonTypeName("BodyPart_mediaType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class BodyPartMediaType {
    public static final String JSON_PROPERTY_PARAMETERS = "parameters";
    public static final String JSON_PROPERTY_SUBTYPE = "subtype";
    public static final String JSON_PROPERTY_TYPE = "type";
    public static final String JSON_PROPERTY_WILDCARD_SUBTYPE = "wildcardSubtype";
    public static final String JSON_PROPERTY_WILDCARD_TYPE = "wildcardType";
    private Map<String, String> parameters = null;
    private String subtype;
    private String type;
    private Boolean wildcardSubtype;
    private Boolean wildcardType;

    public BodyPartMediaType() {
    }

    public BodyPartMediaType parameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public BodyPartMediaType putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * Get parameters
     *
     * @return parameters
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, String> getParameters() {
        return parameters;
    }


    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }


    public BodyPartMediaType subtype(String subtype) {
        this.subtype = subtype;
        return this;
    }

    /**
     * Get subtype
     *
     * @return subtype
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SUBTYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getSubtype() {
        return subtype;
    }


    @JsonProperty(JSON_PROPERTY_SUBTYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }


    public BodyPartMediaType type(String type) {
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

    public String getType() {
        return type;
    }


    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }


    public BodyPartMediaType wildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
        return this;
    }

    /**
     * Get wildcardSubtype
     *
     * @return wildcardSubtype
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WILDCARD_SUBTYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getWildcardSubtype() {
        return wildcardSubtype;
    }


    @JsonProperty(JSON_PROPERTY_WILDCARD_SUBTYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWildcardSubtype(Boolean wildcardSubtype) {
        this.wildcardSubtype = wildcardSubtype;
    }


    public BodyPartMediaType wildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
        return this;
    }

    /**
     * Get wildcardType
     *
     * @return wildcardType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_WILDCARD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getWildcardType() {
        return wildcardType;
    }


    @JsonProperty(JSON_PROPERTY_WILDCARD_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWildcardType(Boolean wildcardType) {
        this.wildcardType = wildcardType;
    }


    /**
     * Return true if this BodyPart_mediaType object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BodyPartMediaType bodyPartMediaType = (BodyPartMediaType) o;
        return Objects.equals(this.parameters, bodyPartMediaType.parameters) &&
            Objects.equals(this.subtype, bodyPartMediaType.subtype) &&
            Objects.equals(this.type, bodyPartMediaType.type) &&
            Objects.equals(this.wildcardSubtype, bodyPartMediaType.wildcardSubtype) &&
            Objects.equals(this.wildcardType, bodyPartMediaType.wildcardType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, subtype, type, wildcardSubtype, wildcardType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BodyPartMediaType {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    wildcardSubtype: ").append(toIndentedString(wildcardSubtype)).append("\n");
        sb.append("    wildcardType: ").append(toIndentedString(wildcardType)).append("\n");
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

