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
 * ApiThirdPartyScanResultDTO
 */
@JsonPropertyOrder({
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_COMPONENTS_AFFECTED,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_EMBEDDABLE_REPORT_HTML_URL,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_ERROR_MESSAGE,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_GRANDFATHERED_POLICY_VIOLATIONS,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_IS_ERROR,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_OPEN_POLICY_VIOLATIONS,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_POLICY_ACTION,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_REPORT_DATA_URL,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_REPORT_HTML_URL,
    ApiThirdPartyScanResultDTO.JSON_PROPERTY_REPORT_PDF_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiThirdPartyScanResultDTO {
    public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "componentsAffected";
    public static final String JSON_PROPERTY_EMBEDDABLE_REPORT_HTML_URL = "embeddableReportHtmlUrl";
    public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
    public static final String JSON_PROPERTY_GRANDFATHERED_POLICY_VIOLATIONS = "grandfatheredPolicyViolations";
    public static final String JSON_PROPERTY_IS_ERROR = "isError";
    public static final String JSON_PROPERTY_OPEN_POLICY_VIOLATIONS = "openPolicyViolations";
    public static final String JSON_PROPERTY_POLICY_ACTION = "policyAction";
    public static final String JSON_PROPERTY_REPORT_DATA_URL = "reportDataUrl";
    public static final String JSON_PROPERTY_REPORT_HTML_URL = "reportHtmlUrl";
    public static final String JSON_PROPERTY_REPORT_PDF_URL = "reportPdfUrl";
    private ApiEvaluationResultCounterDTO componentsAffected;
    private String embeddableReportHtmlUrl;
    private String errorMessage;
    private Integer grandfatheredPolicyViolations;
    private Boolean isError;
    private ApiEvaluationResultCounterDTO openPolicyViolations;
    private String policyAction;
    private String reportDataUrl;
    private String reportHtmlUrl;
    private String reportPdfUrl;

    public ApiThirdPartyScanResultDTO() {
    }

    public ApiThirdPartyScanResultDTO componentsAffected(ApiEvaluationResultCounterDTO componentsAffected) {
        this.componentsAffected = componentsAffected;
        return this;
    }

    /**
     * Get componentsAffected
     *
     * @return componentsAffected
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiEvaluationResultCounterDTO getComponentsAffected() {
        return componentsAffected;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponentsAffected(ApiEvaluationResultCounterDTO componentsAffected) {
        this.componentsAffected = componentsAffected;
    }


    public ApiThirdPartyScanResultDTO embeddableReportHtmlUrl(String embeddableReportHtmlUrl) {
        this.embeddableReportHtmlUrl = embeddableReportHtmlUrl;
        return this;
    }

    /**
     * Get embeddableReportHtmlUrl
     *
     * @return embeddableReportHtmlUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EMBEDDABLE_REPORT_HTML_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getEmbeddableReportHtmlUrl() {
        return embeddableReportHtmlUrl;
    }


    @JsonProperty(JSON_PROPERTY_EMBEDDABLE_REPORT_HTML_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmbeddableReportHtmlUrl(String embeddableReportHtmlUrl) {
        this.embeddableReportHtmlUrl = embeddableReportHtmlUrl;
    }


    public ApiThirdPartyScanResultDTO errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getErrorMessage() {
        return errorMessage;
    }


    @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }


    public ApiThirdPartyScanResultDTO grandfatheredPolicyViolations(Integer grandfatheredPolicyViolations) {
        this.grandfatheredPolicyViolations = grandfatheredPolicyViolations;
        return this;
    }

    /**
     * Get grandfatheredPolicyViolations
     *
     * @return grandfatheredPolicyViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_GRANDFATHERED_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getGrandfatheredPolicyViolations() {
        return grandfatheredPolicyViolations;
    }


    @JsonProperty(JSON_PROPERTY_GRANDFATHERED_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setGrandfatheredPolicyViolations(Integer grandfatheredPolicyViolations) {
        this.grandfatheredPolicyViolations = grandfatheredPolicyViolations;
    }


    public ApiThirdPartyScanResultDTO isError(Boolean isError) {
        this.isError = isError;
        return this;
    }

    /**
     * Get isError
     *
     * @return isError
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IS_ERROR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getIsError() {
        return isError;
    }


    @JsonProperty(JSON_PROPERTY_IS_ERROR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsError(Boolean isError) {
        this.isError = isError;
    }


    public ApiThirdPartyScanResultDTO openPolicyViolations(ApiEvaluationResultCounterDTO openPolicyViolations) {
        this.openPolicyViolations = openPolicyViolations;
        return this;
    }

    /**
     * Get openPolicyViolations
     *
     * @return openPolicyViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OPEN_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiEvaluationResultCounterDTO getOpenPolicyViolations() {
        return openPolicyViolations;
    }


    @JsonProperty(JSON_PROPERTY_OPEN_POLICY_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOpenPolicyViolations(ApiEvaluationResultCounterDTO openPolicyViolations) {
        this.openPolicyViolations = openPolicyViolations;
    }


    public ApiThirdPartyScanResultDTO policyAction(String policyAction) {
        this.policyAction = policyAction;
        return this;
    }

    /**
     * Get policyAction
     *
     * @return policyAction
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_ACTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyAction() {
        return policyAction;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_ACTION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
    }


    public ApiThirdPartyScanResultDTO reportDataUrl(String reportDataUrl) {
        this.reportDataUrl = reportDataUrl;
        return this;
    }

    /**
     * Get reportDataUrl
     *
     * @return reportDataUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REPORT_DATA_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getReportDataUrl() {
        return reportDataUrl;
    }


    @JsonProperty(JSON_PROPERTY_REPORT_DATA_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportDataUrl(String reportDataUrl) {
        this.reportDataUrl = reportDataUrl;
    }


    public ApiThirdPartyScanResultDTO reportHtmlUrl(String reportHtmlUrl) {
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


    public ApiThirdPartyScanResultDTO reportPdfUrl(String reportPdfUrl) {
        this.reportPdfUrl = reportPdfUrl;
        return this;
    }

    /**
     * Get reportPdfUrl
     *
     * @return reportPdfUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REPORT_PDF_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getReportPdfUrl() {
        return reportPdfUrl;
    }


    @JsonProperty(JSON_PROPERTY_REPORT_PDF_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportPdfUrl(String reportPdfUrl) {
        this.reportPdfUrl = reportPdfUrl;
    }


    /**
     * Return true if this ApiThirdPartyScanResultDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiThirdPartyScanResultDTO apiThirdPartyScanResultDTO = (ApiThirdPartyScanResultDTO) o;
        return Objects.equals(this.componentsAffected, apiThirdPartyScanResultDTO.componentsAffected) &&
            Objects.equals(this.embeddableReportHtmlUrl, apiThirdPartyScanResultDTO.embeddableReportHtmlUrl) &&
            Objects.equals(this.errorMessage, apiThirdPartyScanResultDTO.errorMessage) &&
            Objects.equals(this.grandfatheredPolicyViolations, apiThirdPartyScanResultDTO.grandfatheredPolicyViolations) &&
            Objects.equals(this.isError, apiThirdPartyScanResultDTO.isError) &&
            Objects.equals(this.openPolicyViolations, apiThirdPartyScanResultDTO.openPolicyViolations) &&
            Objects.equals(this.policyAction, apiThirdPartyScanResultDTO.policyAction) &&
            Objects.equals(this.reportDataUrl, apiThirdPartyScanResultDTO.reportDataUrl) &&
            Objects.equals(this.reportHtmlUrl, apiThirdPartyScanResultDTO.reportHtmlUrl) &&
            Objects.equals(this.reportPdfUrl, apiThirdPartyScanResultDTO.reportPdfUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentsAffected, embeddableReportHtmlUrl, errorMessage, grandfatheredPolicyViolations, isError, openPolicyViolations, policyAction, reportDataUrl, reportHtmlUrl, reportPdfUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiThirdPartyScanResultDTO {\n");
        sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
        sb.append("    embeddableReportHtmlUrl: ").append(toIndentedString(embeddableReportHtmlUrl)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    grandfatheredPolicyViolations: ").append(toIndentedString(grandfatheredPolicyViolations)).append("\n");
        sb.append("    isError: ").append(toIndentedString(isError)).append("\n");
        sb.append("    openPolicyViolations: ").append(toIndentedString(openPolicyViolations)).append("\n");
        sb.append("    policyAction: ").append(toIndentedString(policyAction)).append("\n");
        sb.append("    reportDataUrl: ").append(toIndentedString(reportDataUrl)).append("\n");
        sb.append("    reportHtmlUrl: ").append(toIndentedString(reportHtmlUrl)).append("\n");
        sb.append("    reportPdfUrl: ").append(toIndentedString(reportPdfUrl)).append("\n");
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
