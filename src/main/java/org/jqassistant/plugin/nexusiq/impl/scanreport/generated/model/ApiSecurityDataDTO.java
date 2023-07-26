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
 * ApiSecurityDataDTO
 */
@JsonPropertyOrder({
    ApiSecurityDataDTO.JSON_PROPERTY_SECURITY_ISSUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiSecurityDataDTO {
    public static final String JSON_PROPERTY_SECURITY_ISSUES = "securityIssues";
    private List<ApiSecurityIssueDTO> securityIssues = null;

    public ApiSecurityDataDTO() {
    }

    public ApiSecurityDataDTO securityIssues(List<ApiSecurityIssueDTO> securityIssues) {
        this.securityIssues = securityIssues;
        return this;
    }

    public ApiSecurityDataDTO addSecurityIssuesItem(ApiSecurityIssueDTO securityIssuesItem) {
        if (this.securityIssues == null) {
            this.securityIssues = new ArrayList<>();
        }
        this.securityIssues.add(securityIssuesItem);
        return this;
    }

    /**
     * Get securityIssues
     *
     * @return securityIssues
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SECURITY_ISSUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiSecurityIssueDTO> getSecurityIssues() {
        return securityIssues;
    }


    @JsonProperty(JSON_PROPERTY_SECURITY_ISSUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSecurityIssues(List<ApiSecurityIssueDTO> securityIssues) {
        this.securityIssues = securityIssues;
    }


    /**
     * Return true if this ApiSecurityDataDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiSecurityDataDTO apiSecurityDataDTO = (ApiSecurityDataDTO) o;
        return Objects.equals(this.securityIssues, apiSecurityDataDTO.securityIssues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityIssues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiSecurityDataDTO {\n");
        sb.append("    securityIssues: ").append(toIndentedString(securityIssues)).append("\n");
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

