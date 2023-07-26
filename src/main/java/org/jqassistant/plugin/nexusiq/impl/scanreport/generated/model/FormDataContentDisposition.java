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

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * FormDataContentDisposition
 */
@JsonPropertyOrder({
    FormDataContentDisposition.JSON_PROPERTY_CREATION_DATE,
    FormDataContentDisposition.JSON_PROPERTY_FILE_NAME,
    FormDataContentDisposition.JSON_PROPERTY_MODIFICATION_DATE,
    FormDataContentDisposition.JSON_PROPERTY_NAME,
    FormDataContentDisposition.JSON_PROPERTY_PARAMETERS,
    FormDataContentDisposition.JSON_PROPERTY_READ_DATE,
    FormDataContentDisposition.JSON_PROPERTY_SIZE,
    FormDataContentDisposition.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class FormDataContentDisposition {
    public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
    public static final String JSON_PROPERTY_FILE_NAME = "fileName";
    public static final String JSON_PROPERTY_MODIFICATION_DATE = "modificationDate";
    public static final String JSON_PROPERTY_NAME = "name";
    public static final String JSON_PROPERTY_PARAMETERS = "parameters";
    public static final String JSON_PROPERTY_READ_DATE = "readDate";
    public static final String JSON_PROPERTY_SIZE = "size";
    public static final String JSON_PROPERTY_TYPE = "type";
    private OffsetDateTime creationDate;
    private String fileName;
    private OffsetDateTime modificationDate;
    private String name;
    private Map<String, String> parameters = null;
    private OffsetDateTime readDate;
    private Long size;
    private String type;

    public FormDataContentDisposition() {
    }

    public FormDataContentDisposition creationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Get creationDate
     *
     * @return creationDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CREATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getCreationDate() {
        return creationDate;
    }


    @JsonProperty(JSON_PROPERTY_CREATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }


    public FormDataContentDisposition fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get fileName
     *
     * @return fileName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getFileName() {
        return fileName;
    }


    @JsonProperty(JSON_PROPERTY_FILE_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    public FormDataContentDisposition modificationDate(OffsetDateTime modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }

    /**
     * Get modificationDate
     *
     * @return modificationDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MODIFICATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getModificationDate() {
        return modificationDate;
    }


    @JsonProperty(JSON_PROPERTY_MODIFICATION_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setModificationDate(OffsetDateTime modificationDate) {
        this.modificationDate = modificationDate;
    }


    public FormDataContentDisposition name(String name) {
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


    public FormDataContentDisposition parameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    public FormDataContentDisposition putParametersItem(String key, String parametersItem) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, parametersItem);
        return this;
    }

    /**
     * Get parameters
     *
     * @return parameters
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, String> getParameters() {
        return parameters;
    }


    @JsonProperty(JSON_PROPERTY_PARAMETERS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }


    public FormDataContentDisposition readDate(OffsetDateTime readDate) {
        this.readDate = readDate;
        return this;
    }

    /**
     * Get readDate
     *
     * @return readDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_READ_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getReadDate() {
        return readDate;
    }


    @JsonProperty(JSON_PROPERTY_READ_DATE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setReadDate(OffsetDateTime readDate) {
        this.readDate = readDate;
    }


    public FormDataContentDisposition size(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Long getSize() {
        return size;
    }


    @JsonProperty(JSON_PROPERTY_SIZE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSize(Long size) {
        this.size = size;
    }


    public FormDataContentDisposition type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getType() {
        return type;
    }


    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Return true if this FormDataContentDisposition object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormDataContentDisposition formDataContentDisposition = (FormDataContentDisposition) o;
        return Objects.equals(this.creationDate, formDataContentDisposition.creationDate) &&
            Objects.equals(this.fileName, formDataContentDisposition.fileName) &&
            Objects.equals(this.modificationDate, formDataContentDisposition.modificationDate) &&
            Objects.equals(this.name, formDataContentDisposition.name) &&
            Objects.equals(this.parameters, formDataContentDisposition.parameters) &&
            Objects.equals(this.readDate, formDataContentDisposition.readDate) &&
            Objects.equals(this.size, formDataContentDisposition.size) &&
            Objects.equals(this.type, formDataContentDisposition.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationDate, fileName, modificationDate, name, parameters, readDate, size, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormDataContentDisposition {\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    readDate: ").append(toIndentedString(readDate)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

