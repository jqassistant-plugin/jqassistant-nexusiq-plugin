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
 * ApplicableTagsDTO
 */
@JsonPropertyOrder({
    ApplicableTagsDTO.JSON_PROPERTY_APPLICATION_CATEGORIES_BY_OWNER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApplicableTagsDTO {
    public static final String JSON_PROPERTY_APPLICATION_CATEGORIES_BY_OWNER = "applicationCategoriesByOwner";
    private List<TagsByOwnerDTO> applicationCategoriesByOwner = null;

    public ApplicableTagsDTO() {
    }

    public ApplicableTagsDTO applicationCategoriesByOwner(List<TagsByOwnerDTO> applicationCategoriesByOwner) {
        this.applicationCategoriesByOwner = applicationCategoriesByOwner;
        return this;
    }

    public ApplicableTagsDTO addApplicationCategoriesByOwnerItem(TagsByOwnerDTO applicationCategoriesByOwnerItem) {
        if (this.applicationCategoriesByOwner == null) {
            this.applicationCategoriesByOwner = new ArrayList<>();
        }
        this.applicationCategoriesByOwner.add(applicationCategoriesByOwnerItem);
        return this;
    }

    /**
     * Get applicationCategoriesByOwner
     *
     * @return applicationCategoriesByOwner
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_CATEGORIES_BY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<TagsByOwnerDTO> getApplicationCategoriesByOwner() {
        return applicationCategoriesByOwner;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_CATEGORIES_BY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationCategoriesByOwner(List<TagsByOwnerDTO> applicationCategoriesByOwner) {
        this.applicationCategoriesByOwner = applicationCategoriesByOwner;
    }


    /**
     * Return true if this ApplicableTagsDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicableTagsDTO applicableTagsDTO = (ApplicableTagsDTO) o;
        return Objects.equals(this.applicationCategoriesByOwner, applicableTagsDTO.applicationCategoriesByOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationCategoriesByOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicableTagsDTO {\n");
        sb.append("    applicationCategoriesByOwner: ").append(toIndentedString(applicationCategoriesByOwner)).append("\n");
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

