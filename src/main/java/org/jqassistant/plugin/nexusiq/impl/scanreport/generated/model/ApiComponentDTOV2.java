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
 * ApiComponentDTOV2
 */
@JsonPropertyOrder({
    ApiComponentDTOV2.JSON_PROPERTY_COMPONENT_IDENTIFIER,
    ApiComponentDTOV2.JSON_PROPERTY_DISPLAY_NAME,
    ApiComponentDTOV2.JSON_PROPERTY_HASH,
    ApiComponentDTOV2.JSON_PROPERTY_PACKAGE_URL,
    ApiComponentDTOV2.JSON_PROPERTY_PROPRIETARY,
    ApiComponentDTOV2.JSON_PROPERTY_SHA256,
    ApiComponentDTOV2.JSON_PROPERTY_THIRD_PARTY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentDTOV2 {
    public static final String JSON_PROPERTY_COMPONENT_IDENTIFIER = "componentIdentifier";
    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    public static final String JSON_PROPERTY_HASH = "hash";
    public static final String JSON_PROPERTY_PACKAGE_URL = "packageUrl";
    public static final String JSON_PROPERTY_PROPRIETARY = "proprietary";
    public static final String JSON_PROPERTY_SHA256 = "sha256";
    public static final String JSON_PROPERTY_THIRD_PARTY = "thirdParty";
    private ApiComponentIdentifierDTOV2 componentIdentifier;
    private String displayName;
    private String hash;
    private String packageUrl;
    private Boolean proprietary;
    private String sha256;
    private Boolean thirdParty;

    public ApiComponentDTOV2() {
    }

    public ApiComponentDTOV2 componentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
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


    public ApiComponentDTOV2 displayName(String displayName) {
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


    public ApiComponentDTOV2 hash(String hash) {
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


    public ApiComponentDTOV2 packageUrl(String packageUrl) {
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


    public ApiComponentDTOV2 proprietary(Boolean proprietary) {
        this.proprietary = proprietary;
        return this;
    }

    /**
     * Get proprietary
     *
     * @return proprietary
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROPRIETARY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getProprietary() {
        return proprietary;
    }


    @JsonProperty(JSON_PROPERTY_PROPRIETARY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProprietary(Boolean proprietary) {
        this.proprietary = proprietary;
    }


    public ApiComponentDTOV2 sha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * Get sha256
     *
     * @return sha256
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SHA256)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getSha256() {
        return sha256;
    }


    @JsonProperty(JSON_PROPERTY_SHA256)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }


    public ApiComponentDTOV2 thirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
        return this;
    }

    /**
     * Get thirdParty
     *
     * @return thirdParty
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_THIRD_PARTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getThirdParty() {
        return thirdParty;
    }


    @JsonProperty(JSON_PROPERTY_THIRD_PARTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setThirdParty(Boolean thirdParty) {
        this.thirdParty = thirdParty;
    }


    /**
     * Return true if this ApiComponentDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentDTOV2 apiComponentDTOV2 = (ApiComponentDTOV2) o;
        return Objects.equals(this.componentIdentifier, apiComponentDTOV2.componentIdentifier) &&
            Objects.equals(this.displayName, apiComponentDTOV2.displayName) &&
            Objects.equals(this.hash, apiComponentDTOV2.hash) &&
            Objects.equals(this.packageUrl, apiComponentDTOV2.packageUrl) &&
            Objects.equals(this.proprietary, apiComponentDTOV2.proprietary) &&
            Objects.equals(this.sha256, apiComponentDTOV2.sha256) &&
            Objects.equals(this.thirdParty, apiComponentDTOV2.thirdParty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentIdentifier, displayName, hash, packageUrl, proprietary, sha256, thirdParty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentDTOV2 {\n");
        sb.append("    componentIdentifier: ").append(toIndentedString(componentIdentifier)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    proprietary: ").append(toIndentedString(proprietary)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    thirdParty: ").append(toIndentedString(thirdParty)).append("\n");
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

