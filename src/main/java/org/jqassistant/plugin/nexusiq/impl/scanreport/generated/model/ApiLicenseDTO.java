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
 * ApiLicenseDTO
 */
@JsonPropertyOrder({
    ApiLicenseDTO.JSON_PROPERTY_LICENSE_ID,
    ApiLicenseDTO.JSON_PROPERTY_LICENSE_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiLicenseDTO {
    public static final String JSON_PROPERTY_LICENSE_ID = "licenseId";
    public static final String JSON_PROPERTY_LICENSE_NAME = "licenseName";
    private String licenseId;
    private String licenseName;

    public ApiLicenseDTO() {
    }

    public ApiLicenseDTO licenseId(String licenseId) {
        this.licenseId = licenseId;
        return this;
    }

    /**
     * Get licenseId
     *
     * @return licenseId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LICENSE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLicenseId() {
        return licenseId;
    }


    @JsonProperty(JSON_PROPERTY_LICENSE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }


    public ApiLicenseDTO licenseName(String licenseName) {
        this.licenseName = licenseName;
        return this;
    }

    /**
     * Get licenseName
     *
     * @return licenseName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_LICENSE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getLicenseName() {
        return licenseName;
    }


    @JsonProperty(JSON_PROPERTY_LICENSE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }


    /**
     * Return true if this ApiLicenseDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiLicenseDTO apiLicenseDTO = (ApiLicenseDTO) o;
        return Objects.equals(this.licenseId, apiLicenseDTO.licenseId) &&
            Objects.equals(this.licenseName, apiLicenseDTO.licenseName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licenseId, licenseName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiLicenseDTO {\n");
        sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
        sb.append("    licenseName: ").append(toIndentedString(licenseName)).append("\n");
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
