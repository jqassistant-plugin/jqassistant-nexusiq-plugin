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
 * ApiLicenseLegalFileDTO
 */
@JsonPropertyOrder({
    ApiLicenseLegalFileDTO.JSON_PROPERTY_CONTENT,
    ApiLicenseLegalFileDTO.JSON_PROPERTY_ID,
    ApiLicenseLegalFileDTO.JSON_PROPERTY_ORIGINAL_CONTENT_HASH,
    ApiLicenseLegalFileDTO.JSON_PROPERTY_REL_PATH,
    ApiLicenseLegalFileDTO.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiLicenseLegalFileDTO {
    public static final String JSON_PROPERTY_CONTENT = "content";
    public static final String JSON_PROPERTY_ID = "id";
    public static final String JSON_PROPERTY_ORIGINAL_CONTENT_HASH = "originalContentHash";
    public static final String JSON_PROPERTY_REL_PATH = "relPath";
    public static final String JSON_PROPERTY_STATUS = "status";
    private String content;
    private String id;
    private String originalContentHash;
    private String relPath;
    private StatusEnum status;
    public ApiLicenseLegalFileDTO() {
    }

    public ApiLicenseLegalFileDTO content(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     *
     * @return content
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getContent() {
        return content;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContent(String content) {
        this.content = content;
    }

    public ApiLicenseLegalFileDTO id(String id) {
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

    public ApiLicenseLegalFileDTO originalContentHash(String originalContentHash) {
        this.originalContentHash = originalContentHash;
        return this;
    }

    /**
     * Get originalContentHash
     *
     * @return originalContentHash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ORIGINAL_CONTENT_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOriginalContentHash() {
        return originalContentHash;
    }

    @JsonProperty(JSON_PROPERTY_ORIGINAL_CONTENT_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOriginalContentHash(String originalContentHash) {
        this.originalContentHash = originalContentHash;
    }

    public ApiLicenseLegalFileDTO relPath(String relPath) {
        this.relPath = relPath;
        return this;
    }

    /**
     * Get relPath
     *
     * @return relPath
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REL_PATH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getRelPath() {
        return relPath;
    }

    @JsonProperty(JSON_PROPERTY_REL_PATH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRelPath(String relPath) {
        this.relPath = relPath;
    }

    public ApiLicenseLegalFileDTO status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public StatusEnum getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Return true if this ApiLicenseLegalFileDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiLicenseLegalFileDTO apiLicenseLegalFileDTO = (ApiLicenseLegalFileDTO) o;
        return Objects.equals(this.content, apiLicenseLegalFileDTO.content) &&
            Objects.equals(this.id, apiLicenseLegalFileDTO.id) &&
            Objects.equals(this.originalContentHash, apiLicenseLegalFileDTO.originalContentHash) &&
            Objects.equals(this.relPath, apiLicenseLegalFileDTO.relPath) &&
            Objects.equals(this.status, apiLicenseLegalFileDTO.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, id, originalContentHash, relPath, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiLicenseLegalFileDTO {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    originalContentHash: ").append(toIndentedString(originalContentHash)).append("\n");
        sb.append("    relPath: ").append(toIndentedString(relPath)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
     * Gets or Sets status
     */
    public enum StatusEnum {
        ENABLED("enabled"),

        DISABLED("disabled");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
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

