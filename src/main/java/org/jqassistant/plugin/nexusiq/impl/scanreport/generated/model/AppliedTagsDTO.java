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
 * AppliedTagsDTO
 */
@JsonPropertyOrder({
    AppliedTagsDTO.JSON_PROPERTY_APPLICATION_TAGS_BY_OWNER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class AppliedTagsDTO {
    public static final String JSON_PROPERTY_APPLICATION_TAGS_BY_OWNER = "applicationTagsByOwner";
    private List<ApplicationTagsByOwnerDTO> applicationTagsByOwner = null;

    public AppliedTagsDTO() {
    }

    public AppliedTagsDTO applicationTagsByOwner(List<ApplicationTagsByOwnerDTO> applicationTagsByOwner) {
        this.applicationTagsByOwner = applicationTagsByOwner;
        return this;
    }

    public AppliedTagsDTO addApplicationTagsByOwnerItem(ApplicationTagsByOwnerDTO applicationTagsByOwnerItem) {
        if (this.applicationTagsByOwner == null) {
            this.applicationTagsByOwner = new ArrayList<>();
        }
        this.applicationTagsByOwner.add(applicationTagsByOwnerItem);
        return this;
    }

    /**
     * Get applicationTagsByOwner
     *
     * @return applicationTagsByOwner
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_TAGS_BY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApplicationTagsByOwnerDTO> getApplicationTagsByOwner() {
        return applicationTagsByOwner;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_TAGS_BY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationTagsByOwner(List<ApplicationTagsByOwnerDTO> applicationTagsByOwner) {
        this.applicationTagsByOwner = applicationTagsByOwner;
    }


    /**
     * Return true if this AppliedTagsDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppliedTagsDTO appliedTagsDTO = (AppliedTagsDTO) o;
        return Objects.equals(this.applicationTagsByOwner, appliedTagsDTO.applicationTagsByOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationTagsByOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppliedTagsDTO {\n");
        sb.append("    applicationTagsByOwner: ").append(toIndentedString(applicationTagsByOwner)).append("\n");
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

