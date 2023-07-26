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
 * ApiApplicationListDTO
 */
@JsonPropertyOrder({
    ApiApplicationListDTO.JSON_PROPERTY_APPLICATIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiApplicationListDTO {
    public static final String JSON_PROPERTY_APPLICATIONS = "applications";
    private List<ApiApplicationDTO> applications = null;

    public ApiApplicationListDTO() {
    }

    public ApiApplicationListDTO applications(List<ApiApplicationDTO> applications) {
        this.applications = applications;
        return this;
    }

    public ApiApplicationListDTO addApplicationsItem(ApiApplicationDTO applicationsItem) {
        if (this.applications == null) {
            this.applications = new ArrayList<>();
        }
        this.applications.add(applicationsItem);
        return this;
    }

    /**
     * Get applications
     *
     * @return applications
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiApplicationDTO> getApplications() {
        return applications;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplications(List<ApiApplicationDTO> applications) {
        this.applications = applications;
    }


    /**
     * Return true if this ApiApplicationListDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiApplicationListDTO apiApplicationListDTO = (ApiApplicationListDTO) o;
        return Objects.equals(this.applications, apiApplicationListDTO.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiApplicationListDTO {\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

