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
 * ApiReportResultsDTO
 */
@JsonPropertyOrder({
    ApiReportResultsDTO.JSON_PROPERTY_APPLICATION_ID,
    ApiReportResultsDTO.JSON_PROPERTY_COMMIT_HASH,
    ApiReportResultsDTO.JSON_PROPERTY_EMBEDDABLE_REPORT_HTML_URL,
    ApiReportResultsDTO.JSON_PROPERTY_EVALUATION_DATE,
    ApiReportResultsDTO.JSON_PROPERTY_IS_FOR_MONITORING,
    ApiReportResultsDTO.JSON_PROPERTY_IS_REEVALUATION,
    ApiReportResultsDTO.JSON_PROPERTY_LATEST_REPORT_HTML_URL,
    ApiReportResultsDTO.JSON_PROPERTY_POLICY_EVALUATION_ID,
    ApiReportResultsDTO.JSON_PROPERTY_POLICY_EVALUATION_RESULT,
    ApiReportResultsDTO.JSON_PROPERTY_REPORT_DATA_URL,
    ApiReportResultsDTO.JSON_PROPERTY_REPORT_HTML_URL,
    ApiReportResultsDTO.JSON_PROPERTY_REPORT_PDF_URL,
    ApiReportResultsDTO.JSON_PROPERTY_SCAN_ID,
    ApiReportResultsDTO.JSON_PROPERTY_STAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiReportResultsDTO {
    public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
    public static final String JSON_PROPERTY_COMMIT_HASH = "commitHash";
    public static final String JSON_PROPERTY_EMBEDDABLE_REPORT_HTML_URL = "embeddableReportHtmlUrl";
    public static final String JSON_PROPERTY_EVALUATION_DATE = "evaluationDate";
    public static final String JSON_PROPERTY_IS_FOR_MONITORING = "isForMonitoring";
    public static final String JSON_PROPERTY_IS_REEVALUATION = "isReevaluation";
    public static final String JSON_PROPERTY_LATEST_REPORT_HTML_URL = "latestReportHtmlUrl";
    public static final String JSON_PROPERTY_POLICY_EVALUATION_ID = "policyEvaluationId";
    public static final String JSON_PROPERTY_POLICY_EVALUATION_RESULT = "policyEvaluationResult";
    public static final String JSON_PROPERTY_REPORT_DATA_URL = "reportDataUrl";
    public static final String JSON_PROPERTY_REPORT_HTML_URL = "reportHtmlUrl";
    public static final String JSON_PROPERTY_REPORT_PDF_URL = "reportPdfUrl";
    public static final String JSON_PROPERTY_SCAN_ID = "scanId";
    public static final String JSON_PROPERTY_STAGE = "stage";
    private String applicationId;
    private String commitHash;
    private String embeddableReportHtmlUrl;
    private OffsetDateTime evaluationDate;
    private Boolean isForMonitoring;
    private Boolean isReevaluation;
    private String latestReportHtmlUrl;
    private String policyEvaluationId;
    private PolicyEvaluationResult policyEvaluationResult;
    private String reportDataUrl;
    private String reportHtmlUrl;
    private String reportPdfUrl;
    private String scanId;
    private String stage;

    // ------ MANUAL ADDITIONS -------
    private  String policyAction;

    @javax.annotation.Nullable
    public String getPolicyAction() {
        return policyAction;
    }

    public void setPolicyAction(String policyAction) {
        this.policyAction = policyAction;
    }

    // ------ MANUAL ADDITIONS END -------

    public ApiReportResultsDTO() {
    }

    public ApiReportResultsDTO applicationId(String applicationId) {
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


    public ApiReportResultsDTO commitHash(String commitHash) {
        this.commitHash = commitHash;
        return this;
    }

    /**
     * Get commitHash
     *
     * @return commitHash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMMIT_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getCommitHash() {
        return commitHash;
    }


    @JsonProperty(JSON_PROPERTY_COMMIT_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }


    public ApiReportResultsDTO embeddableReportHtmlUrl(String embeddableReportHtmlUrl) {
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


    public ApiReportResultsDTO evaluationDate(OffsetDateTime evaluationDate) {
        this.evaluationDate = evaluationDate;
        return this;
    }

    /**
     * Get evaluationDate
     *
     * @return evaluationDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EVALUATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getEvaluationDate() {
        return evaluationDate;
    }


    @JsonProperty(JSON_PROPERTY_EVALUATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEvaluationDate(OffsetDateTime evaluationDate) {
        this.evaluationDate = evaluationDate;
    }


    public ApiReportResultsDTO isForMonitoring(Boolean isForMonitoring) {
        this.isForMonitoring = isForMonitoring;
        return this;
    }

    /**
     * Get isForMonitoring
     *
     * @return isForMonitoring
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IS_FOR_MONITORING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getIsForMonitoring() {
        return isForMonitoring;
    }


    @JsonProperty(JSON_PROPERTY_IS_FOR_MONITORING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsForMonitoring(Boolean isForMonitoring) {
        this.isForMonitoring = isForMonitoring;
    }


    public ApiReportResultsDTO isReevaluation(Boolean isReevaluation) {
        this.isReevaluation = isReevaluation;
        return this;
    }

    /**
     * Get isReevaluation
     *
     * @return isReevaluation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_IS_REEVALUATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getIsReevaluation() {
        return isReevaluation;
    }


    @JsonProperty(JSON_PROPERTY_IS_REEVALUATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsReevaluation(Boolean isReevaluation) {
        this.isReevaluation = isReevaluation;
    }


    public ApiReportResultsDTO latestReportHtmlUrl(String latestReportHtmlUrl) {
        this.latestReportHtmlUrl = latestReportHtmlUrl;
        return this;
    }

    /**
     * Get latestReportHtmlUrl
     *
     * @return latestReportHtmlUrl
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LATEST_REPORT_HTML_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLatestReportHtmlUrl() {
        return latestReportHtmlUrl;
    }


    @JsonProperty(JSON_PROPERTY_LATEST_REPORT_HTML_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLatestReportHtmlUrl(String latestReportHtmlUrl) {
        this.latestReportHtmlUrl = latestReportHtmlUrl;
    }


    public ApiReportResultsDTO policyEvaluationId(String policyEvaluationId) {
        this.policyEvaluationId = policyEvaluationId;
        return this;
    }

    /**
     * Get policyEvaluationId
     *
     * @return policyEvaluationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_EVALUATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyEvaluationId() {
        return policyEvaluationId;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_EVALUATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyEvaluationId(String policyEvaluationId) {
        this.policyEvaluationId = policyEvaluationId;
    }


    public ApiReportResultsDTO policyEvaluationResult(PolicyEvaluationResult policyEvaluationResult) {
        this.policyEvaluationResult = policyEvaluationResult;
        return this;
    }

    /**
     * Get policyEvaluationResult
     *
     * @return policyEvaluationResult
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_EVALUATION_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public PolicyEvaluationResult getPolicyEvaluationResult() {
        return policyEvaluationResult;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_EVALUATION_RESULT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyEvaluationResult(PolicyEvaluationResult policyEvaluationResult) {
        this.policyEvaluationResult = policyEvaluationResult;
    }


    public ApiReportResultsDTO reportDataUrl(String reportDataUrl) {
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


    public ApiReportResultsDTO reportHtmlUrl(String reportHtmlUrl) {
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


    public ApiReportResultsDTO reportPdfUrl(String reportPdfUrl) {
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


    public ApiReportResultsDTO scanId(String scanId) {
        this.scanId = scanId;
        return this;
    }

    /**
     * Get scanId
     *
     * @return scanId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SCAN_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getScanId() {
        return scanId;
    }


    @JsonProperty(JSON_PROPERTY_SCAN_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setScanId(String scanId) {
        this.scanId = scanId;
    }


    public ApiReportResultsDTO stage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Get stage
     *
     * @return stage
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getStage() {
        return stage;
    }


    @JsonProperty(JSON_PROPERTY_STAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStage(String stage) {
        this.stage = stage;
    }


    /**
     * Return true if this ApiReportResultsDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiReportResultsDTO apiReportResultsDTO = (ApiReportResultsDTO) o;
        return Objects.equals(this.applicationId, apiReportResultsDTO.applicationId) &&
            Objects.equals(this.commitHash, apiReportResultsDTO.commitHash) &&
            Objects.equals(this.embeddableReportHtmlUrl, apiReportResultsDTO.embeddableReportHtmlUrl) &&
            Objects.equals(this.evaluationDate, apiReportResultsDTO.evaluationDate) &&
            Objects.equals(this.isForMonitoring, apiReportResultsDTO.isForMonitoring) &&
            Objects.equals(this.isReevaluation, apiReportResultsDTO.isReevaluation) &&
            Objects.equals(this.latestReportHtmlUrl, apiReportResultsDTO.latestReportHtmlUrl) &&
            Objects.equals(this.policyEvaluationId, apiReportResultsDTO.policyEvaluationId) &&
            Objects.equals(this.policyEvaluationResult, apiReportResultsDTO.policyEvaluationResult) &&
            Objects.equals(this.reportDataUrl, apiReportResultsDTO.reportDataUrl) &&
            Objects.equals(this.reportHtmlUrl, apiReportResultsDTO.reportHtmlUrl) &&
            Objects.equals(this.reportPdfUrl, apiReportResultsDTO.reportPdfUrl) &&
            Objects.equals(this.scanId, apiReportResultsDTO.scanId) &&
            Objects.equals(this.stage, apiReportResultsDTO.stage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, commitHash, embeddableReportHtmlUrl, evaluationDate, isForMonitoring, isReevaluation, latestReportHtmlUrl, policyEvaluationId, policyEvaluationResult, reportDataUrl, reportHtmlUrl, reportPdfUrl, scanId, stage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiReportResultsDTO {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    commitHash: ").append(toIndentedString(commitHash)).append("\n");
        sb.append("    embeddableReportHtmlUrl: ").append(toIndentedString(embeddableReportHtmlUrl)).append("\n");
        sb.append("    evaluationDate: ").append(toIndentedString(evaluationDate)).append("\n");
        sb.append("    isForMonitoring: ").append(toIndentedString(isForMonitoring)).append("\n");
        sb.append("    isReevaluation: ").append(toIndentedString(isReevaluation)).append("\n");
        sb.append("    latestReportHtmlUrl: ").append(toIndentedString(latestReportHtmlUrl)).append("\n");
        sb.append("    policyEvaluationId: ").append(toIndentedString(policyEvaluationId)).append("\n");
        sb.append("    policyEvaluationResult: ").append(toIndentedString(policyEvaluationResult)).append("\n");
        sb.append("    reportDataUrl: ").append(toIndentedString(reportDataUrl)).append("\n");
        sb.append("    reportHtmlUrl: ").append(toIndentedString(reportHtmlUrl)).append("\n");
        sb.append("    reportPdfUrl: ").append(toIndentedString(reportPdfUrl)).append("\n");
        sb.append("    scanId: ").append(toIndentedString(scanId)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
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

