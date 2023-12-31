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
 * ConstraintFact
 */
@JsonPropertyOrder({
    ConstraintFact.JSON_PROPERTY_CONDITION_FACTS,
    ConstraintFact.JSON_PROPERTY_CONSTRAINT_ID,
    ConstraintFact.JSON_PROPERTY_CONSTRAINT_NAME,
    ConstraintFact.JSON_PROPERTY_OPERATOR_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ConstraintFact {
    public static final String JSON_PROPERTY_CONDITION_FACTS = "conditionFacts";
    public static final String JSON_PROPERTY_CONSTRAINT_ID = "constraintId";
    public static final String JSON_PROPERTY_CONSTRAINT_NAME = "constraintName";
    public static final String JSON_PROPERTY_OPERATOR_NAME = "operatorName";
    private List<ConditionFact> conditionFacts = null;
    private String constraintId;
    private String constraintName;
    private String operatorName;

    public ConstraintFact() {
    }

    public ConstraintFact conditionFacts(List<ConditionFact> conditionFacts) {
        this.conditionFacts = conditionFacts;
        return this;
    }

    public ConstraintFact addConditionFactsItem(ConditionFact conditionFactsItem) {
        if (this.conditionFacts == null) {
            this.conditionFacts = new ArrayList<>();
        }
        this.conditionFacts.add(conditionFactsItem);
        return this;
    }

    /**
     * Get conditionFacts
     *
     * @return conditionFacts
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONDITION_FACTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ConditionFact> getConditionFacts() {
        return conditionFacts;
    }


    @JsonProperty(JSON_PROPERTY_CONDITION_FACTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConditionFacts(List<ConditionFact> conditionFacts) {
        this.conditionFacts = conditionFacts;
    }


    public ConstraintFact constraintId(String constraintId) {
        this.constraintId = constraintId;
        return this;
    }

    /**
     * Get constraintId
     *
     * @return constraintId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONSTRAINT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getConstraintId() {
        return constraintId;
    }


    @JsonProperty(JSON_PROPERTY_CONSTRAINT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstraintId(String constraintId) {
        this.constraintId = constraintId;
    }


    public ConstraintFact constraintName(String constraintName) {
        this.constraintName = constraintName;
        return this;
    }

    /**
     * Get constraintName
     *
     * @return constraintName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONSTRAINT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getConstraintName() {
        return constraintName;
    }


    @JsonProperty(JSON_PROPERTY_CONSTRAINT_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstraintName(String constraintName) {
        this.constraintName = constraintName;
    }


    public ConstraintFact operatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }

    /**
     * Get operatorName
     *
     * @return operatorName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OPERATOR_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOperatorName() {
        return operatorName;
    }


    @JsonProperty(JSON_PROPERTY_OPERATOR_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }


    /**
     * Return true if this ConstraintFact object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConstraintFact constraintFact = (ConstraintFact) o;
        return Objects.equals(this.conditionFacts, constraintFact.conditionFacts) &&
            Objects.equals(this.constraintId, constraintFact.constraintId) &&
            Objects.equals(this.constraintName, constraintFact.constraintName) &&
            Objects.equals(this.operatorName, constraintFact.operatorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conditionFacts, constraintId, constraintName, operatorName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConstraintFact {\n");
        sb.append("    conditionFacts: ").append(toIndentedString(conditionFacts)).append("\n");
        sb.append("    constraintId: ").append(toIndentedString(constraintId)).append("\n");
        sb.append("    constraintName: ").append(toIndentedString(constraintName)).append("\n");
        sb.append("    operatorName: ").append(toIndentedString(operatorName)).append("\n");
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

