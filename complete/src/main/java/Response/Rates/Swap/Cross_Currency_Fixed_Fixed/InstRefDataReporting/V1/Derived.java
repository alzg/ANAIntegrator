
package Response.Rates.Swap.Cross_Currency_Fixed_Fixed.InstRefDataReporting.V1;

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
    "UnderlyingAssetType",
    "SingleorMultiCurrency",
    "IssuerorOperatoroftheTradingVenueIdentifier",
    "ShortName"
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
    /**
     * Single or Multi Currency
     * <p>
     * Indicates whether the swap is single or multi-currency
     * (Required)
     * 
     */
    @JsonProperty("SingleorMultiCurrency")
    @JsonPropertyDescription("Indicates whether the swap is single or multi-currency")
    @NotNull
    private Derived.SingleorMultiCurrency singleorMultiCurrency;
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
    private final static long serialVersionUID = -3259378978941118497L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Derived() {
    }

    /**
     * 
     * @param underlyingAssetType
     * @param issuerorOperatoroftheTradingVenueIdentifier
     * @param fullName
     * @param classificationType
     * @param commodityDerivativeIndicator
     * @param shortName
     * @param singleorMultiCurrency
     */
    public Derived(String fullName, String classificationType, String commodityDerivativeIndicator, Derived.UnderlyingAssetType underlyingAssetType, Derived.SingleorMultiCurrency singleorMultiCurrency, String issuerorOperatoroftheTradingVenueIdentifier, String shortName) {
        super();
        this.fullName = fullName;
        this.classificationType = classificationType;
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
        this.underlyingAssetType = underlyingAssetType;
        this.singleorMultiCurrency = singleorMultiCurrency;
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
        this.shortName = shortName;
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

    /**
     * Single or Multi Currency
     * <p>
     * Indicates whether the swap is single or multi-currency
     * (Required)
     * 
     */
    @JsonProperty("SingleorMultiCurrency")
    public Derived.SingleorMultiCurrency getSingleorMultiCurrency() {
        return singleorMultiCurrency;
    }

    /**
     * Single or Multi Currency
     * <p>
     * Indicates whether the swap is single or multi-currency
     * (Required)
     * 
     */
    @JsonProperty("SingleorMultiCurrency")
    public void setSingleorMultiCurrency(Derived.SingleorMultiCurrency singleorMultiCurrency) {
        this.singleorMultiCurrency = singleorMultiCurrency;
    }

    public Derived withSingleorMultiCurrency(Derived.SingleorMultiCurrency singleorMultiCurrency) {
        this.singleorMultiCurrency = singleorMultiCurrency;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullName", fullName).append("classificationType", classificationType).append("commodityDerivativeIndicator", commodityDerivativeIndicator).append("underlyingAssetType", underlyingAssetType).append("singleorMultiCurrency", singleorMultiCurrency).append("issuerorOperatoroftheTradingVenueIdentifier", issuerorOperatoroftheTradingVenueIdentifier).append("shortName", shortName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(underlyingAssetType).append(issuerorOperatoroftheTradingVenueIdentifier).append(fullName).append(classificationType).append(commodityDerivativeIndicator).append(shortName).append(singleorMultiCurrency).toHashCode();
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
        return new EqualsBuilder().append(underlyingAssetType, rhs.underlyingAssetType).append(issuerorOperatoroftheTradingVenueIdentifier, rhs.issuerorOperatoroftheTradingVenueIdentifier).append(fullName, rhs.fullName).append(classificationType, rhs.classificationType).append(commodityDerivativeIndicator, rhs.commodityDerivativeIndicator).append(shortName, rhs.shortName).append(singleorMultiCurrency, rhs.singleorMultiCurrency).isEquals();
    }

    public enum SingleorMultiCurrency {

        SINGLE_CURRENCY("Single Currency"),
        CROSS_CURRENCY("Cross Currency");
        private final String value;
        private final static Map<String, Derived.SingleorMultiCurrency> CONSTANTS = new HashMap<String, Derived.SingleorMultiCurrency>();

        static {
            for (Derived.SingleorMultiCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SingleorMultiCurrency(String value) {
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
        public static Derived.SingleorMultiCurrency fromValue(String value) {
            Derived.SingleorMultiCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum UnderlyingAssetType {

        BASIS_SWAP_FLOAT_FLOAT("Basis Swap (Float - Float)"),
        FIXED_FLOATING("Fixed - Floating"),
        FIXED_FIXED("Fixed - Fixed"),
        INFLATION_RATE_INDEX("Inflation Rate Index"),
        OVERNIGHT_INDEX_SWAP_OIS("Overnight Index Swap (OIS)"),
        ZERO_COUPON("Zero Coupon"),
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
