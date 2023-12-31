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
 * Action
 */
@JsonPropertyOrder({
    Action.JSON_PROPERTY_ACTION_TYPE_ID,
    Action.JSON_PROPERTY_TARGET,
    Action.JSON_PROPERTY_TARGET_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class Action {
    public static final String JSON_PROPERTY_ACTION_TYPE_ID = "actionTypeId";
    public static final String JSON_PROPERTY_TARGET = "target";
    public static final String JSON_PROPERTY_TARGET_TYPE = "targetType";
    private String actionTypeId;
    private String target;
    private String targetType;

    public Action() {
    }

    public Action actionTypeId(String actionTypeId) {
        this.actionTypeId = actionTypeId;
        return this;
    }

    /**
     * Get actionTypeId
     *
     * @return actionTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ACTION_TYPE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getActionTypeId() {
        return actionTypeId;
    }


    @JsonProperty(JSON_PROPERTY_ACTION_TYPE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setActionTypeId(String actionTypeId) {
        this.actionTypeId = actionTypeId;
    }


    public Action target(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get target
     *
     * @return target
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TARGET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getTarget() {
        return target;
    }


    @JsonProperty(JSON_PROPERTY_TARGET)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTarget(String target) {
        this.target = target;
    }


    public Action targetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     *
     * @return targetType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getTargetType() {
        return targetType;
    }


    @JsonProperty(JSON_PROPERTY_TARGET_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }


    /**
     * Return true if this Action object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Action action = (Action) o;
        return Objects.equals(this.actionTypeId, action.actionTypeId) &&
            Objects.equals(this.target, action.target) &&
            Objects.equals(this.targetType, action.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionTypeId, target, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Action {\n");
        sb.append("    actionTypeId: ").append(toIndentedString(actionTypeId)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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

