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
import java.util.*;


/**
 * ApiReportPolicyDataDTOV2
 */
@JsonPropertyOrder({
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_APPLICATION,
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_COMMIT_HASH,
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_COMPONENTS,
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_COUNTS,
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_INITIATOR,
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_REPORT_TIME,
    ApiReportPolicyDataDTOV2.JSON_PROPERTY_REPORT_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiReportPolicyDataDTOV2 {
    public static final String JSON_PROPERTY_APPLICATION = "application";
    public static final String JSON_PROPERTY_COMMIT_HASH = "commitHash";
    public static final String JSON_PROPERTY_COMPONENTS = "components";
    public static final String JSON_PROPERTY_COUNTS = "counts";
    public static final String JSON_PROPERTY_INITIATOR = "initiator";
    public static final String JSON_PROPERTY_REPORT_TIME = "reportTime";
    public static final String JSON_PROPERTY_REPORT_TITLE = "reportTitle";
    private ApiApplicationBaseDTO application;
    private String commitHash;
    private List<ApiReportComponentPolicyViolationsDTOV2> components = null;
    private Map<String, Integer> counts = null;
    private String initiator;
    private OffsetDateTime reportTime;
    private String reportTitle;

    public ApiReportPolicyDataDTOV2() {
    }

    public ApiReportPolicyDataDTOV2 application(ApiApplicationBaseDTO application) {
        this.application = application;
        return this;
    }

    /**
     * Get application
     *
     * @return application
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiApplicationBaseDTO getApplication() {
        return application;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplication(ApiApplicationBaseDTO application) {
        this.application = application;
    }


    public ApiReportPolicyDataDTOV2 commitHash(String commitHash) {
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


    public ApiReportPolicyDataDTOV2 components(List<ApiReportComponentPolicyViolationsDTOV2> components) {
        this.components = components;
        return this;
    }

    public ApiReportPolicyDataDTOV2 addComponentsItem(ApiReportComponentPolicyViolationsDTOV2 componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    /**
     * Get components
     *
     * @return components
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiReportComponentPolicyViolationsDTOV2> getComponents() {
        return components;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponents(List<ApiReportComponentPolicyViolationsDTOV2> components) {
        this.components = components;
    }


    public ApiReportPolicyDataDTOV2 counts(Map<String, Integer> counts) {
        this.counts = counts;
        return this;
    }

    public ApiReportPolicyDataDTOV2 putCountsItem(String key, Integer countsItem) {
        if (this.counts == null) {
            this.counts = new HashMap<>();
        }
        this.counts.put(key, countsItem);
        return this;
    }

    /**
     * Get counts
     *
     * @return counts
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COUNTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, Integer> getCounts() {
        return counts;
    }


    @JsonProperty(JSON_PROPERTY_COUNTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCounts(Map<String, Integer> counts) {
        this.counts = counts;
    }


    public ApiReportPolicyDataDTOV2 initiator(String initiator) {
        this.initiator = initiator;
        return this;
    }

    /**
     * Get initiator
     *
     * @return initiator
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_INITIATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getInitiator() {
        return initiator;
    }


    @JsonProperty(JSON_PROPERTY_INITIATOR)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }


    public ApiReportPolicyDataDTOV2 reportTime(OffsetDateTime reportTime) {
        this.reportTime = reportTime;
        return this;
    }

    /**
     * Get reportTime
     *
     * @return reportTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REPORT_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getReportTime() {
        return reportTime;
    }


    @JsonProperty(JSON_PROPERTY_REPORT_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportTime(OffsetDateTime reportTime) {
        this.reportTime = reportTime;
    }


    public ApiReportPolicyDataDTOV2 reportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
        return this;
    }

    /**
     * Get reportTitle
     *
     * @return reportTitle
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REPORT_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getReportTitle() {
        return reportTitle;
    }


    @JsonProperty(JSON_PROPERTY_REPORT_TITLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }


    /**
     * Return true if this ApiReportPolicyDataDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiReportPolicyDataDTOV2 apiReportPolicyDataDTOV2 = (ApiReportPolicyDataDTOV2) o;
        return Objects.equals(this.application, apiReportPolicyDataDTOV2.application) &&
            Objects.equals(this.commitHash, apiReportPolicyDataDTOV2.commitHash) &&
            Objects.equals(this.components, apiReportPolicyDataDTOV2.components) &&
            Objects.equals(this.counts, apiReportPolicyDataDTOV2.counts) &&
            Objects.equals(this.initiator, apiReportPolicyDataDTOV2.initiator) &&
            Objects.equals(this.reportTime, apiReportPolicyDataDTOV2.reportTime) &&
            Objects.equals(this.reportTitle, apiReportPolicyDataDTOV2.reportTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(application, commitHash, components, counts, initiator, reportTime, reportTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiReportPolicyDataDTOV2 {\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    commitHash: ").append(toIndentedString(commitHash)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
        sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
        sb.append("    reportTime: ").append(toIndentedString(reportTime)).append("\n");
        sb.append("    reportTitle: ").append(toIndentedString(reportTitle)).append("\n");
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
