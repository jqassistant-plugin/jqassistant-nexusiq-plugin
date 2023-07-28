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
 * ValidationResult
 */
@JsonPropertyOrder({
    ValidationResult.JSON_PROPERTY_MESSAGE,
    ValidationResult.JSON_PROPERTY_VALID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ValidationResult {
    public static final String JSON_PROPERTY_MESSAGE = "message";
    public static final String JSON_PROPERTY_VALID = "valid";
    private String message;
    private Boolean valid;

    public ValidationResult() {
    }

    public ValidationResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getMessage() {
        return message;
    }


    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessage(String message) {
        this.message = message;
    }


    public ValidationResult valid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * Get valid
     *
     * @return valid
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_VALID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getValid() {
        return valid;
    }


    @JsonProperty(JSON_PROPERTY_VALID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValid(Boolean valid) {
        this.valid = valid;
    }


    /**
     * Return true if this ValidationResult object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ValidationResult validationResult = (ValidationResult) o;
        return Objects.equals(this.message, validationResult.message) &&
            Objects.equals(this.valid, validationResult.valid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, valid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationResult {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
