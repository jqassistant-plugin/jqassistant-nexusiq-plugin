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
 * ApiFirewallReleaseQuarantineSummaryDTO
 */
@JsonPropertyOrder({
    ApiFirewallReleaseQuarantineSummaryDTO.JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_M_T_D,
    ApiFirewallReleaseQuarantineSummaryDTO.JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_Y_T_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiFirewallReleaseQuarantineSummaryDTO {
    public static final String JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_M_T_D = "autoReleaseQuarantineCountMTD";
    public static final String JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_Y_T_D = "autoReleaseQuarantineCountYTD";
    private Long autoReleaseQuarantineCountMTD;
    private Long autoReleaseQuarantineCountYTD;

    public ApiFirewallReleaseQuarantineSummaryDTO() {
    }

    public ApiFirewallReleaseQuarantineSummaryDTO autoReleaseQuarantineCountMTD(Long autoReleaseQuarantineCountMTD) {
        this.autoReleaseQuarantineCountMTD = autoReleaseQuarantineCountMTD;
        return this;
    }

    /**
     * Get autoReleaseQuarantineCountMTD
     *
     * @return autoReleaseQuarantineCountMTD
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_M_T_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Long getAutoReleaseQuarantineCountMTD() {
        return autoReleaseQuarantineCountMTD;
    }


    @JsonProperty(JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_M_T_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAutoReleaseQuarantineCountMTD(Long autoReleaseQuarantineCountMTD) {
        this.autoReleaseQuarantineCountMTD = autoReleaseQuarantineCountMTD;
    }


    public ApiFirewallReleaseQuarantineSummaryDTO autoReleaseQuarantineCountYTD(Long autoReleaseQuarantineCountYTD) {
        this.autoReleaseQuarantineCountYTD = autoReleaseQuarantineCountYTD;
        return this;
    }

    /**
     * Get autoReleaseQuarantineCountYTD
     *
     * @return autoReleaseQuarantineCountYTD
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_Y_T_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Long getAutoReleaseQuarantineCountYTD() {
        return autoReleaseQuarantineCountYTD;
    }


    @JsonProperty(JSON_PROPERTY_AUTO_RELEASE_QUARANTINE_COUNT_Y_T_D)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAutoReleaseQuarantineCountYTD(Long autoReleaseQuarantineCountYTD) {
        this.autoReleaseQuarantineCountYTD = autoReleaseQuarantineCountYTD;
    }


    /**
     * Return true if this ApiFirewallReleaseQuarantineSummaryDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiFirewallReleaseQuarantineSummaryDTO apiFirewallReleaseQuarantineSummaryDTO = (ApiFirewallReleaseQuarantineSummaryDTO) o;
        return Objects.equals(this.autoReleaseQuarantineCountMTD, apiFirewallReleaseQuarantineSummaryDTO.autoReleaseQuarantineCountMTD) &&
            Objects.equals(this.autoReleaseQuarantineCountYTD, apiFirewallReleaseQuarantineSummaryDTO.autoReleaseQuarantineCountYTD);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoReleaseQuarantineCountMTD, autoReleaseQuarantineCountYTD);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiFirewallReleaseQuarantineSummaryDTO {\n");
        sb.append("    autoReleaseQuarantineCountMTD: ").append(toIndentedString(autoReleaseQuarantineCountMTD)).append("\n");
        sb.append("    autoReleaseQuarantineCountYTD: ").append(toIndentedString(autoReleaseQuarantineCountYTD)).append("\n");
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

