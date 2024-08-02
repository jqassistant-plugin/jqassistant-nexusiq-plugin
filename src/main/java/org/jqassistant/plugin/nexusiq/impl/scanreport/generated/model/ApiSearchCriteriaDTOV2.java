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
 * ApiSearchCriteriaDTOV2
 */
@JsonPropertyOrder({
    ApiSearchCriteriaDTOV2.JSON_PROPERTY_COMPONENT_IDENTIFIER,
    ApiSearchCriteriaDTOV2.JSON_PROPERTY_HASH,
    ApiSearchCriteriaDTOV2.JSON_PROPERTY_PACKAGE_URL,
    ApiSearchCriteriaDTOV2.JSON_PROPERTY_STAGE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiSearchCriteriaDTOV2 {
    public static final String JSON_PROPERTY_COMPONENT_IDENTIFIER = "componentIdentifier";
    public static final String JSON_PROPERTY_HASH = "hash";
    public static final String JSON_PROPERTY_PACKAGE_URL = "packageUrl";
    public static final String JSON_PROPERTY_STAGE_ID = "stageId";
    private ApiComponentIdentifierDTOV2 componentIdentifier;
    private String hash;
    private String packageUrl;
    private String stageId;

    public ApiSearchCriteriaDTOV2() {
    }

    public ApiSearchCriteriaDTOV2 componentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
        return this;
    }

    /**
     * Get componentIdentifier
     *
     * @return componentIdentifier
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENT_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentIdentifierDTOV2 getComponentIdentifier() {
        return componentIdentifier;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENT_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
    }


    public ApiSearchCriteriaDTOV2 hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Get hash
     *
     * @return hash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getHash() {
        return hash;
    }


    @JsonProperty(JSON_PROPERTY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHash(String hash) {
        this.hash = hash;
    }


    public ApiSearchCriteriaDTOV2 packageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }

    /**
     * Get packageUrl
     *
     * @return packageUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PACKAGE_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPackageUrl() {
        return packageUrl;
    }


    @JsonProperty(JSON_PROPERTY_PACKAGE_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }


    public ApiSearchCriteriaDTOV2 stageId(String stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * Get stageId
     *
     * @return stageId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STAGE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getStageId() {
        return stageId;
    }


    @JsonProperty(JSON_PROPERTY_STAGE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStageId(String stageId) {
        this.stageId = stageId;
    }


    /**
     * Return true if this ApiSearchCriteriaDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiSearchCriteriaDTOV2 apiSearchCriteriaDTOV2 = (ApiSearchCriteriaDTOV2) o;
        return Objects.equals(this.componentIdentifier, apiSearchCriteriaDTOV2.componentIdentifier) &&
            Objects.equals(this.hash, apiSearchCriteriaDTOV2.hash) &&
            Objects.equals(this.packageUrl, apiSearchCriteriaDTOV2.packageUrl) &&
            Objects.equals(this.stageId, apiSearchCriteriaDTOV2.stageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentIdentifier, hash, packageUrl, stageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSearchCriteriaDTOV2 {\n");
        sb.append("    componentIdentifier: ").append(toIndentedString(componentIdentifier)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    stageId: ").append(toIndentedString(stageId)).append("\n");
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
