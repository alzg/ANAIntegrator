
package Response.Foreign_Exchange.Option.Digital_Option.InstRefDataReporting.V1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.DecimalMin;
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "NotionalCurrency",
    "ExpiryDate",
    "OptionType",
    "OptionExerciseStyle",
    "ValuationMethodorTrigger",
    "OtherNotionalCurrency",
    "SettlementCurrency",
    "DeliveryType",
    "PriceMultiplier"
})
public class Attributes implements Serializable
{

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
    private Attributes.NotionalCurrency notionalCurrency;
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
     * Option Type
     * <p>
     * Indication as to whether the derivative contract is a call (right to purchase a specific underlying asset) or a put (right to sell a specific underlying asset) or whether it is a chooser (right to decide whether it is a call or put prior to the expiration date)
     * (Required)
     * 
     */
    @JsonProperty("OptionType")
    @JsonPropertyDescription("Indication as to whether the derivative contract is a call (right to purchase a specific underlying asset) or a put (right to sell a specific underlying asset) or whether it is a chooser (right to decide whether it is a call or put prior to the expiration date)")
    @NotNull
    private Attributes.OptionType optionType;
    /**
     * Option Exercise Style
     * <p>
     * Indicates when the option can be execercised. A Bermudan option can be execercised only on predetermined date; American option can be exercised at anytime prior to and including its expiry date; A European option can only be exercised at the expiry date
     * (Required)
     * 
     */
    @JsonProperty("OptionExerciseStyle")
    @JsonPropertyDescription("Indicates when the option can be execercised. A Bermudan option can be execercised only on predetermined date; American option can be exercised at anytime prior to and including its expiry date; A European option can only be exercised at the expiry date")
    @NotNull
    private Attributes.OptionExerciseStyle optionExerciseStyle;
    /**
     * Valuation Method or Trigger
     * <p>
     * The Valuation method or trigger as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("ValuationMethodorTrigger")
    @JsonPropertyDescription("The Valuation method or trigger as defined by CFI code: ISO 10962 (2015)")
    @NotNull
    private Attributes.ValuationMethodorTrigger valuationMethodorTrigger;
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
    private Attributes.OtherNotionalCurrency otherNotionalCurrency;
    /**
     * Settlement Currency
     * <p>
     * Settlement Currency
     * (Required)
     * 
     */
    @JsonProperty("SettlementCurrency")
    @JsonPropertyDescription("Settlement Currency")
    @NotNull
    private Attributes.SettlementCurrency settlementCurrency;
    /**
     * Delivery Type
     * <p>
     * The Delivery Type as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("DeliveryType")
    @JsonPropertyDescription("The Delivery Type as defined by CFI code: ISO 10962 (2015)")
    @NotNull
    private Attributes.DeliveryType deliveryType = Attributes.DeliveryType.fromValue("CASH");
    /**
     * Price Multiplier
     * <p>
     * Number of units of the underlying instrument represented by a single derivative contract. Number of units of the underlying instrument represented by a single derivative contract. For an option on an index, the amount per index point. For spreadbets the movement in the price of the underlying instrument on which the spreadbet is based
     * (Required)
     * 
     */
    @JsonProperty("PriceMultiplier")
    @JsonPropertyDescription("Number of units of the underlying instrument represented by a single derivative contract. Number of units of the underlying instrument represented by a single derivative contract. For an option on an index, the amount per index point. For spreadbets the movement in the price of the underlying instrument on which the spreadbet is based")
    @DecimalMin("0")
    @NotNull
    private Double priceMultiplier = 1.0D;
    private final static long serialVersionUID = -9033401504846038626L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param notionalCurrency
     * @param expiryDate
     * @param optionType
     * @param optionExerciseStyle
     * @param settlementCurrency
     * @param deliveryType
     * @param otherNotionalCurrency
     * @param valuationMethodorTrigger
     * @param priceMultiplier
     */
    public Attributes(Attributes.NotionalCurrency notionalCurrency, String expiryDate, Attributes.OptionType optionType, Attributes.OptionExerciseStyle optionExerciseStyle, Attributes.ValuationMethodorTrigger valuationMethodorTrigger, Attributes.OtherNotionalCurrency otherNotionalCurrency, Attributes.SettlementCurrency settlementCurrency, Attributes.DeliveryType deliveryType, Double priceMultiplier) {
        super();
        this.notionalCurrency = notionalCurrency;
        this.expiryDate = expiryDate;
        this.optionType = optionType;
        this.optionExerciseStyle = optionExerciseStyle;
        this.valuationMethodorTrigger = valuationMethodorTrigger;
        this.otherNotionalCurrency = otherNotionalCurrency;
        this.settlementCurrency = settlementCurrency;
        this.deliveryType = deliveryType;
        this.priceMultiplier = priceMultiplier;
    }

