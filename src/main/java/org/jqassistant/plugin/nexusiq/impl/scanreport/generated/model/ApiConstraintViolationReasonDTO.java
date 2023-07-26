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
 * ApiConstraintViolationReasonDTO
 */
@JsonPropertyOrder({
    ApiConstraintViolationReasonDTO.JSON_PROPERTY_REASON,
    ApiConstraintViolationReasonDTO.JSON_PROPERTY_REFERENCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiConstraintViolationReasonDTO {
    public static final String JSON_PROPERTY_REASON = "reason";
    public static final String JSON_PROPERTY_REFERENCE = "reference";
    private String reason;
    private TriggerReference reference;

    public ApiConstraintViolationReasonDTO() {
    }

    public ApiConstraintViolationReasonDTO reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getReason() {
        return reason;
    }


    @JsonProperty(JSON_PROPERTY_REASON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReason(String reason) {
        this.reason = reason;
    }


    public ApiConstraintViolationReasonDTO reference(TriggerReference reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get reference
     *
     * @return reference
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public TriggerReference getReference() {
        return reference;
    }


    @JsonProperty(JSON_PROPERTY_REFERENCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReference(TriggerReference reference) {
        this.reference = reference;
    }


    /**
     * Return true if this ApiConstraintViolationReasonDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiConstraintViolationReasonDTO apiConstraintViolationReasonDTO = (ApiConstraintViolationReasonDTO) o;
        return Objects.equals(this.reason, apiConstraintViolationReasonDTO.reason) &&
            Objects.equals(this.reference, apiConstraintViolationReasonDTO.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reason, reference);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiConstraintViolationReasonDTO {\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

