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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * ApiComponentTransitivePolicyViolationsDTO
 */
@JsonPropertyOrder({
    ApiComponentTransitivePolicyViolationsDTO.JSON_PROPERTY_COMPONENT_IDENTIFIER,
    ApiComponentTransitivePolicyViolationsDTO.JSON_PROPERTY_DISPLAY_NAME,
    ApiComponentTransitivePolicyViolationsDTO.JSON_PROPERTY_HASH,
    ApiComponentTransitivePolicyViolationsDTO.JSON_PROPERTY_IS_INNER_SOURCE,
    ApiComponentTransitivePolicyViolationsDTO.JSON_PROPERTY_PACKAGE_URL,
    ApiComponentTransitivePolicyViolationsDTO.JSON_PROPERTY_TRANSITIVE_POLICY_VIOLATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentTransitivePolicyViolationsDTO {
    public static final String JSON_PROPERTY_COMPONENT_IDENTIFIER = "componentIdentifier";
    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    public static final String JSON_PROPERTY_HASH = "hash";
    public static final String JSON_PROPERTY_IS_INNER_SOURCE = "isInnerSource";
    public static final String JSON_PROPERTY_PACKAGE_URL = "packageUrl";
    public static final String JSON_PROPERTY_TRANSITIVE_POLICY_VIOLATIONS = "transitivePolicyViolations";
    private ApiComponentIdentifierDTOV2 componentIdentifier;
    private String displayName;
    private String hash;
    private Boolean isInnerSource;
    private String packageUrl;
    private List<ApiStagePolicyViolationComponentDTO> transitivePolicyViolations = null;

    public ApiComponentTransitivePolicyViolationsDTO() {
    }

    public ApiComponentTransitivePolicyViolationsDTO componentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
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


    public ApiComponentTransitivePolicyViolationsDTO displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getDisplayName() {
        return displayName;
    }


    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }


    public ApiComponentTransitivePolicyViolationsDTO hash(String hash) {
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


    public ApiComponentTransitivePolicyViolationsDTO isInnerSource(Boolean isInnerSource) {
        this.isInnerSource = isInnerSource;
        return this;
    }

    /**
     * Get isInnerSource
     *
     * @return isInnerSource
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IS_INNER_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getIsInnerSource() {
        return isInnerSource;
    }


    @JsonProperty(JSON_PROPERTY_IS_INNER_SOURCE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsInnerSource(Boolean isInnerSource) {
        this.isInnerSource = isInnerSource;
    }


    public ApiComponentTransitivePolicyViolationsDTO packageUrl(String packageUrl) {
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


    public ApiComponentTransitivePolicyViolationsDTO transitivePolicyViolations(List<ApiStagePolicyViolationComponentDTO> transitivePolicyViolations) {
        this.transitivePolicyViolations = transitivePolicyViolations;
        return this;
    }

    public ApiComponentTransitivePolicyViolationsDTO addTransitivePolicyViolationsItem(ApiStagePolicyViolationComponentDTO transitivePolicyViolationsItem) {
        if (this.transitivePolicyViolations == null) {
            this.transitivePolicyViolations = new ArrayList<>();
        }
        this.transitivePolicyViolations.add(transitivePolicyViolationsItem);
        return this;
    }

    /**
     * Get transitivePolicyViolations
     *
     * @return transitivePolicyViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TRANSITIVE_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiStagePolicyViolationComponentDTO> getTransitivePolicyViolations() {
        return transitivePolicyViolations;
    }


    @JsonProperty(JSON_PROPERTY_TRANSITIVE_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTransitivePolicyViolations(List<ApiStagePolicyViolationComponentDTO> transitivePolicyViolations) {
        this.transitivePolicyViolations = transitivePolicyViolations;
    }


    /**
     * Return true if this ApiComponentTransitivePolicyViolationsDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentTransitivePolicyViolationsDTO apiComponentTransitivePolicyViolationsDTO = (ApiComponentTransitivePolicyViolationsDTO) o;
        return Objects.equals(this.componentIdentifier, apiComponentTransitivePolicyViolationsDTO.componentIdentifier) &&
            Objects.equals(this.displayName, apiComponentTransitivePolicyViolationsDTO.displayName) &&
            Objects.equals(this.hash, apiComponentTransitivePolicyViolationsDTO.hash) &&
            Objects.equals(this.isInnerSource, apiComponentTransitivePolicyViolationsDTO.isInnerSource) &&
            Objects.equals(this.packageUrl, apiComponentTransitivePolicyViolationsDTO.packageUrl) &&
            Objects.equals(this.transitivePolicyViolations, apiComponentTransitivePolicyViolationsDTO.transitivePolicyViolations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentIdentifier, displayName, hash, isInnerSource, packageUrl, transitivePolicyViolations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentTransitivePolicyViolationsDTO {\n");
        sb.append("    componentIdentifier: ").append(toIndentedString(componentIdentifier)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    isInnerSource: ").append(toIndentedString(isInnerSource)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    transitivePolicyViolations: ").append(toIndentedString(transitivePolicyViolations)).append("\n");
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
