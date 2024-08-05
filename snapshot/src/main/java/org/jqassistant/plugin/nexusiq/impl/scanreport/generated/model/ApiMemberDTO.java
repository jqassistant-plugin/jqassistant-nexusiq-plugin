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
 * ApiMemberDTO
 */
@JsonPropertyOrder({
    ApiMemberDTO.JSON_PROPERTY_OWNER_ID,
    ApiMemberDTO.JSON_PROPERTY_OWNER_TYPE,
    ApiMemberDTO.JSON_PROPERTY_TYPE,
    ApiMemberDTO.JSON_PROPERTY_USER_OR_GROUP_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiMemberDTO {
    public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
    public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
    public static final String JSON_PROPERTY_TYPE = "type";
    public static final String JSON_PROPERTY_USER_OR_GROUP_NAME = "userOrGroupName";
    private String ownerId;
    private String ownerType;
    private TypeEnum type;
    private String userOrGroupName;
    public ApiMemberDTO() {
    }

    public ApiMemberDTO ownerId(String ownerId) {
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

    public ApiMemberDTO ownerType(String ownerType) {
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

    public ApiMemberDTO type(TypeEnum type) {
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

    public ApiMemberDTO userOrGroupName(String userOrGroupName) {
        this.userOrGroupName = userOrGroupName;
        return this;
    }

    /**
     * Get userOrGroupName
     *
     * @return userOrGroupName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USER_OR_GROUP_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getUserOrGroupName() {
        return userOrGroupName;
    }

    @JsonProperty(JSON_PROPERTY_USER_OR_GROUP_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserOrGroupName(String userOrGroupName) {
        this.userOrGroupName = userOrGroupName;
    }

    /**
     * Return true if this ApiMemberDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiMemberDTO apiMemberDTO = (ApiMemberDTO) o;
        return Objects.equals(this.ownerId, apiMemberDTO.ownerId) &&
            Objects.equals(this.ownerType, apiMemberDTO.ownerType) &&
            Objects.equals(this.type, apiMemberDTO.type) &&
            Objects.equals(this.userOrGroupName, apiMemberDTO.userOrGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, ownerType, type, userOrGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiMemberDTO {\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userOrGroupName: ").append(toIndentedString(userOrGroupName)).append("\n");
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
        USER("USER"),

        GROUP("GROUP");

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
