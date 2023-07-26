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
 * PolicyOwner
 */
@JsonPropertyOrder({
    PolicyOwner.JSON_PROPERTY_OWNER_ID,
    PolicyOwner.JSON_PROPERTY_OWNER_NAME,
    PolicyOwner.JSON_PROPERTY_OWNER_PUBLIC_ID,
    PolicyOwner.JSON_PROPERTY_OWNER_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class PolicyOwner {
    public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
    public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
    public static final String JSON_PROPERTY_OWNER_PUBLIC_ID = "ownerPublicId";
    public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
    private String ownerId;
    private String ownerName;
    private String ownerPublicId;
    private String ownerType;

    public PolicyOwner() {
    }

    public PolicyOwner ownerId(String ownerId) {
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


    public PolicyOwner ownerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    /**
     * Get ownerName
     *
     * @return ownerName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OWNER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOwnerName() {
        return ownerName;
    }


    @JsonProperty(JSON_PROPERTY_OWNER_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }


    public PolicyOwner ownerPublicId(String ownerPublicId) {
        this.ownerPublicId = ownerPublicId;
        return this;
    }

    /**
     * Get ownerPublicId
     *
     * @return ownerPublicId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OWNER_PUBLIC_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOwnerPublicId() {
        return ownerPublicId;
    }


    @JsonProperty(JSON_PROPERTY_OWNER_PUBLIC_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwnerPublicId(String ownerPublicId) {
        this.ownerPublicId = ownerPublicId;
    }


    public PolicyOwner ownerType(String ownerType) {
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
     * Return true if this PolicyOwner object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyOwner policyOwner = (PolicyOwner) o;
        return Objects.equals(this.ownerId, policyOwner.ownerId) &&
            Objects.equals(this.ownerName, policyOwner.ownerName) &&
            Objects.equals(this.ownerPublicId, policyOwner.ownerPublicId) &&
            Objects.equals(this.ownerType, policyOwner.ownerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, ownerName, ownerPublicId, ownerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyOwner {\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
        sb.append("    ownerPublicId: ").append(toIndentedString(ownerPublicId)).append("\n");
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