    /**
     * Notional Currency
     * <p>
     * Currency in which the notional is denominated. Usage: Within MiFIR, in the case of an interest rate or currency derivative contract, this will be the notional currency of leg 1 or the currency 1 of the pair. Within MiFIR, in the case of swaptions where the underlying swap is single-currency, this will be the notional currency of the underlying swap. For swaptions where the underlying is multi-currency, this will be the notional currency of leg 1 of the swap
     * (Required)
     * 
     */
    @JsonProperty("NotionalCurrency")
    public Attributes.NotionalCurrency getNotionalCurrency() {
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
    public void setNotionalCurrency(Attributes.NotionalCurrency notionalCurrency) {
        this.notionalCurrency = notionalCurrency;
    }

    public Attributes withNotionalCurrency(Attributes.NotionalCurrency notionalCurrency) {
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

    public Attributes withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Option Type
     * <p>
     * Indication as to whether the derivative contract is a call (right to purchase a specific underlying asset) or a put (right to sell a specific underlying asset) or whether it is a chooser (right to decide whether it is a call or put prior to the expiration date)
     * (Required)
     * 
     */
    @JsonProperty("OptionType")
    public Attributes.OptionType getOptionType() {
        return optionType;
    }

    /**
     * Option Type
     * <p>
     * Indication as to whether the derivative contract is a call (right to purchase a specific underlying asset) or a put (right to sell a specific underlying asset) or whether it is a chooser (right to decide whether it is a call or put prior to the expiration date)
     * (Required)
     * 
     */
    @JsonProperty("OptionType")
    public void setOptionType(Attributes.OptionType optionType) {
        this.optionType = optionType;
    }

    public Attributes withOptionType(Attributes.OptionType optionType) {
        this.optionType = optionType;
        return this;
    }

    /**
     * Option Exercise Style
     * <p>
     * Indicates when the option can be execercised. A Bermudan option can be execercised only on predetermined date; American option can be exercised at anytime prior to and including its expiry date; A European option can only be exercised at the expiry date
     * (Required)
     * 
     */
    @JsonProperty("OptionExerciseStyle")
    public Attributes.OptionExerciseStyle getOptionExerciseStyle() {
        return optionExerciseStyle;
    }

    /**
     * Option Exercise Style
     * <p>
     * Indicates when the option can be execercised. A Bermudan option can be execercised only on predetermined date; American option can be exercised at anytime prior to and including its expiry date; A European option can only be exercised at the expiry date
     * (Required)
     * 
     */
    @JsonProperty("OptionExerciseStyle")
    public void setOptionExerciseStyle(Attributes.OptionExerciseStyle optionExerciseStyle) {
        this.optionExerciseStyle = optionExerciseStyle;
    }

    public Attributes withOptionExerciseStyle(Attributes.OptionExerciseStyle optionExerciseStyle) {
        this.optionExerciseStyle = optionExerciseStyle;
        return this;
    }

    /**
     * Valuation Method or Trigger
     * <p>
     * The Valuation method or trigger as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("ValuationMethodorTrigger")
    public Attributes.ValuationMethodorTrigger getValuationMethodorTrigger() {
        return valuationMethodorTrigger;
    }

    /**
     * Valuation Method or Trigger
     * <p>
     * The Valuation method or trigger as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("ValuationMethodorTrigger")
    public void setValuationMethodorTrigger(Attributes.ValuationMethodorTrigger valuationMethodorTrigger) {
        this.valuationMethodorTrigger = valuationMethodorTrigger;
    }

    public Attributes withValuationMethodorTrigger(Attributes.ValuationMethodorTrigger valuationMethodorTrigger) {
        this.valuationMethodorTrigger = valuationMethodorTrigger;
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
    public Attributes.OtherNotionalCurrency getOtherNotionalCurrency() {
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
    public void setOtherNotionalCurrency(Attributes.OtherNotionalCurrency otherNotionalCurrency) {
        this.otherNotionalCurrency = otherNotionalCurrency;
    }

    public Attributes withOtherNotionalCurrency(Attributes.OtherNotionalCurrency otherNotionalCurrency) {
        this.otherNotionalCurrency = otherNotionalCurrency;
        return this;
    }

    /**
     * Settlement Currency
     * <p>
     * Settlement Currency
     * (Required)
     * 
     */
    @JsonProperty("SettlementCurrency")
    public Attributes.SettlementCurrency getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Settlement Currency
     * <p>
     * Settlement Currency
     * (Required)
     * 
     */
    @JsonProperty("SettlementCurrency")
    public void setSettlementCurrency(Attributes.SettlementCurrency settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public Attributes withSettlementCurrency(Attributes.SettlementCurrency settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
        return this;
    }

    /**
     * Delivery Type
     * <p>
     * The Delivery Type as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("DeliveryType")
    public Attributes.DeliveryType getDeliveryType() {
        return deliveryType;
    }

    /**
     * Delivery Type
     * <p>
     * The Delivery Type as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("DeliveryType")
    public void setDeliveryType(Attributes.DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }

    public Attributes withDeliveryType(Attributes.DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }

    /**
     * Price Multiplier
     * <p>
     * Number of units of the underlying instrument represented by a single derivative contract. Number of units of the underlying instrument represented by a single derivative contract. For an option on an index, the amount per index point. For spreadbets the movement in the price of the underlying instrument on which the spreadbet is based
     * (Required)
     * 
     */
    @JsonProperty("PriceMultiplier")
    public Double getPriceMultiplier() {
        return priceMultiplier;
    }

    /**
     * Price Multiplier
     * <p>
     * Number of units of the underlying instrument represented by a single derivative contract. Number of units of the underlying instrument represented by a single derivative contract. For an option on an index, the amount per index point. For spreadbets the movement in the price of the underlying instrument on which the spreadbet is based
     * (Required)
     * 
     */
    @JsonProperty("PriceMultiplier")
    public void setPriceMultiplier(Double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public Attributes withPriceMultiplier(Double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notionalCurrency", notionalCurrency).append("expiryDate", expiryDate).append("optionType", optionType).append("optionExerciseStyle", optionExerciseStyle).append("valuationMethodorTrigger", valuationMethodorTrigger).append("otherNotionalCurrency", otherNotionalCurrency).append("settlementCurrency", settlementCurrency).append("deliveryType", deliveryType).append("priceMultiplier", priceMultiplier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notionalCurrency).append(expiryDate).append(optionType).append(optionExerciseStyle).append(settlementCurrency).append(deliveryType).append(otherNotionalCurrency).append(valuationMethodorTrigger).append(priceMultiplier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Attributes) == false) {
            return false;
        }
        Attributes rhs = ((Attributes) other);
        return new EqualsBuilder().append(notionalCurrency, rhs.notionalCurrency).append(expiryDate, rhs.expiryDate).append(optionType, rhs.optionType).append(optionExerciseStyle, rhs.optionExerciseStyle).append(settlementCurrency, rhs.settlementCurrency).append(deliveryType, rhs.deliveryType).append(otherNotionalCurrency, rhs.otherNotionalCurrency).append(valuationMethodorTrigger, rhs.valuationMethodorTrigger).append(priceMultiplier, rhs.priceMultiplier).isEquals();
    }

    public enum DeliveryType {

        CASH("CASH"),
        PHYS("PHYS"),
        OPTL("OPTL");
        private final String value;
        private final static Map<String, Attributes.DeliveryType> CONSTANTS = new HashMap<String, Attributes.DeliveryType>();

        static {
            for (Attributes.DeliveryType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DeliveryType(String value) {
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
        public static Attributes.DeliveryType fromValue(String value) {
            Attributes.DeliveryType constant = CONSTANTS.get(value);
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
        private final static Map<String, Attributes.NotionalCurrency> CONSTANTS = new HashMap<String, Attributes.NotionalCurrency>();

        static {
            for (Attributes.NotionalCurrency c: values()) {
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
        public static Attributes.NotionalCurrency fromValue(String value) {
            Attributes.NotionalCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OptionExerciseStyle {

        AMER("AMER"),
        BERM("BERM"),
        EURO("EURO");
        private final String value;
        private final static Map<String, Attributes.OptionExerciseStyle> CONSTANTS = new HashMap<String, Attributes.OptionExerciseStyle>();

        static {
            for (Attributes.OptionExerciseStyle c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OptionExerciseStyle(String value) {
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
        public static Attributes.OptionExerciseStyle fromValue(String value) {
            Attributes.OptionExerciseStyle constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OptionType {

        CALL("CALL"),
        PUTO("PUTO"),
        OPTL("OPTL");
        private final String value;
        private final static Map<String, Attributes.OptionType> CONSTANTS = new HashMap<String, Attributes.OptionType>();

        static {
            for (Attributes.OptionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OptionType(String value) {
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
        public static Attributes.OptionType fromValue(String value) {
            Attributes.OptionType constant = CONSTANTS.get(value);
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
        private final static Map<String, Attributes.OtherNotionalCurrency> CONSTANTS = new HashMap<String, Attributes.OtherNotionalCurrency>();

        static {
            for (Attributes.OtherNotionalCurrency c: values()) {
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
        public static Attributes.OtherNotionalCurrency fromValue(String value) {
            Attributes.OtherNotionalCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SettlementCurrency {

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
        private final static Map<String, Attributes.SettlementCurrency> CONSTANTS = new HashMap<String, Attributes.SettlementCurrency>();

        static {
            for (Attributes.SettlementCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SettlementCurrency(String value) {
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
        public static Attributes.SettlementCurrency fromValue(String value) {
            Attributes.SettlementCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ValuationMethodorTrigger {

        DIGITAL_BINARY("Digital (Binary)"),
        DIGITAL_BARRIER("Digital Barrier");
        private final String value;
        private final static Map<String, Attributes.ValuationMethodorTrigger> CONSTANTS = new HashMap<String, Attributes.ValuationMethodorTrigger>();

        static {
            for (Attributes.ValuationMethodorTrigger c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ValuationMethodorTrigger(String value) {
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
        public static Attributes.ValuationMethodorTrigger fromValue(String value) {
            Attributes.ValuationMethodorTrigger constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
