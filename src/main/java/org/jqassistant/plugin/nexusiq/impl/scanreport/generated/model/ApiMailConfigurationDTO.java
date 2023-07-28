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
 * ApiMailConfigurationDTO
 */
@JsonPropertyOrder({
    ApiMailConfigurationDTO.JSON_PROPERTY_HOSTNAME,
    ApiMailConfigurationDTO.JSON_PROPERTY_PASSWORD,
    ApiMailConfigurationDTO.JSON_PROPERTY_PASSWORD_IS_INCLUDED,
    ApiMailConfigurationDTO.JSON_PROPERTY_PORT,
    ApiMailConfigurationDTO.JSON_PROPERTY_SSL_ENABLED,
    ApiMailConfigurationDTO.JSON_PROPERTY_START_TLS_ENABLED,
    ApiMailConfigurationDTO.JSON_PROPERTY_SYSTEM_EMAIL,
    ApiMailConfigurationDTO.JSON_PROPERTY_USERNAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiMailConfigurationDTO {
    public static final String JSON_PROPERTY_HOSTNAME = "hostname";
    public static final String JSON_PROPERTY_PASSWORD = "password";
    public static final String JSON_PROPERTY_PASSWORD_IS_INCLUDED = "passwordIsIncluded";
    public static final String JSON_PROPERTY_PORT = "port";
    public static final String JSON_PROPERTY_SSL_ENABLED = "sslEnabled";
    public static final String JSON_PROPERTY_START_TLS_ENABLED = "startTlsEnabled";
    public static final String JSON_PROPERTY_SYSTEM_EMAIL = "systemEmail";
    public static final String JSON_PROPERTY_USERNAME = "username";
    private String hostname;
    private List<String> password = null;
    private Boolean passwordIsIncluded;
    private Integer port;
    private Boolean sslEnabled;
    private Boolean startTlsEnabled;
    private String systemEmail;
    private String username;

    public ApiMailConfigurationDTO() {
    }

    public ApiMailConfigurationDTO hostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     *
     * @return hostname
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_HOSTNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getHostname() {
        return hostname;
    }


    @JsonProperty(JSON_PROPERTY_HOSTNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }


    public ApiMailConfigurationDTO password(List<String> password) {
        this.password = password;
        return this;
    }

    public ApiMailConfigurationDTO addPasswordItem(String passwordItem) {
        if (this.password == null) {
            this.password = new ArrayList<>();
        }
        this.password.add(passwordItem);
        return this;
    }

    /**
     * Get password
     *
     * @return password
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<String> getPassword() {
        return password;
    }


    @JsonProperty(JSON_PROPERTY_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPassword(List<String> password) {
        this.password = password;
    }


    public ApiMailConfigurationDTO passwordIsIncluded(Boolean passwordIsIncluded) {
        this.passwordIsIncluded = passwordIsIncluded;
        return this;
    }

    /**
     * Get passwordIsIncluded
     *
     * @return passwordIsIncluded
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PASSWORD_IS_INCLUDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getPasswordIsIncluded() {
        return passwordIsIncluded;
    }


    @JsonProperty(JSON_PROPERTY_PASSWORD_IS_INCLUDED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPasswordIsIncluded(Boolean passwordIsIncluded) {
        this.passwordIsIncluded = passwordIsIncluded;
    }


    public ApiMailConfigurationDTO port(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getPort() {
        return port;
    }


    @JsonProperty(JSON_PROPERTY_PORT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPort(Integer port) {
        this.port = port;
    }


    public ApiMailConfigurationDTO sslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    /**
     * Get sslEnabled
     *
     * @return sslEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SSL_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getSslEnabled() {
        return sslEnabled;
    }


    @JsonProperty(JSON_PROPERTY_SSL_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }


    public ApiMailConfigurationDTO startTlsEnabled(Boolean startTlsEnabled) {
        this.startTlsEnabled = startTlsEnabled;
        return this;
    }

    /**
     * Get startTlsEnabled
     *
     * @return startTlsEnabled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_START_TLS_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getStartTlsEnabled() {
        return startTlsEnabled;
    }


    @JsonProperty(JSON_PROPERTY_START_TLS_ENABLED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartTlsEnabled(Boolean startTlsEnabled) {
        this.startTlsEnabled = startTlsEnabled;
    }


    public ApiMailConfigurationDTO systemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
        return this;
    }

    /**
     * Get systemEmail
     *
     * @return systemEmail
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SYSTEM_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getSystemEmail() {
        return systemEmail;
    }


    @JsonProperty(JSON_PROPERTY_SYSTEM_EMAIL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }


    public ApiMailConfigurationDTO username(String username) {
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
     * Return true if this ApiMailConfigurationDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiMailConfigurationDTO apiMailConfigurationDTO = (ApiMailConfigurationDTO) o;
        return Objects.equals(this.hostname, apiMailConfigurationDTO.hostname) &&
            Objects.equals(this.password, apiMailConfigurationDTO.password) &&
            Objects.equals(this.passwordIsIncluded, apiMailConfigurationDTO.passwordIsIncluded) &&
            Objects.equals(this.port, apiMailConfigurationDTO.port) &&
            Objects.equals(this.sslEnabled, apiMailConfigurationDTO.sslEnabled) &&
            Objects.equals(this.startTlsEnabled, apiMailConfigurationDTO.startTlsEnabled) &&
            Objects.equals(this.systemEmail, apiMailConfigurationDTO.systemEmail) &&
            Objects.equals(this.username, apiMailConfigurationDTO.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostname, password, passwordIsIncluded, port, sslEnabled, startTlsEnabled, systemEmail, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiMailConfigurationDTO {\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    passwordIsIncluded: ").append(toIndentedString(passwordIsIncluded)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    sslEnabled: ").append(toIndentedString(sslEnabled)).append("\n");
        sb.append("    startTlsEnabled: ").append(toIndentedString(startTlsEnabled)).append("\n");
        sb.append("    systemEmail: ").append(toIndentedString(systemEmail)).append("\n");
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
