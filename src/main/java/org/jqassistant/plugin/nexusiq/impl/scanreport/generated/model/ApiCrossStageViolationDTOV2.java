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
import java.util.*;


/**
 * ApiCrossStageViolationDTOV2
 */
@JsonPropertyOrder({
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_APPLICATION_NAME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_APPLICATION_PUBLIC_ID,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_COMPONENT_IDENTIFIER,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_CONSTRAINT_VIOLATIONS,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_DISPLAY_NAME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_FILENAME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_FIX_TIME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_HASH,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_OPEN_TIME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_ORGANIZATION_NAME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_POLICY_ID,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_POLICY_NAME,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_POLICY_OWNER,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_POLICY_THREAT_CATEGORY,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_POLICY_VIOLATION_ID,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_STAGE_DATA,
    ApiCrossStageViolationDTOV2.JSON_PROPERTY_THREAT_LEVEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-26T13:18:09.990569236+02:00[Europe/Berlin]")
public class ApiCrossStageViolationDTOV2 {
    public static final String JSON_PROPERTY_APPLICATION_NAME = "applicationName";
    public static final String JSON_PROPERTY_APPLICATION_PUBLIC_ID = "applicationPublicId";
    public static final String JSON_PROPERTY_COMPONENT_IDENTIFIER = "componentIdentifier";
    public static final String JSON_PROPERTY_CONSTRAINT_VIOLATIONS = "constraintViolations";
    public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
    public static final String JSON_PROPERTY_FILENAME = "filename";
    public static final String JSON_PROPERTY_FIX_TIME = "fixTime";
    public static final String JSON_PROPERTY_HASH = "hash";
    public static final String JSON_PROPERTY_OPEN_TIME = "openTime";
    public static final String JSON_PROPERTY_ORGANIZATION_NAME = "organizationName";
    public static final String JSON_PROPERTY_POLICY_ID = "policyId";
    public static final String JSON_PROPERTY_POLICY_NAME = "policyName";
    public static final String JSON_PROPERTY_POLICY_OWNER = "policyOwner";
    public static final String JSON_PROPERTY_POLICY_THREAT_CATEGORY = "policyThreatCategory";
    public static final String JSON_PROPERTY_POLICY_VIOLATION_ID = "policyViolationId";
    public static final String JSON_PROPERTY_STAGE_DATA = "stageData";
    public static final String JSON_PROPERTY_THREAT_LEVEL = "threatLevel";
    private String applicationName;
    private String applicationPublicId;
    private ApiComponentIdentifierDTOV2 componentIdentifier;
    private List<ApiConstraintViolationDTO> constraintViolations = null;
    private ComponentDisplayName displayName;
    private String filename;
    private OffsetDateTime fixTime;
    private String hash;
    private OffsetDateTime openTime;
    private String organizationName;
    private String policyId;
    private String policyName;
    private PolicyOwner policyOwner;
    private String policyThreatCategory;
    private String policyViolationId;
    private Map<String, StageData> stageData = null;
    private Integer threatLevel;

    public ApiCrossStageViolationDTOV2() {
    }

    public ApiCrossStageViolationDTOV2 applicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Get applicationName
     *
     * @return applicationName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getApplicationName() {
        return applicationName;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    public ApiCrossStageViolationDTOV2 applicationPublicId(String applicationPublicId) {
        this.applicationPublicId = applicationPublicId;
        return this;
    }

    /**
     * Get applicationPublicId
     *
     * @return applicationPublicId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_APPLICATION_PUBLIC_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getApplicationPublicId() {
        return applicationPublicId;
    }


    @JsonProperty(JSON_PROPERTY_APPLICATION_PUBLIC_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setApplicationPublicId(String applicationPublicId) {
        this.applicationPublicId = applicationPublicId;
    }


    public ApiCrossStageViolationDTOV2 componentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
        return this;
    }

    /**
     * Get componentIdentifier
     *
     * @return componentIdentifier
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMPONENT_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ApiComponentIdentifierDTOV2 getComponentIdentifier() {
        return componentIdentifier;
    }


    @JsonProperty(JSON_PROPERTY_COMPONENT_IDENTIFIER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComponentIdentifier(ApiComponentIdentifierDTOV2 componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
    }


    public ApiCrossStageViolationDTOV2 constraintViolations(List<ApiConstraintViolationDTO> constraintViolations) {
        this.constraintViolations = constraintViolations;
        return this;
    }

    public ApiCrossStageViolationDTOV2 addConstraintViolationsItem(ApiConstraintViolationDTO constraintViolationsItem) {
        if (this.constraintViolations == null) {
            this.constraintViolations = new ArrayList<>();
        }
        this.constraintViolations.add(constraintViolationsItem);
        return this;
    }

    /**
     * Get constraintViolations
     *
     * @return constraintViolations
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_CONSTRAINT_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public List<ApiConstraintViolationDTO> getConstraintViolations() {
        return constraintViolations;
    }


    @JsonProperty(JSON_PROPERTY_CONSTRAINT_VIOLATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setConstraintViolations(List<ApiConstraintViolationDTO> constraintViolations) {
        this.constraintViolations = constraintViolations;
    }


    public ApiCrossStageViolationDTOV2 displayName(ComponentDisplayName displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get displayName
     *
     * @return displayName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public ComponentDisplayName getDisplayName() {
        return displayName;
    }


    @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDisplayName(ComponentDisplayName displayName) {
        this.displayName = displayName;
    }


    public ApiCrossStageViolationDTOV2 filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get filename
     *
     * @return filename
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FILENAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getFilename() {
        return filename;
    }


    @JsonProperty(JSON_PROPERTY_FILENAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFilename(String filename) {
        this.filename = filename;
    }


    public ApiCrossStageViolationDTOV2 fixTime(OffsetDateTime fixTime) {
        this.fixTime = fixTime;
        return this;
    }

    /**
     * Get fixTime
     *
     * @return fixTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_FIX_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getFixTime() {
        return fixTime;
    }


    @JsonProperty(JSON_PROPERTY_FIX_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFixTime(OffsetDateTime fixTime) {
        this.fixTime = fixTime;
    }


    public ApiCrossStageViolationDTOV2 hash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * Get hash
     *
     * @return hash
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getHash() {
        return hash;
    }


    @JsonProperty(JSON_PROPERTY_HASH)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setHash(String hash) {
        this.hash = hash;
    }


    public ApiCrossStageViolationDTOV2 openTime(OffsetDateTime openTime) {
        this.openTime = openTime;
        return this;
    }

    /**
     * Get openTime
     *
     * @return openTime
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_OPEN_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public OffsetDateTime getOpenTime() {
        return openTime;
    }


    @JsonProperty(JSON_PROPERTY_OPEN_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOpenTime(OffsetDateTime openTime) {
        this.openTime = openTime;
    }


    public ApiCrossStageViolationDTOV2 organizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get organizationName
     *
     * @return organizationName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getOrganizationName() {
        return organizationName;
    }


    @JsonProperty(JSON_PROPERTY_ORGANIZATION_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }


    public ApiCrossStageViolationDTOV2 policyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * Get policyId
     *
     * @return policyId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyId() {
        return policyId;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }


    public ApiCrossStageViolationDTOV2 policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get policyName
     *
     * @return policyName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyName() {
        return policyName;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    public ApiCrossStageViolationDTOV2 policyOwner(PolicyOwner policyOwner) {
        this.policyOwner = policyOwner;
        return this;
    }

    /**
     * Get policyOwner
     *
     * @return policyOwner
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public PolicyOwner getPolicyOwner() {
        return policyOwner;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_OWNER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyOwner(PolicyOwner policyOwner) {
        this.policyOwner = policyOwner;
    }


    public ApiCrossStageViolationDTOV2 policyThreatCategory(String policyThreatCategory) {
        this.policyThreatCategory = policyThreatCategory;
        return this;
    }

    /**
     * Get policyThreatCategory
     *
     * @return policyThreatCategory
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_THREAT_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyThreatCategory() {
        return policyThreatCategory;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_THREAT_CATEGORY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyThreatCategory(String policyThreatCategory) {
        this.policyThreatCategory = policyThreatCategory;
    }


    public ApiCrossStageViolationDTOV2 policyViolationId(String policyViolationId) {
        this.policyViolationId = policyViolationId;
        return this;
    }

    /**
     * Get policyViolationId
     *
     * @return policyViolationId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_POLICY_VIOLATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getPolicyViolationId() {
        return policyViolationId;
    }


    @JsonProperty(JSON_PROPERTY_POLICY_VIOLATION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPolicyViolationId(String policyViolationId) {
        this.policyViolationId = policyViolationId;
    }


    public ApiCrossStageViolationDTOV2 stageData(Map<String, StageData> stageData) {
        this.stageData = stageData;
        return this;
    }

    public ApiCrossStageViolationDTOV2 putStageDataItem(String key, StageData stageDataItem) {
        if (this.stageData == null) {
            this.stageData = new HashMap<>();
        }
        this.stageData.put(key, stageDataItem);
        return this;
    }

    /**
     * Get stageData
     *
     * @return stageData
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_STAGE_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Map<String, StageData> getStageData() {
        return stageData;
    }


    @JsonProperty(JSON_PROPERTY_STAGE_DATA)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStageData(Map<String, StageData> stageData) {
        this.stageData = stageData;
    }


    public ApiCrossStageViolationDTOV2 threatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }

    /**
     * Get threatLevel
     *
     * @return threatLevel
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getThreatLevel() {
        return threatLevel;
    }


    @JsonProperty(JSON_PROPERTY_THREAT_LEVEL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setThreatLevel(Integer threatLevel) {
        this.threatLevel = threatLevel;
    }


    /**
     * Return true if this ApiCrossStageViolationDTOV2 object is equal to o.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiCrossStageViolationDTOV2 apiCrossStageViolationDTOV2 = (ApiCrossStageViolationDTOV2) o;
        return Objects.equals(this.applicationName, apiCrossStageViolationDTOV2.applicationName) &&
            Objects.equals(this.applicationPublicId, apiCrossStageViolationDTOV2.applicationPublicId) &&
            Objects.equals(this.componentIdentifier, apiCrossStageViolationDTOV2.componentIdentifier) &&
            Objects.equals(this.constraintViolations, apiCrossStageViolationDTOV2.constraintViolations) &&
            Objects.equals(this.displayName, apiCrossStageViolationDTOV2.displayName) &&
            Objects.equals(this.filename, apiCrossStageViolationDTOV2.filename) &&
            Objects.equals(this.fixTime, apiCrossStageViolationDTOV2.fixTime) &&
            Objects.equals(this.hash, apiCrossStageViolationDTOV2.hash) &&
            Objects.equals(this.openTime, apiCrossStageViolationDTOV2.openTime) &&
            Objects.equals(this.organizationName, apiCrossStageViolationDTOV2.organizationName) &&
            Objects.equals(this.policyId, apiCrossStageViolationDTOV2.policyId) &&
            Objects.equals(this.policyName, apiCrossStageViolationDTOV2.policyName) &&
            Objects.equals(this.policyOwner, apiCrossStageViolationDTOV2.policyOwner) &&
            Objects.equals(this.policyThreatCategory, apiCrossStageViolationDTOV2.policyThreatCategory) &&
            Objects.equals(this.policyViolationId, apiCrossStageViolationDTOV2.policyViolationId) &&
            Objects.equals(this.stageData, apiCrossStageViolationDTOV2.stageData) &&
            Objects.equals(this.threatLevel, apiCrossStageViolationDTOV2.threatLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationName, applicationPublicId, componentIdentifier, constraintViolations, displayName, filename, fixTime, hash, openTime, organizationName, policyId, policyName, policyOwner, policyThreatCategory, policyViolationId, stageData, threatLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiCrossStageViolationDTOV2 {\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    applicationPublicId: ").append(toIndentedString(applicationPublicId)).append("\n");
        sb.append("    componentIdentifier: ").append(toIndentedString(componentIdentifier)).append("\n");
        sb.append("    constraintViolations: ").append(toIndentedString(constraintViolations)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    fixTime: ").append(toIndentedString(fixTime)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
        sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyOwner: ").append(toIndentedString(policyOwner)).append("\n");
        sb.append("    policyThreatCategory: ").append(toIndentedString(policyThreatCategory)).append("\n");
        sb.append("    policyViolationId: ").append(toIndentedString(policyViolationId)).append("\n");
        sb.append("    stageData: ").append(toIndentedString(stageData)).append("\n");
        sb.append("    threatLevel: ").append(toIndentedString(threatLevel)).append("\n");
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

