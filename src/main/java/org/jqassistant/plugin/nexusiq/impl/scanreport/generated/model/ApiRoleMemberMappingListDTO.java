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
 * ApiRoleMemberMappingListDTO
 */
@JsonPropertyOrder({
    ApiRoleMemberMappingListDTO.JSON_PROPERTY_MEMBER_MAPPINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiRoleMemberMappingListDTO {
    public static final String JSON_PROPERTY_MEMBER_MAPPINGS = "memberMappings";
    private List<ApiRoleMemberMappingDTO> memberMappings = null;

    public ApiRoleMemberMappingListDTO() {
    }

    public ApiRoleMemberMappingListDTO memberMappings(List<ApiRoleMemberMappingDTO> memberMappings) {
        this.memberMappings = memberMappings;
        return this;
    }

    public ApiRoleMemberMappingListDTO addMemberMappingsItem(ApiRoleMemberMappingDTO memberMappingsItem) {
        if (this.memberMappings == null) {
            this.memberMappings = new ArrayList<>();
        }
        this.memberMappings.add(memberMappingsItem);
        return this;
    }

    /**
     * Get memberMappings
     *
     * @return memberMappings
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MEMBER_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiRoleMemberMappingDTO> getMemberMappings() {
        return memberMappings;
    }


    @JsonProperty(JSON_PROPERTY_MEMBER_MAPPINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMemberMappings(List<ApiRoleMemberMappingDTO> memberMappings) {
        this.memberMappings = memberMappings;
    }


    /**
     * Return true if this ApiRoleMemberMappingListDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiRoleMemberMappingListDTO apiRoleMemberMappingListDTO = (ApiRoleMemberMappingListDTO) o;
        return Objects.equals(this.memberMappings, apiRoleMemberMappingListDTO.memberMappings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberMappings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRoleMemberMappingListDTO {\n");
        sb.append("    memberMappings: ").append(toIndentedString(memberMappings)).append("\n");
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

