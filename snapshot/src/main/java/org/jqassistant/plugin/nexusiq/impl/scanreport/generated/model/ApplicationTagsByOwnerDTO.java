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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ApplicationTagsByOwnerDTO
 */
@JsonPropertyOrder({
    ApplicationTagsByOwnerDTO.JSON_PROPERTY_APPLICATION_TAGS,
    ApplicationTagsByOwnerDTO.JSON_PROPERTY_OWNER_ID,
    ApplicationTagsByOwnerDTO.JSON_PROPERTY_OWNER_NAME,
    ApplicationTagsByOwnerDTO.JSON_PROPERTY_OWNER_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApplicationTagsByOwnerDTO {
    public static final String JSON_PROPERTY_APPLICATION_TAGS = "applicationTags";
    public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
    public static final String JSON_PROPERTY_OWNER_NAME = "ownerName";
    public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
    private List<ApplicationTag> applicationTags = null;
    private String ownerId;
    private String ownerName;
    private OwnerTypeEnum ownerType;
    public ApplicationTagsByOwnerDTO() {
    }

    public ApplicationTagsByOwnerDTO applicationTags(List<ApplicationTag> applicationTags) {
        this.applicationTags = applicationTags;
        return this;
    }

    public ApplicationTagsByOwnerDTO addApplicationTagsItem(ApplicationTag applicationTagsItem) {
        if (this.applicationTags == null) {
            this.applicationTags = new ArrayList<>();
        }
        this.applicationTags.add(applicationTagsItem);
        return this;
    }

    /**
     * Get applicationTags
     *
     * @return applicationTags
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApplicationTag> getApplicationTags() {
        return applicationTags;
    }

    @JsonProperty(JSON_PROPERTY_APPLICATION_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationTags(List<ApplicationTag> applicationTags) {
        this.applicationTags = applicationTags;
    }

    public ApplicationTagsByOwnerDTO ownerId(String ownerId) {
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

    public ApplicationTagsByOwnerDTO ownerName(String ownerName) {
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

    public ApplicationTagsByOwnerDTO ownerType(OwnerTypeEnum ownerType) {
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

    public OwnerTypeEnum getOwnerType() {
        return ownerType;
    }

    @JsonProperty(JSON_PROPERTY_OWNER_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOwnerType(OwnerTypeEnum ownerType) {
        this.ownerType = ownerType;
    }

    /**
     * Return true if this ApplicationTagsByOwnerDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationTagsByOwnerDTO applicationTagsByOwnerDTO = (ApplicationTagsByOwnerDTO) o;
        return Objects.equals(this.applicationTags, applicationTagsByOwnerDTO.applicationTags) &&
            Objects.equals(this.ownerId, applicationTagsByOwnerDTO.ownerId) &&
            Objects.equals(this.ownerName, applicationTagsByOwnerDTO.ownerName) &&
            Objects.equals(this.ownerType, applicationTagsByOwnerDTO.ownerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationTags, ownerId, ownerName, ownerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationTagsByOwnerDTO {\n");
        sb.append("    applicationTags: ").append(toIndentedString(applicationTags)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
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

    /**
     * Gets or Sets ownerType
     */
    public enum OwnerTypeEnum {
        APPLICATION("application"),

        ORGANIZATION("organization"),

        REPOSITORY_CONTAINER("repository_container"),

        REPOSITORY("repository"),

        GLOBAL("global");

        private String value;

        OwnerTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static OwnerTypeEnum fromValue(String value) {
            for (OwnerTypeEnum b : OwnerTypeEnum.values()) {
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

