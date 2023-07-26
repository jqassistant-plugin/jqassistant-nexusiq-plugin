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
 * ApiComponentProjectScmDTO
 */
@JsonPropertyOrder({
    ApiComponentProjectScmDTO.JSON_PROPERTY_SCM_DETAILS,
    ApiComponentProjectScmDTO.JSON_PROPERTY_SCM_METADATA,
    ApiComponentProjectScmDTO.JSON_PROPERTY_SCM_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentProjectScmDTO {
    public static final String JSON_PROPERTY_SCM_DETAILS = "scmDetails";
    public static final String JSON_PROPERTY_SCM_METADATA = "scmMetadata";
    public static final String JSON_PROPERTY_SCM_URL = "scmUrl";
    private ApiComponentProjectScmDetailsDTO scmDetails;
    private ApiComponentProjectScmMetadataDTO scmMetadata;
    private String scmUrl;

    public ApiComponentProjectScmDTO() {
    }

    public ApiComponentProjectScmDTO scmDetails(ApiComponentProjectScmDetailsDTO scmDetails) {
        this.scmDetails = scmDetails;
        return this;
    }

    /**
     * Get scmDetails
     *
     * @return scmDetails
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SCM_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentProjectScmDetailsDTO getScmDetails() {
        return scmDetails;
    }


    @JsonProperty(JSON_PROPERTY_SCM_DETAILS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setScmDetails(ApiComponentProjectScmDetailsDTO scmDetails) {
        this.scmDetails = scmDetails;
    }


    public ApiComponentProjectScmDTO scmMetadata(ApiComponentProjectScmMetadataDTO scmMetadata) {
        this.scmMetadata = scmMetadata;
        return this;
    }

    /**
     * Get scmMetadata
     *
     * @return scmMetadata
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SCM_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentProjectScmMetadataDTO getScmMetadata() {
        return scmMetadata;
    }


    @JsonProperty(JSON_PROPERTY_SCM_METADATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setScmMetadata(ApiComponentProjectScmMetadataDTO scmMetadata) {
        this.scmMetadata = scmMetadata;
    }


    public ApiComponentProjectScmDTO scmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
        return this;
    }

    /**
     * Get scmUrl
     *
     * @return scmUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SCM_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getScmUrl() {
        return scmUrl;
    }


    @JsonProperty(JSON_PROPERTY_SCM_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
    }


    /**
     * Return true if this ApiComponentProjectScmDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentProjectScmDTO apiComponentProjectScmDTO = (ApiComponentProjectScmDTO) o;
        return Objects.equals(this.scmDetails, apiComponentProjectScmDTO.scmDetails) &&
            Objects.equals(this.scmMetadata, apiComponentProjectScmDTO.scmMetadata) &&
            Objects.equals(this.scmUrl, apiComponentProjectScmDTO.scmUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scmDetails, scmMetadata, scmUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentProjectScmDTO {\n");
        sb.append("    scmDetails: ").append(toIndentedString(scmDetails)).append("\n");
        sb.append("    scmMetadata: ").append(toIndentedString(scmMetadata)).append("\n");
        sb.append("    scmUrl: ").append(toIndentedString(scmUrl)).append("\n");
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

