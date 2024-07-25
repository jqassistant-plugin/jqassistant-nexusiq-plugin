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

import java.time.OffsetDateTime;
import java.util.Objects;


/**
 * ApiComponentDetailsDTOV2
 */
@JsonPropertyOrder({
    ApiComponentDetailsDTOV2.JSON_PROPERTY_CATALOG_DATE,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_COMPONENT,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_HYGIENE_RATING,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_INTEGRITY_RATING,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_LICENSE_DATA,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_MATCH_STATE,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_POLICY_DATA,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_PROJECT_DATA,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_RELATIVE_POPULARITY,
    ApiComponentDetailsDTOV2.JSON_PROPERTY_SECURITY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiComponentDetailsDTOV2 {
    public static final String JSON_PROPERTY_CATALOG_DATE = "catalogDate";
    public static final String JSON_PROPERTY_COMPONENT = "component";
    public static final String JSON_PROPERTY_HYGIENE_RATING = "hygieneRating";
    public static final String JSON_PROPERTY_INTEGRITY_RATING = "integrityRating";
    public static final String JSON_PROPERTY_LICENSE_DATA = "licenseData";
    public static final String JSON_PROPERTY_MATCH_STATE = "matchState";
    public static final String JSON_PROPERTY_POLICY_DATA = "policyData";
    public static final String JSON_PROPERTY_PROJECT_DATA = "projectData";
    public static final String JSON_PROPERTY_RELATIVE_POPULARITY = "relativePopularity";
    public static final String JSON_PROPERTY_SECURITY_DATA = "securityData";
    private OffsetDateTime catalogDate;
    private ApiComponentDTOV2 component;
    private String hygieneRating;
    private String integrityRating;
    private ApiLicenseDataDTO licenseData;
    private String matchState;
    private ApiComponentPolicyViolationListDTOV2 policyData;
    private ApiComponentProjectDataDTO projectData;
    private Integer relativePopularity;
    private ApiSecurityDataDTO securityData;

    public ApiComponentDetailsDTOV2() {
    }

    public ApiComponentDetailsDTOV2 catalogDate(OffsetDateTime catalogDate) {
        this.catalogDate = catalogDate;
        return this;
    }

    /**
     * Get catalogDate
     *
     * @return catalogDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CATALOG_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getCatalogDate() {
        return catalogDate;
    }


    @JsonProperty(JSON_PROPERTY_CATALOG_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCatalogDate(OffsetDateTime catalogDate) {
        this.catalogDate = catalogDate;
    }


    public ApiComponentDetailsDTOV2 component(ApiComponentDTOV2 component) {
        this.component = component;
        return this;
    }

    /**
     * Get component
     *
     * @return component
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentDTOV2 getComponent() {
        return component;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponent(ApiComponentDTOV2 component) {
        this.component = component;
    }


    public ApiComponentDetailsDTOV2 hygieneRating(String hygieneRating) {
        this.hygieneRating = hygieneRating;
        return this;
    }

    /**
     * Get hygieneRating
     *
     * @return hygieneRating
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_HYGIENE_RATING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getHygieneRating() {
        return hygieneRating;
    }


    @JsonProperty(JSON_PROPERTY_HYGIENE_RATING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHygieneRating(String hygieneRating) {
        this.hygieneRating = hygieneRating;
    }


    public ApiComponentDetailsDTOV2 integrityRating(String integrityRating) {
        this.integrityRating = integrityRating;
        return this;
    }

    /**
     * Get integrityRating
     *
     * @return integrityRating
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INTEGRITY_RATING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getIntegrityRating() {
        return integrityRating;
    }


    @JsonProperty(JSON_PROPERTY_INTEGRITY_RATING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIntegrityRating(String integrityRating) {
        this.integrityRating = integrityRating;
    }


    public ApiComponentDetailsDTOV2 licenseData(ApiLicenseDataDTO licenseData) {
        this.licenseData = licenseData;
        return this;
    }

    /**
     * Get licenseData
     *
     * @return licenseData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LICENSE_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiLicenseDataDTO getLicenseData() {
        return licenseData;
    }


    @JsonProperty(JSON_PROPERTY_LICENSE_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLicenseData(ApiLicenseDataDTO licenseData) {
        this.licenseData = licenseData;
    }


    public ApiComponentDetailsDTOV2 matchState(String matchState) {
        this.matchState = matchState;
        return this;
    }

    /**
     * Get matchState
     *
     * @return matchState
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MATCH_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getMatchState() {
        return matchState;
    }


    @JsonProperty(JSON_PROPERTY_MATCH_STATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }


    public ApiComponentDetailsDTOV2 policyData(ApiComponentPolicyViolationListDTOV2 policyData) {
        this.policyData = policyData;
        return this;
    }

    /**
     * Get policyData
     *
     * @return policyData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentPolicyViolationListDTOV2 getPolicyData() {
        return policyData;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyData(ApiComponentPolicyViolationListDTOV2 policyData) {
        this.policyData = policyData;
    }


    public ApiComponentDetailsDTOV2 projectData(ApiComponentProjectDataDTO projectData) {
        this.projectData = projectData;
        return this;
    }

    /**
     * Get projectData
     *
     * @return projectData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROJECT_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentProjectDataDTO getProjectData() {
        return projectData;
    }


    @JsonProperty(JSON_PROPERTY_PROJECT_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProjectData(ApiComponentProjectDataDTO projectData) {
        this.projectData = projectData;
    }


    public ApiComponentDetailsDTOV2 relativePopularity(Integer relativePopularity) {
        this.relativePopularity = relativePopularity;
        return this;
    }

    /**
     * Get relativePopularity
     *
     * @return relativePopularity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_RELATIVE_POPULARITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getRelativePopularity() {
        return relativePopularity;
    }


    @JsonProperty(JSON_PROPERTY_RELATIVE_POPULARITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRelativePopularity(Integer relativePopularity) {
        this.relativePopularity = relativePopularity;
    }


    public ApiComponentDetailsDTOV2 securityData(ApiSecurityDataDTO securityData) {
        this.securityData = securityData;
        return this;
    }

    /**
     * Get securityData
     *
     * @return securityData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SECURITY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiSecurityDataDTO getSecurityData() {
        return securityData;
    }


    @JsonProperty(JSON_PROPERTY_SECURITY_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSecurityData(ApiSecurityDataDTO securityData) {
        this.securityData = securityData;
    }


    /**
     * Return true if this ApiComponentDetailsDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiComponentDetailsDTOV2 apiComponentDetailsDTOV2 = (ApiComponentDetailsDTOV2) o;
        return Objects.equals(this.catalogDate, apiComponentDetailsDTOV2.catalogDate) &&
            Objects.equals(this.component, apiComponentDetailsDTOV2.component) &&
            Objects.equals(this.hygieneRating, apiComponentDetailsDTOV2.hygieneRating) &&
            Objects.equals(this.integrityRating, apiComponentDetailsDTOV2.integrityRating) &&
            Objects.equals(this.licenseData, apiComponentDetailsDTOV2.licenseData) &&
            Objects.equals(this.matchState, apiComponentDetailsDTOV2.matchState) &&
            Objects.equals(this.policyData, apiComponentDetailsDTOV2.policyData) &&
            Objects.equals(this.projectData, apiComponentDetailsDTOV2.projectData) &&
            Objects.equals(this.relativePopularity, apiComponentDetailsDTOV2.relativePopularity) &&
            Objects.equals(this.securityData, apiComponentDetailsDTOV2.securityData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogDate, component, hygieneRating, integrityRating, licenseData, matchState, policyData, projectData, relativePopularity, securityData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiComponentDetailsDTOV2 {\n");
        sb.append("    catalogDate: ").append(toIndentedString(catalogDate)).append("\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    hygieneRating: ").append(toIndentedString(hygieneRating)).append("\n");
        sb.append("    integrityRating: ").append(toIndentedString(integrityRating)).append("\n");
        sb.append("    licenseData: ").append(toIndentedString(licenseData)).append("\n");
        sb.append("    matchState: ").append(toIndentedString(matchState)).append("\n");
        sb.append("    policyData: ").append(toIndentedString(policyData)).append("\n");
        sb.append("    projectData: ").append(toIndentedString(projectData)).append("\n");
        sb.append("    relativePopularity: ").append(toIndentedString(relativePopularity)).append("\n");
        sb.append("    securityData: ").append(toIndentedString(securityData)).append("\n");
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

