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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * FormDataBodyPart
 */
@JsonPropertyOrder({
    FormDataBodyPart.JSON_PROPERTY_CONTENT_DISPOSITION,
    FormDataBodyPart.JSON_PROPERTY_ENTITY,
    FormDataBodyPart.JSON_PROPERTY_FORM_DATA_CONTENT_DISPOSITION,
    FormDataBodyPart.JSON_PROPERTY_HEADERS,
    FormDataBodyPart.JSON_PROPERTY_MEDIA_TYPE,
    FormDataBodyPart.JSON_PROPERTY_MESSAGE_BODY_WORKERS,
    FormDataBodyPart.JSON_PROPERTY_NAME,
    FormDataBodyPart.JSON_PROPERTY_PARAMETERIZED_HEADERS,
    FormDataBodyPart.JSON_PROPERTY_PARENT,
    FormDataBodyPart.JSON_PROPERTY_PROVIDERS,
    FormDataBodyPart.JSON_PROPERTY_SIMPLE,
    FormDataBodyPart.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class FormDataBodyPart {
    public static final String JSON_PROPERTY_CONTENT_DISPOSITION = "contentDisposition";
    public static final String JSON_PROPERTY_ENTITY = "entity";
    public static final String JSON_PROPERTY_FORM_DATA_CONTENT_DISPOSITION = "formDataContentDisposition";
    public static final String JSON_PROPERTY_HEADERS = "headers";
    public static final String JSON_PROPERTY_MEDIA_TYPE = "mediaType";
    public static final String JSON_PROPERTY_MESSAGE_BODY_WORKERS = "messageBodyWorkers";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_PARAMETERIZED_HEADERS = "parameterizedHeaders";
    public static final String JSON_PROPERTY_PARENT = "parent";
    public static final String JSON_PROPERTY_PROVIDERS = "providers";
    public static final String JSON_PROPERTY_SIMPLE = "simple";
    public static final String JSON_PROPERTY_VALUE = "value";
    private ContentDisposition contentDisposition;
    private Object entity;
    private FormDataContentDisposition formDataContentDisposition;
    private Map<String, List<String>> headers = null;
    private BodyPartMediaType mediaType;
    private Object messageBodyWorkers;
    private String name;
    private Map<String, List<ParameterizedHeader>> parameterizedHeaders = null;
    private MultiPart parent;
    private Object providers;
    private Boolean simple;
    private String value;

    public FormDataBodyPart() {
    }

    public FormDataBodyPart contentDisposition(ContentDisposition contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get contentDisposition
     *
     * @return contentDisposition
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONTENT_DISPOSITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ContentDisposition getContentDisposition() {
        return contentDisposition;
    }


    @JsonProperty(JSON_PROPERTY_CONTENT_DISPOSITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setContentDisposition(ContentDisposition contentDisposition) {
        this.contentDisposition = contentDisposition;
    }


    public FormDataBodyPart entity(Object entity) {
        this.entity = entity;
        return this;
    }

    /**
     * Get entity
     *
     * @return entity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ENTITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Object getEntity() {
        return entity;
    }


    @JsonProperty(JSON_PROPERTY_ENTITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEntity(Object entity) {
        this.entity = entity;
    }


    public FormDataBodyPart formDataContentDisposition(FormDataContentDisposition formDataContentDisposition) {
        this.formDataContentDisposition = formDataContentDisposition;
        return this;
    }

    /**
     * Get formDataContentDisposition
     *
     * @return formDataContentDisposition
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FORM_DATA_CONTENT_DISPOSITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public FormDataContentDisposition getFormDataContentDisposition() {
        return formDataContentDisposition;
    }


    @JsonProperty(JSON_PROPERTY_FORM_DATA_CONTENT_DISPOSITION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFormDataContentDisposition(FormDataContentDisposition formDataContentDisposition) {
        this.formDataContentDisposition = formDataContentDisposition;
    }


    public FormDataBodyPart headers(Map<String, List<String>> headers) {
        this.headers = headers;
        return this;
    }

    public FormDataBodyPart putHeadersItem(String key, List<String> headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    /**
     * Get headers
     *
     * @return headers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, List<String>> getHeaders() {
        return headers;
    }


    @JsonProperty(JSON_PROPERTY_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }


    public FormDataBodyPart mediaType(BodyPartMediaType mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get mediaType
     *
     * @return mediaType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public BodyPartMediaType getMediaType() {
        return mediaType;
    }


    @JsonProperty(JSON_PROPERTY_MEDIA_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMediaType(BodyPartMediaType mediaType) {
        this.mediaType = mediaType;
    }


    public FormDataBodyPart messageBodyWorkers(Object messageBodyWorkers) {
        this.messageBodyWorkers = messageBodyWorkers;
        return this;
    }

    /**
     * Get messageBodyWorkers
     *
     * @return messageBodyWorkers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MESSAGE_BODY_WORKERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Object getMessageBodyWorkers() {
        return messageBodyWorkers;
    }


    @JsonProperty(JSON_PROPERTY_MESSAGE_BODY_WORKERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMessageBodyWorkers(Object messageBodyWorkers) {
        this.messageBodyWorkers = messageBodyWorkers;
    }


    public FormDataBodyPart name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getName() {
        return name;
    }


    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }


    public FormDataBodyPart parameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
        this.parameterizedHeaders = parameterizedHeaders;
        return this;
    }

    public FormDataBodyPart putParameterizedHeadersItem(String key, List<ParameterizedHeader> parameterizedHeadersItem) {
        if (this.parameterizedHeaders == null) {
            this.parameterizedHeaders = new HashMap<>();
        }
        this.parameterizedHeaders.put(key, parameterizedHeadersItem);
        return this;
    }

    /**
     * Get parameterizedHeaders
     *
     * @return parameterizedHeaders
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARAMETERIZED_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, List<ParameterizedHeader>> getParameterizedHeaders() {
        return parameterizedHeaders;
    }


    @JsonProperty(JSON_PROPERTY_PARAMETERIZED_HEADERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParameterizedHeaders(Map<String, List<ParameterizedHeader>> parameterizedHeaders) {
        this.parameterizedHeaders = parameterizedHeaders;
    }


    public FormDataBodyPart parent(MultiPart parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     *
     * @return parent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public MultiPart getParent() {
        return parent;
    }


    @JsonProperty(JSON_PROPERTY_PARENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParent(MultiPart parent) {
        this.parent = parent;
    }


    public FormDataBodyPart providers(Object providers) {
        this.providers = providers;
        return this;
    }

    /**
     * Get providers
     *
     * @return providers
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PROVIDERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Object getProviders() {
        return providers;
    }


    @JsonProperty(JSON_PROPERTY_PROVIDERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setProviders(Object providers) {
        this.providers = providers;
    }


    public FormDataBodyPart simple(Boolean simple) {
        this.simple = simple;
        return this;
    }

    /**
     * Get simple
     *
     * @return simple
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SIMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getSimple() {
        return simple;
    }


    @JsonProperty(JSON_PROPERTY_SIMPLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSimple(Boolean simple) {
        this.simple = simple;
    }


    public FormDataBodyPart value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getValue() {
        return value;
    }


    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(String value) {
        this.value = value;
    }


    /**
     * Return true if this FormDataBodyPart object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormDataBodyPart formDataBodyPart = (FormDataBodyPart) o;
        return Objects.equals(this.contentDisposition, formDataBodyPart.contentDisposition) &&
            Objects.equals(this.entity, formDataBodyPart.entity) &&
            Objects.equals(this.formDataContentDisposition, formDataBodyPart.formDataContentDisposition) &&
            Objects.equals(this.headers, formDataBodyPart.headers) &&
            Objects.equals(this.mediaType, formDataBodyPart.mediaType) &&
            Objects.equals(this.messageBodyWorkers, formDataBodyPart.messageBodyWorkers) &&
            Objects.equals(this.name, formDataBodyPart.name) &&
            Objects.equals(this.parameterizedHeaders, formDataBodyPart.parameterizedHeaders) &&
            Objects.equals(this.parent, formDataBodyPart.parent) &&
            Objects.equals(this.providers, formDataBodyPart.providers) &&
            Objects.equals(this.simple, formDataBodyPart.simple) &&
            Objects.equals(this.value, formDataBodyPart.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contentDisposition, entity, formDataContentDisposition, headers, mediaType, messageBodyWorkers, name, parameterizedHeaders, parent, providers, simple, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormDataBodyPart {\n");
        sb.append("    contentDisposition: ").append(toIndentedString(contentDisposition)).append("\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
        sb.append("    formDataContentDisposition: ").append(toIndentedString(formDataContentDisposition)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    messageBodyWorkers: ").append(toIndentedString(messageBodyWorkers)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parameterizedHeaders: ").append(toIndentedString(parameterizedHeaders)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
        sb.append("    simple: ").append(toIndentedString(simple)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

