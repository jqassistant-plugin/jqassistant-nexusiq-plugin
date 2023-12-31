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

import com.fasterxml.jackson.annotation.*;
import io.swagger.annotations.ApiModelProperty;

import java.time.OffsetDateTime;
import java.util.Objects;


/**
 * ApiWaiverOptionsDTO
 */
@JsonPropertyOrder({
    ApiWaiverOptionsDTO.JSON_PROPERTY_APPLY_TO_ALL_COMPONENTS,
    ApiWaiverOptionsDTO.JSON_PROPERTY_COMMENT,
    ApiWaiverOptionsDTO.JSON_PROPERTY_EXPIRY_TIME,
    ApiWaiverOptionsDTO.JSON_PROPERTY_MATCHER_STRATEGY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiWaiverOptionsDTO {
    public static final String JSON_PROPERTY_APPLY_TO_ALL_COMPONENTS = "applyToAllComponents";
    public static final String JSON_PROPERTY_COMMENT = "comment";
    public static final String JSON_PROPERTY_EXPIRY_TIME = "expiryTime";
    public static final String JSON_PROPERTY_MATCHER_STRATEGY = "matcherStrategy";
    private Boolean applyToAllComponents;
    private String comment;
    private OffsetDateTime expiryTime;
    private MatcherStrategyEnum matcherStrategy;
    public ApiWaiverOptionsDTO() {
    }

    public ApiWaiverOptionsDTO applyToAllComponents(Boolean applyToAllComponents) {
        this.applyToAllComponents = applyToAllComponents;
        return this;
    }

    /**
     * Get applyToAllComponents
     *
     * @return applyToAllComponents
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLY_TO_ALL_COMPONENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Boolean getApplyToAllComponents() {
        return applyToAllComponents;
    }

    @JsonProperty(JSON_PROPERTY_APPLY_TO_ALL_COMPONENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplyToAllComponents(Boolean applyToAllComponents) {
        this.applyToAllComponents = applyToAllComponents;
    }

    public ApiWaiverOptionsDTO comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getComment() {
        return comment;
    }

    @JsonProperty(JSON_PROPERTY_COMMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComment(String comment) {
        this.comment = comment;
    }

    public ApiWaiverOptionsDTO expiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get expiryTime
     *
     * @return expiryTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_EXPIRY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getExpiryTime() {
        return expiryTime;
    }

    @JsonProperty(JSON_PROPERTY_EXPIRY_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
    }

    public ApiWaiverOptionsDTO matcherStrategy(MatcherStrategyEnum matcherStrategy) {
        this.matcherStrategy = matcherStrategy;
        return this;
    }

    /**
     * Get matcherStrategy
     *
     * @return matcherStrategy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_MATCHER_STRATEGY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public MatcherStrategyEnum getMatcherStrategy() {
        return matcherStrategy;
    }

    @JsonProperty(JSON_PROPERTY_MATCHER_STRATEGY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMatcherStrategy(MatcherStrategyEnum matcherStrategy) {
        this.matcherStrategy = matcherStrategy;
    }

    /**
     * Return true if this ApiWaiverOptionsDTO object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiWaiverOptionsDTO apiWaiverOptionsDTO = (ApiWaiverOptionsDTO) o;
        return Objects.equals(this.applyToAllComponents, apiWaiverOptionsDTO.applyToAllComponents) &&
            Objects.equals(this.comment, apiWaiverOptionsDTO.comment) &&
            Objects.equals(this.expiryTime, apiWaiverOptionsDTO.expiryTime) &&
            Objects.equals(this.matcherStrategy, apiWaiverOptionsDTO.matcherStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyToAllComponents, comment, expiryTime, matcherStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiWaiverOptionsDTO {\n");
        sb.append("    applyToAllComponents: ").append(toIndentedString(applyToAllComponents)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
        sb.append("    matcherStrategy: ").append(toIndentedString(matcherStrategy)).append("\n");
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

    /**
     * Gets or Sets matcherStrategy
     */
    public enum MatcherStrategyEnum {
        DEFAULT("DEFAULT"),

        EXACT_COMPONENT("EXACT_COMPONENT"),

        ALL_COMPONENTS("ALL_COMPONENTS"),

        ALL_VERSIONS("ALL_VERSIONS");

        private String value;

        MatcherStrategyEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static MatcherStrategyEnum fromValue(String value) {
            for (MatcherStrategyEnum b : MatcherStrategyEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

