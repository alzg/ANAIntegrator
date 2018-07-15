
package Response.Foreign_Exchange.Swap.FX_Swap.InstRefDataReporting.V1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
    "UnderlyingAssetType",
    "NotionalCurrency",
    "ExpiryDate",
    "OtherNotionalCurrency"
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
    private String underlyingAssetType;
    /**
     * Notional Currency
     * <p>
     * Currency in which the notional is denominated. Usage: Within MiFIR, in the case of an interest rate or currency derivative contract, this will be the notional currency of leg 1 or the currency 1 of the pair. Within MiFIR, in the case of swaptions where the underlying swap is single-currency, this will be the notional currency of the underlying swap. For swaptions where the underlying is multi-currency, this will be the notional currency of leg 1 of the swap
     * (Required)
     * 
     */
    @JsonProperty("NotionalCurrency")
    @JsonPropertyDescription("Currency in which the notional is denominated. Usage: Within MiFIR, in the case of an interest rate or currency derivative contract, this will be the notional currency of leg 1 or the currency 1 of the pair. Within MiFIR, in the case of swaptions where the underlying swap is single-currency, this will be the notional currency of the underlying swap. For swaptions where the underlying is multi-currency, this will be the notional currency of leg 1 of the swap")
    @NotNull
    private Derived.NotionalCurrency notionalCurrency;
    /**
     * Expiry Date
     * <p>
     * Expiry date of the instrument (YYYY-MM-DD)
     * (Required)
     * 
     */
    @JsonProperty("ExpiryDate")
    @JsonPropertyDescription("Expiry date of the instrument (YYYY-MM-DD)")
    @Pattern(regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$")
    @NotNull
    private String expiryDate;
    /**
     * Other Notional Currency
     * <p>
     * In the case of multi-currency or cross-currency swaps the currency in which leg 2 of the contract is denominated; For swaptions where the underlying swap is multi-currency, the currency in which leg 2 of the swap is denominated
     * (Required)
     * 
     */
    @JsonProperty("OtherNotionalCurrency")
    @JsonPropertyDescription("In the case of multi-currency or cross-currency swaps the currency in which leg 2 of the contract is denominated; For swaptions where the underlying swap is multi-currency, the currency in which leg 2 of the swap is denominated")
    @NotNull
    private Derived.OtherNotionalCurrency otherNotionalCurrency;
    private final static long serialVersionUID = -7795109417292113624L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Derived() {
    }

    /**
     * 
     * @param notionalCurrency
     * @param expiryDate
     * @param issuerorOperatoroftheTradingVenueIdentifier
     * @param fXType
     * @param underlyingAssetType
     * @param fullName
     * @param classificationType
     * @param otherNotionalCurrency
     * @param commodityDerivativeIndicator
     * @param shortName
     */
    public Derived(String fullName, String classificationType, String commodityDerivativeIndicator, String issuerorOperatoroftheTradingVenueIdentifier, String shortName, Derived.FXType fXType, String underlyingAssetType, Derived.NotionalCurrency notionalCurrency, String expiryDate, Derived.OtherNotionalCurrency otherNotionalCurrency) {
        super();
        this.fullName = fullName;
        this.classificationType = classificationType;
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
        this.shortName = shortName;
        this.fXType = fXType;
        this.underlyingAssetType = underlyingAssetType;
        this.notionalCurrency = notionalCurrency;
        this.expiryDate = expiryDate;
        this.otherNotionalCurrency = otherNotionalCurrency;
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
    public String getUnderlyingAssetType() {
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
    public void setUnderlyingAssetType(String underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
    }

    public Derived withUnderlyingAssetType(String underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
        return this;
    }

    /**
     * Notional Currency
     * <p>
     * Currency in which the notional is denominated. Usage: Within MiFIR, in the case of an interest rate or currency derivative contract, this will be the notional currency of leg 1 or the currency 1 of the pair. Within MiFIR, in the case of swaptions where the underlying swap is single-currency, this will be the notional currency of the underlying swap. For swaptions where the underlying is multi-currency, this will be the notional currency of leg 1 of the swap
     * (Required)
     * 
     */
    @JsonProperty("NotionalCurrency")
    public Derived.NotionalCurrency getNotionalCurrency() {
        return notionalCurrency;
    }

    /**
     * Notional Currency
     * <p>
     * Currency in which the notional is denominated. Usage: Within MiFIR, in the case of an interest rate or currency derivative contract, this will be the notional currency of leg 1 or the currency 1 of the pair. Within MiFIR, in the case of swaptions where the underlying swap is single-currency, this will be the notional currency of the underlying swap. For swaptions where the underlying is multi-currency, this will be the notional currency of leg 1 of the swap
     * (Required)
     * 
     */
    @JsonProperty("NotionalCurrency")
    public void setNotionalCurrency(Derived.NotionalCurrency notionalCurrency) {
        this.notionalCurrency = notionalCurrency;
    }

    public Derived withNotionalCurrency(Derived.NotionalCurrency notionalCurrency) {
        this.notionalCurrency = notionalCurrency;
        return this;
    }

    /**
     * Expiry Date
     * <p>
     * Expiry date of the instrument (YYYY-MM-DD)
     * (Required)
     * 
     */
    @JsonProperty("ExpiryDate")
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Expiry Date
     * <p>
     * Expiry date of the instrument (YYYY-MM-DD)
     * (Required)
     * 
     */
    @JsonProperty("ExpiryDate")
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Derived withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Other Notional Currency
     * <p>
     * In the case of multi-currency or cross-currency swaps the currency in which leg 2 of the contract is denominated; For swaptions where the underlying swap is multi-currency, the currency in which leg 2 of the swap is denominated
     * (Required)
     * 
     */
    @JsonProperty("OtherNotionalCurrency")
    public Derived.OtherNotionalCurrency getOtherNotionalCurrency() {
        return otherNotionalCurrency;
    }

    /**
     * Other Notional Currency
     * <p>
     * In the case of multi-currency or cross-currency swaps the currency in which leg 2 of the contract is denominated; For swaptions where the underlying swap is multi-currency, the currency in which leg 2 of the swap is denominated
     * (Required)
     * 
     */
    @JsonProperty("OtherNotionalCurrency")
    public void setOtherNotionalCurrency(Derived.OtherNotionalCurrency otherNotionalCurrency) {
        this.otherNotionalCurrency = otherNotionalCurrency;
    }

    public Derived withOtherNotionalCurrency(Derived.OtherNotionalCurrency otherNotionalCurrency) {
        this.otherNotionalCurrency = otherNotionalCurrency;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullName", fullName).append("classificationType", classificationType).append("commodityDerivativeIndicator", commodityDerivativeIndicator).append("issuerorOperatoroftheTradingVenueIdentifier", issuerorOperatoroftheTradingVenueIdentifier).append("shortName", shortName).append("fXType", fXType).append("underlyingAssetType", underlyingAssetType).append("notionalCurrency", notionalCurrency).append("expiryDate", expiryDate).append("otherNotionalCurrency", otherNotionalCurrency).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notionalCurrency).append(expiryDate).append(issuerorOperatoroftheTradingVenueIdentifier).append(fXType).append(underlyingAssetType).append(fullName).append(classificationType).append(otherNotionalCurrency).append(commodityDerivativeIndicator).append(shortName).toHashCode();
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
        return new EqualsBuilder().append(notionalCurrency, rhs.notionalCurrency).append(expiryDate, rhs.expiryDate).append(issuerorOperatoroftheTradingVenueIdentifier, rhs.issuerorOperatoroftheTradingVenueIdentifier).append(fXType, rhs.fXType).append(underlyingAssetType, rhs.underlyingAssetType).append(fullName, rhs.fullName).append(classificationType, rhs.classificationType).append(otherNotionalCurrency, rhs.otherNotionalCurrency).append(commodityDerivativeIndicator, rhs.commodityDerivativeIndicator).append(shortName, rhs.shortName).isEquals();
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

    public enum NotionalCurrency {

        EUR("EUR"),
        GBP("GBP"),
        AUD("AUD"),
        NZD("NZD"),
        USD("USD"),
        CAD("CAD"),
        CHF("CHF"),
        JPY("JPY"),
        AED("AED"),
        AFN("AFN"),
        ALL("ALL"),
        AMD("AMD"),
        ANG("ANG"),
        AOA("AOA"),
        ARS("ARS"),
        AWG("AWG"),
        AZN("AZN"),
        BAM("BAM"),
        BBD("BBD"),
        BDT("BDT"),
        BGN("BGN"),
        BHD("BHD"),
        BIF("BIF"),
        BMD("BMD"),
        BND("BND"),
        BOB("BOB"),
        BOV("BOV"),
        BRL("BRL"),
        BSD("BSD"),
        BTN("BTN"),
        BWP("BWP"),
        BYN("BYN"),
        BYR("BYR"),
        BZD("BZD"),
        CDF("CDF"),
        CHE("CHE"),
        CHW("CHW"),
        CLF("CLF"),
        CLP("CLP"),
        CNY("CNY"),
        COP("COP"),
        COU("COU"),
        CRC("CRC"),
        CUC("CUC"),
        CUP("CUP"),
        CVE("CVE"),
        CZK("CZK"),
        DJF("DJF"),
        DKK("DKK"),
        DOP("DOP"),
        DZD("DZD"),
        EGP("EGP"),
        ERN("ERN"),
        ETB("ETB"),
        FJD("FJD"),
        FKP("FKP"),
        GEL("GEL"),
        GHS("GHS"),
        GIP("GIP"),
        GMD("GMD"),
        GNF("GNF"),
        GTQ("GTQ"),
        GYD("GYD"),
        HKD("HKD"),
        HNL("HNL"),
        HRK("HRK"),
        HTG("HTG"),
        HUF("HUF"),
        IDR("IDR"),
        ILS("ILS"),
        INR("INR"),
        IQD("IQD"),
        IRR("IRR"),
        ISK("ISK"),
        JMD("JMD"),
        JOD("JOD"),
        KES("KES"),
        KGS("KGS"),
        KHR("KHR"),
        KMF("KMF"),
        KPW("KPW"),
        KRW("KRW"),
        KWD("KWD"),
        KYD("KYD"),
        KZT("KZT"),
        LAK("LAK"),
        LBP("LBP"),
        LKR("LKR"),
        LRD("LRD"),
        LSL("LSL"),
        LYD("LYD"),
        MAD("MAD"),
        MDL("MDL"),
        MGA("MGA"),
        MKD("MKD"),
        MMK("MMK"),
        MNT("MNT"),
        MOP("MOP"),
        MRO("MRO"),
        MUR("MUR"),
        MVR("MVR"),
        MWK("MWK"),
        MXN("MXN"),
        MXV("MXV"),
        MYR("MYR"),
        MZN("MZN"),
        NAD("NAD"),
        NGN("NGN"),
        NIO("NIO"),
        NOK("NOK"),
        NPR("NPR"),
        OMR("OMR"),
        PAB("PAB"),
        PEN("PEN"),
        PGK("PGK"),
        PHP("PHP"),
        PKR("PKR"),
        PLN("PLN"),
        PYG("PYG"),
        QAR("QAR"),
        RON("RON"),
        RSD("RSD"),
        RUB("RUB"),
        RWF("RWF"),
        SAR("SAR"),
        SBD("SBD"),
        SCR("SCR"),
        SDG("SDG"),
        SEK("SEK"),
        SGD("SGD"),
        SHP("SHP"),
        SLL("SLL"),
        SOS("SOS"),
        SRD("SRD"),
        SSP("SSP"),
        STD("STD"),
        SVC("SVC"),
        SYP("SYP"),
        SZL("SZL"),
        THB("THB"),
        TJS("TJS"),
        TMT("TMT"),
        TND("TND"),
        TOP("TOP"),
        TRY("TRY"),
        TTD("TTD"),
        TWD("TWD"),
        TZS("TZS"),
        UAH("UAH"),
        UGX("UGX"),
        USN("USN"),
        UYI("UYI"),
        UYU("UYU"),
        UZS("UZS"),
        VEF("VEF"),
        VND("VND"),
        VUV("VUV"),
        WST("WST"),
        XAF("XAF"),
        XAG("XAG"),
        XAU("XAU"),
        XBA("XBA"),
        XBB("XBB"),
        XBC("XBC"),
        XBD("XBD"),
        XCD("XCD"),
        XDR("XDR"),
        XOF("XOF"),
        XPD("XPD"),
        XPF("XPF"),
        XPT("XPT"),
        XSU("XSU"),
        XTS("XTS"),
        XUA("XUA"),
        XXX("XXX"),
        YER("YER"),
        ZAR("ZAR"),
        ZMW("ZMW"),
        ZWL("ZWL");
        private final String value;
        private final static Map<String, Derived.NotionalCurrency> CONSTANTS = new HashMap<String, Derived.NotionalCurrency>();

        static {
            for (Derived.NotionalCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private NotionalCurrency(String value) {
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
        public static Derived.NotionalCurrency fromValue(String value) {
            Derived.NotionalCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherNotionalCurrency {

        EUR("EUR"),
        GBP("GBP"),
        AUD("AUD"),
        NZD("NZD"),
        USD("USD"),
        CAD("CAD"),
        CHF("CHF"),
        JPY("JPY"),
        AED("AED"),
        AFN("AFN"),
        ALL("ALL"),
        AMD("AMD"),
        ANG("ANG"),
        AOA("AOA"),
        ARS("ARS"),
        AWG("AWG"),
        AZN("AZN"),
        BAM("BAM"),
        BBD("BBD"),
        BDT("BDT"),
        BGN("BGN"),
        BHD("BHD"),
        BIF("BIF"),
        BMD("BMD"),
        BND("BND"),
        BOB("BOB"),
        BOV("BOV"),
        BRL("BRL"),
        BSD("BSD"),
        BTN("BTN"),
        BWP("BWP"),
        BYN("BYN"),
        BYR("BYR"),
        BZD("BZD"),
        CDF("CDF"),
        CHE("CHE"),
        CHW("CHW"),
        CLF("CLF"),
        CLP("CLP"),
        CNY("CNY"),
        COP("COP"),
        COU("COU"),
        CRC("CRC"),
        CUC("CUC"),
        CUP("CUP"),
        CVE("CVE"),
        CZK("CZK"),
        DJF("DJF"),
        DKK("DKK"),
        DOP("DOP"),
        DZD("DZD"),
        EGP("EGP"),
        ERN("ERN"),
        ETB("ETB"),
        FJD("FJD"),
        FKP("FKP"),
        GEL("GEL"),
        GHS("GHS"),
        GIP("GIP"),
        GMD("GMD"),
        GNF("GNF"),
        GTQ("GTQ"),
        GYD("GYD"),
        HKD("HKD"),
        HNL("HNL"),
        HRK("HRK"),
        HTG("HTG"),
        HUF("HUF"),
        IDR("IDR"),
        ILS("ILS"),
        INR("INR"),
        IQD("IQD"),
        IRR("IRR"),
        ISK("ISK"),
        JMD("JMD"),
        JOD("JOD"),
        KES("KES"),
        KGS("KGS"),
        KHR("KHR"),
        KMF("KMF"),
        KPW("KPW"),
        KRW("KRW"),
        KWD("KWD"),
        KYD("KYD"),
        KZT("KZT"),
        LAK("LAK"),
        LBP("LBP"),
        LKR("LKR"),
        LRD("LRD"),
        LSL("LSL"),
        LYD("LYD"),
        MAD("MAD"),
        MDL("MDL"),
        MGA("MGA"),
        MKD("MKD"),
        MMK("MMK"),
        MNT("MNT"),
        MOP("MOP"),
        MRO("MRO"),
        MUR("MUR"),
        MVR("MVR"),
        MWK("MWK"),
        MXN("MXN"),
        MXV("MXV"),
        MYR("MYR"),
        MZN("MZN"),
        NAD("NAD"),
        NGN("NGN"),
        NIO("NIO"),
        NOK("NOK"),
        NPR("NPR"),
        OMR("OMR"),
        PAB("PAB"),
        PEN("PEN"),
        PGK("PGK"),
        PHP("PHP"),
        PKR("PKR"),
        PLN("PLN"),
        PYG("PYG"),
        QAR("QAR"),
        RON("RON"),
        RSD("RSD"),
        RUB("RUB"),
        RWF("RWF"),
        SAR("SAR"),
        SBD("SBD"),
        SCR("SCR"),
        SDG("SDG"),
        SEK("SEK"),
        SGD("SGD"),
        SHP("SHP"),
        SLL("SLL"),
        SOS("SOS"),
        SRD("SRD"),
        SSP("SSP"),
        STD("STD"),
        SVC("SVC"),
        SYP("SYP"),
        SZL("SZL"),
        THB("THB"),
        TJS("TJS"),
        TMT("TMT"),
        TND("TND"),
        TOP("TOP"),
        TRY("TRY"),
        TTD("TTD"),
        TWD("TWD"),
        TZS("TZS"),
        UAH("UAH"),
        UGX("UGX"),
        USN("USN"),
        UYI("UYI"),
        UYU("UYU"),
        UZS("UZS"),
        VEF("VEF"),
        VND("VND"),
        VUV("VUV"),
        WST("WST"),
        XAF("XAF"),
        XAG("XAG"),
        XAU("XAU"),
        XBA("XBA"),
        XBB("XBB"),
        XBC("XBC"),
        XBD("XBD"),
        XCD("XCD"),
        XDR("XDR"),
        XOF("XOF"),
        XPD("XPD"),
        XPF("XPF"),
        XPT("XPT"),
        XSU("XSU"),
        XTS("XTS"),
        XUA("XUA"),
        XXX("XXX"),
        YER("YER"),
        ZAR("ZAR"),
        ZMW("ZMW"),
        ZWL("ZWL");
        private final String value;
        private final static Map<String, Derived.OtherNotionalCurrency> CONSTANTS = new HashMap<String, Derived.OtherNotionalCurrency>();

        static {
            for (Derived.OtherNotionalCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherNotionalCurrency(String value) {
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
        public static Derived.OtherNotionalCurrency fromValue(String value) {
            Derived.OtherNotionalCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
