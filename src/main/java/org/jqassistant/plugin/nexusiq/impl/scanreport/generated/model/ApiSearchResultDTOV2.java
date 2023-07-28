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
 * ApiSearchResultDTOV2
 */
@JsonPropertyOrder({
    ApiSearchResultDTOV2.JSON_PROPERTY_APPLICATION_ID,
    ApiSearchResultDTOV2.JSON_PROPERTY_APPLICATION_NAME,
    ApiSearchResultDTOV2.JSON_PROPERTY_COMPONENT_IDENTIFIER,
    ApiSearchResultDTOV2.JSON_PROPERTY_DEPENDENCY_DATA,
    ApiSearchResultDTOV2.JSON_PROPERTY_HASH,
    ApiSearchResultDTOV2.JSON_PROPERTY_PACKAGE_URL,
    ApiSearchResultDTOV2.JSON_PROPERTY_REPORT_HTML_URL,
    ApiSearchResultDTOV2.JSON_PROPERTY_REPORT_URL,
    ApiSearchResultDTOV2.JSON_PROPERTY_THREAT_LEVEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiSearchResultDTOV2 {
    public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
    public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
    public static final String JSON_PROPERTY_COMPONENT_IDENTIFIER = "componentIdentifier";
    public static final String JSON_PROPERTY_DEPENDENCY_DATA = "dependencyData";
    public static final String JSON_PROPERTY_HASH = "hash";
    public static final String JSON_PROPERTY_PACKAGE_URL = "packageUrl";
    public static final String JSON_PROPERTY_REPORT_HTML_URL = "reportHtmlUrl";
    public static final String JSON_PROPERTY_REPORT_URL = "reportUrl";
    public static final String JSON_PROPERTY_THREAT_LEVEL = "threatLevel";
    private String applicationId;
    private String applicationName;
    private ApiComponentIdentifierDTOV2 componentIdentifier;
    private ApiDependencyDataDTO dependencyData;
    private String hash;
    private String packageUrl;
    private String reportHtmlUrl;
    private String reportUrl;
    private Integer threatLevel;

    public ApiSearchResultDTOV2() {
    }

    public ApiSearchResultDTOV2 applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get applicationId
     *
     * @return applicationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getApplicationId() {
        return applicationId;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }


    public ApiSearchResultDTOV2 applicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get applicationName
     *
     * @return applicationName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getApplicationName() {
        return applicationName;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    public ApiSearchResultDTOV2 componentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
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


    public ApiSearchResultDTOV2 dependencyData(ApiDependencyDataDTO dependencyData) {
        this.dependencyData = dependencyData;
        return this;
    }

    /**
     * Get dependencyData
     *
     * @return dependencyData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DEPENDENCY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiDependencyDataDTO getDependencyData() {
        return dependencyData;
    }


    @JsonProperty(JSON_PROPERTY_DEPENDENCY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDependencyData(ApiDependencyDataDTO dependencyData) {
        this.dependencyData = dependencyData;
    }


    public ApiSearchResultDTOV2 hash(String hash) {
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


    public ApiSearchResultDTOV2 packageUrl(String packageUrl) {
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


    public ApiSearchResultDTOV2 reportHtmlUrl(String reportHtmlUrl) {
        this.reportHtmlUrl = reportHtmlUrl;
        return this;
    }

    /**
     * Get reportHtmlUrl
     *
     * @return reportHtmlUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REPORT_HTML_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getReportHtmlUrl() {
        return reportHtmlUrl;
    }


    @JsonProperty(JSON_PROPERTY_REPORT_HTML_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportHtmlUrl(String reportHtmlUrl) {
        this.reportHtmlUrl = reportHtmlUrl;
    }


    public ApiSearchResultDTOV2 reportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
        return this;
    }

    /**
     * Get reportUrl
     *
     * @return reportUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REPORT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getReportUrl() {
        return reportUrl;
    }


    @JsonProperty(JSON_PROPERTY_REPORT_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }


    public ApiSearchResultDTOV2 threatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }

    /**
     * Get threatLevel
     *
     * @return threatLevel
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getThreatLevel() {
        return threatLevel;
    }


    @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setThreatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
    }


    /**
     * Return true if this ApiSearchResultDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiSearchResultDTOV2 apiSearchResultDTOV2 = (ApiSearchResultDTOV2) o;
        return Objects.equals(this.applicationId, apiSearchResultDTOV2.applicationId) &&
            Objects.equals(this.applicationName, apiSearchResultDTOV2.applicationName) &&
            Objects.equals(this.componentIdentifier, apiSearchResultDTOV2.componentIdentifier) &&
            Objects.equals(this.dependencyData, apiSearchResultDTOV2.dependencyData) &&
            Objects.equals(this.hash, apiSearchResultDTOV2.hash) &&
            Objects.equals(this.packageUrl, apiSearchResultDTOV2.packageUrl) &&
            Objects.equals(this.reportHtmlUrl, apiSearchResultDTOV2.reportHtmlUrl) &&
            Objects.equals(this.reportUrl, apiSearchResultDTOV2.reportUrl) &&
            Objects.equals(this.threatLevel, apiSearchResultDTOV2.threatLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, applicationName, componentIdentifier, dependencyData, hash, packageUrl, reportHtmlUrl, reportUrl, threatLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSearchResultDTOV2 {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    componentIdentifier: ").append(toIndentedString(componentIdentifier)).append("\n");
        sb.append("    dependencyData: ").append(toIndentedString(dependencyData)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    reportHtmlUrl: ").append(toIndentedString(reportHtmlUrl)).append("\n");
        sb.append("    reportUrl: ").append(toIndentedString(reportUrl)).append("\n");
        sb.append("    threatLevel: ").append(toIndentedString(threatLevel)).append("\n");
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
