
package Response.Foreign_Exchange.Option.Digital_Option.InstRefDataReporting.V1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Derived
 * <p>
 * Derived Attributes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FullName",
    "ClassificationType",
    "CommodityDerivativeIndicator",
    "IssuerorOperatoroftheTradingVenueIdentifier",
    "ShortName",
    "FXType",
    "UnderlyingAssetType"
})
public class Derived implements Serializable
{

    /**
     * Full Name
     * <p>
     * Full name of the financial instrument
     * (Required)
     * 
     */
    @JsonProperty("FullName")
    @JsonPropertyDescription("Full name of the financial instrument")
    @NotNull
    private String fullName;
    /**
     * Classification Type
     * <p>
     * Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority
     * (Required)
     * 
     */
    @JsonProperty("ClassificationType")
    @JsonPropertyDescription("Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority")
    @NotNull
    private String classificationType;
    /**
     * Commodity Derivative Indicator
     * <p>
     * Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU
     * (Required)
     * 
     */
    @JsonProperty("CommodityDerivativeIndicator")
    @JsonPropertyDescription("Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU")
    @NotNull
    private String commodityDerivativeIndicator;
    /**
     * Issuer or Operator of the Trading Venue Identifier
     * <p>
     * ISIN Issuer Long Name
     * (Required)
     * 
     */
    @JsonProperty("IssuerorOperatoroftheTradingVenueIdentifier")
    @JsonPropertyDescription("ISIN Issuer Long Name")
    @NotNull
    private String issuerorOperatoroftheTradingVenueIdentifier;
    /**
     * Short Name
     * <p>
     * Short name of financial instrument in accordance with ISO 18774
     * (Required)
     * 
     */
    @JsonProperty("ShortName")
    @JsonPropertyDescription("Short name of financial instrument in accordance with ISO 18774")
    @NotNull
    private String shortName;
    /**
     * FX Type
     * <p>
     * Type of underlying currency
     * (Required)
     * 
     */
    @JsonProperty("FXType")
    @JsonPropertyDescription("Type of underlying currency")
    @NotNull
    private Derived.FXType fXType;
    /**
     * Underlying Asset Type
     * <p>
     * The type of the underlying asset as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("UnderlyingAssetType")
    @JsonPropertyDescription("The type of the underlying asset as defined by CFI code: ISO 10962 (2015)")
    @NotNull
    private Derived.UnderlyingAssetType underlyingAssetType;
    private final static long serialVersionUID = 7347630608334353325L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Derived() {
    }

    /**
     * 
     * @param issuerorOperatoroftheTradingVenueIdentifier
     * @param fXType
     * @param underlyingAssetType
     * @param fullName
     * @param classificationType
     * @param commodityDerivativeIndicator
     * @param shortName
     */
    public Derived(String fullName, String classificationType, String commodityDerivativeIndicator, String issuerorOperatoroftheTradingVenueIdentifier, String shortName, Derived.FXType fXType, Derived.UnderlyingAssetType underlyingAssetType) {
        super();
        this.fullName = fullName;
        this.classificationType = classificationType;
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
        this.shortName = shortName;
        this.fXType = fXType;
        this.underlyingAssetType = underlyingAssetType;
    }

