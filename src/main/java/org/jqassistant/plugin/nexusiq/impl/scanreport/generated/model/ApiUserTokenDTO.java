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
 * ApiUserTokenDTO
 */
@JsonPropertyOrder({
    ApiUserTokenDTO.JSON_PROPERTY_PASS_CODE,
    ApiUserTokenDTO.JSON_PROPERTY_REALM,
    ApiUserTokenDTO.JSON_PROPERTY_USER_CODE,
    ApiUserTokenDTO.JSON_PROPERTY_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiUserTokenDTO {
    public static final String JSON_PROPERTY_PASS_CODE = "passCode";
    public static final String JSON_PROPERTY_REALM = "realm";
    public static final String JSON_PROPERTY_USER_CODE = "userCode";
    public static final String JSON_PROPERTY_USERNAME = "username";
    private String passCode;
    private String realm;
    private String userCode;
    private String username;

    public ApiUserTokenDTO() {
    }

    public ApiUserTokenDTO passCode(String passCode) {
        this.passCode = passCode;
        return this;
    }

    /**
     * Get passCode
     *
     * @return passCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PASS_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPassCode() {
        return passCode;
    }


    @JsonProperty(JSON_PROPERTY_PASS_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPassCode(String passCode) {
        this.passCode = passCode;
    }


    public ApiUserTokenDTO realm(String realm) {
        this.realm = realm;
        return this;
    }

    /**
     * Get realm
     *
     * @return realm
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_REALM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getRealm() {
        return realm;
    }


    @JsonProperty(JSON_PROPERTY_REALM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRealm(String realm) {
        this.realm = realm;
    }


    public ApiUserTokenDTO userCode(String userCode) {
        this.userCode = userCode;
        return this;
    }

    /**
     * Get userCode
     *
     * @return userCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USER_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getUserCode() {
        return userCode;
    }


    @JsonProperty(JSON_PROPERTY_USER_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }


    public ApiUserTokenDTO username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getUsername() {
        return username;
    }


    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * Return true if this ApiUserTokenDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiUserTokenDTO apiUserTokenDTO = (ApiUserTokenDTO) o;
        return Objects.equals(this.passCode, apiUserTokenDTO.passCode) &&
            Objects.equals(this.realm, apiUserTokenDTO.realm) &&
            Objects.equals(this.userCode, apiUserTokenDTO.userCode) &&
            Objects.equals(this.username, apiUserTokenDTO.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passCode, realm, userCode, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiUserTokenDTO {\n");
        sb.append("    passCode: ").append(toIndentedString(passCode)).append("\n");
        sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
        sb.append("    userCode: ").append(toIndentedString(userCode)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

