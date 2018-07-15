
package Response.Commodities.Swap.Swap.InstRefDataReporting.V1;

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
    "ReturnorPayoutTrigger",
    "DeliveryType",
    "BaseProduct",
    "SubProduct",
    "AdditionalSubProduct",
    "TransactionType",
    "FinalPriceType",
    "ReferenceRate",
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
     * Return or Payout Trigger
     * <p>
     * The Return or payout Trigger as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("ReturnorPayoutTrigger")
    @JsonPropertyDescription("The Return or payout Trigger as defined by CFI code: ISO 10962 (2015)")
    @NotNull
    private Attributes.ReturnorPayoutTrigger returnorPayoutTrigger;
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
    private Attributes.DeliveryType deliveryType;
    /**
     * Base Product
     * <p>
     * Base product taxonomy of commodity product
     * (Required)
     * 
     */
    @JsonProperty("BaseProduct")
    @JsonPropertyDescription("Base product taxonomy of commodity product")
    @NotNull
    private String baseProduct;
    /**
     * Sub Product
     * <p>
     * Sub product taxonomy of commodity product
     * (Required)
     * 
     */
    @JsonProperty("SubProduct")
    @JsonPropertyDescription("Sub product taxonomy of commodity product")
    @NotNull
    private String subProduct;
    /**
     * Additional Sub Product
     * <p>
     * Additional Sub Product
     * (Required)
     * 
     */
    @JsonProperty("AdditionalSubProduct")
    @JsonPropertyDescription("Additional Sub Product")
    @NotNull
    private String additionalSubProduct;
    /**
     * Transaction Type
     * <p>
     * Transaction type as specified by the trading venue
     * (Required)
     * 
     */
    @JsonProperty("TransactionType")
    @JsonPropertyDescription("Transaction type as specified by the trading venue")
    @NotNull
    private Attributes.TransactionType transactionType;
    /**
     * Final Price Type
     * <p>
     * Final price type as specified by the trading venue
     * (Required)
     * 
     */
    @JsonProperty("FinalPriceType")
    @JsonPropertyDescription("Final price type as specified by the trading venue")
    @NotNull
    private Attributes.FinalPriceType finalPriceType;
    /**
     * Reference Rate
     * <p>
     * Identifies the reference index for the instrument
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRate")
    @JsonPropertyDescription("Identifies the reference index for the instrument")
    @NotNull
    private Attributes.ReferenceRate referenceRate;
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
    private final static long serialVersionUID = -9113861841164799889L;

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
     * @param transactionType
     * @param referenceRate
     * @param subProduct
     * @param returnorPayoutTrigger
     * @param additionalSubProduct
     * @param baseProduct
     * @param deliveryType
     * @param priceMultiplier
     * @param finalPriceType
     */
    public Attributes(Attributes.NotionalCurrency notionalCurrency, String expiryDate, Attributes.ReturnorPayoutTrigger returnorPayoutTrigger, Attributes.DeliveryType deliveryType, String baseProduct, String subProduct, String additionalSubProduct, Attributes.TransactionType transactionType, Attributes.FinalPriceType finalPriceType, Attributes.ReferenceRate referenceRate, Double priceMultiplier) {
        super();
        this.notionalCurrency = notionalCurrency;
        this.expiryDate = expiryDate;
        this.returnorPayoutTrigger = returnorPayoutTrigger;
        this.deliveryType = deliveryType;
        this.baseProduct = baseProduct;
        this.subProduct = subProduct;
        this.additionalSubProduct = additionalSubProduct;
        this.transactionType = transactionType;
        this.finalPriceType = finalPriceType;
        this.referenceRate = referenceRate;
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
     * Return or Payout Trigger
     * <p>
     * The Return or payout Trigger as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("ReturnorPayoutTrigger")
    public Attributes.ReturnorPayoutTrigger getReturnorPayoutTrigger() {
        return returnorPayoutTrigger;
    }

    /**
     * Return or Payout Trigger
     * <p>
     * The Return or payout Trigger as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("ReturnorPayoutTrigger")
    public void setReturnorPayoutTrigger(Attributes.ReturnorPayoutTrigger returnorPayoutTrigger) {
        this.returnorPayoutTrigger = returnorPayoutTrigger;
    }

    public Attributes withReturnorPayoutTrigger(Attributes.ReturnorPayoutTrigger returnorPayoutTrigger) {
        this.returnorPayoutTrigger = returnorPayoutTrigger;
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
     * Base Product
     * <p>
     * Base product taxonomy of commodity product
     * (Required)
     * 
     */
    @JsonProperty("BaseProduct")
    public String getBaseProduct() {
        return baseProduct;
    }

    /**
     * Base Product
     * <p>
     * Base product taxonomy of commodity product
     * (Required)
     * 
     */
    @JsonProperty("BaseProduct")
    public void setBaseProduct(String baseProduct) {
        this.baseProduct = baseProduct;
    }

    public Attributes withBaseProduct(String baseProduct) {
        this.baseProduct = baseProduct;
        return this;
    }

    /**
     * Sub Product
     * <p>
     * Sub product taxonomy of commodity product
     * (Required)
     * 
     */
    @JsonProperty("SubProduct")
    public String getSubProduct() {
        return subProduct;
    }

    /**
     * Sub Product
     * <p>
     * Sub product taxonomy of commodity product
     * (Required)
     * 
     */
    @JsonProperty("SubProduct")
    public void setSubProduct(String subProduct) {
        this.subProduct = subProduct;
    }

    public Attributes withSubProduct(String subProduct) {
        this.subProduct = subProduct;
        return this;
    }

    /**
     * Additional Sub Product
     * <p>
     * Additional Sub Product
     * (Required)
     * 
     */
    @JsonProperty("AdditionalSubProduct")
    public String getAdditionalSubProduct() {
        return additionalSubProduct;
    }

    /**
     * Additional Sub Product
     * <p>
     * Additional Sub Product
     * (Required)
     * 
     */
    @JsonProperty("AdditionalSubProduct")
    public void setAdditionalSubProduct(String additionalSubProduct) {
        this.additionalSubProduct = additionalSubProduct;
    }

    public Attributes withAdditionalSubProduct(String additionalSubProduct) {
        this.additionalSubProduct = additionalSubProduct;
        return this;
    }

    /**
     * Transaction Type
     * <p>
     * Transaction type as specified by the trading venue
     * (Required)
     * 
     */
    @JsonProperty("TransactionType")
    public Attributes.TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Transaction Type
     * <p>
     * Transaction type as specified by the trading venue
     * (Required)
     * 
     */
    @JsonProperty("TransactionType")
    public void setTransactionType(Attributes.TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Attributes withTransactionType(Attributes.TransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    /**
     * Final Price Type
     * <p>
     * Final price type as specified by the trading venue
     * (Required)
     * 
     */
    @JsonProperty("FinalPriceType")
    public Attributes.FinalPriceType getFinalPriceType() {
        return finalPriceType;
    }

    /**
     * Final Price Type
     * <p>
     * Final price type as specified by the trading venue
     * (Required)
     * 
     */
    @JsonProperty("FinalPriceType")
    public void setFinalPriceType(Attributes.FinalPriceType finalPriceType) {
        this.finalPriceType = finalPriceType;
    }

    public Attributes withFinalPriceType(Attributes.FinalPriceType finalPriceType) {
        this.finalPriceType = finalPriceType;
        return this;
    }

    /**
     * Reference Rate
     * <p>
     * Identifies the reference index for the instrument
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRate")
    public Attributes.ReferenceRate getReferenceRate() {
        return referenceRate;
    }

    /**
     * Reference Rate
     * <p>
     * Identifies the reference index for the instrument
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRate")
    public void setReferenceRate(Attributes.ReferenceRate referenceRate) {
        this.referenceRate = referenceRate;
    }

    public Attributes withReferenceRate(Attributes.ReferenceRate referenceRate) {
        this.referenceRate = referenceRate;
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
        return new ToStringBuilder(this).append("notionalCurrency", notionalCurrency).append("expiryDate", expiryDate).append("returnorPayoutTrigger", returnorPayoutTrigger).append("deliveryType", deliveryType).append("baseProduct", baseProduct).append("subProduct", subProduct).append("additionalSubProduct", additionalSubProduct).append("transactionType", transactionType).append("finalPriceType", finalPriceType).append("referenceRate", referenceRate).append("priceMultiplier", priceMultiplier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notionalCurrency).append(expiryDate).append(transactionType).append(referenceRate).append(subProduct).append(returnorPayoutTrigger).append(additionalSubProduct).append(baseProduct).append(deliveryType).append(priceMultiplier).append(finalPriceType).toHashCode();
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
        return new EqualsBuilder().append(notionalCurrency, rhs.notionalCurrency).append(expiryDate, rhs.expiryDate).append(transactionType, rhs.transactionType).append(referenceRate, rhs.referenceRate).append(subProduct, rhs.subProduct).append(returnorPayoutTrigger, rhs.returnorPayoutTrigger).append(additionalSubProduct, rhs.additionalSubProduct).append(baseProduct, rhs.baseProduct).append(deliveryType, rhs.deliveryType).append(priceMultiplier, rhs.priceMultiplier).append(finalPriceType, rhs.finalPriceType).isEquals();
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

    public enum FinalPriceType {

        ARGM("ARGM"),
        BLTC("BLTC"),
        EXOF("EXOF"),
        GBCL("GBCL"),
        IHSM("IHSM"),
        PLAT("PLAT"),
        OTHR("OTHR");
        private final String value;
        private final static Map<String, Attributes.FinalPriceType> CONSTANTS = new HashMap<String, Attributes.FinalPriceType>();

        static {
            for (Attributes.FinalPriceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private FinalPriceType(String value) {
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
        public static Attributes.FinalPriceType fromValue(String value) {
            Attributes.FinalPriceType constant = CONSTANTS.get(value);
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

    public enum ReferenceRate {

        A_FUEL_OIL_0_1_S_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("A Fuel oil 0.1%S -waterborne spot Tokyo bay rim intelligence products"),
        A_FUEL_OIL_1_0_S_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("A Fuel oil 1.0%S -waterborne spot Tokyo bay rim intelligence products"),
        ALUMINIUM_ALLOY_LME_15_MONTH("ALUMINIUM ALLOY-LME 15 MONTH"),
        ALUMINIUM_ALLOY_LME_27_MONTH("ALUMINIUM ALLOY-LME 27 MONTH"),
        ALUMINIUM_ALLOY_LME_3_MONTH("ALUMINIUM ALLOY-LME 3 MONTH"),
        ALUMINIUM_ALLOY_LME_CASH("ALUMINIUM ALLOY-LME CASH"),
        ALUMINIUM_ALLOY_MW_A_380_PLATTS_METALS_ALERT("ALUMINIUM ALLOY-MW A-380-PLATTS METALS ALERT"),
        ALUMINIUM_ALLOY_MW_319_PLATTS_METALS_ALERT("ALUMINIUM ALLOY-MW-319-PLATTS METALS ALERT"),
        ALUMINIUM_ALLOY_MW_356_PLATTS_METALS_ALERT("ALUMINIUM ALLOY-MW-356-PLATTS METALS ALERT"),
        ALUMINIUM_LME_15_MONTH("ALUMINIUM-LME 15 MONTH"),
        ALUMINIUM_LME_27_MONTH("ALUMINIUM-LME 27 MONTH"),
        ALUMINIUM_LME_3_MONTH("ALUMINIUM-LME 3 MONTH"),
        ALUMINIUM_LME_CASH("ALUMINIUM-LME CASH"),
        ALUMINIUM_MIDWEST_PLATTS_METALS_ALERT("ALUMINIUM-MIDWEST-PLATTS METALS ALERT"),
        ALUMINIUM_TOCOM("ALUMINIUM-TOCOM"),
        ALUMINUM_COMEX("ALUMINUM-COMEX"),
        AMMONIA_CFR_TAMPA_FMB("AMMONIA - CFR TAMPA - FMB"),
        AMMONIA_FOB_US_GULF_BARGE_FMB("AMMONIA - FOB US GULF BARGE - FMB"),
        AMMONIA_FOB_YUZHNY_FMB("AMMONIA - FOB YUZHNY - FMB"),
        ARABIAN_LIGHT_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("ARABIAN LIGHT FOB ARA CRACK NETBACK-PLATTS MARKETWIRE"),
        AZUKI_BEANS_TGE("AZUKI BEANS-TGE"),
        BARLEY_ICE("BARLEY-ICE"),
        BENZENE_IN_EUROPE_CONTRACT_FOB_NEW("Benzene in Europe Contract (FOB NEW)"),
        BENZENE_CONTRACT_BENZENE_FOB_USGC_GAL_GALLON_B_D("BENZENE-CONTRACT BENZENE (FOB USGC/GAL)-GALLON-B&D"),
        BENZENE_CONTRACT_BENZENE_FOB_USGC_GAL_TON_B_D("BENZENE-CONTRACT BENZENE (FOB USGC/GAL)-TON-B&D"),
        BENZENE_CONTRACT_BENZENE_GALLON_CMAI("BENZENE-CONTRACT BENZENE-GALLON-CMAI"),
        BENZENE_CONTRACT_BENZENE_TON_CMAI("BENZENE-CONTRACT BENZENE-TON-CMAI"),
        BENZENE_SPOT_BENZENE_USGC_GAL_GALLON_B_D("BENZENE-SPOT BENZENE (USGC/GAL)-GALLON-B&D"),
        BENZENE_SPOT_BENZENE_USGC_GAL_TON_B_D("BENZENE-SPOT BENZENE (USGC/GAL)-TON-B&D"),
        BENZENE_SPOT_BENZENE_GALLON_CMAI("BENZENE-SPOT BENZENE-GALLON-CMAI"),
        BENZENE_SPOT_BENZENE_TON_CMAI("BENZENE-SPOT BENZENE-TON-CMAI"),
        BIODIESEL_FAME_0_C_CFPP_ROTTERDAM_QUARTER_ARGUS_BIOFUELS("BIODIESEL-FAME 0C CFPP ROTTERDAM QUARTER-ARGUS BIOFUELS"),
        BIODIESEL_FAME_0_C_CFPP_ROTTERDAM_ARGUS_BIOFUELS("BIODIESEL-FAME 0C CFPP ROTTERDAM-ARGUS BIOFUELS"),
        BIODIESEL_FAME_0_C_CFPP_T_1_CIF_ROTTERDAM_ARGUS_BIOFUELS("BIODIESEL-FAME 0C CFPP T1 CIF ROTTERDAM-ARGUS BIOFUELS"),
        BIODIESEL_PALM_OME_ROTTERDAM_ARGUS_BIOFUELS("BIODIESEL-PALM OME ROTTERDAM-ARGUS BIOFUELS"),
        BIODIESEL_RAPESEED_OME_ROTTERDAM_ARGUS_BIOFUELS("BIODIESEL-RAPESEED OME ROTTERDAM-ARGUS BIOFUELS"),
        BIODIESEL_SOYA_OME_ROTTERDAM_ARGUS_BIOFUELS("BIODIESEL-SOYA OME ROTTERDAM-ARGUS BIOFUELS"),
        BLEACHED_KRAFT_FLUFF_EUROPE_RISI("BLEACHED KRAFT FLUFF EUROPE RISI"),
        BRASS_BLEND_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("BRASS BLEND FOB ARA CRACK NETBACK-PLATTS MARKETWIRE"),
        BRENT_BFOEOIL_BRENT_BFOE_ICE("BRENT/BFOEOIL-BRENT/BFOE-ICE"),
        BROAD_WOOL_23_MICRON_SFE("BROAD WOOL (23 MICRON)-SFE"),
        BUTTER_FUTURE_CME("Butter Future  CME"),
        C_FUEL_OIL_0_3_S_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("C Fuel oil 0.3%S -waterborne spot Tokyo bay rim intelligence products"),
        C_FUEL_OIL_3_S_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("C Fuel oil 3.%S -waterborne spot Tokyo bay rim intelligence products"),
        CANOLA_ICE("CANOLA-ICE"),
        CHICAGO_ETHANOL_PLATTS("CHICAGO ETHANOL - PLATTS"),
        CLEAN_FUELS_SPOT_METHANOL_GALLON_FOB_U_S_GULF_CMAI_WEEKLY_MMR("CLEAN FUELS-SPOT METHANOL (GALLON) FOB U.S. GULF-CMAI WEEKLY MMR"),
        CLEAN_FUELS_SPOT_METHANOL_TON_FOB_U_S_GULF_CMAI_WEEKLY_MMR("CLEAN FUELS-SPOT METHANOL (TON) FOB U.S. GULF-CMAI WEEKLY MMR"),
        COAL_API_8_MONTHLY_ARGUS_MCCLOSKEY_S("COAL - API 8- MONTHLY-ARGUS/MCCLOSKEY'S"),
        COAL_API_8_WEEKLY_ARGUS_MCCLOSKEY_S("COAL - API 8- WEEKLY-ARGUS/MCCLOSKEY'S"),
        COAL_API_2_WEEKLY_ARGUS_MCCLOSKEY_S("COAL-API 2 - WEEKLY- ARGUS/MCCLOSKEY'S"),
        COAL_API_2_MONTHLY_ARGUS_MCCLOSKEY_S("COAL-API 2-MONTHLY - ARGUS/MCCLOSKEY'S"),
        COAL_API_4_WEEKLY_ARGUS_MCCLOSKEY_S("COAL-API 4 WEEKLY-ARGUS/MCCLOSKEY'S"),
        COAL_API_4_MONTHLY_ARGUS_MCCLOSKEY_S("COAL-API 4- MONTHLY- ARGUS/MCCLOSKEY'S"),
        COAL_API_6_MONTHLY_ARGUS_MCCLOSKEY_S("COAL-API 6 MONTHLY-ARGUS/MCCLOSKEY'S"),
        COAL_API_6_WEEKLY_ARGUS_MCCLOSKEY_S("COAL-API 6 WEEKLY-ARGUS/MCCLOSKEY'S"),
        COAL_ARA_EEX("COAL-ARA-EEX"),
        COAL_ARA_GLOBALCOALTM("COAL-ARA-GLOBALCOALTM"),
        COAL_CENTRAL_APPALACHIAN_NYMEX("COAL-CENTRAL APPALACHIAN-NYMEX"),
        COAL_CIF_ARA_CIM_PLATTS("COAL-CIF ARA CIM-PLATTS"),
        COAL_NEWCASTLE_GLOBALCOALTM("COAL-NEWCASTLE-GLOBALCOALTM"),
        COAL_RICHARDS_BAY_EEX("COAL-RICHARDS BAY-EEX"),
        COAL_RICHARDS_BAY_GLOBALCOALTM("COAL-RICHARDS BAY-GLOBALCOALTM"),
        COAL_RICHARDS_BAY_ICE("COAL-RICHARDS BAY-ICE"),
        COAL_ROTTERDAM_ICE("COAL-ROTTERDAM-ICE"),
        COBALT_LME_3_MONTH("COBALT - LME - 3 MONTH"),
        COBALT_LME_CASH("COBALT - LME - CASH"),
        COBALT_HIGH_GRADE_METAL_BULLETIN("COBALT HIGH GRADE: Metal Bulletin:"),
        COBALT_LOW_GRADE_METAL_BULLETIN("COBALT LOW GRADE: Metal Bulletin:"),
        COBALT_LME_15_MONTH("COBALT-LME 15 month"),
        COBALT_LME_3_MONTH_("COBALT-LME 3 month"),
        COCOA_ICE("COCOA-ICE"),
        COCOA_NYSE_LIFFE("COCOA-NYSE Liffe"),
        COFFEE_ARABICA_BM_F("COFFEE ARABICA-BM&F"),
        COFFEE_ARABICA_ICE("COFFEE ARABICA-ICE"),
        COFFEE_ROBUSTA_NYSE_LIFFE("COFFEE ROBUSTA-NYSE Liffe"),
        COKING_COAL_ARGUS_FOB_AUSTRALIA_ARGUS_COAL_DAILY_INTERNATIONAL("COKING COAL-ARGUS- FOB AUSTRALIA-ARGUS COAL DAILY INTERNATIONAL"),
        CONTAINERBOARD_26_LB_CORRUGATING_MEDIUM_SEMICHEMICAL_EAST_LIST_PPW("CONTAINERBOARD 26LB CORRUGATING MEDIUM SEMICHEMICAL EAST (LIST) PPW"),
        CONTAINERBOARD_26_LB_SEMICHEMICAL_MEDIUM_EASTERN_U_S_LIST_PPM("CONTAINERBOARD 26LB SEMICHEMICAL MEDIUM EASTERN U.S. (LIST) PPM"),
        CONTAINERBOARD_42_LB_LINERBOARD_UNBLEACHED_KRAFT_EAST_LIST_PPW("CONTAINERBOARD 42LB LINERBOARD UNBLEACHED KRAFT EAST (LIST) PPW"),
        CONTAINERBOARD_42_LB_UNBLEACHED_KRAFT_LINERBOARD_EASTERN_U_S_LIST_PPM("CONTAINERBOARD 42LB UNBLEACHED KRAFT LINERBOARD EASTERN U.S. (LIST) PPM"),
        COPPER_COMEX_SAFEX("COPPER-COMEX-SAFEX"),
        COPPER_COMEX("COPPER-COMEX"),
        COPPER_LME_15_MONTH("COPPER-LME 15 MONTH"),
        COPPER_LME_27_MONTH("COPPER-LME 27 MONTH"),
        COPPER_LME_3_MONTH("COPPER-LME 3 MONTH"),
        COPPER_LME_CASH("COPPER-LME CASH"),
        CORN_CBOT_SAFEX("CORN-CBOT-SAFEX"),
        CORN_CBOT("CORN-CBOT"),
        CORN_NYSE_LIFFE("CORN-NYSE Liffe"),
        COTTON_NO_2_ICE("COTTON NO. 2-ICE"),
        CRUDE_PALM_OIL_MDEX("CRUDE PALM OIL - MDEX,"),
        CRUDE_PALM_OIL_FCPO_MALAYSIA_BURSA_MALAYSIA("CRUDE PALM OIL (FCPO) - MALAYSIA - BURSA MALAYSIA"),
        DAIRY_MILK_NZX("DAIRY - MILK - NZX,"),
        DAP_FOB_TAMPA_FERTILIZER_INDEX("DAP fob Tampa-Fertilizer Index"),
        DAP_CENTRAL_FLORIDA_FMB("DAP- CENTRAL FLORIDA - FMB"),
        DAP_US_GULF_DOMESTIC_FMB("DAP- US GULF DOMESTIC - FMB"),
        DAP_FERTILIZER_INDEX("DAP-FERTILIZER INDEX"),
        DAP_FOB_US_GULF_FMB("DAP-FOB US GULF - FMB"),
        DIESEL_FUEL_GULF_COAST_LOW_SULFUR_PIPELINE_PLATTS_U_S("DIESEL FUEL-GULF COAST LOW SULFUR (PIPELINE)-PLATTS U.S."),
        DIESEL_FUEL_GULF_COAST_LOW_SULFUR_WATERBORNE_PLATTS_U_S("DIESEL FUEL-GULF COAST LOW SULFUR (WATERBORNE)-PLATTS U.S."),
        DIESEL_FUEL_GULF_COAST_ULTRA_LOW_SULFUR_PIPELINE_PLATTS_U_S("DIESEL FUEL-GULF COAST ULTRA LOW SULFUR (PIPELINE)-PLATTS U.S."),
        DIESEL_FUEL_LOS_ANGELES_CARB_NO_2_PIPELINE_OPIS_WEST_COAST("DIESEL FUEL-LOS ANGELES CARB NO. 2 (PIPELINE)-OPIS WEST COAST"),
        DIESEL_FUEL_MIDWEST_GROUP_THREE_ULTRA_LOW_SULFUR_PLATTS_U_S("DIESEL FUEL-MIDWEST GROUP THREE ULTRA LOW SULFUR PLATTS U.S."),
        DIESEL_FUEL_NO_2_BILLINGS_PLATTS_OILGRAM("DIESEL FUEL-NO. 2 BILLINGS-PLATTS OILGRAM"),
        DIESEL_FUEL_NO_2_SALT_LAKE_PLATTS_OILGRAM("DIESEL FUEL-NO. 2 SALT LAKE-PLATTS OILGRAM"),
        DIESEL_FUEL_ON_HIGHWAY_ALL_TYPES_U_S_ENERGY_INFORMATION_ADMINISTRATION("DIESEL FUEL-ON HIGHWAY ALL TYPES (U.S.)-ENERGY INFORMATION ADMINISTRATION"),
        DIESEL_FUEL_U_S_GULF_COAST_ULTRA_LOW_SULFUR_WATERBORNE_PLATTS_US_MARKETSCAN("DIESEL FUEL-U.S. GULF COAST ULTRA LOW SULFUR (WATERBORNE)-PLATTS US MARKETSCAN"),
        DIESEL_FUEL_ULTRA_LOW_SULFUR_COLONIAL_ARGUS_US_PRODUCTS("DIESEL FUEL-ULTRA LOW SULFUR (COLONIAL)-ARGUS US PRODUCTS"),
        DIESEL_FUEL_ULTRA_LOW_SULFUR_NEW_YORK_BARGE_ARGUS_US_PRODUCTS("DIESEL FUEL-ULTRA LOW SULFUR (NEW YORK BARGE)-ARGUS US PRODUCTS"),
        ELECTRICITY_APX_POWER_INDEX_HOURLY("ELECTRICITY - APX - POWER INDEX: HOURLY,"),
        ELECTRICITY_POWER_INDEX_HOURLY_EEX("ELECTRICITY - POWER INDEX - HOURLY - EEX"),
        ELECTRICITY_POWER_INDEX_HOURLY_GME("ELECTRICITY - POWER INDEX - HOURLY - GME,"),
        ELECTRICITY_MISO_CINERGY_HUB_DAY_AHEAD("ELECTRICITY MISO- CINERGY HUB-Day Ahead"),
        ELECTRICITY_MISO_CINERGY_HUB_REAL_TIME("ELECTRICITY MISO- CINERGY HUB-REAL TIME"),
        ELECTRICITY_MISO_ILLINOIS_HUB_DAY_AHEAD("ELECTRICITY MISO-ILLINOIS HUB-Day Ahead"),
        ELECTRICITY_MISO_ILLINOIS_HUB_REAL_TIME("ELECTRICITY MISO-ILLINOIS HUB-Real-Time"),
        ELECTRICITY_MISO_MICHIGAN_HUB_DAY_AHEAD("ELECTRICITY MISO-MICHIGAN HUB-Day Ahead"),
        ELECTRICITY_MISO_MICHIGAN_HUB_REAL_TIME("ELECTRICITY MISO-MICHIGAN HUB-Real-Time"),
        ELECTRICITY_MISO_MINNESOTA_HUB_DAY_AHEAD("ELECTRICITY MISO-MINNESOTA HUB-Day Ahead"),
        ELECTRICITY_MISO_MINNESOTA_HUB_REAL_TIME("ELECTRICITY MISO-MINNESOTA HUB-Real-Time"),
        ELECTRICITY_PJM_NEW_JERSEY_HUB_DAY_AHEAD("ELECTRICITY PJM-NEW JERSEY HUB-DAY AHEAD"),
        ELECTRICITY_PJM_NEW_JERSEY_HUB_REAL_TIME("ELECTRICITY PJM-NEW JERSEY HUB-REAL TIME"),
        ELECTRICITY_PJM_NORTHERN_ILLINOIS_HUB_DAY_AHEAD("ELECTRICITY PJM-NORTHERN ILLINOIS HUB-DAY AHEAD"),
        ELECTRICITY_PJM_NORTHERN_ILLINOIS_HUB_REAL_TIME("ELECTRICITY PJM-NORTHERN ILLINOIS HUB-REAL TIME"),
        ELECTRICITY_PJM_PSEG_DAY_AHEAD("ELECTRICITY PJM-PSEG-DAY AHEAD"),
        ELECTRICITY_PJM_PSEG_REAL_TIME("ELECTRICITY PJM-PSEG-REAL TIME"),
        ELECTRICITY_PJM_WESTERN_HUB_DAY_AHEAD("ELECTRICITY PJM-WESTERN HUB-DAY AHEAD"),
        ELECTRICITY_PJM_WESTERN_HUB_REAL_TIME("ELECTRICITY PJM-WESTERN HUB-REAL TIME"),
        ELECTRICITY_AEMO_SPOT_PRICE_TAS("ELECTRICITY-AEMO SPOT PRICE -TAS"),
        ELECTRICITY_AEMO_SPOT_PRICE_HISTORICAL_NSW("ELECTRICITY-AEMO SPOT PRICE-HISTORICAL-NSW"),
        ELECTRICITY_AEMO_SPOT_PRICE_HISTORICAL_QLD("ELECTRICITY-AEMO SPOT PRICE-HISTORICAL-QLD"),
        ELECTRICITY_AEMO_SPOT_PRICE_HISTORICAL_SA("ELECTRICITY-AEMO SPOT PRICE-HISTORICAL-SA"),
        ELECTRICITY_AEMO_SPOT_PRICE_HISTORICAL_VIC("ELECTRICITY-AEMO SPOT PRICE-HISTORICAL-VIC"),
        ELECTRICITY_AEMO_SPOT_PRICE_NSW("ELECTRICITY-AEMO SPOT PRICE-NSW"),
        ELECTRICITY_AEMO_SPOT_PRICE_QLD("ELECTRICITY-AEMO SPOT PRICE-QLD"),
        ELECTRICITY_AEMO_SPOT_PRICE_SA("ELECTRICITY-AEMO SPOT PRICE-SA"),
        ELECTRICITY_AEMO_SPOT_PRICE_VIC("ELECTRICITY-AEMO SPOT PRICE-VIC"),
        ELECTRICITY_AEP_DAYTON_HUB_OFF_PEAK_ICE("ELECTRICITY-AEP DAYTON HUB OFF-PEAK-ICE-"),
        ELECTRICITY_AEP_DAYTON_HUB_PEAK_ICE("ELECTRICITY-AEP DAYTON HUB PEAK-ICE"),
        ELECTRICITY_AEP_DAYTON_HUB_REAL_TIME_PEAK_ICE("ELECTRICITY-AEP DAYTON HUB REAL TIME PEAK-ICE"),
        ELECTRICITY_ALBERTA_POWER_POOL_AESO("ELECTRICITY-ALBERTA POWER POOL-AESO"),
        ELECTRICITY_CAISO_COB_MALIN_5_N_101_DAY_AHEAD("ELECTRICITY-CAISO-COB (MALIN_5_N101)-DAY AHEAD"),
        ELECTRICITY_CAISO_FOUR_CORNERS_FOURCORN_3_N_501_DAY_AHEAD("ELECTRICITY-CAISO-FOUR CORNERS (FOURCORN_3_N501)-DAY AHEAD"),
        ELECTRICITY_CAISO_MEAD_MEADS_2_N_101_DAY_AHEAD("ELECTRICITY-CAISO-MEAD (MEADS_2_N101)-DAY AHEAD"),
        ELECTRICITY_CAISO_NOB_SYLMARDC_2_N_501_DAY_AHEAD("ELECTRICITY-CAISO-NOB SYLMARDC_2_N501)-DAY AHEAD"),
        ELECTRICITY_CAISO_NP_15_DAY_AHEAD("ELECTRICITY-CAISO-NP15-DAY AHEAD"),
        ELECTRICITY_CAISO_NP_15_REAL_TIME("ELECTRICITY-CAISO-NP15-REAL TIME"),
        ELECTRICITY_CAISO_PALO_VERDE_PALOVRDE_ASR_APND_DAY_AHEAD("ELECTRICITY-CAISO-PALO VERDE (PALOVRDE_ASR-APND)-DAY AHEAD"),
        ELECTRICITY_CAISO_SP_15_DAY_AHEAD("ELECTRICITY-CAISO-SP15-DAY AHEAD"),
        ELECTRICITY_CAISO_SP_15_REAL_TIME("ELECTRICITY-CAISO-SP15-REAL TIME"),
        ELECTRICITY_CALIFORNIA_OREGON_BORDER_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-CALIFORNIA/OREGON BORDER FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_CALIFORNIA_OREGON_BORDER_NON_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-CALIFORNIA/OREGON BORDER NON-FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_CALIFORNIA_OREGON_BORDER_NON_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-CALIFORNIA/OREGON BORDER NON-FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_CINERGY_ON_PEAK_MEGAWATT_DAILY("ELECTRICITY-CINERGY (ON-PEAK)-MEGAWATT DAILY"),
        ELECTRICITY_CINERGY_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-CINERGY FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_CINERGY_OFF_PEAK_ICE("ELECTRICITY-CINERGY OFF-PEAK-ICE"),
        ELECTRICITY_CINERGY_PEAK_ICE("ELECTRICITY-CINERGY PEAK-ICE"),
        ELECTRICITY_CINERGY_REAL_TIME_OFF_PEAK_ICE("ELECTRICITY-CINERGY REAL TIME OFF-PEAK-ICE"),
        ELECTRICITY_CINERGY_REAL_TIME_PEAK_ICE("ELECTRICITY-CINERGY REAL TIME PEAK-ICE"),
        ELECTRICITY_COB_OFF_PEAK_ICE("ELECTRICITY-COB OFF-PEAK-ICE"),
        ELECTRICITY_COB_PEAK_ICE("ELECTRICITY-COB PEAK-ICE"),
        ELECTRICITY_CONTINUOUS_TRADING_BASE_EEX("ELECTRICITY-CONTINUOUS TRADING BASE-EEX"),
        ELECTRICITY_CONTINUOUS_TRADING_PEAK_EEX("ELECTRICITY-CONTINUOUS TRADING PEAK-EEX"),
        ELECTRICITY_CONTINUOUS_TRADING_WEEKEND_BASE_EEX("ELECTRICITY-CONTINUOUS TRADING WEEKEND BASE-EEX"),
        ELECTRICITY_DAILY_PHELIX_BASE_SPOT_EEX("ELECTRICITY-DAILY PHELIX BASE SPOT-EEX"),
        ELECTRICITY_DAILY_PHELIX_PEAK_SPOT_EEX("ELECTRICITY-DAILY PHELIX PEAK SPOT-EEX"),
        ELECTRICITY_DAY_AHEAD_HOURLY_POWERNEXT("ELECTRICITY-DAY-AHEAD-HOURLY-POWERNEXT"),
        ELECTRICITY_DKK_ELSPOT_NO_1_OSL_HOURLY_NORDPOOL("ELECTRICITY-DKK- ELSPOT NO1 (OSL)-HOURLY- NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_SYSTEM_PRICE_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT (SYSTEM PRICE)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_DK_1_ARH_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT DK1 (ARH)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_DK_2_CPH_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT DK2 (CPH)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_FINLAND_HEL_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT FINLAND (HEL)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_NO_2_KRI_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT NO2 (KRI)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_NO_3_TRON_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT NO3 (TRON)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_NO_4_TROM_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT NO4 (TROM)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_NO_5_BER_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT NO5 (BER)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_SE_1_LLA_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT SE1 (LLA)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_SE_2_SDL_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT SE2 (SDL)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_SE_3_STO_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT SE3 (STO)-HOURLY-NORDPOOL"),
        ELECTRICITY_DKK_ELSPOT_SE_4_MMX_HOURLY_NORDPOOL("ELECTRICITY-DKK-ELSPOT SE4 (MMX)-HOURLY-NORDPOOL"),
        ELECTRICITY_ENTERGY_ON_PEAK_MEGAWATT_DAILY("ELECTRICITY-ENTERGY (ON-PEAK)-MEGAWATT DAILY"),
        ELECTRICITY_ENTERGY_OFF_PEAK_ICE("ELECTRICITY-ENTERGY OFF-PEAK-ICE"),
        ELECTRICITY_ENTERGY_PEAK_ICE("ELECTRICITY-ENTERGY PEAK-ICE"),
        ELECTRICITY_ERCOT_AUSTIN_ENERGY_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-AUSTIN ENERGY LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_AUSTIN_ENERGY_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-AUSTIN ENERGY LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_BUS_AVERAGE_345_KV_HUB_DAY_AHEAD("ELECTRICITY-ERCOT-BUS AVERAGE 345KV HUB-DAY AHEAD"),
        ELECTRICITY_ERCOT_BUS_AVERAGE_345_KV_HUB_REAL_TIME("ELECTRICITY-ERCOT-BUS AVERAGE 345KV HUB-REAL TIME"),
        ELECTRICITY_ERCOT_CAPACITY_NON_SPINNING_DAY_AHEAD("ELECTRICITY-ERCOT-CAPACITY NON-SPINNING-DAY AHEAD"),
        ELECTRICITY_ERCOT_CPS_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-CPS LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_CPS_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-CPS LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_HOUSTON_345_KV_HUB_REAL_TIME("ELECTRICITY-ERCOT-HOUSTON 345KV HUB-REAL TIME"),
        ELECTRICITY_ERCOT_HOUSTON_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-HOUSTON LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_HOUSTON_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-HOUSTON LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_HOUSTON_OFF_PEAK_ICE("ELECTRICITY-ERCOT-HOUSTON OFF-PEAK-ICE"),
        ELECTRICITY_ERCOT_HOUSTON_PEAK_ICE("ELECTRICITY-ERCOT-HOUSTON PEAK-ICE"),
        ELECTRICITY_ERCOT_HUB_AVERAGE_345_KV_DAY_AHEAD("ELECTRICITY-ERCOT-HUB AVERAGE 345KV-DAY AHEAD"),
        ELECTRICITY_ERCOT_HUB_AVERAGE_345_KV_REAL_TIME("ELECTRICITY-ERCOT-HUB AVERAGE 345KV-REAL TIME"),
        ELECTRICITY_ERCOT_LCRA_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-LCRA LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_LCRA_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-LCRA LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_NODAL_CPSES_UNIT_1_DAY_AHEAD("ELECTRICITY-ERCOT-NODAL: CPSES UNIT 1-DAY AHEAD"),
        ELECTRICITY_ERCOT_NODAL_MLSES_UNIT_1_DAY_AHEAD("ELECTRICITY-ERCOT-NODAL: MLSES UNIT 1-DAY AHEAD"),
        ELECTRICITY_ERCOT_NODAL_OGSES_UNIT_1_DAY_AHEAD("ELECTRICITY-ERCOT-NODAL: OGSES UNIT 1-DAY AHEAD"),
        ELECTRICITY_ERCOT_NODAL_SD_5_SES_UNIT_5_DAY_AHEAD("ELECTRICITY-ERCOT-NODAL: SD5SES UNIT 5-DAY AHEAD"),
        ELECTRICITY_ERCOT_NODAL_TRSES_UNIT_6_DAY_AHEAD("ELECTRICITY-ERCOT-NODAL: TRSES UNIT 6-DAY AHEAD"),
        ELECTRICITY_ERCOT_NODAL_WAP_WAP_G_8_DAY_AHEAD("ELECTRICITY-ERCOT-NODAL: WAP WAP G8-DAY AHEAD"),
        ELECTRICITY_ERCOT_NORTH_345_KV_HUB_REAL_TIME("ELECTRICITY-ERCOT-NORTH 345KV HUB-REAL TIME"),
        ELECTRICITY_ERCOT_NORTH_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-NORTH LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_NORTH_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-NORTH LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_NORTH_OFF_PEAK_ICE("ELECTRICITY-ERCOT-NORTH OFF-PEAK-ICE"),
        ELECTRICITY_ERCOT_NORTH_PEAK_ICE("ELECTRICITY-ERCOT-NORTH PEAK-ICE"),
        ELECTRICITY_ERCOT_RAYBURN_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-RAYBURN LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_RAYBURN_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-RAYBURN LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_REGULATION_SERVICE_DOWN_ANCILLARY_SERVICES_MCP("ELECTRICITY-ERCOT-REGULATION SERVICE DOWN-ANCILLARY SERVICES MCP"),
        ELECTRICITY_ERCOT_REGULATION_SERVICE_UP_ANCILLARY_SERVICES_MCP("ELECTRICITY-ERCOT-REGULATION SERVICE UP-ANCILLARY SERVICES MCP"),
        ELECTRICITY_ERCOT_RESPONSIVE_RESERVE_ANCILLARY_SERVICES_MCP("ELECTRICITY-ERCOT-RESPONSIVE RESERVE-ANCILLARY SERVICES MCP"),
        ELECTRICITY_ERCOT_SOUTH_345_KV_HUB_REAL_TIME("ELECTRICITY-ERCOT-SOUTH 345KV HUB-REAL TIME"),
        ELECTRICITY_ERCOT_SOUTH_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-SOUTH LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_SOUTH_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-SOUTH LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_SOUTH_OFF_PEAK_ICE("ELECTRICITY-ERCOT-SOUTH OFF-PEAK-ICE"),
        ELECTRICITY_ERCOT_SOUTH_PEAK_ICE("ELECTRICITY-ERCOT-SOUTH PEAK-ICE"),
        ELECTRICITY_ERCOT_WEST_345_KV_HUB_REAL_TIME("ELECTRICITY-ERCOT-WEST 345KV HUB-REAL TIME"),
        ELECTRICITY_ERCOT_WEST_LOAD_ZONE_DAY_AHEAD("ELECTRICITY-ERCOT-WEST LOAD ZONE-DAY AHEAD"),
        ELECTRICITY_ERCOT_WEST_LOAD_ZONE_REAL_TIME("ELECTRICITY-ERCOT-WEST LOAD ZONE-REAL TIME"),
        ELECTRICITY_ERCOT_WEST_OFF_PEAK_ICE("ELECTRICITY-ERCOT-WEST OFF-PEAK-ICE"),
        ELECTRICITY_ERCOT_WEST_PEAK_ICE("ELECTRICITY-ERCOT-WEST PEAK-ICE"),
        ELECTRICITY_EUR_ELSPOT_NO_1_OSL_HOURLY_NORDPOOL("ELECTRICITY-EUR- ELSPOT NO1 (OSL)-HOURLY- NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_SYSTEM_PRICE_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT (SYSTEM PRICE)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_DK_1_ARH_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT DK1 (ARH)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_DK_2_CPH_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT DK2 (CPH)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_FINLAND_HEL_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT FINLAND (HEL)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_NO_2_KRI_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT NO2 (KRI)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_NO_3_TRON_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT NO3 (TRON)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_NO_4_TROM_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT NO4 (TROM)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_NO_5_BER_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT NO5 (BER)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_SE_1_LLA_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT SE1 (LLA)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_SE_2_SDL_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT SE2 (SDL)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_SE_3_STO_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT SE3 (STO)-HOURLY-NORDPOOL"),
        ELECTRICITY_EUR_ELSPOT_SE_4_MMX_HOURLY_NORDPOOL("ELECTRICITY-EUR-ELSPOT SE4 (MMX)-HOURLY-NORDPOOL"),
        ELECTRICITY_FOUR_CORNERS_OFF_PEAK_ICE("ELECTRICITY-FOUR CORNERS OFF-PEAK-ICE"),
        ELECTRICITY_FOUR_CORNERS_PEAK_ICE("ELECTRICITY-FOUR CORNERS PEAK-ICE"),
        ELECTRICITY_FOURCORNERS_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-FOURCORNERS FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_FOURCORNERS_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-FOURCORNERS FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_FOURCORNERS_NON_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-FOURCORNERS NON-FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_HOURLY_BLOCK_AFTERNOON_EEX("ELECTRICITY-HOURLY BLOCK AFTERNOON-EEX"),
        ELECTRICITY_HOURLY_BLOCK_BUSINESS_EEX("ELECTRICITY-HOURLY BLOCK BUSINESS-EEX"),
        ELECTRICITY_HOURLY_BLOCK_EVENING_EEX("ELECTRICITY-HOURLY BLOCK EVENING-EEX"),
        ELECTRICITY_HOURLY_BLOCK_HIGH_NOON_EEX("ELECTRICITY-HOURLY BLOCK HIGH NOON-EEX"),
        ELECTRICITY_HOURLY_BLOCK_MORNING_EEX("ELECTRICITY-HOURLY BLOCK MORNING-EEX"),
        ELECTRICITY_HOURLY_BLOCK_NIGHT_EEX("ELECTRICITY-HOURLY BLOCK NIGHT-EEX"),
        ELECTRICITY_HOURLY_BLOCK_OFF_PEAK_I_EEX("ELECTRICITY-HOURLY BLOCK OFF PEAK I-EEX"),
        ELECTRICITY_HOURLY_BLOCK_OFF_PEAK_II_EEX("ELECTRICITY-HOURLY BLOCK OFF PEAK II-EEX"),
        ELECTRICITY_HOURLY_BLOCK_RUSH_HOUR_EEX("ELECTRICITY-HOURLY BLOCK RUSH HOUR-EEX"),
        ELECTRICITY_IESO_HOURLY_ONTARIO_ENERGY_PRICE("ELECTRICITY-IESO-HOURLY ONTARIO ENERGY PRICE"),
        ELECTRICITY_ISO_NEW_ENGLAND_CONNECTICUT_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-CONNECTICUT-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_CONNECTICUT_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-CONNECTICUT-REAL TIME"),
        ELECTRICITY_ISO_NEW_ENGLAND_HYDRO_QUEBEC_PHASE_1_PHASE_2_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-HYDRO QUEBEC PHASE 1/PHASE2-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_MAINE_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-MAINE-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_MASS_HUB_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-MASS HUB-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_MASS_HUB_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-MASS HUB-REAL TIME"),
        ELECTRICITY_ISO_NEW_ENGLAND_NE_MASS_BOSTON_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-NE MASS BOSTON-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_NE_MASS_BOSTON_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-NE MASS BOSTON-REAL TIME"),
        ELECTRICITY_ISO_NEW_ENGLAND_NEW_HAMPSHIRE_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-NEW HAMPSHIRE-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_NEW_HAMPSHIRE_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-NEW HAMPSHIRE-REAL TIME"),
        ELECTRICITY_ISO_NEW_ENGLAND_RHODE_ISLAND_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-RHODE ISLAND-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_RHODE_ISLAND_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-RHODE ISLAND-REAL TIME"),
        ELECTRICITY_ISO_NEW_ENGLAND_SE_MASS_BOSTON_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-SE MASS BOSTON-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_SE_MASS_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-SE MASS-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_SE_MASS_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-SE MASS-REAL TIME"),
        ELECTRICITY_ISO_NEW_ENGLAND_WC_MASS_DAY_AHEAD("ELECTRICITY-ISO NEW ENGLAND-WC MASS-DAY AHEAD"),
        ELECTRICITY_ISO_NEW_ENGLAND_WC_MASS_REAL_TIME("ELECTRICITY-ISO NEW ENGLAND-WC MASS-REAL TIME"),
        ELECTRICITY_JM_EDGEMOOR_HAYRD_4_REAL_TIME("ELECTRICITY-JM-EDGEMOOR HAYRD4-REAL TIME"),
        ELECTRICITY_JOJOBA_PEAK_ICE("ELECTRICITY-JOJOBA PEAK-ICE"),
        ELECTRICITY_LEBA_UK_POWER_INDEX_DAY_AHEAD_WEEKEND_07_30_09_00("ELECTRICITY-LEBA UK POWER INDEX-DAY AHEAD WEEKEND (07.30-09.00)"),
        ELECTRICITY_LEBA_UK_POWER_INDEX_DAY_AHEAD_WINDOW_07_30_09_00("ELECTRICITY-LEBA UK POWER INDEX-DAY AHEAD WINDOW (07.30-09.00)"),
        ELECTRICITY_LEBA_UK_POWER_INDEX_MONDAY_FRIDAY_PEAK_BLOCKS_3_4_5_07_30_09_00("ELECTRICITY-LEBA UK POWER INDEX-MONDAY-FRIDAY PEAK BLOCKS 3&4&5 (07.30-09.00)"),
        ELECTRICITY_LEBA_UK_POWER_INDEX_WORKING_DAYS_07_30_17_00("ELECTRICITY-LEBA UK POWER INDEX-WORKING DAYS (07.30-17.00)"),
        ELECTRICITY_MEAD_OFF_PEAK_ICE("ELECTRICITY-MEAD OFF-PEAK-ICE"),
        ELECTRICITY_MEAD_PEAK_ICE("ELECTRICITY-MEAD PEAK-ICE"),
        ELECTRICITY_MEAD_MARKETPLACE_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-MEAD/MARKETPLACE FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MEAD_MARKETPLACE_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-MEAD/MARKETPLACE FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MEAD_MARKETPLACE_NON_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-MEAD/MARKETPLACE NON-FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MEAD_MARKETPLACE_NON_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-MEAD/MARKETPLACE NON-FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MID_C_OFF_PEAK_ICE("ELECTRICITY-MID C OFF-PEAK-ICE"),
        ELECTRICITY_MID_C_PEAK_ICE("ELECTRICITY-MID C PEAK-ICE"),
        ELECTRICITY_MID_COLUMBIA_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-MID-COLUMBIA FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MID_COLUMBIA_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-MID-COLUMBIA FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MID_COLUMBIA_NON_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-MID-COLUMBIA NON-FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MID_COLUMBIA_NON_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-MID-COLUMBIA NON-FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_MISO_ALTW_FPL_DAEC_DAY_AHEAD("ELECTRICITY-MISO-ALTW.FPL_DAEC-DAY AHEAD"),
        ELECTRICITY_MISO_ALTW_FPL_DAEC_REAL_TIME("ELECTRICITY-MISO-ALTW.FPL_DAEC-REAL TIME"),
        ELECTRICITY_MISO_ALTW_PIONPRAR_2_DAY_AHEAD("ELECTRICITY-MISO-ALTW.PIONPRAR2-DAY AHEAD"),
        ELECTRICITY_MISO_ALTW_PIONPRAR_2_REAL_TIME("ELECTRICITY-MISO-ALTW.PIONPRAR2-REAL TIME"),
        ELECTRICITY_MISO_AMIL_BGS_6_DAY_AHEAD("ELECTRICITY-MISO-AMIL.BGS6-DAY AHEAD"),
        ELECTRICITY_MISO_AMIL_BGS_6_REAL_TIME("ELECTRICITY-MISO-AMIL.BGS6-REAL TIME"),
        ELECTRICITY_MISO_AMIL_BGS_9_DAY_AHEAD("ELECTRICITY-MISO-AMIL.BGS9-DAY AHEAD"),
        ELECTRICITY_MISO_AMIL_BGS_9_REAL_TIME("ELECTRICITY-MISO-AMIL.BGS9-REAL TIME"),
        ELECTRICITY_MISO_AMIL_CIPS_DAY_AHEAD("ELECTRICITY-MISO-AMIL.CIPS-DAY AHEAD"),
        ELECTRICITY_MISO_AMIL_CIPS_REAL_TIME("ELECTRICITY-MISO-AMIL.CIPS-REAL TIME"),
        ELECTRICITY_MISO_AMIL_SESKEYSTN_DAY_AHEAD("ELECTRICITY-MISO-AMIL.SESKEYSTN-DAY AHEAD"),
        ELECTRICITY_MISO_AMIL_SESKEYSTN_REAL_TIME("ELECTRICITY-MISO-AMIL.SESKEYSTN-REAL TIME"),
        ELECTRICITY_MISO_AMILSES_DAY_AHEAD("ELECTRICITY-MISO-AMILSES-DAY AHEAD"),
        ELECTRICITY_MISO_AMILSES_REAL_TIME("ELECTRICITY-MISO-AMILSES-REAL TIME"),
        ELECTRICITY_MISO_AMMO_UE_DAY_AHEAD("ELECTRICITY-MISO-AMMO.UE-DAY AHEAD"),
        ELECTRICITY_MISO_AMMO_UE_REAL_TIME("ELECTRICITY-MISO-AMMO.UE-REAL TIME"),
        ELECTRICITY_MISO_CIN_SESDUKE_DAY_AHEAD("ELECTRICITY-MISO-CIN.SESDUKE-DAY AHEAD"),
        ELECTRICITY_MISO_CIN_SESDUKE_REAL_TIME("ELECTRICITY-MISO-CIN.SESDUKE-REAL TIME"),
        ELECTRICITY_MISO_CINERGY_HUB_DAY_AHEAD_("ELECTRICITY-MISO-CINERGY HUB-DAY AHEAD"),
        ELECTRICITY_MISO_CINERGY_HUB_REAL_TIME_("ELECTRICITY-MISO-CINERGY HUB-REAL TIME"),
        ELECTRICITY_MISO_CONS_SESB_DAY_AHEAD("ELECTRICITY-MISO-CONS.SESB-DAY AHEAD"),
        ELECTRICITY_MISO_CONS_SESB_REAL_TIME("ELECTRICITY-MISO-CONS.SESB-REAL TIME"),
        ELECTRICITY_MISO_DECO_SESA_DAY_AHEAD("ELECTRICITY-MISO-DECO.SESA-DAY AHEAD"),
        ELECTRICITY_MISO_DECO_SESA_REAL_TIME("ELECTRICITY-MISO-DECO.SESA-REAL TIME"),
        ELECTRICITY_MISO_EEI_DAY_AHEAD("ELECTRICITY-MISO-EEI-DAY AHEAD"),
        ELECTRICITY_MISO_EEI_REAL_TIME("ELECTRICITY-MISO-EEI-REAL TIME"),
        ELECTRICITY_MISO_EES_DAY_AHEAD("ELECTRICITY-MISO-EES-DAY AHEAD"),
        ELECTRICITY_MISO_EES_REAL_TIME("ELECTRICITY-MISO-EES-REAL TIME"),
        ELECTRICITY_MISO_FE_FESR_DAY_AHEAD("ELECTRICITY-MISO-FE.FESR-DAY AHEAD"),
        ELECTRICITY_MISO_FE_FESR_REAL_TIME("ELECTRICITY-MISO-FE.FESR-REAL TIME"),
        ELECTRICITY_MISO_FES_SES_DAY_AHEAD("ELECTRICITY-MISO-FES.SES-DAY AHEAD"),
        ELECTRICITY_MISO_FES_SES_REAL_TIME("ELECTRICITY-MISO-FES.SES-REAL TIME"),
        ELECTRICITY_MISO_ILLINOIS_HUB_DAY_AHEAD_("ELECTRICITY-MISO-ILLINOIS HUB-DAY AHEAD"),
        ELECTRICITY_MISO_ILLINOIS_HUB_REAL_TIME_("ELECTRICITY-MISO-ILLINOIS HUB-REAL TIME"),
        ELECTRICITY_MISO_INDIANA_HUB_DAY_AHEAD("ELECTRICITY-MISO-INDIANA HUB-DAY AHEAD"),
        ELECTRICITY_MISO_INDIANA_HUB_REAL_TIME("ELECTRICITY-MISO-INDIANA HUB-REAL TIME"),
        ELECTRICITY_MISO_LAGN_DAY_AHEAD("ELECTRICITY-MISO-LAGN-DAY AHEAD"),
        ELECTRICITY_MISO_LAGN_REAL_TIME("ELECTRICITY-MISO-LAGN-REAL TIME"),
        ELECTRICITY_MISO_MEC_MECB_DAY_AHEAD("ELECTRICITY-MISO-MEC.MECB-DAY AHEAD"),
        ELECTRICITY_MISO_MEC_MECB_REAL_TIME("ELECTRICITY-MISO-MEC.MECB-REAL TIME"),
        ELECTRICITY_MISO_MICHIGAN_HUB_DAY_AHEAD_("ELECTRICITY-MISO-MICHIGAN HUB-DAY AHEAD"),
        ELECTRICITY_MISO_MICHIGAN_HUB_REAL_TIME_("ELECTRICITY-MISO-MICHIGAN HUB-REAL TIME"),
        ELECTRICITY_MISO_MINNESOTA_HUB_DAY_AHEAD_("ELECTRICITY-MISO-MINNESOTA HUB-DAY AHEAD"),
        ELECTRICITY_MISO_MINNESOTA_HUB_REAL_TIME_("ELECTRICITY-MISO-MINNESOTA HUB-REAL TIME"),
        ELECTRICITY_MISO_MPW_MPW_HUB_REAL_TIME("ELECTRICITY-MISO-MPW.MPW HUB-REAL TIME"),
        ELECTRICITY_MISO_MPW_MPW_DAY_AHEAD("ELECTRICITY-MISO-MPW.MPW-DAY AHEAD"),
        ELECTRICITY_MONA_OFF_PEAK_ICE("ELECTRICITY-MONA OFF-PEAK-ICE"),
        ELECTRICITY_MONA_PEAK_ICE("ELECTRICITY-MONA PEAK-ICE"),
        ELECTRICITY_MONTH_FUTURES_BASE_EEX("ELECTRICITY-MONTH FUTURES BASE-EEX"),
        ELECTRICITY_MONTH_FUTURES_PEAK_EEX("ELECTRICITY-MONTH FUTURES PEAK-EEX"),
        ELECTRICITY_MONTHLY_PHELIX_BASE_SPOT_EEX("ELECTRICITY-MONTHLY PHELIX BASE SPOT-EEX"),
        ELECTRICITY_MONTHLY_PHELIX_PEAK_SPOT_EEX("ELECTRICITY-MONTHLY PHELIX PEAK SPOT-EEX"),
        ELECTRICITY_N_ILLINOIS_OFF_PEAK_ICE("ELECTRICITY-N ILLINOIS OFF-PEAK-ICE"),
        ELECTRICITY_N_ILLINOIS_PEAK_ICE("ELECTRICITY-N ILLINOIS PEAK-ICE"),
        ELECTRICITY_N_ILLINOIS_REAL_TIME_OFF_PEAK_ICE("ELECTRICITY-N ILLINOIS REAL TIME OFF-PEAK-ICE"),
        ELECTRICITY_N_ILLINOIS_REAL_TIME_PEAK_ICE("ELECTRICITY-N ILLINOIS REAL TIME PEAK-ICE"),
        ELECTRICITY_NEPOOL_MH_DA_LMP_OFF_PEAK_ICE("ELECTRICITY-NEPOOL MH DA LMP OFF-PEAK-ICE"),
        ELECTRICITY_NEPOOL_MH_DA_LMP_PEAK_ICE("ELECTRICITY-NEPOOL MH DA LMP PEAK-ICE"),
        ELECTRICITY_NOB_OFF_PEAK_ICE("ELECTRICITY-NOB OFF-PEAK-ICE"),
        ELECTRICITY_NOB_PEAK_ICE("ELECTRICITY-NOB PEAK-ICE"),
        ELECTRICITY_NOK_ELSPOT_SYSTEM_PRICE_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT (SYSTEM PRICE)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_DK_1_ARH_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT DK1 (ARH)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_DK_2_CPH_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT DK2 (CPH)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_FINLAND_HEL_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT FINLAND (HEL)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_NO_1_OSL_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT NO1 (OSL)-HOURLY- NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_NO_2_KRI_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT NO2 (KRI)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_NO_3_TRON_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT NO3 (TRON)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_NO_4_TROM_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT NO4 (TROM)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_NO_5_BER_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT NO5 (BER)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_SE_1_LLA_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT SE1 (LLA)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_SE_2_SDL_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT SE2 (SDL)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_SE_3_STO_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT SE3 (STO)-HOURLY-NORDPOOL"),
        ELECTRICITY_NOK_ELSPOT_SE_4_MMX_HOURLY_NORDPOOL("ELECTRICITY-NOK-ELSPOT SE4 (MMX)-HOURLY-NORDPOOL"),
        ELECTRICITY_NP_15_DAY_AHEAD_OFF_PEAK_ICE("ELECTRICITY-NP-15 DAY AHEAD OFF-PEAK-ICE"),
        ELECTRICITY_NP_15_DAY_AHEAD_PEAK_ICE("ELECTRICITY-NP-15 DAY AHEAD PEAK-ICE"),
        ELECTRICITY_NP_15_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-NP-15 FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_NP_15_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-NP-15 FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_NP_15_OFF_PEAK_ICE("ELECTRICITY-NP-15 OFF-PEAK-ICE"),
        ELECTRICITY_NP_15_PEAK_ICE("ELECTRICITY-NP-15 PEAK-ICE"),
        ELECTRICITY_NYISO_A_PEAK_ICE("ELECTRICITY-NYISO A PEAK-ICE"),
        ELECTRICITY_NYISO_ZONE_A_WEST_DAY_AHEAD("ELECTRICITY-NYISO-ZONE A (WEST)-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_A_WEST_REAL_TIME("ELECTRICITY-NYISO-ZONE A (WEST)-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_B_DAY_AHEAD("ELECTRICITY-NYISO-ZONE B-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_B_REAL_TIME("ELECTRICITY-NYISO-ZONE B-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_C_DAY_AHEAD("ELECTRICITY-NYISO-ZONE C-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_C_REAL_TIME("ELECTRICITY-NYISO-ZONE C-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_D_DAY_AHEAD("ELECTRICITY-NYISO-ZONE D-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_D_REAL_TIME("ELECTRICITY-NYISO-ZONE D-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_E_DAY_AHEAD("ELECTRICITY-NYISO-ZONE E-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_E_REAL_TIME("ELECTRICITY-NYISO-ZONE E-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_F_CAPITL_DAY_AHEAD("ELECTRICITY-NYISO-ZONE F (CAPITL)-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_F_REAL_TIME("ELECTRICITY-NYISO-ZONE F-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_G_HUD_VL_DAY_AHEAD("ELECTRICITY-NYISO-ZONE G (HUD VL)-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_G_HUD_VL_REAL_TIME("ELECTRICITY-NYISO-ZONE G (HUD VL)-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_H_DAY_AHEAD("ELECTRICITY-NYISO-ZONE H-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_H_REAL_TIME("ELECTRICITY-NYISO-ZONE H-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_I_DAY_AHEAD("ELECTRICITY-NYISO-ZONE I-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_I_REAL_TIME("ELECTRICITY-NYISO-ZONE I-REAL TIME"),
        ELECTRICITY_NYISO_ZONE_J_N_Y_C_DAY_AHEAD("ELECTRICITY-NYISO-ZONE J (N.Y.C.)-DAY AHEAD"),
        ELECTRICITY_NYISO_ZONE_J_N_Y_C_REAL_TIME("ELECTRICITY-NYISO-ZONE J (N.Y.C.)-REAL TIME"),
        ELECTRICITY_PALO_VERDE_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-PALO VERDE FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_PALO_VERDE_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-PALO VERDE FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_PALO_VERDE_NON_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-PALO VERDE NON-FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_PALO_VERDE_NON_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-PALO VERDE NON-FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_PALO_VERDE_OFF_PEAK_ICE("ELECTRICITY-PALO VERDE OFF-PEAK-ICE"),
        ELECTRICITY_PALO_VERDE_PEAK_ICE("ELECTRICITY-PALO VERDE PEAK-ICE"),
        ELECTRICITY_PINNACLE_OFF_PEAK_ICE("ELECTRICITY-PINNACLE OFF-PEAK-ICE"),
        ELECTRICITY_PINNACLE_PEAK_ICE("ELECTRICITY-PINNACLE PEAK-ICE"),
        ELECTRICITY_PJM_FIRM_ON_PEAK_DOW_JONES_POWER("ELECTRICITY-PJM FIRM (ON-PEAK)-DOW JONES POWER"),
        ELECTRICITY_PJM_AECO_DAY_AHEAD("ELECTRICITY-PJM-AECO-DAY AHEAD"),
        ELECTRICITY_PJM_AECO_REAL_TIME("ELECTRICITY-PJM-AECO-REAL TIME"),
        ELECTRICITY_PJM_AEP_DAYTON_HUB_DAY_AHEAD("ELECTRICITY-PJM-AEP DAYTON HUB-DAY AHEAD"),
        ELECTRICITY_PJM_AEP_DAYTON_HUB_REAL_TIME("ELECTRICITY-PJM-AEP DAYTON HUB-REAL TIME"),
        ELECTRICITY_PJM_AEP_DAY_AHEAD("ELECTRICITY-PJM-AEP-DAY AHEAD"),
        ELECTRICITY_PJM_AEP_REAL_TIME("ELECTRICITY-PJM-AEP-REAL TIME"),
        ELECTRICITY_PJM_AGGREGATE_FE_OHIO_DAY_AHEAD("ELECTRICITY-PJM-AGGREGATE FE OHIO-DAY AHEAD"),
        ELECTRICITY_PJM_AGGREGATE_FE_OHIO_REAL_TIME("ELECTRICITY-PJM-AGGREGATE FE OHIO-REAL TIME"),
        ELECTRICITY_PJM_AGGREGATE_PEPCO_DC_DAY_AHEAD("ELECTRICITY-PJM-AGGREGATE PEPCO DC-DAY AHEAD"),
        ELECTRICITY_PJM_AGGREGATE_PEPCO_DC_REAL_TIME("ELECTRICITY-PJM-AGGREGATE PEPCO DC-REAL TIME"),
        ELECTRICITY_PJM_AGGREGATE_PEPCO_MD_DAY_AHEAD("ELECTRICITY-PJM-AGGREGATE PEPCO MD-DAY AHEAD"),
        ELECTRICITY_PJM_AGGREGATE_PEPCO_MD_REAL_TIME("ELECTRICITY-PJM-AGGREGATE PEPCO MD-REAL TIME"),
        ELECTRICITY_PJM_APS_DAY_AHEAD("ELECTRICITY-PJM-APS-DAY AHEAD"),
        ELECTRICITY_PJM_APS_REAL_TIME("ELECTRICITY-PJM-APS-REAL TIME"),
        ELECTRICITY_PJM_ATSI_DAY_AHEAD("ELECTRICITY-PJM-ATSI-DAY AHEAD"),
        ELECTRICITY_PJM_ATSI_REAL_TIME("ELECTRICITY-PJM-ATSI-REAL TIME"),
        ELECTRICITY_PJM_BGE_DAY_AHEAD("ELECTRICITY-PJM-BGE-DAY AHEAD"),
        ELECTRICITY_PJM_BGE_REAL_TIME("ELECTRICITY-PJM-BGE-REAL TIME"),
        ELECTRICITY_PJM_CHICAGO_GEN_HUB_DAY_AHEAD("ELECTRICITY-PJM-CHICAGO GEN HUB-DAY AHEAD"),
        ELECTRICITY_PJM_CHICAGO_GEN_HUB_REAL_TIME("ELECTRICITY-PJM-CHICAGO GEN HUB-REAL TIME"),
        ELECTRICITY_PJM_COMED_DAY_AHEAD("ELECTRICITY-PJM-COMED-DAY AHEAD"),
        ELECTRICITY_PJM_COMED_REAL_TIME("ELECTRICITY-PJM-COMED-REAL TIME"),
        ELECTRICITY_PJM_DAY_DAY_AHEAD("ELECTRICITY-PJM-DAY-DAY AHEAD"),
        ELECTRICITY_PJM_DAY_REAL_TIME("ELECTRICITY-PJM-DAY-REAL TIME"),
        ELECTRICITY_PJM_DEOK_DAY_AHEAD("ELECTRICITY-PJM-DEOK-DAY AHEAD"),
        ELECTRICITY_PJM_DEOK_REAL_TIME("ELECTRICITY-PJM-DEOK-REAL TIME"),
        ELECTRICITY_PJM_DOM_ZONE_DAY_AHEAD("ELECTRICITY-PJM-DOM ZONE-DAY AHEAD"),
        ELECTRICITY_PJM_DOM_ZONE_REAL_TIME("ELECTRICITY-PJM-DOM ZONE-REAL TIME"),
        ELECTRICITY_PJM_DOMINION_HUB_DAY_AHEAD("ELECTRICITY-PJM-DOMINION HUB-DAY AHEAD"),
        ELECTRICITY_PJM_DOMINION_HUB_REAL_TIME("ELECTRICITY-PJM-DOMINION HUB-REAL TIME"),
        ELECTRICITY_PJM_DPL_DAY_AHEAD("ELECTRICITY-PJM-DPL-DAY AHEAD"),
        ELECTRICITY_PJM_DPL_REAL_TIME("ELECTRICITY-PJM-DPL-REAL TIME"),
        ELECTRICITY_PJM_DUQ_DAY_AHEAD("ELECTRICITY-PJM-DUQ-DAY AHEAD"),
        ELECTRICITY_PJM_DUQ_REAL_TIME("ELECTRICITY-PJM-DUQ-REAL TIME"),
        ELECTRICITY_PJM_EASTERN_HUB_DAY_AHEAD("ELECTRICITY-PJM-EASTERN HUB-DAY AHEAD"),
        ELECTRICITY_PJM_EASTERN_HUB_REAL_TIME("ELECTRICITY-PJM-EASTERN HUB-REAL TIME"),
        ELECTRICITY_PJM_EDGEMOOR_HAYRD_4_DAY_AHEAD("ELECTRICITY-PJM-EDGEMOOR HAYRD4-DAY AHEAD"),
        ELECTRICITY_PJM_EDGEMOOR_HAYRD_8_DAY_AHEAD("ELECTRICITY-PJM-EDGEMOOR HAYRD8-DAY AHEAD"),
        ELECTRICITY_PJM_EDGEMOOR_HAYRD_8_REAL_TIME("ELECTRICITY-PJM-EDGEMOOR HAYRD8-REAL TIME"),
        ELECTRICITY_PJM_INTERFACE_SOUTHEAST_DAY_AHEAD("ELECTRICITY-PJM-INTERFACE SOUTHEAST-DAY AHEAD"),
        ELECTRICITY_PJM_INTERFACE_SOUTHEAST_REAL_TIME("ELECTRICITY-PJM-INTERFACE SOUTHEAST-REAL TIME"),
        ELECTRICITY_PJM_INTERFACE_SOUTHIMP_DAY_AHEAD("ELECTRICITY-PJM-INTERFACE SOUTHIMP-DAY AHEAD"),
        ELECTRICITY_PJM_INTERFACE_SOUTHIMP_REAL_TIME("ELECTRICITY-PJM-INTERFACE SOUTHIMP-REAL TIME"),
        ELECTRICITY_PJM_INTERFACE_SOUTHWEST_DAY_AHEAD("ELECTRICITY-PJM-INTERFACE SOUTHWEST-DAY AHEAD"),
        ELECTRICITY_PJM_INTERFACE_SOUTHWEST_REAL_TIME("ELECTRICITY-PJM-INTERFACE SOUTHWEST-REAL TIME"),
        ELECTRICITY_PJM_INTERFACE("ELECTRICITY-PJM-INTERFACE"),
        ELECTRICITY_PJM_JCPL_DAY_AHEAD("ELECTRICITY-PJM-JCPL-DAY AHEAD"),
        ELECTRICITY_PJM_JCPL_REAL_TIME("ELECTRICITY-PJM-JCPL-REAL TIME"),
        ELECTRICITY_PJM_METED_DAY_AHEAD("ELECTRICITY-PJM-METED-DAY AHEAD"),
        ELECTRICITY_PJM_METED_REAL_TIME("ELECTRICITY-PJM-METED-REAL TIME"),
        ELECTRICITY_PJM_NEW_JERSEY_HUB_DAY_AHEAD_("ELECTRICITY-PJM-NEW JERSEY HUB-DAY AHEAD"),
        ELECTRICITY_PJM_NEW_JERSEY_HUB_REAL_TIME_("ELECTRICITY-PJM-NEW JERSEY HUB-REAL TIME"),
        ELECTRICITY_PJM_NORTHERN_ILLINOIS_HUB_DAY_AHEAD_("ELECTRICITY-PJM-NORTHERN ILLINOIS HUB-DAY AHEAD"),
        ELECTRICITY_PJM_NORTHERN_ILLINOIS_HUB_REAL_TIME_("ELECTRICITY-PJM-NORTHERN ILLINOIS HUB-REAL TIME"),
        ELECTRICITY_PJM_OHIO_HUB_DAY_AHEAD("ELECTRICITY-PJM-OHIO HUB-DAY AHEAD"),
        ELECTRICITY_PJM_OHIO_HUB_REAL_TIME("ELECTRICITY-PJM-OHIO HUB-REAL TIME"),
        ELECTRICITY_PJM_PECO_DAY_AHEAD("ELECTRICITY-PJM-PECO-DAY AHEAD"),
        ELECTRICITY_PJM_PECO_REAL_TIME("ELECTRICITY-PJM-PECO-REAL TIME"),
        ELECTRICITY_PJM_PENELEC_DAY_AHEAD("ELECTRICITY-PJM-PENELEC-DAY AHEAD"),
        ELECTRICITY_PJM_PENELEC_REAL_TIME("ELECTRICITY-PJM-PENELEC-REAL TIME"),
        ELECTRICITY_PJM_PEPCO_DAY_AHEAD("ELECTRICITY-PJM-PEPCO-DAY AHEAD"),
        ELECTRICITY_PJM_PEPCO_REAL_TIME("ELECTRICITY-PJM-PEPCO-REAL TIME"),
        ELECTRICITY_PJM_PPL_DAY_AHEAD("ELECTRICITY-PJM-PPL-DAY AHEAD"),
        ELECTRICITY_PJM_PPL_REAL_TIME("ELECTRICITY-PJM-PPL-REAL TIME"),
        ELECTRICITY_PJM_PSEG_DAY_AHEAD_("ELECTRICITY-PJM-PSEG-DAY AHEAD"),
        ELECTRICITY_PJM_PSEG_REAL_TIME_("ELECTRICITY-PJM-PSEG-REAL TIME"),
        ELECTRICITY_PJM_RECO_DAY_AHEAD("ELECTRICITY-PJM-RECO-DAY AHEAD"),
        ELECTRICITY_PJM_RECO_REAL_TIME("ELECTRICITY-PJM-RECO-REAL TIME"),
        ELECTRICITY_PJM_STEELCTY_BETH_4_CC_DAY_AHEAD("ELECTRICITY-PJM-STEELCTY BETH 4CC-DAY AHEAD"),
        ELECTRICITY_PJM_STEELCTY_BETH_4_CC_REAL_TIME("ELECTRICITY-PJM-STEELCTY BETH 4CC-REAL TIME"),
        ELECTRICITY_PJM_STEELCTY_BETH_8_CC_DAY_AHEAD("ELECTRICITY-PJM-STEELCTY BETH 8CC-DAY AHEAD"),
        ELECTRICITY_PJM_STEELCTY_BETH_8_CC_REAL_TIME("ELECTRICITY-PJM-STEELCTY BETH 8CC-REAL TIME"),
        ELECTRICITY_PJM_WEST_INTERFACE_HUB_DAY_AHEAD("ELECTRICITY-PJM-WEST INTERFACE HUB-DAY AHEAD"),
        ELECTRICITY_PJM_WEST_INTERFACE_HUB_REAL_TIME("ELECTRICITY-PJM-WEST INTERFACE HUB-REAL TIME"),
        ELECTRICITY_PJM_WEST_OFF_PEAK_ICE("ELECTRICITY-PJM-WEST OFF-PEAK-ICE"),
        ELECTRICITY_PJM_WEST_PEAK_ICE("ELECTRICITY-PJM-WEST PEAK-ICE"),
        ELECTRICITY_PJM_WEST_REAL_TIME_OFF_PEAK_ICE("ELECTRICITY-PJM-WEST REAL TIME OFF-PEAK-ICE"),
        ELECTRICITY_PJM_WEST_REAL_TIME_PEAK_ICE("ELECTRICITY-PJM-WEST REAL TIME PEAK-ICE"),
        ELECTRICITY_PJM_WESTPEAK_ICE("ELECTRICITY-PJM-WESTPEAK-ICE"),
        ELECTRICITY_PORTUGUESE_POWER_INDEX_HOURLY_OMIE("ELECTRICITY-PORTUGUESE POWER INDEX-HOURLY- OMIE"),
        ELECTRICITY_POWER_INDEX_HOURLY_APX("ELECTRICITY-POWER INDEX-HOURLY-APX"),
        ELECTRICITY_POWER_INDEX_HOURLY_EEX_("ELECTRICITY-POWER INDEX-HOURLY-EEX"),
        ELECTRICITY_POWER_INDEX_HOURLY_OMIE("ELECTRICITY-POWER INDEX-HOURLY-OMIE"),
        ELECTRICITY_PREZZO_UNICO_NAZIONALE_HOURLY_GME("ELECTRICITY-PREZZO UNICO NAZIONALE-HOURLY-GME"),
        ELECTRICITY_QUARTER_FUTURES_BASE_EEX("ELECTRICITY-QUARTER FUTURES BASE-EEX"),
        ELECTRICITY_QUARTER_FUTURES_PEAK_EEX("ELECTRICITY-QUARTER FUTURES PEAK-EEX"),
        ELECTRICITY_SEK_ELSPOT_NO_1_OSL_HOURLY_NORDPOOL("ELECTRICITY-SEK- ELSPOT NO1 (OSL)-HOURLY- NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_SYSTEM_PRICE_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT (SYSTEM PRICE)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_DK_1_ARH_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT DK1 (ARH)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_DK_2_CPH_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT DK2 (CPH)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_FINLAND_HEL_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT FINLAND (HEL)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_NO_2_KRI_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT NO2 (KRI)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_NO_3_TRON_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT NO3 (TRON)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_NO_4_TROM_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT NO4 (TROM)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_NO_5_BER_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT NO5 (BER)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_SE_1_LLA_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT SE1 (LLA)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_SE_2_SDL_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT SE2 (SDL)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_SE_3_STO_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT SE3 (STO)-HOURLY-NORDPOOL"),
        ELECTRICITY_SEK_ELSPOT_SE_4_MMX_HOURLY_NORDPOOL("ELECTRICITY-SEK-ELSPOT SE4 (MMX)-HOURLY-NORDPOOL"),
        ELECTRICITY_SOCO_PEAK_ICE("ELECTRICITY-SOCO PEAK-ICE"),
        ELECTRICITY_SP_15_DAY_AHEAD_OFF_PEAK_ICE("ELECTRICITY-SP-15 DAY AHEAD OFF-PEAK-ICE"),
        ELECTRICITY_SP_15_DAY_AHEAD_PEAK_ICE("ELECTRICITY-SP-15 DAY AHEAD PEAK-ICE"),
        ELECTRICITY_SP_15_FIRM_OFF_PEAK_DOW_JONES_POWER("ELECTRICITY-SP-15 FIRM (OFF-PEAK)-DOW JONES POWER"),
        ELECTRICITY_SP_15_FIRM_ON_PEAK_DOW_JONES("ELECTRICITY-SP-15 FIRM (ON-PEAK)-DOW JONES"),
        ELECTRICITY_SP_15_OFF_PEAK_ICE("ELECTRICITY-SP-15 OFF-PEAK-ICE"),
        ELECTRICITY_SP_15_PEAK_ICE("ELECTRICITY-SP-15 PEAK-ICE"),
        ELECTRICITY_SWEP_DOW_JONES_POWER("ELECTRICITY-SWEP-DOW JONES POWER"),
        ELECTRICITY_SWISSIX_DAY_BASE_EEX("ELECTRICITY-SWISSIX DAY BASE-EEX"),
        ELECTRICITY_UK_BASE_ICE("ELECTRICITY-UK BASE-ICE"),
        ELECTRICITY_UK_PEAK_ICE("ELECTRICITY-UK PEAK-ICE"),
        ELECTRICITY_WEST_WING_OFF_PEAK_ICE("ELECTRICITY-WEST WING OFF-PEAK-ICE"),
        ELECTRICITY_WEST_WING_PEAK_ICE("ELECTRICITY-WEST WING PEAK-ICE"),
        ELECTRICITY_YEAR_FUTURES_BASE_EEX("ELECTRICITY-YEAR FUTURES BASE-EEX"),
        ELECTRICITY_YEAR_FUTURES_PEAK_EEX("ELECTRICITY-YEAR FUTURES PEAK-EEX"),
        EMISSIONS_BLUENEXT_FUTURES_CER("EMISSIONS - BLUENEXT FUTURES CER"),
        EMISSIONS_BLUENEXT_FUTURES_EUA("EMISSIONS - BLUENEXT FUTURES EUA"),
        EMISSIONS_BLUENEXT_SPOT_CER("EMISSIONS - BLUENEXT SPOT CER"),
        EMISSIONS_BLUENEXT_SPOT_ERU("EMISSIONS - BLUENEXT SPOT ERU"),
        EMISSIONS_BLUENEXT_SPOT_EUA("EMISSIONS - BLUENEXT SPOT EUA"),
        EMISSIONS_BLUENEXT_SPOT_GREEN_CER("EMISSIONS - BLUENEXT SPOT GREEN CER"),
        EMISSIONS_EU_ETS_CER_FORWARD_NASDAQ_OMX("EMISSIONS - EU ETS-CER FORWARD-NASDAQ OMX"),
        EMISSIONS_EU_ETS_CER_FUTURES_NASDAQ_OMX("EMISSIONS - EU ETS-CER FUTURES-NASDAQ OMX"),
        EMISSIONS_EU_ETS_CER_SPOT_NASDAQ_OMX("EMISSIONS - EU ETS-CER SPOT-NASDAQ OMX"),
        EMISSIONS_EU_ETS_EUA_FORWARD_NASDAQ_OMX("EMISSIONS - EU ETS-EUA FORWARD-NASDAQ OMX"),
        EMISSIONS_EU_ETS_EUA_FUTURES_NASDAQ_OMX("EMISSIONS - EU ETS-EUA FUTURES-NASDAQ OMX"),
        EMISSIONS_EU_ETS_EUA_SPOT_NASDAQ_OMX("EMISSIONS - EU ETS-EUA SPOT-NASDAQ OMX"),
        EMISSIONS_EU_ETS_EUROPEAN_CARBON_FUTURES_FORWARD_EEX("EMISSIONS - EU ETS-EUROPEAN CARBON FUTURES FORWARD-EEX"),
        EMISSIONS_EU_ETS_LEBA_CARBON_CER_INDEX("EMISSIONS - EU ETS-LEBA CARBON CER INDEX"),
        EMISSIONS_EU_ETS_LEBA_CARBON_EUA_INDEX("EMISSIONS - EU ETS-LEBA CARBON EUA INDEX"),
        EMISSIONS_EU_ETS_LEBA_SPOT_CARBON_CER_INDEX("EMISSIONS - EU ETS-LEBA SPOT CARBON CER INDEX"),
        EMISSIONS_EU_ETS_LEBA_SPOT_CARBON_EUA_INDEX("EMISSIONS - EU ETS-LEBA SPOT CARBON EUA INDEX"),
        EMISSIONS_EU_ETS_PWX_CARBON_SPOT_POWERNEXT("EMISSIONS - EU ETS-PWX CARBON SPOT-POWERNEXT"),
        EMISSIONS_EU_ETS_SPOT_EEX("EMISSIONS - EU ETS-SPOT-EEX"),
        EMISSIONS_EU_ETS_SPOT_EXAA("EMISSIONS - EU ETS-SPOT-EXAA"),
        EMISSIONS_ICE_ECX_CER_DAILY_FUTURES("EMISSIONS - ICE ECX CER DAILY FUTURES"),
        EMISSIONS_ICE_ECX_CER_FUTURES_OPTIONS("EMISSIONS - ICE ECX CER Futures Options"),
        EMISSIONS_ICE_ECX_CER_FUTURES("EMISSIONS - ICE ECX CER FUTURES"),
        EMISSIONS_ICE_ECX_EUA_FUTURES_OPTIONS("EMISSIONS - ICE ECX EUA Futures Options"),
        EMISSIONS_ICE_ECX_EUA_DAILY_FUTURES("EMISSIONS - ICE-ECX EUA Daily Futures"),
        EMISSIONS_ICE_ECX_EUA_FUTURES("EMISSIONS - ICE-ECX EUA FUTURES"),
        ETHANOL_T_1_FOB_ROTTERDAM_ARGUS_BIOFUELS("ETHANOL T1 FOB ROTTERDAM-ARGUS BIOFUELS"),
        ETHANOL_T_2_FOB_ROTTERDAM_ARGUS_BIOFUELS("ETHANOL T2 FOB ROTTERDAM-ARGUS BIOFUELS"),
        ETHANOL_BM_F("ETHANOL-BM&F"),
        ETHANOL_CBOT("ETHANOL-CBOT"),
        ETHANOL_CME("ETHANOL-CME"),
        ETHANOL_ICE("ETHANOL-ICE"),
        ETHANOL_PLATTS_OILGRAM("ETHANOL-PLATTS OILGRAM"),
        ETHYLENE_CMAI("Ethylene CMAI"),
        FEED_BARLEY_ASX("FEED BARLEY-ASX"),
        FEEDER_CATTLE_CME("FEEDER CATTLE-CME"),
        FINE_WOOL_19_MICRON_SFE("FINE WOOL (19 MICRON)-SFE"),
        FOEX_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_PULP_PIX_INDEX("FOEX Northern Bleached Softwood Kraft Pulp PIX Index"),
        FOEX_PIX_PULP_US_BHKP_PRICE("FOEX PIX Pulp US BHKP Price"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_INDEX_ROUTE_M_1_B_OR_BALTIC_S_1_B_EACH("FREIGHT-BALTIC EXCHANGE- SUPRAMEX INDEX ROUTE M1B or BALTIC S1B each"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_INDEX_ROUTE_M_3_OR_BALTIC_S_3_EACH("FREIGHT-BALTIC EXCHANGE- SUPRAMEX INDEX ROUTE M3 or BALTIC S3 each"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_INDEX_ROUTE_S_2_OR_BALTIC_S_2_EACH("FREIGHT-BALTIC EXCHANGE- SUPRAMEX INDEX ROUTE S2 or BALTIC S2 each"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_INDEX_ROUTE_S_4_A_OR_BALTIC_S_4_A_EACH("FREIGHT-BALTIC EXCHANGE- SUPRAMEX INDEX ROUTE S4A or BALTIC S4A each"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_INDEX_ROUTE_S_4_B_OR_BALTIC_S_4_B_EACH("FREIGHT-BALTIC EXCHANGE- SUPRAMEX INDEX ROUTE S4B or BALTIC S4B each"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_WEIGHTED_INDEX_AVERAGE_ROUTES_CALCULATED_DAILY_AVERAGE("FREIGHT-BALTIC EXCHANGE- SUPRAMEX WEIGHTED INDEX AVERAGE ROUTES-CALCULATED DAILY AVERAGE"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_10_03_OR_BALTIC_C_10_03_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C10_03 or BALTIC C10_03 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_11_03_OR_BALTIC_C_11_03_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C11_03 or BALTIC C11_03 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_2_OR_BALTIC_C_2_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C2 or BALTIC C2 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_3_OR_BALTIC_C_3_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C3 or BALTIC C3 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_4_OR_BALTIC_C_4_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C4 or BALTIC C4 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_5_OR_BALTIC_C_5_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C5 or BALTIC C5 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_7_OR_BALTIC_C_7_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C7 or BALTIC C7 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_8_03_OR_BALTIC_C_8_03_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C8_03 or BALTIC C8_03 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_ROUTE_C_9_03_OR_BALTIC_C_9_03_EACH("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX ROUTE C9_03 or BALTIC C9_03 each"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_TIME_CHARTER_AVERAGE_ROUTES_CALCULATED_DAILY_AVERAGE("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX TIME CHARTER AVERAGE ROUTES-CALCULATED DAILY AVERAGE"),
        FREIGHT_BALTIC_EXCHANGE_CAPESIZE_INDEX_TIME_CHARTER_AVERAGE_ROUTES_PUBLISHED_DAILY_AVERAGE("FREIGHT-BALTIC EXCHANGE-CAPESIZE INDEX TIME CHARTER AVERAGE ROUTES-PUBLISHED DAILY AVERAGE"),
        FREIGHT_BALTIC_EXCHANGE_CLEAN_TANKER_INDEX_ROUTE_TC_1_OR_BALTIC_TC_1_EACH("FREIGHT-BALTIC EXCHANGE-CLEAN TANKER INDEX ROUTE TC1 or BALTIC TC1 each"),
        FREIGHT_BALTIC_EXCHANGE_CLEAN_TANKER_INDEX_ROUTE_TC_2_37_OR_BALTIC_TC_2_37_EACH("FREIGHT-BALTIC EXCHANGE-CLEAN TANKER INDEX ROUTE TC2_37 or BALTIC TC2_37 each"),
        FREIGHT_BALTIC_EXCHANGE_CLEAN_TANKER_INDEX_ROUTE_TC_3_38_OR_BALTIC_TC_3_38_EACH("FREIGHT-BALTIC EXCHANGE-CLEAN TANKER INDEX ROUTE TC3_38 or BALTIC TC3_38 each"),
        FREIGHT_BALTIC_EXCHANGE_CLEAN_TANKER_INDEX_ROUTE_TC_4_OR_BALTIC_TC_4_EACH("FREIGHT-BALTIC EXCHANGE-CLEAN TANKER INDEX ROUTE TC4 or BALTIC TC4 each"),
        FREIGHT_BALTIC_EXCHANGE_CLEAN_TANKER_INDEX_ROUTE_TC_5_OR_BALTIC_TC_5_EACH("FREIGHT-BALTIC EXCHANGE-CLEAN TANKER INDEX ROUTE TC5 or BALTIC TC5 each"),
        FREIGHT_BALTIC_EXCHANGE_CLEAN_TANKER_INDEX_ROUTE_TC_6_OR_BALTIC_TC_6_EACH("FREIGHT-BALTIC EXCHANGE-CLEAN TANKER INDEX ROUTE TC6 or BALTIC TC6 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_1_OR_BALTIC_TD_1_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD1 or BALTIC TD1 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_10_OR_BALTIC_TD_10_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD10 or BALTIC TD10 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_10_D_OR_BALTIC_TD_10_D_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD10D or BALTIC TD10D each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_11_OR_BALTIC_TD_11_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD11 or BALTIC TD11 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_12_OR_BALTIC_TD_12_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD12 or BALTIC TD12 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_2_OR_BALTIC_TD_2_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD2 or BALTIC TD2 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_3_OR_BALTIC_TD_3_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD3 or BALTIC TD3 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_4_OR_BALTIC_TD_4_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD4 or BALTIC TD4 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_5_OR_BALTIC_TD_5_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD5 or BALTIC TD5 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_6_OR_BALTIC_TD_6_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD6 or BALTIC TD6 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_7_OR_BALTIC_TD_7_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD7 or BALTIC TD7 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_8_OR_BALTIC_TD_8_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD8 or BALTIC TD8 each"),
        FREIGHT_BALTIC_EXCHANGE_DIRTY_TANKER_INDEX_ROUTE_TD_9_OR_BALTIC_TD_9_EACH("FREIGHT-BALTIC EXCHANGE-DIRTY TANKER INDEX ROUTE TD9 or BALTIC TD9 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_1_OR_BALTIC_P_1_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P1 or BALTIC P1 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_1_A_03_OR_BALTIC_P_1_A_03_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P1A_03 or BALTIC P1A_03 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_2_OR_BALTIC_P_2_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P2 or BALTIC P2 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_2_A_03_OR_BALTIC_P_2_A_03_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P2A_03 or BALTIC P2A_03 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_3_OR_BALTIC_P_3_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P3 or BALTIC P3 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_3_A_03_OR_BALTIC_P_3_A_03_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P3A_03 or BALTIC P3A_03 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_ROUTE_P_4_03_OR_BALTIC_P_4_03_EACH("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX ROUTE P4_03 or BALTIC P4_03 each"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_INDEX_TIME_CHARTER_AVERAGE_ROUTES_PUBLISHED_DAILY_AVERAGE("FREIGHT-BALTIC EXCHANGE-PANAMAX INDEX TIME CHARTER AVERAGE ROUTES-PUBLISHED DAILY AVERAGE"),
        FREIGHT_BALTIC_EXCHANGE_PANAMAX_TIME_CHARTER_INDEX_AVERAGE_ROUTES_CALCULATED_DAILY_AVERAGE("FREIGHT-BALTIC EXCHANGE-PANAMAX TIME CHARTER INDEX AVERAGE ROUTES-CALCULATED DAILY AVERAGE"),
        FREIGHT_BALTIC_EXCHANGE_SUPRAMEX_INDEX_ROUTE_M_1_A_OR_BALTIC_S_1_A_EACH("FREIGHT-BALTIC EXCHANGE-SUPRAMEX INDEX ROUTE M1A or BALTIC S1A each"),
        FREIGHT_CAPESIZE_BOLIVAR_SSY("FREIGHT-CAPESIZE-BOLIVAR-SSY"),
        FREIGHT_CAPESIZE_RICHARDS_BAY_SSY("FREIGHT-CAPESIZE-RICHARDS BAY-SSY"),
        FREIGHT_PANAMAX_BOLIVAR_SSY("FREIGHT-PANAMAX-BOLIVAR-SSY"),
        FREIGHT_PANAMAX_INDONESIA_SSY("FREIGHT-PANAMAX-INDONESIA-SSY"),
        FREIGHT_PANAMAX_RICHARDS_BAY_SSY("FREIGHT-PANAMAX-RICHARDS BAY-SSY"),
        FREIGHT_PLATTS_CLEAN_TANKERWIRE_INDEX_ROUTE_TC_1_RAS_TANURA_YOKOHAMA_OR_PLATTS_TC_1_RT_YOK_EACH("FREIGHT-PLATTS CLEAN TANKERWIRE INDEX-ROUTE TC1 (RAS TANURA-YOKOHAMA) or PLATTS TC1 (RT-YOK) each"),
        FREIGHT_PLATTS_CLEAN_TANKERWIRE_INDEX_ROUTE_TC_2_37_ROTTERDAM_NY_OR_PLATTS_TC_2_37_RDM_NY_EACH("FREIGHT-PLATTS CLEAN TANKERWIRE INDEX-ROUTE TC2_37 (ROTTERDAM-NY) or PLATTS TC2_37 (RDM-NY) each"),
        FREIGHT_PLATTS_CLEAN_TANKERWIRE_INDEX_ROUTE_TC_3_30_ARUBA_NEW_YORK_OR_PLATTS_TC_3_30_ARU_NY_EACH("FREIGHT-PLATTS CLEAN TANKERWIRE INDEX-ROUTE TC3_30 (ARUBA-NEW YORK) or PLATTS TC3_30 (ARU-NY) each"),
        FREIGHT_PLATTS_CLEAN_TANKERWIRE_INDEX_ROUTE_TC_4_SINGAPORE_CHIBA_OR_PLATTS_TC_4_SING_CHI_EACH("FREIGHT-PLATTS CLEAN TANKERWIRE INDEX-ROUTE TC4 (SINGAPORE-CHIBA) or PLATTS TC4 (SING-CHI) each"),
        FREIGHT_PLATTS_CLEAN_TANKERWIRE_INDEX_ROUTE_TC_5_RAS_TANURA_YOKOHAMA_OR_PLATTS_TC_5_RT_YOK_EACH("FREIGHT-PLATTS CLEAN TANKERWIRE INDEX-ROUTE TC5 (RAS TANURA-YOKOHAMA) or PLATTS TC5 (RT-YOK) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_1_270_RAS_TANURA_LOOP_OR_PLATTS_TD_1_270_RT_LOOP_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD1_270 (RAS TANURA-LOOP) or PLATTS TD1_270 (RT-LOOP) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_10_ARUBA_NEW_YORK_OR_PLATTS_TD_10_ARU_NY_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD10 (ARUBA-NEW YORK) or PLATTS TD10 (ARU-NY) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_11_BANIAS_LAVERA_OR_PLATTS_TD_11_BAN_LAV_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD11 (BANIAS-LAVERA) or PLATTS TD11 (BAN-LAV) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_12_ANTWERP_HOUSTON_OR_PLATTS_TD_12_ARA_USG_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD12 (ANTWERP-HOUSTON) or PLATTS TD12 (ARA-USG) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_14_DUMAI_CHIBA_OR_PLATTS_TD_14_DUM_CHI_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD14 (DUMAI-CHIBA) or PLATTS TD14 (DUM-CHI) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_2_RAS_TANURA_SINGAPORE_OR_PLATTS_TD_2_RT_SING_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD2 (RAS TANURA-SINGAPORE) or PLATTS TD2 (RT-SING) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_3_250_RAS_TANURA_CHIBA_OR_PLATTS_TD_3_250_RT_CHI_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD3_250 (RAS TANURA-CHIBA) or PLATTS TD3_250 (RT-CHI) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_4_O_S_BONNY_LOOP_OR_PLATTS_TD_4_BSY_LOOP_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD4 (O.S BONNY-LOOP) or PLATTS TD4 (BSY-LOOP) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_5_O_S_BONNY_PHILADELPHIA_OR_PLATTS_TD_5_BSY_PHIL_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD5 (O.S BONNY-PHILADELPHIA) or PLATTS TD5 (BSY-PHIL) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_6_NOVOROSSIYK_AUGUSTA_OR_PLATTS_TD_6_X_MED_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD6 (NOVOROSSIYK-AUGUSTA) or PLATTS TD6 (X-MED) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_7_SULLOM_VOE_WILHELMSHAVEN_OR_PLATTS_TD_7_SV_WH_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD7 (SULLOM VOE-WILHELMSHAVEN or PLATTS TD7 (SV-WH) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_8_MENA_AL_AHMADI_SINGAPORE_OR_PLATTS_TD_8_MA_SP_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD8 (MENA AL AHMADI-SINGAPORE) or PLATTS TD8 (MA-SP) each"),
        FREIGHT_PLATTS_DIRTY_TANKERWIRE_INDEX_ROUTE_TD_9_PUERTO_LAS_CRUZ_CORPUS_CHRISTI_OR_PLATTS_TD_9_PLC_CC_EACH("FREIGHT-PLATTS DIRTY TANKERWIRE INDEX-ROUTE TD9 (PUERTO LAS CRUZ-CORPUS CHRISTI) or PLATTS TD9 (PLC-CC) each"),
        FROZEN_CONCENTRATED_ORANGE_JUICE_NO_1_ICE("FROZEN CONCENTRATED ORANGE JUICE NO. 1-ICE"),
        FUEL_OIL_180_CST_SINGAPORE_CARGOES_PLATTS_ASIA_PACIFIC("FUEL OIL - 180 CST SINGAPORE (CARGOES) - PLATTS ASIA PACIFIC"),
        FUEL_OIL_380_CST_FOR_ARAB_GULF_PLATTS_ASIA_PACIFIC("FUEL OIL 380 CST - FOR ARAB GULF - PLATTS ASIA-PACIFIC"),
        FUEL_OIL_SCHWERES_HEIZOEL_1_PERCENT_HSL_RHEINSCHIENE("FUEL OIL SCHWERES HEIZOEL-1 PERCENT HSL RHEINSCHIENE"),
        FUEL_OIL_1_PERCENT_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-1 PERCENT-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_1_PERCENT_BARGES_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-1 PERCENT-BARGES-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_1_PERCENT_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-1 PERCENT-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_1_PERCENT_CARGOES_FOB_NWE_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-1 PERCENT-CARGOES FOB NWE-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_1_PERCENT_CIF_MED_GENOVA_LAVERA_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-1 PERCENT-CIF MED (GENOVA/LAVERA)-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_1_PERCENT_CIF_NWE_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-1 PERCENT-CIF-NWE-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_1_PERCENT_CIF_WEST_MED_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-1 PERCENT-CIF-WEST MED-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_1_PERCENT_FOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-1 PERCENT-FOB MED (ITALY)-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_1_PERCENT_FOB_NWE_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-1 PERCENT-FOB-NWE-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_1_PERCENT_FOB_WEST_MED_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-1 PERCENT-FOB-WEST MED-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_180_CST_ARAB_GULF_FOB_PLATTS_ASIA_PACIFIC("FUEL OIL-180 CST ARAB GULF (FOB)-PLATTS ASIA-PACIFIC"),
        FUEL_OIL_180_CST_SINGAPORE_PLATTS_OILGRAM_BUNKERWIRE("FUEL OIL-180 CST SINGAPORE-PLATTS OILGRAM BUNKERWIRE"),
        FUEL_OIL_3_5_PERCENT_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-3.5 PERCENT-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_3_5_PERCENT_BARGES_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-3.5 PERCENT-BARGES-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_3_5_PERCENT_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-3.5 PERCENT-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_3_5_PERCENT_CARGOES_FOB_NWE_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-3.5 PERCENT-CARGOES FOB NWE-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_3_5_PERCENT_CIF_MED_GENOVA_LAVERA_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-3.5 PERCENT-CIF MED (GENOVA/LAVERA)-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_3_5_PERCENT_CIF_NWE_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-3.5 PERCENT-CIF-NWE-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_3_5_PERCENT_FOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("FUEL OIL-3.5 PERCENT-FOB MED (ITALY)-PLATTS EUROPEAN MARKETSCAN"),
        FUEL_OIL_3_5_PERCENT_FOB_NWE_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-3.5 PERCENT-FOB-NWE-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_3_5_PERCENT_FOB_WEST_MED_ARGUS_EUROPEAN_PRODUCTS_REPORT("FUEL OIL-3.5 PERCENT-FOB-WEST MED-ARGUS EUROPEAN PRODUCTS REPORT"),
        FUEL_OIL_380_CST_DAILY_PRICE_ASSESSMENTS_CRISTOBAL_EX_WHARF_PLATTS_OILGRAM_BUNKERWIRE("FUEL OIL-380 CST DAILY PRICE ASSESSMENTS CRISTOBAL (EX-WHARF)-PLATTS OILGRAM BUNKERWIRE"),
        FUEL_OIL_380_CST_FUJAIRAH_IFO_PLATTS_OILGRAM_BUNKERWIRE("FUEL OIL-380 CST FUJAIRAH (IFO)-PLATTS OILGRAM BUNKERWIRE"),
        FUEL_OIL_380_CST_ROTTERDAM_IFO_PLATTS_OILGRAM_BUNKERWIRE("FUEL OIL-380 CST ROTTERDAM (IFO)-PLATTS OILGRAM BUNKERWIRE"),
        FUEL_OIL_380_CST_SINGAPORE_CARGOES_PLATTS_ASIA_PACIFIC_MARKETSCAN("FUEL OIL-380 CST SINGAPORE (CARGOES)-PLATTS ASIA-PACIFIC MARKETSCAN"),
        FUEL_OIL_380_CST_SINGAPORE_NON_CARGOES_PLATTS_OILGRAM_BUNKERWIRE("FUEL OIL-380 CST SINGAPORE (NON-CARGOES)-PLATTS OILGRAM BUNKERWIRE"),
        FUEL_OIL_NO_6_0_3_PERCENT_HP_NEW_YORK_BARGE_PLATTS_U_S("FUEL OIL-NO. 6 0.3 PERCENT HP NEW YORK (BARGE)-PLATTS U.S."),
        FUEL_OIL_NO_6_0_3_PERCENT_HP_NEW_YORK_CARGO_PLATTS_U_S("FUEL OIL-NO. 6 0.3 PERCENT HP NEW YORK (CARGO)-PLATTS U.S."),
        FUEL_OIL_NO_6_0_3_PERCENT_LP_NEW_YORK_CARGO_PLATTS_U_S("FUEL OIL-NO. 6 0.3 PERCENT LP NEW YORK (CARGO)-PLATTS U.S."),
        FUEL_OIL_NO_6_0_7_PERCENT_NEW_YORK_CARGO_PLATTS_U_S("FUEL OIL-NO. 6 0.7 PERCENT NEW YORK (CARGO)-PLATTS U.S."),
        FUEL_OIL_NO_6_1_0_PERCENT_GULF_COAST_WATERBORNE_8_API_PLATTS_U_S("FUEL OIL-NO. 6 1.0 PERCENT GULF COAST (WATERBORNE)-8 API-PLATTS U.S."),
        FUEL_OIL_NO_6_1_0_PERCENT_NEW_YORK_CARGO_PLATTS_U_S("FUEL OIL-NO. 6 1.0 PERCENT NEW YORK (CARGO)-PLATTS U.S."),
        FUEL_OIL_NO_6_2_2_PERCENT_RESIDUAL_BARGE_PLATTS_U_S("FUEL OIL-NO. 6 2.2 PERCENT RESIDUAL (BARGE)-PLATTS U.S."),
        FUEL_OIL_NO_6_2_2_PERCENT_RESIDUAL_CARGO_PLATTS_U_S("FUEL OIL-NO. 6 2.2 PERCENT RESIDUAL (CARGO)-PLATTS U.S."),
        FUEL_OIL_NO_6_3_0_PERCENT_GULF_COAST_WATERBORNE_PLATTS_U_S("FUEL OIL-NO. 6 3.0 PERCENT GULF COAST (WATERBORNE)-PLATTS U.S."),
        FUEL_OIL_NO_6_3_0_PERCENT_NEW_YORK_CARGO_PLATTS_U_S("FUEL OIL-NO. 6 3.0 PERCENT NEW YORK (CARGO)-PLATTS U.S."),
        GAS_OIL_50_PPM_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("GAS OIL - 50 PPM - BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        GAS_OIL_0_1_PERCENT_CARGOESFOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("GAS OIL-0.1 PERCENT CARGOESFOB MED (ITALY)-PLATTS EUROPEAN MARKETSCAN"),
        GAS_OIL_0_1_PERCENT_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("GAS OIL-0.1 PERCENT-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        GAS_OIL_0_1_PERCENT_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("GAS OIL-0.1 PERCENT-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        GAS_OIL_0_1_PERCENT_CARGOES_FOB_NWE_PLATTS_EUROPEAN("GAS OIL-0.1 PERCENT-CARGOES FOB NWE-PLATTS EUROPEAN"),
        GAS_OIL_0_1_PERCENT_CIF_MED_GENOVA_LAVERA_PLATTS_EUROPEAN_MARKETSCAN("GAS OIL-0.1 PERCENT-CIF MED (GENOVA/LAVERA)-PLATTS EUROPEAN MARKETSCAN"),
        GAS_OIL_0_5_SINGAPORE_PLATTS_ASIA_PACIFIC("GAS OIL-0.5 SINGAPORE-PLATTS ASIA-PACIFIC,"),
        GAS_OIL_ICE_GASOIL_AVERAGE_ARGUS_EUROPEAN_PRODUCTS_REPORT("GAS OIL-ICE GASOIL AVERAGE-ARGUS EUROPEAN PRODUCTS REPORT"),
        GAS_OIL_ICE_GASOIL_AVERAGE_PLATTS_EUROPEAN_MARKETSCAN("GAS OIL-ICE GASOIL AVERAGE-PLATTS EUROPEAN MARKETSCAN"),
        GAS_OIL_ICE("GAS OIL-ICE"),
        GAS_OIL_LEICHTES_HEIZOEL_RHEINSCHIENE("GAS OIL-LEICHTES HEIZOEL RHEINSCHIENE"),
        GAS_OIL_TOCOM("GAS OIL-TOCOM"),
        GASOIL_FOB_ARAB_GULF_PLATTS_ASIA_PACIFIC("GASOIL - FOB ARAB GULF - PLATTS ASIA-PACIFIC"),
        GASOIL_0_05_FOB_SINGAPORE_PLATTS_ASIA_PACIFIC("GASOIL 0.05 - FOB SINGAPORE - PLATTS ASIA-PACIFIC"),
        GASOIL_0_25_FOB_SINGAPORE_PLATTS_ASIA_PACIFIC("GASOIL 0.25 - FOB SINGAPORE - PLATTS ASIA-PACIFIC"),
        GASOIL_10_PPM_FOB_SINGAPORE_PLATTS_ASIA_PACIFIC("GASOIL 10PPM - FOB SINGAPORE - PLATTS ASIA-PACIFIC"),
        GASOIL_50_PPM_FOB_SINGAPORE_PLATTS_ASIA_PACIFIC("GASOIL 50PPM - FOB SINGAPORE - PLATTS ASIA-PACIFIC"),
        GASOIL_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("Gasoil-waterborne spot Tokyo bay rim intelligence products"),
        GASOLINE_87_M_COLONIAL_ARGUS_US_PRODUCTS("GASOLINE 87M COLONIAL-ARGUS US PRODUCTS"),
        GASOLINE_10_PPM_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("GASOLINE- 10PPM -CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        GASOLINE_MOGAS_95_R_UNL_10_PPM_BARGES_ARGUS_EUROPEAN_PRODUCTS("GASOLINE- MOGAS 95R UNL 10PPM-BARGES-ARGUS EUROPEAN PRODUCTS"),
        GASOLINE_CARBOB_R_LOS_ANGELES_PIPELINE_OPIS_WEST_COAST("GASOLINE-CARBOB-R LOS ANGELES (PIPELINE)-OPIS WEST COAST"),
        GASOLINE_CBOB_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-CBOB GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_EUROBOB_NON_OXY_ARGUS_EUROPEAN_PRODUCTS("GASOLINE-EUROBOB NON OXY-ARGUS EUROPEAN PRODUCTS"),
        GASOLINE_EUROBOB_OXY_BARGES_ARGUS_EUROPEAN_PRODUCTS("GASOLINE-EUROBOB OXY-BARGES -ARGUS EUROPEAN PRODUCTS"),
        GASOLINE_MOGAS_95_R_UNL_10_PPM_CIF_NWE_CARGOES_ARGUS_EUROPEAN_PRODUCTS("GASOLINE-MOGAS 95R UNL 10PPM-CIF NWE-CARGOES-ARGUS EUROPEAN PRODUCTS"),
        GASOLINE_PREM_RBOB_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-PREM RBOB GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_PREM_UNL_93_ULS_30_ATLANTA_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-PREM UNL 93 ULS 30 ATLANTA GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_PREMIUM_CBOB_NEW_YORK_HARBOR_FOB_BARGE_PLATTS_US_MARKETSCAN("GASOLINE-PREMIUM CBOB NEW YORK HARBOR (FOB Barge)-PLATTS US MARKETSCAN"),
        GASOLINE_PREMIUM_UNL_10_PPM_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("GASOLINE-PREMIUM UNL 10 PPM-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        GASOLINE_PREMIUM_UNL_10_PPM_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("GASOLINE-PREMIUM UNL 10 PPM-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        GASOLINE_PREMIUM_UNL_10_PPM_CARGOES_FOB_NWE_PLATTS_EUROPEAN_MARKETSCAN("GASOLINE-PREMIUM UNL 10 PPM-CARGOES FOB NWE-PLATTS EUROPEAN MARKETSCAN"),
        GASOLINE_PREMIUM_UNL_10_PPM_FOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("GASOLINE-PREMIUM UNL 10 PPM-FOB MED (ITALY)-PLATTS EUROPEAN MARKETSCAN"),
        GASOLINE_RBOB_NEW_YORK_ICE("GASOLINE-RBOB-NEW YORK-ICE"),
        GASOLINE_RBOB_NEW_YORK_NYMEX("GASOLINE-RBOB-NEW YORK-NYMEX"),
        GASOLINE_REGULAR_U_S_ENERGY_INFORMATION_ADMINISTRATION("GASOLINE-REGULAR (U.S.)-ENERGY INFORMATION ADMINISTRATION"),
        GASOLINE_REGULAR_UNL_10_PPM_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("GASOLINE-REGULAR UNL 10 PPM-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        GASOLINE_SUPER_UNL_93_NEW_YORK_BARGE_PLATTS_U_S("GASOLINE-SUPER UNL 93 NEW YORK (BARGE)-PLATTS U.S."),
        GASOLINE_TOCOM("GASOLINE-TOCOM"),
        GASOLINE_UNL_87_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-UNL 87 GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_UNL_87_GULF_COAST_WATERBORNE_PLATTS_U_S("GASOLINE-UNL 87 GULF COAST (WATERBORNE)-PLATTS U.S."),
        GASOLINE_UNL_87_NEW_YORK_BARGE_PLATTS_U_S("GASOLINE-UNL 87 NEW YORK (BARGE)-PLATTS U.S."),
        GASOLINE_UNL_87_NEW_YORK_CARGO_PLATTS_U_S("GASOLINE-UNL 87 NEW YORK (CARGO)-PLATTS U.S."),
        GASOLINE_UNL_87_ULS_30_ATLANTA_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-UNL 87 ULS 30 ATLANTA GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_UNL_87_WEST_COAST_PIPELINE_LOS_ANGELES_PLATTS_U_S("GASOLINE-UNL 87 WEST COAST PIPELINE (LOS ANGELES)-PLATTS U.S."),
        GASOLINE_UNL_87_SUPPLEMENTAL_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-UNL 87-SUPPLEMENTAL GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_UNL_92_SINGAPORE_MOGAS_PLATTS_ASIA_PACIFIC("GASOLINE-UNL 92 SINGAPORE (MOGAS)-PLATTS ASIA PACIFIC"),
        GASOLINE_UNL_93_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-UNL 93 GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_UNL_93_SUPPLEMENTAL_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-UNL 93-SUPPLEMENTAL GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_UNL_95_SINGAPORE_MOGAS_PLATTS_ASIA_PACIFIC("GASOLINE-UNL 95 SINGAPORE (MOGAS)-PLATTS ASIA PACIFIC"),
        GASOLINE_UNL_97_SINGAPORE_MOGAS_PLATTS_ASIA_PACIFIC("GASOLINE-UNL 97 SINGAPORE (MOGAS)-PLATTS ASIA PACIFIC"),
        GASOLINE_UNL_98_SINGAPORE_MOGAS_PLATTS_ASIA_PACIFIC("GASOLINE-UNL 98 SINGAPORE (MOGAS)-PLATTS ASIA PACIFIC"),
        GASOLINE_UNL_RBOB_GULF_COAST_PIPELINE_PLATTS_U_S("GASOLINE-UNL RBOB GULF COAST (PIPELINE)-PLATTS U.S."),
        GASOLINE_UNLEADED_RBOB_NEW_YORK_CARGO_PLATTS_U_S("GASOLINE-UNLEADED RBOB NEW YORK (CARGO)-PLATTS U.S."),
        GASOLINE_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("GASOLINE-WATERBORNE SPOT TOKYO BAY-RIM INTELLIGENCE PRODUCTS,"),
        GOLD_A_M_FIX_EUR("GOLD-A.M. FIX (EUR)"),
        GOLD_A_M_FIX_GBP("GOLD-A.M. FIX (GBP)"),
        GOLD_A_M_FIX("GOLD-A.M. FIX"),
        GOLD_COMEX_SAFEX("GOLD-COMEX-SAFEX"),
        GOLD_COMEX("GOLD-COMEX"),
        GOLD_P_M_FIX_EUR("GOLD-P.M. FIX (EUR)"),
        GOLD_P_M_FIX_GBP("GOLD-P.M. FIX (GBP)"),
        GOLD_P_M_FIX("GOLD-P.M. FIX"),
        GOLD_TOCOM("GOLD-TOCOM"),
        GREASY_WOOL_21_MICRON_SFE("GREASY WOOL (21 MICRON)-SFE"),
        GSCI_TR("GSCI TR@"),
        HEATING_OIL_COLONIAL_ARGUS_US_PRODUCTS("HEATING OIL COLONIAL-ARGUS US PRODUCTS"),
        HEATING_OIL_NEW_YORK_BARGE_PLATTS_U_S("HEATING OIL-NEW YORK (BARGE)-PLATTS U.S."),
        HEATING_OIL_NEW_YORK_CARGO_PLATTS_U_S("HEATING OIL-NEW YORK (CARGO)-PLATTS U.S."),
        HEATING_OIL_NEW_YORK_ICE("HEATING OIL-NEW YORK-ICE"),
        HEATING_OIL_NEW_YORK_NYMEX("HEATING OIL-NEW YORK-NYMEX"),
        HEATING_OIL_NO_2_GULF_COAST_PIPELINE_PLATTS_U_S("HEATING OIL-NO. 2 GULF COAST (PIPELINE)-PLATTS U.S."),
        HEATING_OIL_NO_2_GULF_COAST_WATERBORNE_PLATTS_U_S("HEATING OIL-NO. 2 GULF COAST (WATERBORNE)-PLATTS U.S."),
        HIGH_SULPHUR_FUEL_OIL_180_CST_SINGAPORE_PLATTS_ASIA_PACIFIC("HIGH SULPHUR FUEL OIL - 180 CST SINGAPORE - PLATTS ASIA-PACIFIC"),
        HPDE_HWM_FILM_N_A_CMAI("HPDE HWM FILM-N.A.-CMAI"),
        HS_6_TC_HANDYSIZE_DRY_TIME_CHARTER_AVERAGE_6_ROUTES_FREIGHT_BALTIC_EXCHANGE_HANDYSIZE_TIME_CHARTER_AVERAGE_ROUTES_PUBLISHED_DAILY_AVERAGE("HS6TC (Handysize Dry Time charter Average 6 Routes) FREIGHT - BALTIC EXCHANGE - HANDYSIZE TIME CHARTER AVERAGE ROUTES-PUBLISHED DAILY AVERAGE"),
        ICIS_FD_EU_CONTRACT_PRICE_POLYETHYLENE("ICIS FD EU Contract Price Polyethylene"),
        ICIS_FD_EU_DOMESTIC_PRICES_POLYPROPYLENE("ICIS FD EU Domestic Prices Polypropylene"),
        IRANIAN_LIGHT_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("IRANIAN LIGHT FOB ARA CRACK NETBACK- PLATTS MARKETWIRE"),
        IRIDIUM_COMDAQ_EUR("IRIDIUM-COMDAQ (EUR)"),
        IRIDIUM_COMDAQ_GBP("IRIDIUM-COMDAQ (GBP)"),
        IRIDIUM_COMDAQ_JPY("IRIDIUM-COMDAQ (JPY)"),
        IRIDIUM_COMDAQ("IRIDIUM-COMDAQ"),
        IRIDIUM_HERAEUS("IRIDIUM-HERAEUS"),
        IRIDIUM_JOHNSON_MATTHEY("IRIDIUM-JOHNSON MATTHEY"),
        IRON_ORE_IODBZ_00_IODEX_62_FE_CFR_CHINA("IRON ORE- IODBZ00 IODEX 62% FeCFR CHINA"),
        IRON_ORE_FINES_62_PERCENT_FE_QINGDAO_THE_STEEL_INDEX("IRON ORE-FINES 62 PERCENT FE-QINGDAO-THE STEEL INDEX-"),
        IRON_ORE_FINES_62_PERCENT_FE_TIANJIN_THE_STEEL_INDEX("IRON ORE-FINES 62 PERCENT FE-TIANJIN -THE STEEL INDEX"),
        IRON_ORE_FINES_63_5_63_PERCENT_FE_QINGDAO_THE_STEEL_INDEX("IRON ORE-FINES 63.5/63 PERCENT FE-QINGDAO-THE STEEL INDEX-"),
        IRON_ORE_MB_63_5_METAL_BULLETIN("IRON ORE-MB 63.5% METAL BULLETIN"),
        JET_FUEL_COLONIAL_JET_54_ARGUS_US_PRODUCTS("JET FUEL COLONIAL JET 54-ARGUS US PRODUCTS"),
        JET_FUEL_COLONIAL_JET_55_ARGUS_US_PRODUCTS("JET FUEL COLONIAL JET 55 -ARGUS US PRODUCTS"),
        JET_FUEL_CHICAGO_JET_ARGUS_US_PRODUCTS_REPORT("JET FUEL- Chicago Jet - ARGUS US PRODUCTS REPORT"),
        JET_FUEL_GROUP_3_JET_Q_PROMPT_ARGUS_US_PRODUCTS("JET FUEL- GROUP 3 JET Q - Prompt ARGUS US PRODUCTS"),
        JET_FUEL_LOS_ANGELES_JET_ARGUS_US_PRODUCTS("JET FUEL- Los Angeles Jet - ARGUS US PRODUCTS"),
        JET_FUEL_NY_BARGES_JET_54_PROMPT_ARGUS_US_PRODUCTS("JET FUEL- NY Barges Jet 54 - Prompt- ARGUS US PRODUCTS"),
        JET_FUEL_NY_BARGES_JET_55_PROMPT_ARGUS_US_PRODUCTS("JET FUEL- NY Barges Jet 55 - Prompt- ARGUS US PRODUCTS"),
        JET_FUEL_ASIA_PACIFIC_KERO_PLATTS_ASIA_PACIFIC("JET FUEL-ASIA-PACIFIC (KERO)-PLATTS ASIA-PACIFIC"),
        JET_FUEL_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("JET FUEL-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        JET_FUEL_BARGES_NWE_ARGUS_EUROPEAN_PRODUCTS("JET FUEL-BARGES-NWE-ARGUS EUROPEAN PRODUCTS"),
        JET_FUEL_BUCKEYE_PLATTS_U_S("JET FUEL-BUCKEYE-PLATTS U.S."),
        JET_FUEL_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("JET FUEL-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        JET_FUEL_CARGOES_CIF_NWE_ARGUS_EUROPEAN_PRODUCTS("JET FUEL-CARGOES-CIF-NWE-ARGUS EUROPEAN PRODUCTS"),
        JET_FUEL_FOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("JET FUEL-FOB MED (ITALY)-PLATTS EUROPEAN MARKETSCAN"),
        JET_FUEL_FOB_NWE_ARGUS_EUROPEAN_PRODUCTS("JET FUEL-FOB-NWE-ARGUS EUROPEAN PRODUCTS"),
        JET_FUEL_FOB_WEST_MED_ARGUS_EUROPEAN_PRODUCTS("JET FUEL-FOB-WEST MED-ARGUS EUROPEAN PRODUCTS"),
        JET_FUEL_JET_54_GULF_COAST_PIPELINE_PLATTS_U_S("JET FUEL-JET 54 GULF COAST (PIPELINE)-PLATTS U.S."),
        JET_FUEL_JET_54_GULF_COAST_WATERBORNE_PLATTS_U_S("JET FUEL-JET 54 GULF COAST (WATERBORNE)-PLATTS U.S."),
        JET_FUEL_JET_55_GULF_COAST_PIPELINE_PLATTS_U_S("JET FUEL-JET 55 GULF COAST (PIPELINE)-PLATTS U.S."),
        JET_FUEL_JET_55_GULF_COAST_WATERBORNE_PLATTS_U_S("JET FUEL-JET 55 GULF COAST (WATERBORNE)-PLATTS U.S."),
        JET_FUEL_LOS_ANGELES_PIPELINE_OPIS_WEST_COAST("JET FUEL-LOS ANGELES (PIPELINE)-OPIS WEST COAST"),
        JET_FUEL_MIDWEST_CHICAGO_JET_PLATTS_U_S("JET FUEL-Midwest Chicago: Jet -PLATTS U.S."),
        JET_FUEL_MIDWEST_GROUP_3_JET_PLATTS_U_S("JET FUEL-Midwest Group 3: Jet -PLATTS U.S."),
        JET_FUEL_NEW_YORK_BARGE_LOW_SULFUR_JET_PLATTS_U_S("JET FUEL-NEW YORK (BARGE) Low Sulfur Jet -PLATTS U.S."),
        JET_FUEL_NEW_YORK_BARGE_PLATTS_U_S("JET FUEL-NEW YORK (BARGE)-PLATTS U.S."),
        JET_FUEL_WEST_COAST_LOS_ANGELES_PIPELINE_PLATTS_U_S("JET FUEL-WEST COAST LOS ANGELES (PIPELINE)-PLATTS U.S."),
        KEROSENE_FOR_ARAB_GULF_PLATTS_ASIA_PACIFIC("KEROSENE - FOR ARAB GULF - PLATTS ASIA PACIFIC"),
        KEROSENE_TOCOM("KEROSENE-TOCOM"),
        KEROSENE_WATERBORNE_SPOT_TOKYO_BAY_RIM_INTELLIGENCE_PRODUCTS("KEROSENE-WATERBORNE SPOT TOKYO BAY-RIM INTELLIGENCE PRODUCTS"),
        KIRKUK_LIGHT_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("KIRKUK LIGHT FOB ARA CRACK NETBACK- PLATTS MARKETWIRE"),
        KUWAIT_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("KUWAIT FOB ARA CRACK NETBACK- PLATTS MARKETWIRE"),
        LEAD_LME_15_MONTH("LEAD-LME 15 MONTH"),
        LEAD_LME_3_MONTH("LEAD-LME 3 MONTH"),
        LEAD_LME_CASH("LEAD-LME CASH"),
        LEAN_HOGS_CME("LEAN HOGS-CME"),
        LIVE_CATTLE_CME("LIVE CATTLE-CME"),
        LOW_DENSITY_POLYETHYLENE_GENERAL_PURPOSE_PLATTS_POLYMERSCAN("Low Density Polyethylene General Purpose - Platts Polymerscan,"),
        LUMBER_CME("LUMBER-CME"),
        MATIF_MAIZE("MATIF MAIZE"),
        MILK_CLASS_III_CME("MILK-CLASS III-CME"),
        MILK_CLASS_IV_CME("MILK-CLASS IV-CME"),
        MILK_NONFAT_DRY_CME("MILK-NONFAT-DRY-CME"),
        MILK_WMP_NXZ("MILK-WMP-NXZ"),
        MILLING_WHEAT_MATIF("MILLING WHEAT - MATIF"),
        MILLING_WHEAT_EURONEXT_LIFFE("MILLING WHEAT-EURONEXT LIFFE"),
        MOLYBDENUM_LME_3_MONTH("MOLYBDENUM - LME - 3 MONTH"),
        MOLYBDENUM_LME_CASH("MOLYBDENUM - LME - CASH"),
        MOLYBDENUM_PLATTS_METALS_WEEK("MOLYBDENUM - PLATTS METALS WEEK::"),
        MOLYBDENUM_LME_15_MONTH("MOLYBDENUM-LME 15 month"),
        MOLYBDENUM_LME_3_MONTH_("MOLYBDENUM-LME 3 month"),
        MOP_CFR_BRAZIL_FMB("MOP-CFR BRAZIL-FMB"),
        MOP_CFR_EUROPE_FMB("MOP-CFR EUROPE-FMB"),
        MOP_CFR_SE_ASIA_FMB("MOP-CFR SE ASIA-FMB"),
        MOP_FOB_FSU_FMB("MOP-FOB FSU-FMB"),
        MOP_FOB_VANCOUVER_FMB("MOP-FOB VANCOUVER-FMB"),
        MTBE_GULF_COAST_WATERBORNE_PLATTS_U_S("MTBE-GULF COAST (WATERBORNE)-PLATTS U.S."),
        MURBAN_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("MURBAN FOB ARA CRACK NETBACK- PLATTS MARKETWIRE"),
        NAPHTHA_FOR_ARAB_GULF_PLATTS_ASIA_PACIFIC("NAPHTHA - FOR ARAB GULF - PLATTS ASIA-PACIFIC"),
        NAPHTHA_JAPAN_C_F_PLATTS_ASIA_PACIFIC("NAPHTHA JAPAN (C+F)-PLATTS ASIA PACIFIC"),
        NAPHTHA_CIF_MED_GENOVA_LAVERA_PLATTS_EUROPEAN_MARKETSCAN("NAPHTHA-CIF MED (GENOVA/LAVERA)-PLATTS EUROPEAN MARKETSCAN"),
        NAPHTHA_FOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("NAPHTHA-FOB MED (ITALY)-PLATTS EUROPEAN MARKETSCAN"),
        NAPHTHA_GULF_COAST_WATERBORNE_PLATTS_U_S("NAPHTHA-GULF COAST (WATERBORNE)-PLATTS U.S."),
        NAPHTHA_PHYSICAL_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("NAPHTHA-PHYSICAL-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        NAPHTHA_PHYSICAL_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("NAPHTHA-PHYSICAL-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        NAPHTHA_SINGAPORE_PLATTS_ASIA_PACIFIC("NAPHTHA-SINGAPORE-PLATTS ASIA-PACIFIC"),
        NASAAC_LME_15_MONTH("NASAAC-LME 15 MONTH"),
        NASAAC_LME_27_MONTH("NASAAC-LME 27 MONTH"),
        NASAAC_LME_3_MONTH("NASAAC-LME 3 MONTH"),
        NASAAC_LME_CASH("NASAAC-LME CASH"),
        NATURAL_GAS_MAINLINE_CGTC_INSIDE_FERC("NATURAL GAS - MAINLINE (CGTC) - INSIDE FERC"),
        NATURAL_GAS_TEXAS_KOCH_INSIDE_FERC("NATURAL GAS - TEXAS (KOCH) - INSIDE FERC"),
        NATURAL_GAS_AECO_$_CAD_GJ_NGX("NATURAL GAS-AECO ($CAD/GJ)-NGX"),
        NATURAL_GAS_AECO_C_NIT_CAD_GJ_CANADIAN_GAS_PRICE_REPORTER_MONTHLY("NATURAL GAS-AECO C-NIT (CAD/GJ)-CANADIAN GAS PRICE REPORTER-MONTHLY"),
        NATURAL_GAS_AECO_C_NIT_CAD_GJ_CANADIAN_GAS_PRICE_REPORTER_5_A_DAILY("NATURAL GAS-AECO C/NIT (CAD/GJ) - CANADIAN GAS PRICE REPORTER - 5A DAILY"),
        NATURAL_GAS_ALBERTA_NATURAL_GAS_CO_PG_E_GAS_TRANSMISSIONS_NORTHWEST_INTERCONNECT_MONTH_AHEAD_ICE("NATURAL GAS-ALBERTA NATURAL GAS CO. & PG&E GAS TRANSMISSIONS-NORTHWEST INTERCONNECT-MONTH AHEAD-ICE"),
        NATURAL_GAS_ALBERTA_NOVA_INVENTORY_TRANSFER_AECO_MONTH_AHEAD_ICE("NATURAL GAS-ALBERTA, NOVA INVENTORY TRANSFER (AECO)-MONTH AHEAD-ICE"),
        NATURAL_GAS_ALGONQUIN_CITYGATES_DAY_AHEAD_ICE("NATURAL GAS-ALGONQUIN CITYGATES-DAY AHEAD-ICE-"),
        NATURAL_GAS_ALGONQUIN_GAS_TRANSMISSIONS_CO_CITYGATES_MONTH_AHEAD_ICE("NATURAL GAS-ALGONQUIN GAS TRANSMISSIONS CO.-CITYGATES-MONTH AHEAD-ICE"),
        NATURAL_GAS_ALLIANCE_DELIVERED_DAY_AHEAD_ICE("NATURAL GAS-ALLIANCE DELIVERED-DAY AHEAD-ICE"),
        NATURAL_GAS_ALLIANCE_PIPELINE_CO_INTO_INTERSTATES_ANR_NICOR_NGPL_MIDWESTERN_UDEL_VECTOR_MONTH_AHEAD_ICE("NATURAL GAS-ALLIANCE PIPELINE CO.-INTO INTERSTATES (ANR, NICOR, NGPL, MIDWESTERN, UDEL, VECTOR)-MONTH AHEAD-ICE"),
        NATURAL_GAS_AMERICAN_NATURAL_RESOURCES_PIPELINE_CO_SE_TRANSMISSION_GATHERING_POOL_MONTH_AHEAD_ICE("NATURAL GAS-AMERICAN NATURAL RESOURCES PIPELINE CO.-SE TRANSMISSION & GATHERING POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_AMERICAN_NATURAL_RESOURCES_PIPELINE_CO_SW_POOL_MONTH_AHEAD_ICE("NATURAL GAS-AMERICAN NATURAL RESOURCES PIPELINE CO.-SW POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_AMERICAN_NATURAL_RESOURCES_PIPLELINE_CO_SE_GATHERING_POOL_MONTH_AHEAD_ICE("NATURAL GAS-AMERICAN NATURAL RESOURCES PIPLELINE CO.-SE GATHERING POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_ANR_LOUISIANA_INSIDE_FERC("NATURAL GAS-ANR (LOUISIANA)-INSIDE FERC"),
        NATURAL_GAS_ANR_OKLAHOMA_INSIDE_FERC("NATURAL GAS-ANR (OKLAHOMA)-INSIDE FERC"),
        NATURAL_GAS_ANR_SE_T_ICE_DAY_AHEAD("NATURAL GAS-ANR-SE T-ICE DAY AHEAD"),
        NATURAL_GAS_ANR_SW_DAY_AHEAD_ICE("NATURAL GAS-ANR-SW-DAY AHEAD-ICE"),
        NATURAL_GAS_APPALACHIA_COLUMBIA_GAS_GAS_DAILY("NATURAL GAS-APPALACHIA (COLUMBIA GAS)-GAS DAILY"),
        NATURAL_GAS_APPALACHIA_DOMINION_NORTH_POINT_GAS_DAILY("NATURAL GAS-APPALACHIA (DOMINION, NORTH POINT)-GAS DAILY"),
        NATURAL_GAS_APPALACHIA_DOMINION_SOUTH_POINT_GAS_DAILY("NATURAL GAS-APPALACHIA (DOMINION, SOUTH POINT)-GAS DAILY"),
        NATURAL_GAS_APPALACHIA_LEBANON_HUB_GAS_DAILY("NATURAL GAS-APPALACHIA (LEBANON HUB)-GAS DAILY"),
        NATURAL_GAS_APPALACHIA_LEIDY_HUB_GAS_DAILY("NATURAL GAS-APPALACHIA (LEIDY HUB)-GAS DAILY"),
        NATURAL_GAS_CALIFORNIA_MALIN_NGI("NATURAL GAS-CALIFORNIA (MALIN)-NGI"),
        NATURAL_GAS_CALIFORNIA_PG_E_CITY_GATE_INSIDE_FERC("NATURAL GAS-CALIFORNIA (PG&E CITY-GATE)-INSIDE FERC"),
        NATURAL_GAS_CALIFORNIA_PG_E_CITYGATE_NGI("NATURAL GAS-CALIFORNIA (PG&E CITYGATE)-NGI"),
        NATURAL_GAS_CALIFORNIA_PG_E_MALIN_ORE_INSIDE_FERC("NATURAL GAS-CALIFORNIA (PG&E MALIN, ORE.)-INSIDE FERC"),
        NATURAL_GAS_CALIFORNIA_PG_E_SOUTH_INSIDE_FERC("NATURAL GAS-CALIFORNIA (PG&E SOUTH)-INSIDE FERC"),
        NATURAL_GAS_CALIFORNIA_SOCAL_CITYGATE_INSIDE_FERC("NATURAL GAS-CALIFORNIA (SOCAL CITYGATE)-INSIDE FERC"),
        NATURAL_GAS_CALIFORNIA_SOCAL_CITYGATE_NGI("NATURAL GAS-CALIFORNIA (SOCAL CITYGATE)-NGI"),
        NATURAL_GAS_CALIFORNIA_SOUTHERN_BORDER_PG_E_NGI("NATURAL GAS-CALIFORNIA (SOUTHERN BORDER, PG&E)-NGI"),
        NATURAL_GAS_CALIFORNIA_SOUTHERN_CALIFORNIA_BDR_AVG_NGI("NATURAL GAS-CALIFORNIA (SOUTHERN CALIFORNIA BDR. AVG.)-NGI"),
        NATURAL_GAS_CALIFORNIA_SOUTHERN_CALIFORNIA_GAS_CO_INSIDE_FERC("NATURAL GAS-CALIFORNIA (SOUTHERN CALIFORNIA GAS CO.)-INSIDE FERC"),
        NATURAL_GAS_CANADIAN_GAS_DAWN_GAS_DAILY("NATURAL GAS-CANADIAN GAS (DAWN)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_EMERSON_VIKING_GL_GAS_DAILY("NATURAL GAS-CANADIAN GAS (EMERSON, VIKING GL)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_IROQUOIS_GAS_DAILY("NATURAL GAS-CANADIAN GAS (IROQUOIS)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_KINGSGATE_GAS_DAILY("NATURAL GAS-CANADIAN GAS (KINGSGATE)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_NIAGARA_GAS_DAILY("NATURAL GAS-CANADIAN GAS (NIAGARA)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_NORTHWEST_SUMAS_GAS_DAILY("NATURAL GAS-CANADIAN GAS (NORTHWEST SUMAS)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_TCPL_ALBERTA_AECO_C_GAS_DAILY("NATURAL GAS-CANADIAN GAS (TCPL ALBERTA-AECO-C)-GAS DAILY"),
        NATURAL_GAS_CANADIAN_GAS_WESTCOAST_STATION_2_GAS_DAILY("NATURAL GAS-CANADIAN GAS (WESTCOAST, STATION 2)-GAS DAILY"),
        NATURAL_GAS_CARTHAGE_HUB_TAILGATE_MONTH_AHEAD_ICE("NATURAL GAS-CARTHAGE HUB-TAILGATE-MONTH AHEAD-ICE"),
        NATURAL_GAS_CARTHAGE_DAY_AHEAD_ICE("NATURAL GAS-CARTHAGE-DAY AHEAD-ICE"),
        NATURAL_GAS_CEGH_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-CEGH DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_CEGH_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-CEGH DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_CEGH_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-CEGH-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_CEGT_WEST_DAY_AHEAD_ICE("NATURAL GAS-CEGT WEST-DAY AHEAD-ICE"),
        NATURAL_GAS_CEGT_FLEX_DAY_AHEAD_ICE("NATURAL GAS-CEGT- FLEX-DAY AHEAD-ICE"),
        NATURAL_GAS_CENTERPOINT_EAST_INSIDE_FERC("NATURAL GAS-CENTERPOINT (EAST)-INSIDE FERC"),
        NATURAL_GAS_CENTERPOINT_ENERGY_GAS_TRANSMISSION_CO_EAST_GENERIC_NORTH_SOUTH_OR_FLEX_MONTH_AHEAD_ICE("NATURAL GAS-CENTERPOINT ENERGY GAS TRANSMISSION CO.-EAST (GENERIC-NORTH, SOUTH OR FLEX)-MONTH AHEAD-ICE"),
        NATURAL_GAS_CENTERPOINT_WEST_GENERIC_W_1_OR_W_2_MONTH_AHEAD_ICE("NATURAL GAS-CENTERPOINT-WEST (GENERIC-W1 OR W2)-MONTH AHEAD-ICE"),
        NATURAL_GAS_CG_MAINLINE_DAY_AHEAD_ICE_NATURAL_GAS("NATURAL GAS-CG MAINLINE-DAY AHEAD-ICE -NATURAL GAS"),
        NATURAL_GAS_CG_ONSHORE_DAY_AHEAD_ICE("NATURAL GAS-CG ONSHORE-DAY AHEAD-ICE"),
        NATURAL_GAS_CHEYENNE_HUB_MONTH_AHEAD_ICE("NATURAL GAS-CHEYENNE HUB-MONTH AHEAD-ICE"),
        NATURAL_GAS_CHEYENNE_DAY_AHEAD_ICE("NATURAL GAS-CHEYENNE-DAY AHEAD-ICE"),
        NATURAL_GAS_CHICAGO_CITYGATES_DAY_AHEAD_ICE("NATURAL GAS-CHICAGO CITYGATES-DAY AHEAD-ICE"),
        NATURAL_GAS_CIG_ROCKY_MOUNTAINS_INSIDE_FERC("NATURAL GAS-CIG (ROCKY MOUNTAINS)-INSIDE FERC"),
        NATURAL_GAS_CIG_MAINLINE_DAY_AHEAD_ICE("NATURAL GAS-CIG MAINLINE-DAY AHEAD-ICE"),
        NATURAL_GAS_CITYGATES_ALGONQUIN_GAS_DAILY("NATURAL GAS-CITYGATES (ALGONQUIN)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_CHICAGO_GAS_DAILY("NATURAL GAS-CITYGATES (CHICAGO)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_CONSUMERS_ENERGY_GAS_DAILY("NATURAL GAS-CITYGATES (CONSUMERS ENERGY)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_FLORIDA_GAS_DAILY("NATURAL GAS-CITYGATES (FLORIDA)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_IROQUOIS_ZONE_2_GAS_DAILY("NATURAL GAS-CITYGATES (IROQUOIS ZONE 2)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_KERN_RIVER_GAS_DAILY("NATURAL GAS-CITYGATES (KERN RIVER)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_MICH_CON_GAS_DAILY("NATURAL GAS-CITYGATES (MICH CON)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_PG_E_GAS_DAILY("NATURAL GAS-CITYGATES (PG&E)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_SOCAL_GAS_DAILY("NATURAL GAS-CITYGATES (SOCAL)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_TENNESSEE_ZONE_6_GAS_DAILY("NATURAL GAS-CITYGATES (TENNESSEE ZONE 6)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_TEXAS_EASTERN_ZONE_M_3_GAS_DAILY("NATURAL GAS-CITYGATES (TEXAS EASTERN ZONE M-3)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_TRANSCO_ZONE_5_DELIVERED_GAS_DAILY("NATURAL GAS-CITYGATES (TRANSCO ZONE 5 DELIVERED)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_TRANSCO_ZONE_6_NON_NY_GAS_DAILY("NATURAL GAS-CITYGATES (TRANSCO ZONE 6 NON-NY)-GAS DAILY"),
        NATURAL_GAS_CITYGATES_TRANSCO_ZONE_6_NY_GAS_DAILY("NATURAL GAS-CITYGATES (TRANSCO ZONE 6 NY)-GAS DAILY"),
        NATURAL_GAS_COL_GAS_TCO_DAY_AHEAD_ICE("NATURAL GAS-COL GAS TCO-DAY AHEAD-ICE"),
        NATURAL_GAS_COLORADO_INTERSTATE_GAS_COMPANY_MAINLINE_MONTH_AHEAD_ICE("NATURAL GAS-COLORADO INTERSTATE GAS COMPANY-MAINLINE-MONTH AHEAD-ICE"),
        NATURAL_GAS_COLUMBIA_GAS_APPALACHIA_INSIDE_FERC("NATURAL GAS-COLUMBIA GAS (APPALACHIA)-INSIDE FERC"),
        NATURAL_GAS_COLUMBIA_GAS_CO_TCO_POOL_APPALACHIA_MONTH_AHEAD_ICE("NATURAL GAS-COLUMBIA GAS CO.-TCO POOL (APPALACHIA)-MONTH AHEAD-ICE"),
        NATURAL_GAS_COLUMBIA_GULF_LOUISIANA_INSIDE_FERC("NATURAL GAS-COLUMBIA GULF (LOUISIANA)-INSIDE FERC"),
        NATURAL_GAS_COLUMBIA_GULF_MAINLINE_INSIDE_FERC("NATURAL GAS-COLUMBIA GULF (MAINLINE)-INSIDE FERC"),
        NATURAL_GAS_COLUMBIA_GULF_TRANSMISSION_CO_MAINLINE_POOL_MONTH_AHEAD_ICE("NATURAL GAS-COLUMBIA GULF TRANSMISSION CO.-MAINLINE POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_COLUMBIA_GULF_TRANSMISSION_CO_ONSHORE_POOL_MONTH_AHEAD_ICE("NATURAL GAS-COLUMBIA GULF TRANSMISSION CO.-ONSHORE POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_CONSUMERS_ENERGY_CITYGATE_MONTH_AHEAD_ICE("NATURAL GAS-CONSUMERS ENERGY CITYGATE-MONTH AHEAD-ICE"),
        NATURAL_GAS_CONSUMERS_DAY_AHEAD_ICE("NATURAL GAS-CONSUMERS-DAY AHEAD-ICE"),
        NATURAL_GAS_DEMARC_DAY_AHEAD_ICE("NATURAL GAS-DEMARC-DAY AHEAD-ICE"),
        NATURAL_GAS_DOMINION_APPALACHIA_INSIDE_FERC("NATURAL GAS-DOMINION (APPALACHIA)-INSIDE FERC"),
        NATURAL_GAS_DOMINION_SOUTH_DAY_AHEAD_ICE("NATURAL GAS-DOMINION SOUTH-DAY AHEAD-ICE"),
        NATURAL_GAS_DOMINION_SOUTH_POINT_MONTH_AHEAD_ICE("NATURAL GAS-DOMINION-SOUTH POINT-MONTH AHEAD-ICE"),
        NATURAL_GAS_DRACUT_DAY_AHEAD_ICE("NATURAL GAS-DRACUT-DAY AHEAD-ICE"),
        NATURAL_GAS_E_HOUSTON_KATY_HOUSTON_SHIP_CHANNEL_GAS_DAILY("NATURAL GAS-E. HOUSTON-KATY (HOUSTON SHIP CHANNEL)-GAS DAILY"),
        NATURAL_GAS_E_HOUSTON_KATY_KATY_GAS_DAILY("NATURAL GAS-E. HOUSTON-KATY (KATY)-GAS DAILY"),
        NATURAL_GAS_E_TEXAS_HOUSTON_SHIP_CHANNEL_INSIDE_FERC("NATURAL GAS-E. TEXAS (HOUSTON SHIP CHANNEL)-INSIDE FERC"),
        NATURAL_GAS_E_TEXAS_KATY_INSIDE_FERC("NATURAL GAS-E. TEXAS (KATY)-INSIDE FERC"),
        NATURAL_GAS_EAST_TEXAS_CARTHAGE_GAS_DAILY("NATURAL GAS-EAST TEXAS (CARTHAGE)-GAS DAILY"),
        NATURAL_GAS_EAST_TEXAS_NGPL_TEXOK_GAS_DAILY("NATURAL GAS-EAST TEXAS (NGPL TEXOK)-GAS DAILY"),
        NATURAL_GAS_EAST_TEXAS_TEXAS_EASTERN_ETX_GAS_DAILY("NATURAL GAS-EAST TEXAS (TEXAS EASTERN ETX)-GAS DAILY"),
        NATURAL_GAS_EAST_TEXAS_TEXAS_GAS_ZONE_1_GAS_DAILY("NATURAL GAS-EAST TEXAS (TEXAS GAS ZONE 1)-GAS DAILY"),
        NATURAL_GAS_EL_PASO_PERMIAN_BASIN_INSIDE_FERC("NATURAL GAS-EL PASO (PERMIAN BASIN)-INSIDE FERC"),
        NATURAL_GAS_EL_PASO_SAN_JUAN_BASIN_INSIDE_FERC("NATURAL GAS-EL PASO (SAN JUAN BASIN)-INSIDE FERC"),
        NATURAL_GAS_EL_PASO_KEYSTONE_POOL_MONTH_AHEAD_ICE("NATURAL GAS-EL PASO-KEYSTONE POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_EL_PASO_SAN_JUAN_BASIN_BLANCO_POOL_NON_BONDAD_MONTH_AHEAD_ICE("NATURAL GAS-EL PASO-SAN JUAN BASIN, BLANCO POOL (NON-BONDAD)-MONTH AHEAD-ICE"),
        NATURAL_GAS_EMERSON_$_CAD_GJ_NGX("NATURAL GAS-EMERSON ($CAD/GJ)-NGX"),
        NATURAL_GAS_EMPRESS_$_US_MMBTU_NGX("NATURAL GAS-EMPRESS ($US/MMBTU)-NGX"),
        NATURAL_GAS_EP_PERMIAN_KEYSTONE_POOL_WAHA_POOL_MONTH_AHEAD_ICE("NATURAL GAS-EP-PERMIAN (KEYSTONE POOL, WAHA POOL)-MONTH AHEAD-ICE"),
        NATURAL_GAS_EP_PERMIAN_DAY_AHEAD_ICE("NATURAL GAS-EP-PERMIAN-DAY AHEAD-ICE"),
        NATURAL_GAS_EP_SOUTH_MAINLINE_DAY_AHEAD_ICE("NATURAL GAS-EP-SOUTH MAINLINE-DAY AHEAD-ICE"),
        NATURAL_GAS_EUR_ZEEBRUGGE_HUB_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-EUR-ZEEBRUGGE HUB-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_EUR_ZEEBRUGGE_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-EUR-ZEEBRUGGE-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_EUR_ZEEBRUGGE_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-EUR-ZEEBRUGGE-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_EUR_ZEEBRUGGE_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-EUR-ZEEBRUGGE-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_FGT_Z_1_DAY_AHEAD_ICE("NATURAL GAS-FGT-Z1-DAY AHEAD-ICE"),
        NATURAL_GAS_FGT_Z_2_DAY_AHEAD_ICE("NATURAL GAS-FGT-Z2-DAY AHEAD-ICE"),
        NATURAL_GAS_FGT_Z_3_DAY_AHEAD_ICE("NATURAL GAS-FGT-Z3-DAY AHEAD-ICE"),
        NATURAL_GAS_FLORIDA_GAS_ZONE_1_INSIDE_FERC("NATURAL GAS-FLORIDA GAS (ZONE 1)-INSIDE FERC"),
        NATURAL_GAS_FLORIDA_GAS_ZONE_2_INSIDE_FERC("NATURAL GAS-FLORIDA GAS (ZONE 2)-INSIDE FERC"),
        NATURAL_GAS_FLORIDA_GAS_ZONE_3_INSIDE_FERC("NATURAL GAS-FLORIDA GAS (ZONE 3)-INSIDE FERC"),
        NATURAL_GAS_FLORIDA_GAS_TRANSMISSION_ZONE_2_MONTH_AHEAD_ICE("NATURAL GAS-FLORIDA GAS TRANSMISSION-ZONE 2-MONTH AHEAD-ICE"),
        NATURAL_GAS_FLORIDA_GAS_TRANSMISSION_ZONE_3_MONTH_AHEAD_ICE("NATURAL GAS-FLORIDA GAS TRANSMISSION-ZONE 3-MONTH AHEAD-ICE"),
        NATURAL_GAS_GASPOOL_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-GASPOOL-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_GASPOOL_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-GASPOOL-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_GERMANY_MONTHLY_AVERAGE_EEX("NATURAL GAS-GERMANY MONTHLY AVERAGE-EEX"),
        NATURAL_GAS_GPI_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-GPI DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_GPI_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-GPI DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_GPI_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-GPI-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_HENRY_HUB_TAILGATE_LOUISIANA_MONTH_AHEAD_ICE("NATURAL GAS-HENRY HUB-TAILGATE, LOUISIANA-MONTH AHEAD-ICE"),
        NATURAL_GAS_HENRY_DAY_AHEADICE("NATURAL GAS-HENRY-DAY AHEADICE"),
        NATURAL_GAS_HOUSTON_SHIP_CHANNEL_DAY_AHEAD_ICE("NATURAL GAS-HOUSTON SHIP CHANNEL-DAY AHEAD-ICE"),
        NATURAL_GAS_HOUSTON_SHIP_CHANNEL_HOUSTON_PIPE_LINE_POOL_MONTH_AHEAD_ICE("NATURAL GAS-HOUSTON SHIP CHANNEL-HOUSTON PIPE LINE POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_ICE_NBP_NATURAL_GAS_INDEX_ICE("NATURAL GAS-ICE-NBP NATURAL GAS INDEX-ICE"),
        NATURAL_GAS_IROQUOIS_$_US_MMBTU_NGX("NATURAL GAS-IROQUOIS ($US/MMBTU)-NGX"),
        NATURAL_GAS_IROQUOIS_Z_2_DAY_AHEAD_ICE("NATURAL GAS-IROQUOIS-Z2-DAY AHEAD-ICE"),
        NATURAL_GAS_IROQUOIS_ZONE_1_MONTH_AHEAD_ICE("NATURAL GAS-IROQUOIS-ZONE 1-MONTH AHEAD-ICE"),
        NATURAL_GAS_IROQUOIS_ZONE_2_MONTH_AHEAD_ICE("NATURAL GAS-IROQUOIS-ZONE 2-MONTH AHEAD-ICE"),
        NATURAL_GAS_KATY_EXXON_OASIS_LONESTAR_INTA_INTER_PPM_STORAGE_INJ_WD_MONTH_AHEAD_ICE("NATURAL GAS-KATY (EXXON, OASIS, LONESTAR INTA/INTER, PPM STORAGE (INJ/WD)-MONTH AHEAD-ICE"),
        NATURAL_GAS_KATY_DAY_AHEAD_ICE("NATURAL GAS-KATY-DAY AHEAD-ICE-"),
        NATURAL_GAS_KERN_RIVER_WYOMING_INSIDE_FERC("NATURAL GAS-KERN RIVER (WYOMING)-INSIDE FERC"),
        NATURAL_GAS_KERN_RIVER_GAS_TRANSMISSION_CO_ON_SYSTEM_DELIVERY_NON_WHEELER_NON_KRAMER_JUNCTION_NON_DAGGETT_MONTH_AHEAD_ICE("NATURAL GAS-KERN RIVER GAS TRANSMISSION CO-- ON SYSTEM DELIVERY (NON-WHEELER, NON-KRAMER JUNCTION, NON-DAGGETT)-MONTH AHEAD-ICE"),
        NATURAL_GAS_KERN_RIVER_GAS_TRANSMISSION_ON_SYSTEM_RECEIPT_MONTH_AHEAD_ICE("NATURAL GAS-KERN RIVER GAS TRANSMISSION-ON SYSTEM RECEIPT-MONTH AHEAD-ICE"),
        NATURAL_GAS_KINGSGATE_DAY_AHEAD_ICE("NATURAL GAS-KINGSGATE-DAY AHEAD-ICE"),
        NATURAL_GAS_KRGT_DEL_POOL_DAY_AHEAD_ICE("NATURAL GAS-KRGT-DEL POOL-DAY AHEAD-ICE"),
        NATURAL_GAS_KRGT_REC_POOL_DAY_AHEAD_ICE("NATURAL GAS-KRGT-REC POOL-DAY AHEAD-ICE"),
        NATURAL_GAS_LOUISIANA_ANR_GAS_DAILY("NATURAL GAS-LOUISIANA (ANR)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_COLUMBIA_GULF_MAINLINE_GAS_DAILY("NATURAL GAS-LOUISIANA (COLUMBIA GULF MAINLINE)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_COLUMBIA_GULF_GAS_DAILY("NATURAL GAS-LOUISIANA (COLUMBIA GULF)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_FLORIDA_GAS_ZONE_1_GAS_DAILY("NATURAL GAS-LOUISIANA (FLORIDA GAS ZONE 1)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_FLORIDA_GAS_ZONE_2_GAS_DAILY("NATURAL GAS-LOUISIANA (FLORIDA GAS ZONE 2)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_FLORIDA_GAS_ZONE_3_GAS_DAILY("NATURAL GAS-LOUISIANA (FLORIDA GAS ZONE 3)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_HENRY_HUB_GAS_DAILY("NATURAL GAS-LOUISIANA (HENRY HUB)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_NGPL_GAS_DAILY("NATURAL GAS-LOUISIANA (NGPL)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_SOUTHERN_NATURAL_GAS_DAILY("NATURAL GAS-LOUISIANA (SOUTHERN NATURAL)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TENNESSEE_500_LEG_GAS_DAILY("NATURAL GAS-LOUISIANA (TENNESSEE, 500 LEG)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TENNESSEE_800_LEG_GAS_DAILY("NATURAL GAS-LOUISIANA (TENNESSEE, 800 LEG)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TEXAS_EASTERN_ELA_GAS_DAILY("NATURAL GAS-LOUISIANA (TEXAS EASTERN, ELA)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TEXAS_EASTERN_WLA_GAS_DAILY("NATURAL GAS-LOUISIANA (TEXAS EASTERN, WLA)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TEXAS_GAS_ZONE_SL_GAS_DAILY("NATURAL GAS-LOUISIANA (TEXAS GAS ZONE SL)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TRANSCO_ZONE_2_GAS_DAILY("NATURAL GAS-LOUISIANA (TRANSCO ZONE 2)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TRANSCO_ZONE_3_GAS_DAILY("NATURAL GAS-LOUISIANA (TRANSCO ZONE 3)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TRUNKLINE_ELA_GAS_DAILY("NATURAL GAS-LOUISIANA (TRUNKLINE ELA)-GAS DAILY"),
        NATURAL_GAS_LOUISIANA_TRUNKLINE_WLA_GAS_DAILY("NATURAL GAS-LOUISIANA (TRUNKLINE WLA) -GAS DAILY"),
        NATURAL_GAS_LOUISIANA_NATURAL_GAS_WEEK("NATURAL GAS-LOUISIANA-NATURAL GAS WEEK"),
        NATURAL_GAS_MALIN_DAY_AHEAD_ICE("NATURAL GAS-MALIN-DAY AHEAD-ICE"),
        NATURAL_GAS_MARITIMES_TENNESSEE_GAS_PIPELINE_CO_DRACUT_INTERCONNECT_MONTH_AHEAD_ICE("NATURAL GAS-MARITIMES & TENNESSEE GAS PIPELINE CO.-DRACUT INTERCONNECT-MONTH AHEAD-ICE"),
        NATURAL_GAS_MICHCON_DAY_AHEAD_ICE("NATURAL GAS-MICHCON-DAY AHEAD-ICE"),
        NATURAL_GAS_MICHIGAN_CONSOLIDATED_CITYGATE_MONTH_AHEAD_ICE("NATURAL GAS-MICHIGAN CONSOLIDATED CITYGATE-MONTH AHEAD-ICE"),
        NATURAL_GAS_MIDCONTINENT_NGPL_INSIDE_FERC("NATURAL GAS-MIDCONTINENT (NGPL)-INSIDE FERC"),
        NATURAL_GAS_MIDCONTINENT_NGPL_NGI("NATURAL GAS-MIDCONTINENT (NGPL)-NGI"),
        NATURAL_GAS_MIDWEST_CHICAGO_CITYGATE_NGI("NATURAL GAS-MIDWEST (CHICAGO CITYGATE)-NGI"),
        NATURAL_GAS_MISS_ALA_TEXAS_EASTERN_M_1_KOSI_GAS_DAILY("NATURAL GAS-MISS-ALA (TEXAS EASTERN M-1, KOSI)-GAS DAILY"),
        NATURAL_GAS_MISS_ALA_TRANSCO_ZONE_4_GAS_DAILY("NATURAL GAS-MISS-ALA (TRANSCO ZONE 4)-GAS DAILY"),
        NATURAL_GAS_MONTHLY_INDEX_ALGONQUIN_CITY_GATES_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ALGONQUIN CITY-GATES-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ANR_ML_7_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ANR ML 7-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_APPALACHIA_COLUMBIA_GAS_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX APPALACHIA (COLUMBIA GAS)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_APPALACHIA_DOMINION_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX APPALACHIA (DOMINION)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_CANADIAN_BORDER_NWPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX CANADIAN BORDER (NWPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_CHICAGO_CITY_GATES_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX CHICAGO CITY-GATES-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_DAWN_ONTARIO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX DAWN ONTARIO-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_DEMARCATION_NNG_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX DEMARCATION (NNG)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_E_LOUISIANA_TETCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX E. LOUISIANA (TETCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_E_TEXAS_HOUSTON_SHIP_CHANNEL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX E. TEXAS (HOUSTON SHIP CHANNEL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_E_TEXAS_KATY_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX E. TEXAS (KATY)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_E_TEXAS_TETCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX E. TEXAS (TETCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_EAST_CENTERPOINT_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX EAST (CENTERPOINT)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_ANR_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX LOUISIANA (ANR)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_COLUMBIA_GULF_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX LOUISIANA (COLUMBIA GULF)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_NGPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX LOUISIANA (NGPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_SOUTHERN_NATURAL_INSIDE_FERC("NATURAL GAS-MONTHLY INDEX LOUISIANA (SOUTHERN NATURAL)-INSIDE FERC"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_TENNESSEE_500_LEG_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX LOUISIANA (TENNESSEE 500 LEG)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_TENNESSEE_800_LEG_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX LOUISIANA (TENNESSEE 800 LEG)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_LOUISIANA_TRUNKLINE_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX LOUISIANA (TRUNKLINE)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_MICH_CON_CITY_GATE_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX MICH CON CITY-GATE-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_MIDCONTINENT_NGPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX MIDCONTINENT (NGPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_MISS_ALA_TRANSCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX MISS/ALA (TRANSCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_MISSISSIPPI_MAINLINE_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX MISSISSIPPI (MAINLINE)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_NIAGARA_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX NIAGARA-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_OKLAHOMA_ANR_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX OKLAHOMA (ANR)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_OKLAHOMA_ONG_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX OKLAHOMA (ONG)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_PERMIAN_BASIN_EL_PASO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX PERMIAN BASIN (EL PASO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_PERMIAN_BASIN_TRANSWESTERN_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX PERMIAN BASIN (TRANSWESTERN)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ROCKIES_NW_STANFIELD_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ROCKIES/NW (STANFIELD)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ROCKIES_NW_NOVA_AECO_C_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ROCKIES/NW NOVA (AECO-C)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ROCKY_MOUNTAINS_CIGC_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ROCKY MOUNTAINS (CIGC)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ROCKY_MOUNTAINS_QUESTAR_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ROCKY MOUNTAINS (QUESTAR)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ROCKYMTNS_NWPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ROCKYMTNS (NWPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_S_LOUISIANA_HENRY_HUB_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX S. LOUISIANA (HENRY HUB)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_S_LOUISIANA_EAST_SIDE_GULF_SOUTH_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX S. LOUISIANA/EAST SIDE (GULF SOUTH)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_S_TEXAS_TETCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX S. TEXAS (TETCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_SAN_JUAN_BASIN_EL_PASO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX SAN JUAN BASIN (EL PASO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_SOUTH_TEXAS_NGPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX SOUTH TEXAS (NGPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_TEX_OKL_MAINLINE_PEPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX TEX/OKL MAINLINE (PEPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_TEX_OKLA_KAN_NNG_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX TEX/OKLA/KAN (NNG)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_TEX_OKLA_KAN_SOUTHERN_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX TEX/OKLA/KAN (SOUTHERN)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_TEXAS_TENNESSEE_ZONE_0_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX TEXAS (TENNESSEE ZONE 0)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_TEXAS_TRUNKLINE_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX TEXAS (TRUNKLINE)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_TEXOK_NGPL_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX TEXOK (NGPL)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_VENTURA_NNG_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX VENTURA (NNG)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_W_LOUISIANA_TETCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX W. LOUISIANA (TETCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_W_TEXAS_WAHA_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX W. TEXAS (WAHA)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_WYOMING_KERN_RIVER_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX WYOMING (KERN RIVER)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_1_FGTC_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 1 (FGTC)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_1_TGT_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 1 (TGT)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_1_TRANSCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 1 (TRANSCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_2_FGTC_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 2 (FGTC)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_2_TRANSCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 2 (TRANSCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_3_FGTC_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 3 (FGTC)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_3_TRANSCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 3 (TRANSCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_6_DELIVERED_TENNESSEE_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 6 DELIVERED (TENNESSEE)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_6_NON_NY_TRANSCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 6 NON-NY (TRANSCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_6_NY_TRANSCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE 6 NY (TRANSCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_M_3_TETCO_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE M-3 (TETCO)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_MONTHLY_INDEX_ZONE_SL_TGT_GAS_DAILY_PRICE_GUIDE("NATURAL GAS-MONTHLY INDEX ZONE SL (TGT)-GAS DAILY PRICE GUIDE"),
        NATURAL_GAS_NATURAL_GAS_PIPELINE_CO_OF_AMERICA_AMARILLO_POOLING_PIN_MONTH_AHEAD_ICE("NATURAL GAS-NATURAL GAS PIPELINE CO. OF AMERICA-AMARILLO POOLING PIN-MONTH AHEAD-ICE"),
        NATURAL_GAS_NATURAL_GAS_PIPELINE_CO_OF_AMERICA_LOUISIANA_POOLING_PIN_MONTH_AHEAD_ICE("NATURAL GAS-NATURAL GAS PIPELINE CO. OF AMERICA-LOUISIANA POOLING PIN-MONTH AHEAD-ICE"),
        NATURAL_GAS_NATURAL_GAS_PIPELINE_CO_OF_AMERICA_MID_CONTINENT_POOLING_PIN_MONTH_AHEAD_ICE("NATURAL GAS-NATURAL GAS PIPELINE CO. OF AMERICA-MID-CONTINENT POOLING PIN-MONTH AHEAD-ICE"),
        NATURAL_GAS_NATURAL_GAS_PIPELINE_CO_OF_AMERICA_TXOK_EAST_POOL_GULF_COAST_MONTH_AHEAD_ICE("NATURAL GAS-NATURAL GAS PIPELINE CO. OF AMERICA-TXOK EAST POOL (GULF COAST)-MONTH AHEAD-ICE"),
        NATURAL_GAS_NATURAL_GAS_PIPELINE_CO_OF_AMERICA_SOUTH_TEXAS_POOL_MONTH_AHEAD_ICE("NATURAL GAS-NATURAL GAS PIPELINE CO. OF AMERICA, SOUTH TEXAS POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_NBP_MONTHLY_HEREN("NATURAL GAS-NBP MONTHLY-HEREN"),
        NATURAL_GAS_NBP_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-NBP-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_NBP_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-NBP-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_NBP_DAY_AHEAD_INDEX_HEREN("NATURAL GAS-NBP-DAY AHEAD INDEX-HEREN"),
        NATURAL_GAS_NBP_DAY_AHEAD_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-NBP-DAY AHEAD-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_NBP_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-NBP-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_NBP_PLATTS_ENGR("NATURAL GAS-NBP-PLATTS ENGR"),
        NATURAL_GAS_NBPL_VENTURA_TP_INSIDE_FERC("NATURAL GAS-NBPL (VENTURA TP)-INSIDE FERC"),
        NATURAL_GAS_NCG_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-NCG DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_NCG_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_EEX("NATURAL GAS-NCG DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-EEX"),
        NATURAL_GAS_NCG_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-NCG DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_NCG_MONTHLY_AVERAGE_EEX("NATURAL GAS-NCG MONTHLY AVERAGE-EEX"),
        NATURAL_GAS_NCG_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-NCG-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_NCG_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-NCG-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_NCG_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-NCG-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_NCG_MONTHLY_PRICE_HEREN("NATURAL GAS-NCG-MONTHLY PRICE-HEREN"),
        NATURAL_GAS_NEW_MEXICO_EL_PASO_BONDAD_GAS_DAILY("NATURAL GAS-NEW MEXICO (EL PASO, BONDAD)-GAS DAILY"),
        NATURAL_GAS_NEW_MEXICO_EL_PASO_SAN_JUAN_GAS_DAILY("NATURAL GAS-NEW MEXICO (EL PASO, SAN JUAN)-GAS DAILY"),
        NATURAL_GAS_NGPL_LOUISIANA_INSIDE_FERC("NATURAL GAS-NGPL (LOUISIANA)-INSIDE FERC"),
        NATURAL_GAS_NGPL_NICOR_NIPSCO_PGLC_CITYGATE_NBPL_NICOR_MONTH_AHEAD_ICE("NATURAL GAS-NGPL (NICOR, NIPSCO, PGLC CITYGATE), NBPL-NICOR-MONTH AHEAD-ICE"),
        NATURAL_GAS_NGPL_SOUTH_TEXAS_INSIDE_FERC("NATURAL GAS-NGPL (SOUTH TEXAS)-INSIDE FERC"),
        NATURAL_GAS_NGPL_TEXOK_INSIDE_FERC("NATURAL GAS-NGPL (TEXOK)-INSIDE FERC"),
        NATURAL_GAS_NGPL_AMARILLO_DAY_AHEAD_ICE("NATURAL GAS-NGPL-AMARILLO-DAY AHEAD-ICE"),
        NATURAL_GAS_NGPL_LA_POOL_DAY_AHEAD_ICE("NATURAL GAS-NGPL-LA POOL-DAY AHEAD-ICE"),
        NATURAL_GAS_NGPL_MIDCONT_DAY_AHEAD_ICE("NATURAL GAS-NGPL-MIDCONT-DAY AHEAD-ICE"),
        NATURAL_GAS_NGPL_STX_DAY_AHEAD_ICE("NATURAL GAS-NGPL-STX-DAY AHEAD-ICE"),
        NATURAL_GAS_NGX_AB_NIT_BIDWEEK_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT BIDWEEK (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_BIDWEEK_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT BIDWEEK (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_DAY_AHEAD_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT DAY AHEAD (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_DAY_AHEAD_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT DAY AHEAD (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_MONTH_AHEAD_INDEX_7_A_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT MONTH AHEAD INDEX 7A (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_MONTH_AHEAD_INDEX_7_A_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT MONTH AHEAD INDEX 7A (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_2_A_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 2A (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_2_A_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 2A (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_2_A_ARITHMETIC_AVG_FOR_MONTH_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 2A ARITHMETIC AVG FOR MONTH (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_2_A_ARITHMETIC_AVG_FOR_MONTH_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 2A ARITHMETIC AVG FOR MONTH (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_4_A_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 4A (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_4_A_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 4A (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_5_A_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 5A (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_5_A_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY 5A (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_INDEX_5_A_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY INDEX 5A (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_AB_NIT_SAME_DAY_INDEX_5_A_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX AB-NIT SAME DAY INDEX 5A (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_EMPRESS_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX EMPRESS (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_EMPRESS_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX EMPRESS (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_SPECTRA_ST_2_DAY_AHEAD_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX SPECTRA ST 2 DAY AHEAD (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_SPECTRA_ST_2_DAY_AHEAD_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX SPECTRA ST 2 DAY AHEAD (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_UNION_DAWN_C_$_GJ_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX UNION DAWN (C$/GJ)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NGX_UNION_DAWN_US_$_MMBTU_CANADIAN_GAS_PRICE_REPORTER("NATURAL GAS-NGX UNION DAWN (US$/MMBTU)-CANADIAN GAS PRICE REPORTER"),
        NATURAL_GAS_NIAGARA_$_US_MMBTU_NGX("NATURAL GAS-NIAGARA ($US/MMBTU)-NGX"),
        NATURAL_GAS_NNG_DEMARCATION_INSIDE_FERC("NATURAL GAS-NNG (DEMARCATION)-INSIDE FERC"),
        NATURAL_GAS_NNG_VENTURA_INSIDE_FERC("NATURAL GAS-NNG (VENTURA)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_ALGONQUIN_CITY_GATE_INSIDE_FERC("NATURAL GAS-NORTHEAST (ALGONQUIN CITY-GATE)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_IROQUOIS_ZONE_2_INSIDE_FERC("NATURAL GAS-NORTHEAST (IROQUOIS ZONE 2)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_LEBANON_HUB_INSIDE_FERC("NATURAL GAS-NORTHEAST (LEBANON HUB)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_NIAGARA_INSIDE_FERC("NATURAL GAS-NORTHEAST (NIAGARA)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_TENNESSEE_ZONE_6_DELIVERED_INSIDE_FERC("NATURAL GAS-NORTHEAST (TENNESSEE ZONE 6 DELIVERED)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_TEXAS_EASTERN_ZONE_M_3_INSIDE_FERC("NATURAL GAS-NORTHEAST (TEXAS EASTERN ZONE M-3)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_TRANSCO_ZONE_6_N_Y_INSIDE_FERC("NATURAL GAS-NORTHEAST (TRANSCO ZONE 6 N.Y.)-INSIDE FERC"),
        NATURAL_GAS_NORTHEAST_TRANSCO_ZONE_6_NON_N_Y_INSIDE_FERC("NATURAL GAS-NORTHEAST (TRANSCO ZONE 6 NON-N.Y.)-INSIDE FERC"),
        NATURAL_GAS_NORTHERN_NATURAL_GAS_NORTHERN_BORDER_TRANSFER_POINT_AT_VENTURA_MONTH_AHEAD_ICE("NATURAL GAS-NORTHERN NATURAL GAS & NORTHERN BORDER (TRANSFER POINT) AT VENTURA-MONTH AHEAD-ICE"),
        NATURAL_GAS_NORTHERN_NATURAL_GAS_DEMARCATION_MONTH_AHEAD_ICE("NATURAL GAS-NORTHERN NATURAL GAS-DEMARCATION-MONTH AHEAD-ICE"),
        NATURAL_GAS_NORTHWEST_PIPELINE_CORP_ROCKY_MOUNTAIN_POOL_MONTH_AHEAD_ICE("NATURAL GAS-NORTHWEST PIPELINE CORP.-ROCKY MOUNTAIN POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_NORTHWEST_PIPELINE_CORP_WYOMING_POOL_MONTH_AHEAD_ICE("NATURAL GAS-NORTHWEST PIPELINE CORP.-WYOMING POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_NWP_ROCKY_MTN_DAY_AHEAD_ICE("NATURAL GAS-NWP-ROCKY MTN-DAY AHEAD-ICE"),
        NATURAL_GAS_NWP_WYOMING_DAY_AHEAD_ICE("NATURAL GAS-NWP-WYOMING-DAY AHEAD-ICE"),
        NATURAL_GAS_NWPL_CANADIAN_BORDER_INSIDE_FERC("NATURAL GAS-NWPL (CANADIAN BORDER)-INSIDE FERC"),
        NATURAL_GAS_NWPL_ROCKY_MOUNTAINS_INSIDE_FERC("NATURAL GAS-NWPL (ROCKY MOUNTAINS)-INSIDE FERC"),
        NATURAL_GAS_NYMEX("NATURAL GAS-NYMEX"),
        NATURAL_GAS_OCM("NATURAL GAS-OCM"),
        NATURAL_GAS_OKLAHOMA_ANR_GAS_DAILY("NATURAL GAS-OKLAHOMA (ANR)-GAS DAILY"),
        NATURAL_GAS_OKLAHOMA_CENTERPOINT_EAST_GAS_DAILY("NATURAL GAS-OKLAHOMA (CENTERPOINT EAST)-GAS DAILY"),
        NATURAL_GAS_OKLAHOMA_NGPL_GAS_DAILY("NATURAL GAS-OKLAHOMA (NGPL)-GAS DAILY"),
        NATURAL_GAS_OKLAHOMA_ONEOK_OKLA_GAS_DAILY("NATURAL GAS-OKLAHOMA (ONEOK, OKLA)-GAS DAILY"),
        NATURAL_GAS_OKLAHOMA_PANHANDLE_GAS_DAILY("NATURAL GAS-OKLAHOMA (PANHANDLE)-GAS DAILY"),
        NATURAL_GAS_OKLAHOMA_SOUTHERN_STAR_TX_OKLA_KAN_GAS_DAILY("NATURAL GAS-OKLAHOMA (SOUTHERN STAR, TX-OKLA-KAN)-GAS DAILY"),
        NATURAL_GAS_ONEOK_GAS_TRANSPORTATION_MONTH_AHEAD_ICE("NATURAL GAS-ONEOK GAS TRANSPORTATION-MONTH AHEAD-ICE"),
        NATURAL_GAS_ONEOK_DAY_AHEAD_ICE("NATURAL GAS-ONEOK-DAY AHEAD-ICE"),
        NATURAL_GAS_ONG_OKLAHOMA_INSIDE_FERC("NATURAL GAS-ONG (OKLAHOMA)-INSIDE FERC"),
        NATURAL_GAS_OPAL_PLANT_TAILGATE_MONTH_AHEAD_ICE("NATURAL GAS-OPAL PLANT TAILGATE-MONTH AHEAD-ICE"),
        NATURAL_GAS_OPAL_DAY_AHEAD_ICE("NATURAL GAS-OPAL-DAY AHEAD-ICE"),
        NATURAL_GAS_OTHERS_ALGONQUIN_RECEIPTS_GAS_DAILY("NATURAL GAS-OTHERS (ALGONQUIN, RECEIPTS)-GAS DAILY"),
        NATURAL_GAS_OTHERS_ALLIANCE_INTO_INTERSTATES_GAS_DAILY("NATURAL GAS-OTHERS (ALLIANCE, INTO INTERSTATES)-GAS DAILY"),
        NATURAL_GAS_OTHERS_ANR_ML_7_GAS_DAILY("NATURAL GAS-OTHERS (ANR ML 7)-GAS DAILY"),
        NATURAL_GAS_OTHERS_DEMARCATION_GAS_DAILY("NATURAL GAS-OTHERS (DEMARCATION)-GAS DAILY"),
        NATURAL_GAS_OTHERS_DRACUT_GAS_DAILY("NATURAL GAS-OTHERS (DRACUT)-GAS DAILY"),
        NATURAL_GAS_OTHERS_EP_SOUTH_MAINLINE_GAS_DAILY("NATURAL GAS-OTHERS (EP SOUTH MAINLINE)-GAS DAILY"),
        NATURAL_GAS_OTHERS_NBPL_VENTURA_TP_GAS_DAILY("NATURAL GAS-OTHERS (NBPL VENTURA TP)-GAS DAILY"),
        NATURAL_GAS_OTHERS_NGPL_AMARILLO_RECEIPT_GAS_DAILY("NATURAL GAS-OTHERS (NGPL AMARILLO RECEIPT)-GAS DAILY"),
        NATURAL_GAS_OTHERS_PG_E_MALIN_GAS_DAILY("NATURAL GAS-OTHERS (PG&E MALIN)-GAS DAILY"),
        NATURAL_GAS_OTHERS_PG_E_SOUTH_GAS_DAILY("NATURAL GAS-OTHERS (PG&E SOUTH)-GAS DAILY"),
        NATURAL_GAS_OTHERS_SOCAL_GAS_GAS_DAILY("NATURAL GAS-OTHERS (SOCAL GAS)-GAS DAILY"),
        NATURAL_GAS_OTHERS_TEXAS_EASTERN_M_1_24_INCH_GAS_DAILY("NATURAL GAS-OTHERS (TEXAS EASTERN M-1, 24-INCH)-GAS DAILY"),
        NATURAL_GAS_OTHERS_TRUNKLINE_ZONE_1_A_GAS_DAILY("NATURAL GAS-OTHERS (TRUNKLINE ZONE 1A)-GAS DAILY"),
        NATURAL_GAS_OTHERS_VENTURA_GAS_DAILY("NATURAL GAS-OTHERS (VENTURA)-GAS DAILY"),
        NATURAL_GAS_PACIFIC_GAS_TRANSMISSION_MALIN_POOL_MONTH_AHEAD_ICE("NATURAL GAS-PACIFIC GAS TRANSMISSION-MALIN POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_PACIFIC_GAS_TRANSMISSION_STANFIELD_POOL_MONTH_AHEAD_ICE("NATURAL GAS-PACIFIC GAS TRANSMISSION-STANFIELD POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_PANHANDLE_EASTERN_PIPE_LINE_CO_POOL_GAS_MONTH_AHEAD_ICE("NATURAL GAS-PANHANDLE EASTERN PIPE LINE CO.-POOL GAS-MONTH AHEAD-ICE"),
        NATURAL_GAS_PANHANDLE_DAY_AHEAD_ICE("NATURAL GAS-PANHANDLE-DAY AHEAD-ICE"),
        NATURAL_GAS_PEG_NORTH_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-PEG NORTH DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_PEG_NORTH_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-PEG NORTH DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_PEG_NORTH_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-PEG NORTH-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_PEG_SOUTH_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-PEG SOUTH DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_PEG_SOUTH_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-PEG SOUTH DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_PEG_SOUTH_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-PEG SOUTH-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_PEPL_TEXOK_MAINLINE_INSIDE_FERC("NATURAL GAS-PEPL (TEXOK MAINLINE)-INSIDE FERC"),
        NATURAL_GAS_PERMIAN_BASIN_EL_PASO_GAS_DAILY("NATURAL GAS-PERMIAN BASIN (EL PASO)-GAS DAILY"),
        NATURAL_GAS_PERMIAN_BASIN_TRANSWESTERN_GAS_DAILY("NATURAL GAS-PERMIAN BASIN (TRANSWESTERN)-GAS DAILY"),
        NATURAL_GAS_PERMIAN_BASIN_WAHA_GAS_DAILY("NATURAL GAS-PERMIAN BASIN (WAHA)-GAS DAILY"),
        NATURAL_GAS_PG_E_CITYGATE_DAY_AHEAD_ICE("NATURAL GAS-PG&E-CITYGATE-DAY AHEAD-ICE"),
        NATURAL_GAS_PG_E_CITYGATE_MONTH_AHEAD_ICE("NATURAL GAS-PG&E-CITYGATE-MONTH AHEAD-ICE"),
        NATURAL_GAS_PG_E_TOPOCK_MONTH_AHEAD_ICE("NATURAL GAS-PG&E-TOPOCK-MONTH AHEAD-ICE"),
        NATURAL_GAS_PSV_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-PSV DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_PSV_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-PSV DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_PSV_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-PSV-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_QUESTAR_ROCKY_MOUNTAINS_INSIDE_FERC("NATURAL GAS-QUESTAR (ROCKY MOUNTAINS)-INSIDE FERC"),
        NATURAL_GAS_ROCKIES_CHEYENNE_HUB_GAS_DAILY("NATURAL GAS-ROCKIES (CHEYENNE HUB)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_CIG_ROCKY_MOUNTAINS_GAS_DAILY("NATURAL GAS-ROCKIES (CIG ROCKY MOUNTAINS)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_KERN_RIVER_OPAL_PLANT_GAS_DAILY("NATURAL GAS-ROCKIES (KERN RIVER, OPAL PLANT)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_NORTHWEST_S_OF_GREEN_RIVER_GAS_DAILY("NATURAL GAS-ROCKIES (NORTHWEST, S. OF GREEN RIVER)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_NORTHWEST_WYO_POOL_GAS_DAILY("NATURAL GAS-ROCKIES (NORTHWEST, WYO. POOL)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_QUESTAR_RM_GAS_DAILY("NATURAL GAS-ROCKIES (QUESTAR RM)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_STANFIELD_ORE_GAS_DAILY("NATURAL GAS-ROCKIES (STANFIELD ORE.)-GAS DAILY"),
        NATURAL_GAS_ROCKIES_NW_AECO_C_INSIDE_FERC("NATURAL GAS-ROCKIES/NW (AECO-C)-INSIDE FERC"),
        NATURAL_GAS_ROCKIES_NW_CHEYENNE_HUB_INSIDE_FERC("NATURAL GAS-ROCKIES/NW (CHEYENNE HUB)-INSIDE FERC"),
        NATURAL_GAS_ROCKIES_NW_STANFIELD_INSIDE_FERC("NATURAL GAS-ROCKIES/NW (STANFIELD)-INSIDE FERC"),
        NATURAL_GAS_S_LOUISIANA_HENRY_HUB_INSIDE_FERC("NATURAL GAS-S. LOUISIANA (HENRY HUB)-INSIDE FERC"),
        NATURAL_GAS_SOCAL_BORDER_DAY_AHEAD_ICE("NATURAL GAS-SOCAL BORDER-DAY AHEAD-ICE"),
        NATURAL_GAS_SONAT_T_1_DAY_AHEAD_ICE("NATURAL GAS-SONAT-T1-DAY AHEAD-ICE"),
        NATURAL_GAS_SOUTH_CORPUS_CHRISTI_AGUA_DULCE_HUB_GAS_DAILY("NATURAL GAS-SOUTH-CORPUS CHRISTI (AGUA DULCE HUB)-GAS DAILY"),
        NATURAL_GAS_SOUTH_CORPUS_CHRISTI_NGPL_STX_GAS_DAILY("NATURAL GAS-SOUTH-CORPUS CHRISTI (NGPL STX)-GAS DAILY"),
        NATURAL_GAS_SOUTH_CORPUS_CHRISTI_TENNESSEE_ZONE_0_GAS_DAILY("NATURAL GAS-SOUTH-CORPUS CHRISTI (TENNESSEE ZONE 0)-GAS DAILY"),
        NATURAL_GAS_SOUTH_CORPUS_CHRISTI_TEXAS_EASTERN_STX_GAS_DAILY("NATURAL GAS-SOUTH-CORPUS CHRISTI (TEXAS EASTERN STX)-GAS DAILY"),
        NATURAL_GAS_SOUTH_CORPUS_CHRISTI_TRANSCO_ZONE_1_GAS_DAILY("NATURAL GAS-SOUTH-CORPUS CHRISTI (TRANSCO ZONE 1)-GAS DAILY"),
        NATURAL_GAS_SOUTHERN_CALIFORNIA_BORDER_EHRENBERG_TOPOCK_NEEDLES_WHEELER_KRS_STOR_PROD_KRAMER_MONTH_AHEAD_ICE("NATURAL GAS-SOUTHERN CALIFORNIA BORDER (EHRENBERG,TOPOCK,NEEDLES,WHEELER,KRS,STOR/PROD,KRAMER)-MONTH AHEAD-ICE"),
        NATURAL_GAS_SOUTHERN_NATURAL_LOUISIANA_INSIDE_FERC("NATURAL GAS-SOUTHERN NATURAL (LOUISIANA)-INSIDE FERC"),
        NATURAL_GAS_SOUTHERN_NATURAL_GAS_CO_TIER_1_POOL_MONTH_AHEAD_ICE("NATURAL GAS-SOUTHERN NATURAL GAS CO.-TIER 1 POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_SOUTHERN_STAR_TEX_OKLA_KAN_INSIDE_FERC("NATURAL GAS-SOUTHERN STAR (TEX/OKLA/KAN)-INSIDE FERC"),
        NATURAL_GAS_STANFIELD_DAY_AHEAD_ICE("NATURAL GAS-STANFIELD-DAY AHEAD-ICE"),
        NATURAL_GAS_STATION_2_$_CAD_GJ_NGX("NATURAL GAS-STATION #2 ($CAD/GJ)-NGX"),
        NATURAL_GAS_STATION_2_DAY_AHEAD_ICE("NATURAL GAS-STATION 2-DAY AHEAD-ICE"),
        NATURAL_GAS_TENNESSEE_GAS_LOUISIANA_500_LEG_INSIDE_FERC("NATURAL GAS-TENNESSEE GAS (LOUISIANA, 500 LEG)-INSIDE FERC"),
        NATURAL_GAS_TENNESSEE_GAS_LOUISIANA_800_LEG_INSIDE_FERC("NATURAL GAS-TENNESSEE GAS (LOUISIANA, 800 LEG)-INSIDE FERC"),
        NATURAL_GAS_TENNESSEE_GAS_TEXAS_ZONE_0_INSIDE_FERC("NATURAL GAS-TENNESSEE GAS (TEXAS ZONE 0)-INSIDE FERC"),
        NATURAL_GAS_TENNESSEE_GAS_PIPELINE_CO_ZONE_0_MONTH_AHEAD_ICE("NATURAL GAS-TENNESSEE GAS PIPELINE CO.-ZONE 0-MONTH AHEAD-ICE"),
        NATURAL_GAS_TENNESSEE_GAS_PIPELINE_CO_ZONE_6_200_LINE_DELIVERED_MONTH_AHEAD_ICE("NATURAL GAS-TENNESSEE GAS PIPELINE CO.-ZONE 6, 200 LINE (DELIVERED)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TENNESSEE_GAS_PIPELINE_CO_ZONE_L_500_LEG_POOL_MONTH_AHEAD_ICE("NATURAL GAS-TENNESSEE GAS PIPELINE CO.-ZONE L, 500 LEG POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_TENNESSEE_GAS_PIPELINE_CO_ZONE_L_800_LEG_POOL_MONTH_AHEAD_ICE("NATURAL GAS-TENNESSEE GAS PIPELINE CO.-ZONE L, 800 LEG POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_TETCO_E_LOUISIANA_ZONE_INSIDE_FERC("NATURAL GAS-TETCO (E. LOUISIANA ZONE)-INSIDE FERC"),
        NATURAL_GAS_TETCO_E_TEXAS_ZONE_INSIDE_FERC("NATURAL GAS-TETCO (E. TEXAS ZONE)-INSIDE FERC"),
        NATURAL_GAS_TETCO_M_1_ZONE_INSIDE_FERC("NATURAL GAS-TETCO (M-1 ZONE)-INSIDE FERC"),
        NATURAL_GAS_TETCO_S_TEXAS_ZONE_INSIDE_FERC("NATURAL GAS-TETCO (S. TEXAS ZONE)-INSIDE FERC"),
        NATURAL_GAS_TETCO_W_LOUISIANA_ZONE_INSIDE_FERC("NATURAL GAS-TETCO (W. LOUISIANA ZONE)-INSIDE FERC"),
        NATURAL_GAS_TETCO_ELA_DAY_AHEAD_ICE("NATURAL GAS-TETCO-ELA-DAY AHEAD-ICE"),
        NATURAL_GAS_TETCO_M_1_DAY_AHEAD_ICE("NATURAL GAS-TETCO-M1-DAY AHEAD-ICE"),
        NATURAL_GAS_TETCO_M_3_DAY_AHEAD_ICE("NATURAL GAS-TETCO-M3-DAY AHEAD-ICE"),
        NATURAL_GAS_TETCO_STX_DAY_AHEAD_ICE("NATURAL GAS-TETCO-STX-DAY AHEAD-ICE"),
        NATURAL_GAS_TETCO_WLA_DAY_AHEAD_ICE("NATURAL GAS-TETCO-WLA-DAY AHEAD-ICE"),
        NATURAL_GAS_TEX_OKLA_KAN_NNG_INSIDE_FERC("NATURAL GAS-TEX/OKLA/KAN (NNG)-INSIDE FERC"),
        NATURAL_GAS_TEXAS_EASTERN_TRANSMISSION_CORP_EAST_LA_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS EASTERN TRANSMISSION CORP.- EAST LA-MONTH AHEAD-ICE"),
        NATURAL_GAS_TEXAS_EASTERN_TRANSMISSION_CORP_M_1_30_24_INCH_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS EASTERN TRANSMISSION CORP.- M1 30 & 24 INCH-MONTH AHEAD-ICE"),
        NATURAL_GAS_TEXAS_EASTERN_TRANSMISSION_CORP_WEST_LA_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS EASTERN TRANSMISSION CORP.- WEST LA-MONTH AHEAD-ICE"),
        NATURAL_GAS_TEXAS_EASTERN_TRANSMISSION_CORP_SOUTH_TEXAS_ZONE_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS EASTERN TRANSMISSION CORP.-SOUTH TEXAS ZONE-MONTH AHEAD-ICE"),
        NATURAL_GAS_TEXAS_EASTERN_M_3_ZONE_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS EASTERN-M3 ZONE-MONTH AHEAD-ICE"),
        NATURAL_GAS_TEXAS_GAS_TRANSMISSION_CORP_ZONE_1_FT_POOL_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS GAS TRANSMISSION CORP.- ZONE 1 FT POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_TEXAS_GAS_TRANSMISSION_CORP_ZONE_SL_FT_POOL_MONTH_AHEAD_ICE("NATURAL GAS-TEXAS GAS TRANSMISSION CORP.- ZONE SL FT POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_TGP_500_L_DAY_AHEAD_ICE("NATURAL GAS-TGP-500L-DAY AHEAD-ICE"),
        NATURAL_GAS_TGP_800_L_DAY_AHEAD_ICE("NATURAL GAS-TGP-800L-DAY AHEAD-ICE"),
        NATURAL_GAS_TGP_Z_0_DAY_AHEAD_ICE("NATURAL GAS-TGP-Z0-DAY AHEAD-ICE"),
        NATURAL_GAS_TGP_Z_6_200_L_DAY_AHEAD_ICE("NATURAL GAS-TGP-Z6 200L-DAY AHEAD-ICE"),
        NATURAL_GAS_TGT_ZONE_1_INSIDE_FERC("NATURAL GAS-TGT (ZONE 1)-INSIDE FERC"),
        NATURAL_GAS_TGT_ZONE_SL_INSIDE_FERC("NATURAL GAS-TGT (ZONE SL)-INSIDE FERC"),
        NATURAL_GAS_TGT_NGPL_TXOK_DAY_AHEAD_ICE("NATURAL GAS-TGT-NGPL-TXOK-DAY AHEAD-ICE"),
        NATURAL_GAS_TGT_SL_FT_DAY_AHEAD_ICE("NATURAL GAS-TGT-SL (FT)-DAY AHEAD-ICE"),
        NATURAL_GAS_TGT_Z_1_FT_DAY_AHEAD_ICE("NATURAL GAS-TGT-Z1(FT)-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCO_ZONE_1_INSIDE_FERC("NATURAL GAS-TRANSCO (ZONE 1)-INSIDE FERC"),
        NATURAL_GAS_TRANSCO_ZONE_2_INSIDE_FERC("NATURAL GAS-TRANSCO (ZONE 2)-INSIDE FERC"),
        NATURAL_GAS_TRANSCO_ZONE_3_INSIDE_FERC("NATURAL GAS-TRANSCO (ZONE 3)-INSIDE FERC"),
        NATURAL_GAS_TRANSCO_ZONE_4_GAS_DAILY("NATURAL GAS-TRANSCO ZONE 4-GAS DAILY"),
        NATURAL_GAS_TRANSCO_30_DAY_AHEAD_ICE("NATURAL GAS-TRANSCO-30-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCO_45_DAY_AHEAD_ICE("NATURAL GAS-TRANSCO-45-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCO_65_DAY_AHEAD_ICE("NATURAL GAS-TRANSCO-65-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCO_85_DAY_AHEAD_ICE("NATURAL GAS-TRANSCO-85-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCO_Z_6_NON_NY_DAY_AHEAD_ICE("NATURAL GAS-TRANSCO-Z6 (NON-NY)-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCO_Z_6_NY_DAY_AHEAD_ICE("NATURAL GAS-TRANSCO-Z6 (NY)-DAY AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPE_LINE_CORP_ZONE_5_DELIVERED_NON_WASH_GAS_LIGHT_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPE LINE CORP.-ZONE 5 DELIVERED (NON-WASH.GAS LIGHT)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPELINE_CORP_STATION_30_ZONE_1_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPELINE CORP.-STATION 30 (ZONE 1)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPELINE_CORP_STATION_45_ZONE_2_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPELINE CORP.-STATION 45 (ZONE 2)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPELINE_CORP_STATION_65_ZONE_3_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPELINE CORP.-STATION 65 (ZONE 3)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPELINE_CORP_STATION_85_ZONE_4_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPELINE CORP.-STATION 85 (ZONE 4)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPELINE_CORP_ZONE_6_NON_NY_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPELINE CORP.-ZONE 6 (NON-NY)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSCONTINENTAL_GAS_PIPELINE_CORP_ZONE_6_NY_MONTH_AHEAD_ICE("NATURAL GAS-TRANSCONTINENTAL GAS PIPELINE CORP.-ZONE 6 (NY)-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRANSWESTERN_PERMIAN_BASIN_INSIDE_FERC("NATURAL GAS-TRANSWESTERN (PERMIAN BASIN)-INSIDE FERC"),
        NATURAL_GAS_TRUNKLINE_LOUISIANA_INSIDE_FERC("NATURAL GAS-TRUNKLINE (LOUISIANA)-INSIDE FERC"),
        NATURAL_GAS_TRUNKLINE_ZONE_1_A_INSIDE_FERC("NATURAL GAS-TRUNKLINE (ZONE 1A)-INSIDE FERC"),
        NATURAL_GAS_TRUNKLINE_GAS_COMPANY_EAST_LOUISIANA_POOL_MONTH_AHEAD_ICE("NATURAL GAS-TRUNKLINE GAS COMPANY-EAST LOUISIANA POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRUNKLINE_GAS_COMPANY_WEST_LOUISIANA_POOL_MONTH_AHEAD_ICE("NATURAL GAS-TRUNKLINE GAS COMPANY-WEST LOUISIANA POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_TRUNKLINE_ELA_DAY_AHEAD_ICE("NATURAL GAS-TRUNKLINE-ELA-DAY AHEAD-ICE"),
        NATURAL_GAS_TRUNKLINE_WLA_DAY_AHEAD_ICE("NATURAL GAS-TRUNKLINE-WLA-DAY AHEAD-ICE"),
        NATURAL_GAS_TTF_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-TTF DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_TTF_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-TTF DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_TTF_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-TTF-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_TTF_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-TTF-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_TTF_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-TTF-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_TTF_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-TTF-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_TTF_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-TTF-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_TTF_MONTH_AHEAD_ENDEX("NATURAL GAS-TTF-MONTH AHEAD-ENDEX"),
        NATURAL_GAS_TTF_PLATTS_ENGR("NATURAL GAS-TTF-PLATTS ENGR"),
        NATURAL_GAS_UK_MONTHLY_ICE("NATURAL GAS-UK MONTHLY-ICE"),
        NATURAL_GAS_UNION_DAWN_$_US_MMBTU_NGX("NATURAL GAS-UNION DAWN ($US/MMBTU)-NGX"),
        NATURAL_GAS_UNION_GAS_DAWN_MONTH_AHEAD_ICE("NATURAL GAS-UNION GAS-DAWN-MONTH AHEAD-ICE"),
        NATURAL_GAS_UPPER_MIDWEST_ANR_ML_7_INSIDE_FERC("NATURAL GAS-UPPER MIDWEST (ANR ML 7)-INSIDE FERC"),
        NATURAL_GAS_UPPER_MIDWEST_CHICAGO_CITY_GATES_INSIDE_FERC("NATURAL GAS-UPPER MIDWEST (CHICAGO CITY-GATES)-INSIDE FERC"),
        NATURAL_GAS_UPPER_MIDWEST_CONSUMERS_ENERGY_CITY_GATES_INSIDE_FERC("NATURAL GAS-UPPER MIDWEST (CONSUMERS ENERGY CITY-GATES)-INSIDE FERC"),
        NATURAL_GAS_UPPER_MIDWEST_DAWN_ONTARIO_INSIDE_FERC("NATURAL GAS-UPPER MIDWEST (DAWN ONTARIO)-INSIDE FERC"),
        NATURAL_GAS_UPPER_MIDWEST_MICH_CON_CITY_GATE_INSIDE_FERC("NATURAL GAS-UPPER MIDWEST (MICH CON CITY-GATE)-INSIDE FERC"),
        NATURAL_GAS_VENTURA_DAY_AHEAD_ICE("NATURAL GAS-VENTURA-DAY AHEAD-ICE"),
        NATURAL_GAS_W_TEXAS_WAHA_INSIDE_FERC("NATURAL GAS-W. TEXAS (WAHA)-INSIDE FERC"),
        NATURAL_GAS_W_TEXAS_WAHA_NGI("NATURAL GAS-W. TEXAS (WAHA)-NGI"),
        NATURAL_GAS_WAHA_HUB_WEST_TEXAS_MONTH_AHEAD_ICE("NATURAL GAS-WAHA HUB-WEST TEXAS-MONTH AHEAD-ICE"),
        NATURAL_GAS_WAHA_DAY_AHEAD_ICE("NATURAL GAS-WAHA-DAY AHEAD-ICE"),
        NATURAL_GAS_WESTCOAST_ENERGY_NORTHWEST_PIPELINE_CORP_CDN_BORDER_MONTH_AHEAD_ICE("NATURAL GAS-WESTCOAST ENERGY & NORTHWEST PIPELINE CORP. (CDN BORDER)-MONTH AHEAD-ICE"),
        NATURAL_GAS_WESTCOAST_ENERGY_INC_STATION_2_MONTH_AHEAD_ICE("NATURAL GAS-WESTCOAST ENERGY INC-STATION 2-MONTH AHEAD-ICE"),
        NATURAL_GAS_WYOMING_INTERSTATE_COMPANY_POOL_MONTH_AHEAD_ICE("NATURAL GAS-WYOMING INTERSTATE COMPANY-POOL-MONTH AHEAD-ICE"),
        NATURAL_GAS_ZEEBRUGGE_DAY_AHEAD_AND_WEEKEND_LEBA("NATURAL GAS-ZEEBRUGGE DAY AHEAD AND WEEKEND - LEBA"),
        NATURAL_GAS_ZEEBRUGGE_DAY_AHEAD_WINDOW_AND_WEEKEND_WINDOW_LEBA("NATURAL GAS-ZEEBRUGGE DAY AHEAD WINDOW AND WEEKEND WINDOW - LEBA"),
        NATURAL_GAS_ZEEBRUGGE_HUB_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-ZEEBRUGGE HUB-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_ZEEBRUGGE_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_ARGUS_EUROPEAN_NAT_GAS("NATURAL GAS-ZEEBRUGGE-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE - ARGUS EUROPEAN NAT GAS"),
        NATURAL_GAS_ZEEBRUGGE_DAY_AHEAD_AND_WEEKEND_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-ZEEBRUGGE-DAY AHEAD AND WEEKEND UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_ZEEBRUGGE_DAY_AHEAD_BASE_INDEX_DOW_JONES_NAT_GAS("NATURAL GAS-ZEEBRUGGE-DAY AHEAD BASE INDEX-DOW JONES NAT GAS"),
        NATURAL_GAS_ZEEBRUGGE_MONTH_AHEAD_INDEX_LEBA("NATURAL GAS-ZEEBRUGGE-MONTH AHEAD INDEX-LEBA"),
        NATURAL_GAS_ZEEBRUGGE_MONTH_AHEAD_UNWEIGHTED_AVERAGE_PRICE_HEREN("NATURAL GAS-ZEEBRUGGE-MONTH AHEAD UNWEIGHTED AVERAGE PRICE-HEREN"),
        NATURAL_GAS_ZEEBRUGGE_WEEKEND_BASE_INDEX_DOW_JONES_NAT_GAS("NATURAL GAS-ZEEBRUGGE-WEEKEND BASE INDEX-DOW JONES NAT GAS"),
        NATURAL_GAS_ZIG_INDEX_DOW_JONES_NAT_GAS("NATURAL GAS-ZIG INDEX-DOW JONES NAT GAS"),
        NATURAL_GAS_ZONE_4_TRANSCO_INSIDE_FERC("NATURAL GAS-ZONE 4 (TRANSCO)INSIDE FERC"),
        NEWPRINT_30_LB_EAST_PPW("NEWPRINT 30LB EAST PPW"),
        NEWPRINT_48_8_GSM_US_PAPER_TRADER("NEWPRINT 48.8 GSM US PAPER TRADER"),
        NEWSPRINT_45_G_PPI_GERMANY("NEWSPRINT 45G PPI GERMANY"),
        NEWSPRINT_60_G_PPI_GERMANY("NEWSPRINT 60G PPI GERMANY"),
        NGL_BUSHTON_ETHANE_IN_E_P_KM_OPIS("NGL-BUSHTON ETHANE (IN E-P) KM-OPIS"),
        NGL_BUSHTON_ETHANE_IN_E_P_KM_OUT_MONTH_OPIS("NGL-BUSHTON ETHANE (IN E-P) KM-OUT MONTH-OPIS"),
        NGL_BUSHTON_ETHANE_IN_E_P_KM_PROMPT_MONTH_OPIS("NGL-BUSHTON ETHANE (IN E-P) KM-PROMPT MONTH-OPIS"),
        NGL_BUSHTON_ISOBUTANE_KM_OPIS("NGL-BUSHTON ISOBUTANE KM-OPIS"),
        NGL_BUSHTON_ISOBUTANE_KM_OUT_MONTH_OPIS("NGL-BUSHTON ISOBUTANE KM-OUT MONTH-OPIS"),
        NGL_BUSHTON_ISOBUTANE_KM_PROMPT_MONTH_OPIS("NGL-BUSHTON ISOBUTANE KM-PROMPT MONTH-OPIS"),
        NGL_BUSHTON_N_BUTANE_KM_OPIS("NGL-BUSHTON N. Butane KM-OPIS"),
        NGL_BUSHTON_N_BUTANE_KM_OUT_MONTH_OPIS("NGL-BUSHTON N. Butane KM-OUT MONTH-OPIS"),
        NGL_BUSHTON_N_BUTANE_KM_PROMPT_MONTH_OPIS("NGL-BUSHTON N. Butane KM-PROMPT MONTH-OPIS"),
        NGL_BUSHTON_N_GASOLINE_KM_OPIS("NGL-BUSHTON N. GASOLINE KM-OPIS"),
        NGL_BUSHTON_N_GASOLINE_KM_OUT_MONTH_OPIS("NGL-BUSHTON N. GASOLINE KM-OUT MONTH-OPIS"),
        NGL_BUSHTON_N_GASOLINE_KM_PROMPT_MONTH_OPIS("NGL-BUSHTON N. GASOLINE KM-PROMPT MONTH-OPIS"),
        NGL_BUSHTON_PROPANE_KM_OPIS("NGL-BUSHTON PROPANE KM-OPIS"),
        NGL_BUSHTON_PROPANE_KM_OUT_MONTH_OPIS("NGL-BUSHTON PROPANE KM-OUT MONTH-OPIS"),
        NGL_BUSHTON_PROPANE_KM_PROMPT_MONTH_OPIS("NGL-BUSHTON PROPANE KM-PROMPT MONTH-OPIS"),
        NGL_BUTANE_ASIA_PACIFIC_REFRIGERATED_CARGOES_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (ASIA-PACIFIC REFRIGERATED CARGOES)-ARGUS INTERNATIONAL LPG"),
        NGL_BUTANE_EUROPE_CIF_ARA_LARGE_CARGOES_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (EUROPE; CIF ARA LARGE CARGOES)-ARGUS INTERNATIONAL LPG"),
        NGL_BUTANE_EUROPE_CIF_ARA_SMALL_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (EUROPE: CIF ARA SMALL)-ARGUS INTERNATIONAL LPG"),
        NGL_BUTANE_EUROPE_CIF_MEDITERRANEAN_LARGE_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (EUROPE: CIF MEDITERRANEAN LARGE)-ARGUS INTERNATIONAL LPG"),
        NGL_BUTANE_EUROPE_FCA_ARA_RAIL_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (EUROPE: FCA ARA RAIL)-ARGUS INTERNATIONAL LPG"),
        NGL_BUTANE_EUROPE_FOB_ARA_BARGE_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (EUROPE: FOB ARA BARGE)-ARGUS INTERNATIONAL LPG"),
        NGL_BUTANE_EUROPE_FOB_NORTHWEST_EUROPE_SMALL_ARGUS_INTERNATIONAL_LPG("NGL-BUTANE (EUROPE: FOB NORTHWEST EUROPE SMALL)-ARGUS INTERNATIONAL LPG"),
        NGL_CANADIAN_FIELD_GRADE_BUTANE_EDMONTON_OPIS("NGL-CANADIAN FIELD GRADE BUTANE (EDMONTON)-OPIS"),
        NGL_CANADIAN_FIELD_GRADE_BUTANE_EDMONTON_OUT_MONTH_OPIS("NGL-CANADIAN FIELD GRADE BUTANE (EDMONTON)-OUT MONTH-OPIS"),
        NGL_CANADIAN_FIELD_GRADE_BUTANE_EDMONTON_PROMPT_MONTH_OPIS("NGL-CANADIAN FIELD GRADE BUTANE (EDMONTON)-PROMPT MONTH-OPIS"),
        NGL_CANADIAN_ISOBUTANE_SARNIA_OPIS("NGL-CANADIAN ISOBUTANE (SARNIA)-OPIS"),
        NGL_CANADIAN_ISOBUTANE_SARNIA_OUT_MONTH_OPIS("NGL-CANADIAN ISOBUTANE (SARNIA)-OUT MONTH-OPIS"),
        NGL_CANADIAN_ISOBUTANE_SARNIA_PROMPT_MONTH_OPIS("NGL-CANADIAN ISOBUTANE (SARNIA)-PROMPT MONTH-OPIS"),
        NGL_CANADIAN_N_GASOLINE_EDMONTON_OUT_MONTH_OPIS("NGL-CANADIAN N, GASOLINE (EDMONTON)-OUT MONTH-OPIS"),
        NGL_CANADIAN_N_GASOLINE_EDMONTON_PROMPT_MONTH_OPIS("NGL-CANADIAN N, GASOLINE (EDMONTON)-PROMPT MONTH-OPIS"),
        NGL_CANADIAN_N_BUTANE_SARNIA_OPIS("NGL-CANADIAN N. BUTANE (SARNIA)-OPIS"),
        NGL_CANADIAN_N_BUTANE_SARNIA_OUT_MONTH_OPIS("NGL-CANADIAN N. BUTANE (SARNIA)-OUT MONTH-OPIS"),
        NGL_CANADIAN_N_BUTANE_SARNIA_PROMPT_MONTH_OPIS("NGL-CANADIAN N. BUTANE (SARNIA)-PROMPT MONTH-OPIS"),
        NGL_CANADIAN_N_GASOLINE_EDMONTON_OPIS("NGL-CANADIAN N. GASOLINE (EDMONTON)-OPIS"),
        NGL_CANADIAN_N_GASOLINE_DIFF_TO_WTI_EDMONTON_OPIS("NGL-CANADIAN N. GASOLINE DIFF TO WTI (EDMONTON)-OPIS"),
        NGL_CANADIAN_N_GASOLINE_DIFF_TO_WTI_EDMONTON_OUT_MONTH_OPIS("NGL-CANADIAN N. GASOLINE DIFF TO WTI (EDMONTON)-OUT MONTH-OPIS"),
        NGL_CANADIAN_N_GASOLINE_DIFF_TO_WTI_EDMONTON_PROMPT_MONTH_OPIS("NGL-CANADIAN N. GASOLINE DIFF TO WTI (EDMONTON)-PROMPT MONTH-OPIS"),
        NGL_CANADIAN_PROPANE_EDMONTON_OPIS("NGL-CANADIAN PROPANE (EDMONTON)-OPIS"),
        NGL_CANADIAN_PROPANE_EDMONTON_PROMPT_MONTH_OPIS("NGL-CANADIAN PROPANE (EDMONTON)-PROMPT MONTH-OPIS"),
        NGL_CANADIAN_PROPANE_SARNIA_OPIS("NGL-CANADIAN PROPANE (SARNIA)-OPIS"),
        NGL_CANADIAN_PROPANE_SARNIA_OUT_MONTH_OPIS("NGL-CANADIAN PROPANE (SARNIA)-OUT MONTH-OPIS"),
        NGL_CANADIAN_PROPANE_SARNIA_PROMPT_MONTH_OPIS("NGL-CANADIAN PROPANE (SARNIA)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_ETHANE_IN_E_P_IN_LINE_OUT_MONTH_OPIS("NGL-CONWAY ETHANE IN E-P (IN-LINE)-OUT MONTH-OPIS"),
        NGL_CONWAY_ETHANE_IN_E_P_IN_LINE_PROMPT_MONTH_OPIS("NGL-CONWAY ETHANE IN E-P (IN-LINE)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_ETHANE_IN_E_P_IN_WELL_OPIS("NGL-CONWAY ETHANE IN E-P (IN-WELL)-OPIS"),
        NGL_CONWAY_ETHANE_IN_E_P_IN_WELL_OUT_MONTH_OPIS("NGL-CONWAY ETHANE IN E-P (IN-WELL)-OUT MONTH-OPIS"),
        NGL_CONWAY_ETHANE_IN_E_P_IN_WELL_PROMPT_MONTH_OPIS("NGL-CONWAY ETHANE IN E-P (IN-WELL)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_ETHANE_IN_E_P_IN_LINE_OPIS("NGL-CONWAY ETHANE IN E-P(IN-LINE)-OPIS"),
        NGL_CONWAY_ISOBUTANE_IN_LINE_OPIS("NGL-CONWAY ISOBUTANE (IN-LINE)-OPIS"),
        NGL_CONWAY_ISOBUTANE_IN_LINE_OUT_MONTH_OPIS("NGL-CONWAY ISOBUTANE (IN-LINE)-OUT MONTH-OPIS"),
        NGL_CONWAY_ISOBUTANE_IN_LINE_PROMPT_MONTH_OPIS("NGL-CONWAY ISOBUTANE (IN-LINE)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_ISOBUTANE_IN_WELL_OPIS("NGL-CONWAY ISOBUTANE (IN-WELL)-OPIS"),
        NGL_CONWAY_ISOBUTANE_IN_WELL_OUT_MONTH_OPIS("NGL-CONWAY ISOBUTANE (IN-WELL)-OUT MONTH-OPIS"),
        NGL_CONWAY_ISOBUTANE_IN_WELL_PROMPT_MONTH_OPIS("NGL-CONWAY ISOBUTANE (IN-WELL)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_N_BUTANE_IN_LINE_OPIS("NGL-CONWAY N. BUTANE (IN-LINE)-OPIS"),
        NGL_CONWAY_N_BUTANE_IN_LINE_OUT_MONTH_OPIS("NGL-CONWAY N. BUTANE (IN-LINE)-OUT MONTH-OPIS"),
        NGL_CONWAY_N_BUTANE_IN_LINE_PROMPT_MONTH_OPIS("NGL-CONWAY N. BUTANE (IN-LINE)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_N_BUTANE_IN_WELL_OPIS("NGL-CONWAY N. BUTANE (IN-WELL)-OPIS"),
        NGL_CONWAY_N_BUTANE_IN_WELL_OUT_MONTH_OPIS("NGL-CONWAY N. BUTANE (IN-WELL)-OUT MONTH OPIS"),
        NGL_CONWAY_N_BUTANE_IN_WELL_PROMPT_MONTH_OPIS("NGL-CONWAY N. BUTANE (IN-WELL)-PROMPT MONTH OPIS"),
        NGL_CONWAY_N_GASOLINE_IN_LINE_OPIS("NGL-CONWAY N. GASOLINE (IN-LINE)-OPIS"),
        NGL_CONWAY_N_GASOLINE_IN_LINE_OUT_MONTH_OPIS("NGL-CONWAY N. GASOLINE (IN-LINE)-OUT MONTH-OPIS"),
        NGL_CONWAY_N_GASOLINE_IN_LINE_PROMT_MONTH_OPIS("NGL-CONWAY N. GASOLINE (IN-LINE)-PROMT MONTH-OPIS"),
        NGL_CONWAY_N_GASOLINE_IN_WELL_OPIS("NGL-CONWAY N. GASOLINE (IN-WELL)-OPIS"),
        NGL_CONWAY_N_GASOLINE_IN_WELL_OUT_MONTH_OPIS("NGL-CONWAY N. GASOLINE (IN-WELL)-OUT MONTH-OPIS"),
        NGL_CONWAY_N_GASOLINE_IN_WELL_PROMPT_MONTH_OPIS("NGL-CONWAY N. GASOLINE (IN-WELL)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_PROPANE_IN_LINE_OPIS("NGL-CONWAY PROPANE (IN-LINE)-OPIS"),
        NGL_CONWAY_PROPANE_IN_LINE_OUT_MONTH_OPIS("NGL-CONWAY PROPANE (IN-LINE)-OUT MONTH-OPIS"),
        NGL_CONWAY_PROPANE_IN_LINE_PROMPT_MONTH_OPIS("NGL-CONWAY PROPANE (IN-LINE)-PROMPT MONTH-OPIS"),
        NGL_CONWAY_PROPANE_IN_WELL_OPIS("NGL-CONWAY PROPANE (IN-WELL)-OPIS"),
        NGL_CONWAY_PROPANE_IN_WELL_OUT_MONTH_OPIS("NGL-CONWAY PROPANE (IN-WELL)-OUT MONTH-OPIS"),
        NGL_CONWAY_PROPANE_IN_WELL_PROMPT_MONTH_OPIS("NGL-CONWAY PROPANE (IN-WELL)-PROMPT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_ISOBUTANE_OPIS("NGL-GEISMAR/SORRENTO ISOBUTANE-OPIS"),
        NGL_GEISMAR_SORRENTO_ISOBUTANE_OUT_MONTH_OPIS("NGL-GEISMAR/SORRENTO ISOBUTANE-OUT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_ISOBUTANE_PROMPT_MONTH_OPIS("NGL-GEISMAR/SORRENTO ISOBUTANE-PROMPT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_N_BUTANE_OPIS("NGL-GEISMAR/SORRENTO N. BUTANE- OPIS"),
        NGL_GEISMAR_SORRENTO_N_BUTANE_PROMPT_MONTH_OPIS("NGL-GEISMAR/SORRENTO N. BUTANE- PROMPT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_N_BUTANE_OUT_MONTH_OPIS("NGL-GEISMAR/SORRENTO N. BUTANE-OUT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_N_GASOLINE_OPIS("NGL-GEISMAR/SORRENTO N. GASOLINE-OPIS"),
        NGL_GEISMAR_SORRENTO_N_GASOLINE_OUT_MONTH_OPIS("NGL-GEISMAR/SORRENTO N. GASOLINE-OUT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_N_GASOLINE_PROMPT_MONTH_OPIS("NGL-GEISMAR/SORRENTO N. GASOLINE-PROMPT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_PROPANE_OPIS("NGL-GEISMAR/SORRENTO PROPANE-OPIS"),
        NGL_GEISMAR_SORRENTO_PROPANE_OUT_MONTH_OPIS("NGL-GEISMAR/SORRENTO PROPANE-OUT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_PROPANE_PROMPT_MONTH_OPIS("NGL-GEISMAR/SORRENTO PROPANE-PROMPT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_PURITY_ETHANE_OPIS("NGL-GEISMAR/SORRENTO PURITY ETHANE-OPIS"),
        NGL_GEISMAR_SORRENTO_PURITY_ETHANE_OUT_MONTH_OPIS("NGL-GEISMAR/SORRENTO PURITY ETHANE-OUT MONTH-OPIS"),
        NGL_GEISMAR_SORRENTO_PURITY_ETHANE_PROMPT_MONTH_OPIS("NGL-GEISMAR/SORRENTO PURITY ETHANE-PROMPT MONTH-OPIS"),
        NGL_HATTIESBURG_PROPANE_IN_LINE_OPIS("NGL-HATTIESBURG PROPANE (IN-LINE)-OPIS"),
        NGL_HATTIESBURG_PROPANE_IN_LINE_OUT_MONTH_OPIS("NGL-HATTIESBURG PROPANE (IN-LINE)-OUT MONTH-OPIS"),
        NGL_HATTIESBURG_PROPANE_IN_LINE_PROMPT_MONTH_OPIS("NGL-HATTIESBURG PROPANE (IN-LINE)-PROMPT MONTH-OPIS"),
        NGL_HATTIESBURG_PROPANE_STORAGE_OPIS("NGL-HATTIESBURG PROPANE (STORAGE)-OPIS"),
        NGL_HATTIESBURG_PROPANE_STORAGE_OUT_MONTH_OPIS("NGL-HATTIESBURG PROPANE (STORAGE)-OUT MONTH-OPIS"),
        NGL_HATTIESBURG_PROPANE_STORAGE_PROMPT_MONTH_OPIS("NGL-HATTIESBURG PROPANE (STORAGE)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_EP_MIX_OPIS("NGL-MONT BELVIEU EP MIX-OPIS"),
        NGL_MONT_BELVIEU_EP_MIX_OUT_MONTH_OPIS("NGL-MONT BELVIEU EP MIX-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_EP_MIX_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU EP MIX-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_NON_TET_OPIS("NGL-MONT BELVIEU ISOBUTANE (NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU ISOBUTANE (NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU ISOBUTANE (NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_OTHER_NON_TET_OPIS("NGL-MONT BELVIEU ISOBUTANE (OTHER NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_OTHER_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU ISOBUTANE (OTHER NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_OTHER_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU ISOBUTANE (OTHER NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_TET_OPIS("NGL-MONT BELVIEU ISOBUTANE (TET)-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU ISOBUTANE (TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_ISOBUTANE_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU ISOBUTANE (TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_NON_TET_OPIS("NGL-MONT BELVIEU N. BUTANE (NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU N. BUTANE (NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU N. BUTANE (NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_OTHER_NON_TET_OPIS("NGL-MONT BELVIEU N. BUTANE (OTHER NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_OTHER_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU N. BUTANE (OTHER NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_OTHER_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU N. BUTANE (OTHER NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_TET_OPIS("NGL-MONT BELVIEU N. BUTANE (TET)-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU N. BUTANE (TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_BUTANE_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU N. BUTANE (TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_NON_TET_OPIS("NGL-MONT BELVIEU N. GASOLINE (NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU N. GASOLINE (NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU N. GASOLINE (NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_OTHER_NON_TET_OPIS("NGL-MONT BELVIEU N. GASOLINE (OTHER NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_OTHER_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU N. GASOLINE (OTHER NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_OTHER_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU N. GASOLINE (OTHER NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_TET_OPIS("NGL-MONT BELVIEU N. GASOLINE (TET)-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU N. GASOLINE (TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_N_GASOLINE_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU N. GASOLINE (TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_OTHER_NON_TET_E_P_MIX_OPIS("NGL-MONT BELVIEU OTHER NON-TET E-P MIX-OPIS"),
        NGL_MONT_BELVIEU_OTHER_NON_TET_E_P_MIX_OUT_MONTH_OPIS("NGL-MONT BELVIEU OTHER NON-TET E-P MIX-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_OTHER_NON_TET_E_P_MIX_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU OTHER NON-TET E-P MIX-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_NON_TET_OPIS("NGL-MONT BELVIEU PROPANE (NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU PROPANE (NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU PROPANE (NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_OTHER_NON_TET_OPIS("NGL-MONT BELVIEU PROPANE (OTHER NON-TET)-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_OTHER_NON_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU PROPANE (OTHER NON-TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_OTHER_NON_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU PROPANE (OTHER NON-TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_TET_OPIS("NGL-MONT BELVIEU PROPANE (TET)-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_TET_OUT_MONTH_OPIS("NGL-MONT BELVIEU PROPANE (TET)-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PROPANE_TET_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU PROPANE (TET)-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PURITY_ETHANE_OPIS("NGL-MONT BELVIEU PURITY ETHANE-OPIS"),
        NGL_MONT_BELVIEU_PURITY_ETHANE_OUT_MONTH_OPIS("NGL-MONT BELVIEU PURITY ETHANE-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_PURITY_ETHANE_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU PURITY ETHANE-PROMPT MONTH-OPIS"),
        NGL_MONT_BELVIEU_RIVER_N_GASOLINE_OPIS("NGL-MONT BELVIEU RIVER N. GASOLINE-OPIS"),
        NGL_MONT_BELVIEU_RIVER_N_GASOLINE_OUT_MONTH_OPIS("NGL-MONT BELVIEU RIVER N. GASOLINE-OUT MONTH-OPIS"),
        NGL_MONT_BELVIEU_RIVER_N_GASOLINE_PROMPT_MONTH_OPIS("NGL-MONT BELVIEU RIVER N. GASOLINE-PROMPT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_ETHANE_IN_E_P_OPIS("NGL-NAPOLEAONVILLE ETHANE (IN E-P)- OPIS"),
        NGL_NAPOLEAONVILLE_ETHANE_IN_E_P_OUT_MONTH_OPIS("NGL-NAPOLEAONVILLE ETHANE (IN E-P)- OUT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_ETHANE_IN_E_P_PROMPT_MONTH_OPIS("NGL-NAPOLEAONVILLE ETHANE (IN E-P)- PROMPT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_ISOBUTANE_OPIS("NGL-NAPOLEAONVILLE ISOBUTANE-OPIS"),
        NGL_NAPOLEAONVILLE_ISOBUTANE_OUT_MONTH_OPIS("NGL-NAPOLEAONVILLE ISOBUTANE-OUT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_ISOBUTANE_PROMPT_MONTH_OPIS("NGL-NAPOLEAONVILLE ISOBUTANE-PROMPT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_N_BUTANE_OPIS("NGL-NAPOLEAONVILLE N. BUTANE- OPIS"),
        NGL_NAPOLEAONVILLE_N_BUTANE_OUT_MONTH_OPIS("NGL-NAPOLEAONVILLE N. BUTANE- OUT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_N_BUTANE_PROMPT_MONTH_OPIS("NGL-NAPOLEAONVILLE N. BUTANE- PROMPT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_N_GASOLINE_OPIS("NGL-NAPOLEAONVILLE N. GASOLINE-OPIS"),
        NGL_NAPOLEAONVILLE_N_GASOLINE_OUT_MONTH_OPIS("NGL-NAPOLEAONVILLE N. GASOLINE-OUT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_N_GASOLINE_PROMPT_MONTH_OPIS("NGL-NAPOLEAONVILLE N. GASOLINE-PROMPT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_PROPANE_OPIS("NGL-NAPOLEAONVILLE PROPANE- OPIS"),
        NGL_NAPOLEAONVILLE_PROPANE_OUT_MONTH_OPIS("NGL-NAPOLEAONVILLE PROPANE-OUT MONTH OPIS"),
        NGL_NAPOLEAONVILLE_PROPANE_PROMPT_MONTH_OPIS("NGL-NAPOLEAONVILLE PROPANE-PROMPT MONTH OPIS"),
        NGL_NAPOLEAONVILLE_PURITY_ETHANE_OPIS("NGL-NAPOLEAONVILLE PURITY ETHANE-OPIS"),
        NGL_NAPOLEAONVILLE_PURITY_ETHANE_OUT_MONTH_OPIS("NGL-NAPOLEAONVILLE PURITY ETHANE-OUT MONTH-OPIS"),
        NGL_NAPOLEAONVILLE_PURITY_ETHANE_PROMPT_MONTH_OPIS("NGL-NAPOLEAONVILLE PURITY ETHANE-PROMPT MONTH-OPIS"),
        NGL_PROPANE_ANSI_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (ANSI) -ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_CIF_ARA_LARGE_CARGOES_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE; CIF ARA LARGE CARGOES)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_CIF_ARA_SMALL_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: CIF ARA SMALL)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_CIF_MEDITERRANEAN_LARGE_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: CIF MEDITERRANEAN LARGE)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_CIF_MEDITERRANEAN_SMALL_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: CIF MEDITERRANEAN SMALL)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_FCA_ARA_RAIL_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: FCA ARA RAIL)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_FCA_MEDITERRANEAN_RAIL_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: FCA MEDITERRANEAN RAIL)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_FOB_ARA_BARGE_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: FOB ARA BARGE)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_EUROPE_FOB_NORTHWEST_EUROPE_SMALL_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (EUROPE: FOB NORTHWEST EUROPE SMALL)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_FAR_EAST_INDEX_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (FAR EAST INDEX)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_SAUDI_ARAMCO_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE (SAUDI ARAMCO)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_BUTANE_MIX_EUROPE_FOB_BLACK_SEA_ARGUS_INTERNATIONAL_LPG("NGL-PROPANE-BUTANE MIX (EUROPE: FOB BLACK SEA)-ARGUS INTERNATIONAL LPG"),
        NGL_PROPANE_NYMEX("NGL-PROPANE-NYMEX"),
        NICKEL_LME_15_MONTH("NICKEL-LME 15 MONTH"),
        NICKEL_LME_27_MONTH("NICKEL-LME 27 MONTH"),
        NICKEL_LME_3_MONTH("NICKEL-LME 3 MONTH"),
        NICKEL_LME_CASH("NICKEL-LME CASH"),
        OATS_CBOT("OATS-CBOT"),
        OIL_ARGUS_SOUR_CRUDE_INDEX_ASCI_ARGUS_CRUDE("OIL-ARGUS SOUR CRUDE INDEX (ASCI)-ARGUS CRUDE"),
        OIL_BRENT_BFOE_DATED_ARGUS_CRUDE("OIL-BRENT/BFOE (DATED)-ARGUS CRUDE"),
        OIL_BRENT_BFOE_DTD_PLATTS_MARKETWIRE("OIL-BRENT/BFOE (DTD)-PLATTS MARKETWIRE"),
        OIL_BRENT_BFOE_ARGUS_CRUDE("OIL-BRENT/BFOE-ARGUS CRUDE"),
        OIL_BRENT_BFOE_PLATTS_MARKETWIRE("OIL-BRENT/BFOE-PLATTS MARKETWIRE"),
        OIL_BWAVE_ICE_PLATTS_MARKETWIRE("OIL-BWAVE-ICE/-PLATTS MARKETWIRE"),
        OIL_CRUDE_OIL_TOCOM("OIL-CRUDE OIL-TOCOM"),
        OIL_DUBAI_PLATTS_MARKETWIRE("OIL-DUBAI-PLATTS MARKETWIRE"),
        OIL_JCC_9_DIGIT_PROVISIONAL("OIL-JCC-9 DIGIT PROVISIONAL"),
        OIL_JCC_DETAILED("OIL-JCC-DETAILED"),
        OIL_JCC_FIXED("OIL-JCC-FIXED"),
        OIL_JCC_PROVISIONAL("OIL-JCC-PROVISIONAL"),
        OIL_LLS_ARGUS_CRUDE("OIL-LLS-ARGUS CRUDE"),
        OIL_LLS_PLATTS_MARKETWIRE("OIL-LLS-PLATTS MARKETWIRE"),
        OIL_MARS_ARGUS_CRUDE("OIL-MARS-ARGUS CRUDE"),
        OIL_MARS_PLATTS_MARKETWIRE("OIL-MARS-PLATTS MARKETWIRE"),
        OIL_NW_SHELF_APPI("OIL-NW SHELF-APPI"),
        OIL_OMAN_PLATTS_MARKETWIRE("OIL-OMAN-PLATTS MARKETWIRE"),
        OIL_TAPIS_APPI("OIL-TAPIS-APPI"),
        OIL_TAPIS_PLATTS_MARKETWIRE("OIL-TAPIS-PLATTS MARKETWIRE"),
        OIL_URALS_CIF_ROTTERDAM_PLATTS_MARKETWIRE("OIL-URALS (CIF ROTTERDAM)-PLATTS MARKETWIRE"),
        OIL_URALS_FOB_PRIMORSK_ARGUS_CRUDE("OIL-URALS FOB PRIMORSK-ARGUS CRUDE"),
        OIL_URALS_RCMB_PLATTS_MARKETWIRE("OIL-URALS RCMB-PLATTS MARKETWIRE"),
        OIL_URALS_ROTTERDAM_SPREAD_VS_FWD_DTD_BRENT_BFOE_PLATTS_MARKETWIRE("OIL-URALS ROTTERDAM (SPREAD VS FWD DTD BRENT/BFOE)-PLATTS MARKETWIRE"),
        OIL_WTI_MIDLAND_PLATTS_MARKETWIRE("OIL-WTI MIDLAND-PLATTS MARKETWIRE"),
        OIL_WTI_ARGUS_CRUDE("OIL-WTI-ARGUS CRUDE"),
        OIL_WTI_ICE("OIL-WTI-ICE"),
        OIL_WTI_NYMEX("OIL-WTI-NYMEX"),
        OIL_WTI_PLATTS_MARKETWIRE("OIL-WTI-PLATTS MARKETWIRE"),
        OIL_WTS_ARGUS_CRUDE("OIL-WTS-ARGUS CRUDE"),
        OIL_WTS_PLATTS_MARKETWIRE("OIL-WTS-PLATTS MARKETWIRE"),
        OMAN_MINISTRY_OF_GAS_OFFICIAL_PRICE("OMAN MINISTRY OF GAS OFFICIAL PRICE"),
        OTHER("OTHER"),
        PALLADIUM_A_M_FIX_EUR("PALLADIUM-A.M. FIX (EUR)"),
        PALLADIUM_A_M_FIX_GBP("PALLADIUM-A.M. FIX (GBP)"),
        PALLADIUM_A_M_FIX("PALLADIUM-A.M. FIX"),
        PALLADIUM_NYMEX("PALLADIUM-NYMEX"),
        PALLADIUM_P_M_FIX_EUR("PALLADIUM-P.M. FIX (EUR)"),
        PALLADIUM_P_M_FIX_GBP("PALLADIUM-P.M. FIX (GBP)"),
        PALLADIUM_P_M_FIX("PALLADIUM-P.M. FIX"),
        PALLADIUM_TOCOM("PALLADIUM-TOCOM"),
        PALM_OIL_BURSA_MALAYSIA("PALM OIL-BURSA MALAYSIA"),
        PALM_OIL_MDEX("PALM OIL-MDEX"),
        PLASTIC_LME_LL("PLASTIC-LME-LL"),
        PLASTIC_LME_PP("PLASTIC-LME-PP"),
        PLATINUM_A_M_FIX_EUR("PLATINUM-A.M. FIX (EUR)"),
        PLATINUM_A_M_FIX_GBP("PLATINUM-A.M. FIX (GBP)"),
        PLATINUM_A_M_FIX("PLATINUM-A.M. FIX"),
        PLATINUM_NYMEX_SAFEX("PLATINUM-NYMEX-SAFEX"),
        PLATINUM_NYMEX("PLATINUM-NYMEX"),
        PLATINUM_P_M_FIX_EUR("PLATINUM-P.M. FIX (EUR)"),
        PLATINUM_P_M_FIX_GBP("PLATINUM-P.M. FIX (GBP)"),
        PLATINUM_P_M_FIX("PLATINUM-P.M. FIX"),
        PLATINUM_TOCOM("PLATINUM-TOCOM"),
        POLYETHYLENE_TEREPHTHALATE_ICIS("Polyethylene Terephthalate - ICIS"),
        POLYPROPYLENE_HOMOPOLYMER_INJECTION_PLATTS_POLYMERSCAN("Polypropylene Homopolymer Injection - Platts Polymerscan,"),
        POLYPROPYLENE_NORTH_AMERICA_DOMESTIC_MARKET_CONTRACT_GP_HOMOPOLYMER_DELIVERED("Polypropylene, North America, Domestic Market (Contract) GP - Homopolymer, Delivered"),
        PULP_BLEACHED_HARDWOOD_KRAFT_EUROPE_PIX("PULP BLEACHED HARDWOOD KRAFT EUROPE PIX"),
        PULP_BLEACHED_HARDWOOD_KRAFT_PULP_US_RISI("PULP BLEACHED HARDWOOD KRAFT PULP US RISI"),
        PULP_BLEACHED_HARDWOOD_KRAFT_US_PIX("PULP BLEACHED HARDWOOD KRAFT US PIX"),
        PULP_BLEACHED_KRAFT_FLUFF_UNTREATED_EUROPE_RISI("PULP BLEACHED KRAFT FLUFF (UNTREATED) EUROPE RISI"),
        PULP_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_EUROPE_PIX("PULP NORTHERN BLEACHED SOFTWOOD KRAFT EUROPE PIX"),
        PULP_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_US_PIX("PULP NORTHERN BLEACHED SOFTWOOD KRAFT US PIX"),
        PULP_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_US_PPW("PULP NORTHERN BLEACHED SOFTWOOD KRAFT US PPW"),
        PULP_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_US_RISI("PULP NORTHERN BLEACHED SOFTWOOD KRAFT US RISI"),
        PULP_ICE("PULP-ICE"),
        RAPESEED_MATIF("RAPESEED - MATIF"),
        RAPESEED_NYSE_LIFFE("RAPESEED-NYSE Liffe"),
        RECOVERED_PAPER_1_02_MIXED_P_B_SORTED_PPI_GERMANY("RECOVERED PAPER 1.02 MIXED P&B (SORTED) PPI GERMANY"),
        RECOVERED_PAPER_1_04_SUPERMARKET_CORRUGATED_MIXED_P_B_PPI_GERMANY("RECOVERED PAPER 1.04 SUPERMARKET CORRUGATED MIXED P&B PPI GERMANY"),
        RECOVERED_PAPER_1_05_OLD_CORRUGATED_CONTAINERS_PPI_FRANCE("RECOVERED PAPER 1.05 OLD CORRUGATED CONTAINERS PPI FRANCE"),
        RECOVERED_PAPER_1_11_SORTED_GRAPHIC_PAPER_PPI_GERMANY("RECOVERED PAPER 1.11 SORTED GRAPHIC PAPER PPI GERMANY"),
        RECOVERED_PAPER_2_01_NEWSPAPERS_PPI_GERMANY("RECOVERED PAPER 2.01 NEWSPAPERS PPI GERMANY"),
        RECOVERED_PAPER_DEINK_NEWS_8_ATLANTA_PPW("RECOVERED PAPER DEINK NEWS (8) ATLANTA PPW"),
        RECOVERED_PAPER_DEINK_NEWS_8_CHICAGO_PPW("RECOVERED PAPER DEINK NEWS (8) CHICAGO PPW"),
        RECOVERED_PAPER_DEINK_NEWS_8_DALLAS_HOUSTON_PPW("RECOVERED PAPER DEINK NEWS (8) DALLAS-HOUSTON PPW"),
        RECOVERED_PAPER_DEINK_NEWS_8_NEW_YORK_PPW("RECOVERED PAPER DEINK NEWS (8) NEW YORK PPW"),
        RECOVERED_PAPER_DEINK_NEWS_8_SAN_FRANCISCO_LOS_ANGELES_PPW("RECOVERED PAPER DEINK NEWS (8) SAN FRANCISCO-LOS ANGELES PPW"),
        RECOVERED_PAPER_DEINK_NEWS_8_U_S_AVERAGE_PPW("RECOVERED PAPER DEINK NEWS (8) U.S. AVERAGE PPW"),
        RECOVERED_PAPER_NEWS_8_BUFFALO_OBM("RECOVERED PAPER NEWS #8 BUFFALO OBM"),
        RECOVERED_PAPER_NEWS_8_CHICAGO_OBM("RECOVERED PAPER NEWS #8 CHICAGO OBM"),
        RECOVERED_PAPER_NEWS_8_LOS_ANGELES_OBM("RECOVERED PAPER NEWS #8 LOS ANGELES OBM"),
        RECOVERED_PAPER_NEWS_8_NEW_ENGLAND_OBM("RECOVERED PAPER NEWS #8 NEW ENGLAND OBM"),
        RECOVERED_PAPER_NEWS_8_NEW_YORK_OBM("RECOVERED PAPER NEWS #8 NEW YORK OBM"),
        RECOVERED_PAPER_NEWS_8_PACIFIC_NW_OBM("RECOVERED PAPER NEWS #8 PACIFIC NW OBM"),
        RECOVERED_PAPER_NEWS_8_SAN_FRANCISCO_OBM("RECOVERED PAPER NEWS #8 SAN FRANCISCO OBM"),
        RECOVERED_PAPER_NEWS_8_SOUTHEAST_OBM("RECOVERED PAPER NEWS #8 SOUTHEAST OBM"),
        RECOVERED_PAPER_NEWS_8_SOUTHWEST_OBM("RECOVERED PAPER NEWS #8 SOUTHWEST OBM"),
        RECOVERED_PAPER_OCC_11_ATLANTA_PPW("RECOVERED PAPER OCC #11 ATLANTA PPW"),
        RECOVERED_PAPER_OCC_11_CHICAGO_PPW("RECOVERED PAPER OCC #11 CHICAGO PPW"),
        RECOVERED_PAPER_OCC_11_DALLAS_HOUSTON_PPC("RECOVERED PAPER OCC #11 DALLAS-HOUSTON PPC"),
        RECOVERED_PAPER_OCC_11_NEW_YORK_PPW("RECOVERED PAPER OCC #11 NEW YORK PPW"),
        RECOVERED_PAPER_OCC_11_SAN_FRANCISCO_LOS_ANGELES("RECOVERED PAPER OCC #11 SAN FRANCISCO-LOS ANGELES"),
        RECOVERED_PAPER_OCC_11_U_S_AVERAGE_PPC("RECOVERED PAPER OCC #11 U.S. AVERAGE PPC"),
        RECOVERED_PAPER_OCC_11_BUFFALO_OBM("RECOVERED PAPER OCC#11 BUFFALO OBM"),
        RECOVERED_PAPER_OCC_11_CHICAGO_OBM("RECOVERED PAPER OCC#11 CHICAGO OBM"),
        RECOVERED_PAPER_OCC_11_LOS_ANGELES_OBM("RECOVERED PAPER OCC#11 LOS ANGELES OBM"),
        RECOVERED_PAPER_OCC_11_NEW_ENGLAND_OBM("RECOVERED PAPER OCC#11 NEW ENGLAND OBM"),
        RECOVERED_PAPER_OCC_11_NEW_YORK_OBM("RECOVERED PAPER OCC#11 NEW YORK OBM"),
        RECOVERED_PAPER_OCC_11_PACIFIC_NW_OBM("RECOVERED PAPER OCC#11 PACIFIC NW OBM"),
        RECOVERED_PAPER_OCC_11_SAN_FRANCISCO_OBM("RECOVERED PAPER OCC#11 SAN FRANCISCO OBM"),
        RECOVERED_PAPER_OCC_11_SOUTHEAST_OBM("RECOVERED PAPER OCC#11 SOUTHEAST OBM"),
        RECOVERED_PAPER_OCC_11_SOUTHWEST_OBM("RECOVERED PAPER OCC#11 SOUTHWEST OBM"),
        RECOVERED_PAPER_SOP_37_CHICAGO_OBM("RECOVERED PAPER SOP#37 CHICAGO OBM"),
        RHODIUM_COMDAQ_EUR("RHODIUM-COMDAQ (EUR)"),
        RHODIUM_COMDAQ_GBP("RHODIUM-COMDAQ (GBP)"),
        RHODIUM_COMDAQ_JPY("RHODIUM-COMDAQ (JPY)"),
        RHODIUM_COMDAQ("RHODIUM-COMDAQ"),
        RHODIUM_HERAEUS("RHODIUM-HERAEUS"),
        RHODIUM_JOHNSON_MATTHEY("RHODIUM-JOHNSON MATTHEY"),
        RICE_CBOT("RICE-CBOT"),
        RISI_WORLD_PULP_MONTHLY_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_PULP_PULP_NORTHERN_BLEACHED_SOFTWOOD_KRAFT_US_RISI("RISI World Pulp Monthly Northern Bleached Softwood Kraft Pulp Pulp Northern Bleached Softwood Kraft US RISI"),
        RUBBER_JADE("RUBBER-JADE"),
        RUBBER_RSS_3_SGX("RUBBER-RSS3-SGX"),
        RUBBER_TOCOM("RUBBER-TOCOM"),
        RUBBER_TSR_20_SGX("RUBBER-TSR20-SGX"),
        RUTHENIUM_COMDAQ_EUR("RUTHENIUM-COMDAQ (EUR)"),
        RUTHENIUM_COMDAQ_GBP("RUTHENIUM-COMDAQ (GBP)"),
        RUTHENIUM_COMDAQ_JPY("RUTHENIUM-COMDAQ (JPY)"),
        RUTHENIUM_COMDAQ("RUTHENIUM-COMDAQ"),
        RUTHENIUM_HERAEUS("RUTHENIUM-HERAEUS"),
        RUTHENIUM_JOHNSON_MATTHEY("RUTHENIUM-JOHNSON MATTHEY"),
        SAHARAN_BLEND_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("SAHARAN BLEND FOB ARA CRACK NETBACK- PLATTS MARKETWIRE"),
        SILVER_COMEX_SAFEX("SILVER-COMEX-SAFEX"),
        SILVER_COMEX("SILVER-COMEX"),
        SILVER_FIX_EUR("SILVER-FIX (EUR)"),
        SILVER_FIX_GBP("SILVER-FIX (GBP)"),
        SILVER_FIX("SILVER-FIX"),
        SILVER_TOCOM("SILVER-TOCOM"),
        SM_6_TC_SUPRAMAX_DRY_TIME_CHARTER_AVERAGE_6_ROUTES_FREIGHT_BALTIC_EXCHANGE_SUPRAMAX_TIME_CHARTER_AVERAGE_ROUTES_PUBLISHED_DAILY_AVERAGE("SM6TC (Supramax Dry Time charter Average 6 Routes) FREIGHT - BALTIC EXCHANGE - SUPRAMAX TIME CHARTER AVERAGE ROUTES-PUBLISHED DAILY AVERAGE"),
        SORGHUM_SAFEX("SORGHUM-SAFEX"),
        SOUTHEAST_DAY_AHEAD("SOUTHEAST-DAY AHEAD"),
        SOUTHEAST_REAL_TIME("SOUTHEAST-REAL TIME"),
        SOYBEAN_MEAL_CBOT_SAFEX("SOYBEAN MEAL-CBOT-SAFEX"),
        SOYBEAN_MEAL_CBOT("SOYBEAN MEAL-CBOT"),
        SOYBEAN_OIL_CBOT_SAFEX("SOYBEAN OIL-CBOT-SAFEX"),
        SOYBEAN_OIL_CBOT("SOYBEAN OIL-CBOT"),
        SOYBEANS_CBOT_SAFEX("SOYBEANS-CBOT-SAFEX"),
        SOYBEANS_CBOT("SOYBEANS-CBOT"),
        SOYBEANS_SAFEX("SOYBEANS-SAFEX"),
        STEEL_LME_3_MONTH("STEEL - LME 3 MONTH"),
        STEEL_BILLET_LME_CASH("STEEL BILLET-LME CASH"),
        STEEL_PLATTS_COLD_ROLLED_EUR("STEEL PLATTS COLD ROLLED EUR"),
        STEEL_PLATTS_COLD_ROLLED_USD("STEEL PLATTS COLD ROLLED USD"),
        STEEL_PLATTS_HOT_ROLLED_EUR("STEEL PLATTS HOT ROLLED EUR"),
        STEEL_PLATTS_HOT_ROLLED_USD("STEEL PLATTS HOT ROLLED USD"),
        STEEL_HRC_USA_MIDWEST_CRU_MONTHLY_AVERAGE("STEEL- -HRC-USA-MIDWEST-CRU (Monthly average)"),
        STEEL_LME_BILLETS("STEEL- LME- BILLETS"),
        STEEL_MONTHLY_BILLET_CIS_EXPORT_FOB_BLACK_SEA_CRU_LONG("STEEL-MONTHLY-BILLET-CIS EXPORT FOB BLACK SEA-CRU LONG"),
        STEEL_MONTHLY_CRC_GERMANY_EUR_CRU("STEEL-MONTHLY-CRC-GERMANY (EUR)-CRU"),
        STEEL_MONTHLY_CRC_GERMANY_USD_CRU("STEEL-MONTHLY-CRC-GERMANY (USD)-CRU"),
        STEEL_MONTHLY_CRC_USA_MIDWEST_CRU("STEEL-MONTHLY-CRC-USA-MIDWEST-CRU"),
        STEEL_MONTHLY_HRC_GERMANY_EUR_CRU("STEEL-MONTHLY-HRC-GERMANY (EUR)-CRU"),
        STEEL_MONTHLY_HRC_GERMANY_USD_CRU("STEEL-MONTHLY-HRC-GERMANY (USD)-CRU"),
        STEEL_MONTHLY_SLAB_EUROPE_CIS_EXPORT_BLACK_SEA_PORT_CRU("STEEL-MONTHLY-SLAB-EUROPE-CIS-EXPORT-BLACK SEA PORT-CRU"),
        STEEL_MONTHLY_SLAB_LATIN_AMERICA_BRAZIL_EXPORT_CRU("STEEL-MONTHLY-SLAB-LATIN AMERICA-BRAZIL-EXPORT-CRU"),
        STEEL_PLATTS_EUROPEAN_HOT_ROLLED_COIL_RUHR("STEEL-PLATTS-EUROPEAN HOT ROLLED COIL (RUHR)"),
        STEEL_PLATTS_FOB_BLACK_SEA("STEEL-PLATTS-FOB BLACK SEA"),
        STEEL_PLATTS_HMS_80_20_FERROUS_SCRAP("STEEL-PLATTS-HMS 80/20 FERROUS SCRAP"),
        STEEL_TSI_NORTH("STEEL-TSI NORTH"),
        STEEL_TSI_SOUTH("STEEL-TSI SOUTH"),
        STEEL_TSI_TURKEY_SCRAP("STEEL-TSI TURKEY SCRAP"),
        SUGAR_11_WORLD_ICE("SUGAR # 11 (WORLD)-ICE"),
        SUGAR_16_US_ICE("SUGAR # 16 (US)-ICE"),
        SULPHUR_CFR_CHINA_FMB("SULPHUR-CFR CHINA-FMB"),
        SULPHUR_CFR_INDIA_FMB("SULPHUR-CFR INDIA-FMB"),
        SULPHUR_FOB_BLACK_SEA_FMB("SULPHUR-FOB BLACK SEA-FMB"),
        SULPHUR_FOB_MIDDLE_EAST_FMB("SULPHUR-FOB MIDDLE EAST-FMB"),
        SULPHUR_FOB_VANCOUVER_FMB("SULPHUR-FOB VANCOUVER-FMB"),
        SUNFLOWER_SEEDS_SAFEX("SUNFLOWER SEEDS-SAFEX"),
        TIN_LME_15_MONTH("TIN-LME 15 MONTH"),
        TIN_LME_3_MONTH("TIN-LME 3 MONTH"),
        TIN_LME_CASH("TIN-LME CASH"),
        UAN_NOLA_FMB("UAN - NOLA - FMB"),
        UAN_FERTILIZER_INDEX("UAN-FERTILIZER INDEX"),
        ULTRA_LOW_SULPHUR_DIESEL_U_S_GULF_COAST_PIPELINE_PLATTS_OILGRAM("ULTRA LOW SULPHUR DIESEL - U.S. GULF COAST PIPELINE - PLATTS OILGRAM"),
        ULTRA_LOW_SULPHUR_DIESEL_10_PPM_UK_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("ULTRA LOW SULPHUR DIESEL-10 PPM UK-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        ULTRA_LOW_SULPHUR_DIESEL_10_PPM_BARGES_FOB_ROTTERDAM_PLATTS_EUROPEAN_MARKETSCAN("ULTRA LOW SULPHUR DIESEL-10 PPM-BARGES FOB ROTTERDAM-PLATTS EUROPEAN MARKETSCAN"),
        ULTRA_LOW_SULPHUR_DIESEL_10_PPM_CARGOES_CIF_NWE_BASIS_ARA_PLATTS_EUROPEAN_MARKETSCAN("ULTRA LOW SULPHUR DIESEL-10 PPM-CARGOES CIF NWE/BASIS ARA-PLATTS EUROPEAN MARKETSCAN"),
        ULTRA_LOW_SULPHUR_DIESEL_10_PPM_CIF_MED_GENOVA_LAVERA_PLATTS_EUROPEAN_MARKETSCAN("ULTRA LOW SULPHUR DIESEL-10 PPM-CIF MED (GENOVA/LAVERA)-PLATTS EUROPEAN MARKETSCAN"),
        ULTRA_LOW_SULPHUR_DIESELGERMAN_10_PPM_FOB_NWE_ARGUS_EUROPEAN_PRODUCTS("ULTRA LOW SULPHUR DIESELGERMAN-10PPM-FOB NWE -ARGUS EUROPEAN PRODUCTS"),
        ULTRA_LOW_SULPHUR_DIESEL_10_PPM_FOB_MED_ITALY_PLATTS_EUROPEAN_MARKETSCAN("ULTRA-LOW SULPHUR DIESEL 10PPM- FOB MED (ITALY) - PLATTS EUROPEAN MARKETSCAN"),
        URANIUM_U_3_O_8_TT("URANIUM U3O8 TT"),
        URANIUM_UX_U_3_O_8("URANIUM Ux U3O8"),
        UREA_FOB_BALTIC_FMB("UREA - FOB BALTIC-FMB"),
        UREA_FOB_INDONESIA_FMB("UREA - FOB INDONESIA - FMB"),
        UREA_FOB_US_GULF_BARGE_FMB("UREA - FOB US GULF BARGE FMB"),
        UREA_NEW_ORLEANS_FERTILIZER_INDEX("UREA - New Orleans - Fertilizer Index"),
        UREA_YUZHNYY_FERTILIZER_INDEX("UREA - Yuzhnyy-Fertilizer Index"),
        UREA_EGYPT_FERTILIZER_INDEX("UREA- Egypt - Fertilizer index"),
        UREA_FOB_YUZHNYY_FMB("UREA- FOB YUZHNYY - FMB"),
        UREA_FERTILIZER_INDEX("UREA-FERTILIZER INDEX"),
        WHEAT_FEED_NYSE_LIFFE("WHEAT FEED-NYSE Liffe"),
        WHEAT_HRW_KCBOT("WHEAT HRW-KCBOT"),
        WHEAT_MILLING_ASX("WHEAT MILLING - ASX"),
        WHEAT_MILLING_NYSE_LIFFE("WHEAT MILLING-NYSE Liffe"),
        WHEAT_RED_SPRING_MGE("WHEAT RED SPRING-MGE"),
        WHEAT_CBOT("WHEAT-CBOT"),
        WHEAT_SAFEX("WHEAT-SAFEX"),
        WHITE_MAIZE_GRADE_2_SAFEX("WHITE MAIZE GRADE 2-SAFEX"),
        WHITE_MAIZE_SAFEX("WHITE MAIZE-SAFEX"),
        WHITE_SUGAR_NYSE_LIFFE("WHITE SUGAR-NYSE Liffe"),
        YELLOW_MAIZE_GRADE_2_SAFEX("YELLOW MAIZE GRADE 2-SAFEX"),
        YELLOW_MAIZE_SAFEX("YELLOW MAIZE-SAFEX"),
        ZINC_LME_15_MONTH("ZINC-LME 15 MONTH"),
        ZINC_LME_27_MONTH("ZINC-LME 27 MONTH"),
        ZINC_LME_3_MONTH("ZINC-LME 3 MONTH"),
        ZINC_LME_CASH("ZINC-LME CASH"),
        ZUETINA_FOB_ARA_CRACK_NETBACK_PLATTS_MARKETWIRE("ZUETINA FOB ARA CRACK NETBACK- PLATTS MARKETWIRE");
        private final String value;
        private final static Map<String, Attributes.ReferenceRate> CONSTANTS = new HashMap<String, Attributes.ReferenceRate>();

        static {
            for (Attributes.ReferenceRate c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ReferenceRate(String value) {
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
        public static Attributes.ReferenceRate fromValue(String value) {
            Attributes.ReferenceRate constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum ReturnorPayoutTrigger {

        CONTRACT_FOR_DIFFERENCE_CFD("Contract for Difference (CFD)"),
        TOTAL_RETURN("Total Return");
        private final String value;
        private final static Map<String, Attributes.ReturnorPayoutTrigger> CONSTANTS = new HashMap<String, Attributes.ReturnorPayoutTrigger>();

        static {
            for (Attributes.ReturnorPayoutTrigger c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ReturnorPayoutTrigger(String value) {
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
        public static Attributes.ReturnorPayoutTrigger fromValue(String value) {
            Attributes.ReturnorPayoutTrigger constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum TransactionType {

        FUTR("FUTR"),
        OPTN("OPTN"),
        TAPO("TAPO"),
        SWAP("SWAP"),
        MINI("MINI"),
        OTCT("OTCT"),
        ORIT("ORIT"),
        CRCK("CRCK"),
        DIFF("DIFF"),
        OTHR("OTHR");
        private final String value;
        private final static Map<String, Attributes.TransactionType> CONSTANTS = new HashMap<String, Attributes.TransactionType>();

        static {
            for (Attributes.TransactionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TransactionType(String value) {
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
        public static Attributes.TransactionType fromValue(String value) {
            Attributes.TransactionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