    /**
     * Full Name
     * <p>
     * Full name of the financial instrument
     * (Required)
     * 
     */
    @JsonProperty("FullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full Name
     * <p>
     * Full name of the financial instrument
     * (Required)
     * 
     */
    @JsonProperty("FullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Derived withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Classification Type
     * <p>
     * Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority
     * (Required)
     * 
     */
    @JsonProperty("ClassificationType")
    public String getClassificationType() {
        return classificationType;
    }

    /**
     * Classification Type
     * <p>
     * Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority
     * (Required)
     * 
     */
    @JsonProperty("ClassificationType")
    public void setClassificationType(String classificationType) {
        this.classificationType = classificationType;
    }

    public Derived withClassificationType(String classificationType) {
        this.classificationType = classificationType;
        return this;
    }

    /**
     * Commodity Derivative Indicator
     * <p>
     * Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU
     * (Required)
     * 
     */
    @JsonProperty("CommodityDerivativeIndicator")
    public String getCommodityDerivativeIndicator() {
        return commodityDerivativeIndicator;
    }

    /**
     * Commodity Derivative Indicator
     * <p>
     * Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU
     * (Required)
     * 
     */
    @JsonProperty("CommodityDerivativeIndicator")
    public void setCommodityDerivativeIndicator(String commodityDerivativeIndicator) {
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
    }

    public Derived withCommodityDerivativeIndicator(String commodityDerivativeIndicator) {
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
        return this;
    }

    /**
     * Issuer or Operator of the Trading Venue Identifier
     * <p>
     * ISIN Issuer Long Name
     * (Required)
     * 
     */
    @JsonProperty("IssuerorOperatoroftheTradingVenueIdentifier")
    public String getIssuerorOperatoroftheTradingVenueIdentifier() {
        return issuerorOperatoroftheTradingVenueIdentifier;
    }

    /**
     * Issuer or Operator of the Trading Venue Identifier
     * <p>
     * ISIN Issuer Long Name
     * (Required)
     * 
     */
    @JsonProperty("IssuerorOperatoroftheTradingVenueIdentifier")
    public void setIssuerorOperatoroftheTradingVenueIdentifier(String issuerorOperatoroftheTradingVenueIdentifier) {
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
    }

    public Derived withIssuerorOperatoroftheTradingVenueIdentifier(String issuerorOperatoroftheTradingVenueIdentifier) {
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
        return this;
    }

    /**
     * Short Name
     * <p>
     * Short name of financial instrument in accordance with ISO 18774
     * (Required)
     * 
     */
    @JsonProperty("ShortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short Name
     * <p>
     * Short name of financial instrument in accordance with ISO 18774
     * (Required)
     * 
     */
    @JsonProperty("ShortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Derived withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * FX Type
     * <p>
     * Type of underlying currency
     * (Required)
     * 
     */
    @JsonProperty("FXType")
    public Derived.FXType getFXType() {
        return fXType;
    }

    /**
     * FX Type
     * <p>
     * Type of underlying currency
     * (Required)
     * 
     */
    @JsonProperty("FXType")
    public void setFXType(Derived.FXType fXType) {
        this.fXType = fXType;
    }

    public Derived withFXType(Derived.FXType fXType) {
        this.fXType = fXType;
        return this;
    }

    /**
     * Underlying Asset Type
     * <p>
     * The type of the underlying asset as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("UnderlyingAssetType")
    public Derived.UnderlyingAssetType getUnderlyingAssetType() {
        return underlyingAssetType;
    }

    /**
     * Underlying Asset Type
     * <p>
     * The type of the underlying asset as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("UnderlyingAssetType")
    public void setUnderlyingAssetType(Derived.UnderlyingAssetType underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
    }

    public Derived withUnderlyingAssetType(Derived.UnderlyingAssetType underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullName", fullName).append("classificationType", classificationType).append("commodityDerivativeIndicator", commodityDerivativeIndicator).append("issuerorOperatoroftheTradingVenueIdentifier", issuerorOperatoroftheTradingVenueIdentifier).append("shortName", shortName).append("fXType", fXType).append("underlyingAssetType", underlyingAssetType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(issuerorOperatoroftheTradingVenueIdentifier).append(fXType).append(underlyingAssetType).append(fullName).append(classificationType).append(commodityDerivativeIndicator).append(shortName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Derived) == false) {
            return false;
        }
        Derived rhs = ((Derived) other);
        return new EqualsBuilder().append(issuerorOperatoroftheTradingVenueIdentifier, rhs.issuerorOperatoroftheTradingVenueIdentifier).append(fXType, rhs.fXType).append(underlyingAssetType, rhs.underlyingAssetType).append(fullName, rhs.fullName).append(classificationType, rhs.classificationType).append(commodityDerivativeIndicator, rhs.commodityDerivativeIndicator).append(shortName, rhs.shortName).isEquals();
    }

    public enum FXType {

        FXCR("FXCR"),
        FXEM("FXEM"),
        FXMJ("FXMJ");
        private final String value;
        private final static Map<String, Derived.FXType> CONSTANTS = new HashMap<String, Derived.FXType>();

        static {
            for (Derived.FXType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FXType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Derived.FXType fromValue(String value) {
            Derived.FXType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum UnderlyingAssetType {

        FORWARDS("Forwards"),
        FUTURES("Futures"),
        SPOT("Spot"),
        VOLATILITY("Volatility"),
        OTHER("Other");
        private final String value;
        private final static Map<String, Derived.UnderlyingAssetType> CONSTANTS = new HashMap<String, Derived.UnderlyingAssetType>();

        static {
            for (Derived.UnderlyingAssetType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private UnderlyingAssetType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Derived.UnderlyingAssetType fromValue(String value) {
            Derived.UnderlyingAssetType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
