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
 * ApiRepositoryPathResponseDTO
 */
@JsonPropertyOrder({
    ApiRepositoryPathResponseDTO.JSON_PROPERTY_PATH_VERSIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiRepositoryPathResponseDTO {
    public static final String JSON_PROPERTY_PATH_VERSIONS = "pathVersions";
    private List<ApiRepositoryPathVersions> pathVersions = null;

    public ApiRepositoryPathResponseDTO() {
    }

    public ApiRepositoryPathResponseDTO pathVersions(List<ApiRepositoryPathVersions> pathVersions) {
        this.pathVersions = pathVersions;
        return this;
    }

    public ApiRepositoryPathResponseDTO addPathVersionsItem(ApiRepositoryPathVersions pathVersionsItem) {
        if (this.pathVersions == null) {
            this.pathVersions = new ArrayList<>();
        }
        this.pathVersions.add(pathVersionsItem);
        return this;
    }

    /**
     * Get pathVersions
     *
     * @return pathVersions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PATH_VERSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiRepositoryPathVersions> getPathVersions() {
        return pathVersions;
    }


    @JsonProperty(JSON_PROPERTY_PATH_VERSIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPathVersions(List<ApiRepositoryPathVersions> pathVersions) {
        this.pathVersions = pathVersions;
    }


    /**
     * Return true if this ApiRepositoryPathResponseDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiRepositoryPathResponseDTO apiRepositoryPathResponseDTO = (ApiRepositoryPathResponseDTO) o;
        return Objects.equals(this.pathVersions, apiRepositoryPathResponseDTO.pathVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pathVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRepositoryPathResponseDTO {\n");
        sb.append("    pathVersions: ").append(toIndentedString(pathVersions)).append("\n");
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

