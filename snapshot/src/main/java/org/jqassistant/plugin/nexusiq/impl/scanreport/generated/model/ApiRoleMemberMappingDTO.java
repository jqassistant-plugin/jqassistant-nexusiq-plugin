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
 * ApiRoleMemberMappingDTO
 */
@JsonPropertyOrder({
    ApiRoleMemberMappingDTO.JSON_PROPERTY_MEMBERS,
    ApiRoleMemberMappingDTO.JSON_PROPERTY_ROLE_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiRoleMemberMappingDTO {
    public static final String JSON_PROPERTY_MEMBERS = "members";
    public static final String JSON_PROPERTY_ROLE_ID = "roleId";
    private List<ApiMemberDTO> members = null;
    private String roleId;

    public ApiRoleMemberMappingDTO() {
    }

    public ApiRoleMemberMappingDTO members(List<ApiMemberDTO> members) {
        this.members = members;
        return this;
    }

    public ApiRoleMemberMappingDTO addMembersItem(ApiMemberDTO membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    /**
     * Get members
     *
     * @return members
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MEMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiMemberDTO> getMembers() {
        return members;
    }


    @JsonProperty(JSON_PROPERTY_MEMBERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMembers(List<ApiMemberDTO> members) {
        this.members = members;
    }


    public ApiRoleMemberMappingDTO roleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * Get roleId
     *
     * @return roleId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ROLE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getRoleId() {
        return roleId;
    }


    @JsonProperty(JSON_PROPERTY_ROLE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    /**
     * Return true if this ApiRoleMemberMappingDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiRoleMemberMappingDTO apiRoleMemberMappingDTO = (ApiRoleMemberMappingDTO) o;
        return Objects.equals(this.members, apiRoleMemberMappingDTO.members) &&
            Objects.equals(this.roleId, apiRoleMemberMappingDTO.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, roleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiRoleMemberMappingDTO {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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
