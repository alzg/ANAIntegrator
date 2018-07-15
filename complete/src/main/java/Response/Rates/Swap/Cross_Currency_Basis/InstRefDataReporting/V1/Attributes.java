
package Response.Rates.Swap.Cross_Currency_Basis.InstRefDataReporting.V1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.DecimalMax;
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
    "ReferenceRate",
    "ReferenceRateTermValue",
    "ReferenceRateTermUnit",
    "OtherNotionalCurrency",
    "OtherLegReferenceRate",
    "OtherLegReferenceRateTermValue",
    "OtherLegReferenceRateTermUnit",
    "NotionalSchedule",
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
     * Reference Rate Term Value
     * <p>
     * Tenor value of the first leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRateTermValue")
    @JsonPropertyDescription("Tenor value of the first leg reference rate")
    @DecimalMin("-999")
    @DecimalMax("999")
    @NotNull
    private Long referenceRateTermValue;
    /**
     * Reference Rate Term Unit
     * <p>
     * Tenor unit of the first leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRateTermUnit")
    @JsonPropertyDescription("Tenor unit of the first leg reference rate")
    @NotNull
    private Attributes.ReferenceRateTermUnit referenceRateTermUnit;
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
     * Other Leg Reference Rate
     * <p>
     * The floating rate index of 2nd leg (for basis swaps)
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRate")
    @JsonPropertyDescription("The floating rate index of 2nd leg (for basis swaps)")
    @NotNull
    private Attributes.OtherLegReferenceRate otherLegReferenceRate;
    /**
     * Other Leg Reference Rate Term Value
     * <p>
     * Tenor value of the other leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRateTermValue")
    @JsonPropertyDescription("Tenor value of the other leg reference rate")
    @DecimalMin("-999")
    @DecimalMax("999")
    @NotNull
    private Long otherLegReferenceRateTermValue;
    /**
     * Other Leg Reference Rate Term Unit
     * <p>
     * Tenor unit of the other leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRateTermUnit")
    @JsonPropertyDescription("Tenor unit of the other leg reference rate")
    @NotNull
    private Attributes.OtherLegReferenceRateTermUnit otherLegReferenceRateTermUnit;
    /**
     * Notional Schedule
     * <p>
     * Indicates the face amount of a swap upon which the payment streams for that swap are based
     * (Required)
     * 
     */
    @JsonProperty("NotionalSchedule")
    @JsonPropertyDescription("Indicates the face amount of a swap upon which the payment streams for that swap are based")
    @NotNull
    private Attributes.NotionalSchedule notionalSchedule;
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
    private Attributes.DeliveryType deliveryType = Attributes.DeliveryType.fromValue("PHYS");
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
    private final static long serialVersionUID = 7349250221461395774L;

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
     * @param referenceRate
     * @param referenceRateTermValue
     * @param otherLegReferenceRateTermValue
     * @param deliveryType
     * @param otherNotionalCurrency
     * @param otherLegReferenceRate
     * @param otherLegReferenceRateTermUnit
     * @param notionalSchedule
     * @param priceMultiplier
     * @param referenceRateTermUnit
     */
    public Attributes(Attributes.NotionalCurrency notionalCurrency, String expiryDate, Attributes.ReferenceRate referenceRate, Long referenceRateTermValue, Attributes.ReferenceRateTermUnit referenceRateTermUnit, Attributes.OtherNotionalCurrency otherNotionalCurrency, Attributes.OtherLegReferenceRate otherLegReferenceRate, Long otherLegReferenceRateTermValue, Attributes.OtherLegReferenceRateTermUnit otherLegReferenceRateTermUnit, Attributes.NotionalSchedule notionalSchedule, Attributes.DeliveryType deliveryType, Double priceMultiplier) {
        super();
        this.notionalCurrency = notionalCurrency;
        this.expiryDate = expiryDate;
        this.referenceRate = referenceRate;
        this.referenceRateTermValue = referenceRateTermValue;
        this.referenceRateTermUnit = referenceRateTermUnit;
        this.otherNotionalCurrency = otherNotionalCurrency;
        this.otherLegReferenceRate = otherLegReferenceRate;
        this.otherLegReferenceRateTermValue = otherLegReferenceRateTermValue;
        this.otherLegReferenceRateTermUnit = otherLegReferenceRateTermUnit;
        this.notionalSchedule = notionalSchedule;
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
     * Reference Rate Term Value
     * <p>
     * Tenor value of the first leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRateTermValue")
    public Long getReferenceRateTermValue() {
        return referenceRateTermValue;
    }

    /**
     * Reference Rate Term Value
     * <p>
     * Tenor value of the first leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRateTermValue")
    public void setReferenceRateTermValue(Long referenceRateTermValue) {
        this.referenceRateTermValue = referenceRateTermValue;
    }

    public Attributes withReferenceRateTermValue(Long referenceRateTermValue) {
        this.referenceRateTermValue = referenceRateTermValue;
        return this;
    }

    /**
     * Reference Rate Term Unit
     * <p>
     * Tenor unit of the first leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRateTermUnit")
    public Attributes.ReferenceRateTermUnit getReferenceRateTermUnit() {
        return referenceRateTermUnit;
    }

    /**
     * Reference Rate Term Unit
     * <p>
     * Tenor unit of the first leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("ReferenceRateTermUnit")
    public void setReferenceRateTermUnit(Attributes.ReferenceRateTermUnit referenceRateTermUnit) {
        this.referenceRateTermUnit = referenceRateTermUnit;
    }

    public Attributes withReferenceRateTermUnit(Attributes.ReferenceRateTermUnit referenceRateTermUnit) {
        this.referenceRateTermUnit = referenceRateTermUnit;
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
     * Other Leg Reference Rate
     * <p>
     * The floating rate index of 2nd leg (for basis swaps)
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRate")
    public Attributes.OtherLegReferenceRate getOtherLegReferenceRate() {
        return otherLegReferenceRate;
    }

    /**
     * Other Leg Reference Rate
     * <p>
     * The floating rate index of 2nd leg (for basis swaps)
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRate")
    public void setOtherLegReferenceRate(Attributes.OtherLegReferenceRate otherLegReferenceRate) {
        this.otherLegReferenceRate = otherLegReferenceRate;
    }

    public Attributes withOtherLegReferenceRate(Attributes.OtherLegReferenceRate otherLegReferenceRate) {
        this.otherLegReferenceRate = otherLegReferenceRate;
        return this;
    }

    /**
     * Other Leg Reference Rate Term Value
     * <p>
     * Tenor value of the other leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRateTermValue")
    public Long getOtherLegReferenceRateTermValue() {
        return otherLegReferenceRateTermValue;
    }

    /**
     * Other Leg Reference Rate Term Value
     * <p>
     * Tenor value of the other leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRateTermValue")
    public void setOtherLegReferenceRateTermValue(Long otherLegReferenceRateTermValue) {
        this.otherLegReferenceRateTermValue = otherLegReferenceRateTermValue;
    }

    public Attributes withOtherLegReferenceRateTermValue(Long otherLegReferenceRateTermValue) {
        this.otherLegReferenceRateTermValue = otherLegReferenceRateTermValue;
        return this;
    }

    /**
     * Other Leg Reference Rate Term Unit
     * <p>
     * Tenor unit of the other leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRateTermUnit")
    public Attributes.OtherLegReferenceRateTermUnit getOtherLegReferenceRateTermUnit() {
        return otherLegReferenceRateTermUnit;
    }

    /**
     * Other Leg Reference Rate Term Unit
     * <p>
     * Tenor unit of the other leg reference rate
     * (Required)
     * 
     */
    @JsonProperty("OtherLegReferenceRateTermUnit")
    public void setOtherLegReferenceRateTermUnit(Attributes.OtherLegReferenceRateTermUnit otherLegReferenceRateTermUnit) {
        this.otherLegReferenceRateTermUnit = otherLegReferenceRateTermUnit;
    }

    public Attributes withOtherLegReferenceRateTermUnit(Attributes.OtherLegReferenceRateTermUnit otherLegReferenceRateTermUnit) {
        this.otherLegReferenceRateTermUnit = otherLegReferenceRateTermUnit;
        return this;
    }

    /**
     * Notional Schedule
     * <p>
     * Indicates the face amount of a swap upon which the payment streams for that swap are based
     * (Required)
     * 
     */
    @JsonProperty("NotionalSchedule")
    public Attributes.NotionalSchedule getNotionalSchedule() {
        return notionalSchedule;
    }

    /**
     * Notional Schedule
     * <p>
     * Indicates the face amount of a swap upon which the payment streams for that swap are based
     * (Required)
     * 
     */
    @JsonProperty("NotionalSchedule")
    public void setNotionalSchedule(Attributes.NotionalSchedule notionalSchedule) {
        this.notionalSchedule = notionalSchedule;
    }

    public Attributes withNotionalSchedule(Attributes.NotionalSchedule notionalSchedule) {
        this.notionalSchedule = notionalSchedule;
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
        return new ToStringBuilder(this).append("notionalCurrency", notionalCurrency).append("expiryDate", expiryDate).append("referenceRate", referenceRate).append("referenceRateTermValue", referenceRateTermValue).append("referenceRateTermUnit", referenceRateTermUnit).append("otherNotionalCurrency", otherNotionalCurrency).append("otherLegReferenceRate", otherLegReferenceRate).append("otherLegReferenceRateTermValue", otherLegReferenceRateTermValue).append("otherLegReferenceRateTermUnit", otherLegReferenceRateTermUnit).append("notionalSchedule", notionalSchedule).append("deliveryType", deliveryType).append("priceMultiplier", priceMultiplier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notionalCurrency).append(referenceRate).append(referenceRateTermValue).append(deliveryType).append(otherNotionalCurrency).append(otherLegReferenceRateTermUnit).append(priceMultiplier).append(referenceRateTermUnit).append(expiryDate).append(otherLegReferenceRateTermValue).append(otherLegReferenceRate).append(notionalSchedule).toHashCode();
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
        return new EqualsBuilder().append(notionalCurrency, rhs.notionalCurrency).append(referenceRate, rhs.referenceRate).append(referenceRateTermValue, rhs.referenceRateTermValue).append(deliveryType, rhs.deliveryType).append(otherNotionalCurrency, rhs.otherNotionalCurrency).append(otherLegReferenceRateTermUnit, rhs.otherLegReferenceRateTermUnit).append(priceMultiplier, rhs.priceMultiplier).append(referenceRateTermUnit, rhs.referenceRateTermUnit).append(expiryDate, rhs.expiryDate).append(otherLegReferenceRateTermValue, rhs.otherLegReferenceRateTermValue).append(otherLegReferenceRate, rhs.otherLegReferenceRate).append(notionalSchedule, rhs.notionalSchedule).isEquals();
    }

    public enum DeliveryType {

        CASH("CASH"),
        PHYS("PHYS");
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

    public enum NotionalSchedule {

        CONSTANT("Constant"),
        ACCRETING("Accreting"),
        AMORTIZING("Amortizing"),
        CUSTOM("Custom");
        private final String value;
        private final static Map<String, Attributes.NotionalSchedule> CONSTANTS = new HashMap<String, Attributes.NotionalSchedule>();

        static {
            for (Attributes.NotionalSchedule c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private NotionalSchedule(String value) {
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
        public static Attributes.NotionalSchedule fromValue(String value) {
            Attributes.NotionalSchedule constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherLegReferenceRate {

        AED_EBOR_REUTERS("AED-EBOR-Reuters"),
        AUD_AONIA_OIS_COMPOUND_SWAP_MARKER("AUD-AONIA-OIS-COMPOUND-SwapMarker"),
        AUD_AONIA_OIS_COMPOUND("AUD-AONIA-OIS-COMPOUND"),
        AUD_BBR_AUBBSW("AUD-BBR-AUBBSW"),
        AUD_BBR_BBSW_BLOOMBERG("AUD-BBR-BBSW-Bloomberg"),
        AUD_BBR_BBSW("AUD-BBR-BBSW"),
        AUD_BBR_BBSY_BID("AUD-BBR-BBSY (BID)"),
        AUD_BBR_ISDC("AUD-BBR-ISDC"),
        AUD_LIBOR_BBA_BLOOMBERG("AUD-LIBOR-BBA-Bloomberg"),
        AUD_LIBOR_BBA("AUD-LIBOR-BBA"),
        AUD_LIBOR_REFERENCE_BANKS("AUD-LIBOR-Reference Banks"),
        AUD_QUARTERLY_SWAP_RATE_ICAP_REFERENCE_BANKS("AUD-Quarterly Swap Rate-ICAP-Reference Banks"),
        AUD_QUARTERLY_SWAP_RATE_ICAP("AUD-Quarterly Swap Rate-ICAP"),
        AUD_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("AUD-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        AUD_SEMI_ANNUAL_SWAP_RATE_BGCANTOR_REFERENCE_BANKS("AUD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"),
        AUD_SEMI_ANNUAL_SWAP_RATE_ICAP_REFERENCE_BANKS("AUD-Semi-Annual Swap Rate-ICAP-Reference Banks"),
        AUD_SEMI_ANNUAL_SWAP_RATE_ICAP("AUD-Semi-annual Swap Rate-ICAP"),
        AUD_SWAP_RATE_REUTERS("AUD-Swap Rate-Reuters"),
        BRL_CDI("BRL-CDI"),
        CAD_BA_CDOR_BLOOMBERG("CAD-BA-CDOR-Bloomberg"),
        CAD_BA_CDOR("CAD-BA-CDOR"),
        CAD_BA_ISDD("CAD-BA-ISDD"),
        CAD_BA_REFERENCE_BANKS("CAD-BA-Reference Banks"),
        CAD_BA_REUTERS("CAD-BA-Reuters"),
        CAD_BA_TELERATE("CAD-BA-Telerate"),
        CAD_CORRA_OIS_COMPOUND("CAD-CORRA-OIS-COMPOUND"),
        CAD_ISDA_SWAP_RATE("CAD-ISDA-Swap Rate"),
        CAD_LIBOR_BBA_BLOOMBERG("CAD-LIBOR-BBA-Bloomberg"),
        CAD_LIBOR_BBA_SWAP_MARKER("CAD-LIBOR-BBA-SwapMarker"),
        CAD_LIBOR_BBA("CAD-LIBOR-BBA"),
        CAD_LIBOR_REFERENCE_BANKS("CAD-LIBOR-Reference Banks"),
        CAD_REPO_CORRA("CAD-REPO-CORRA"),
        CAD_TBILL_ISDD("CAD-TBILL-ISDD"),
        CAD_TBILL_REFERENCE_BANKS("CAD-TBILL-Reference Banks"),
        CAD_TBILL_REUTERS("CAD-TBILL-Reuters"),
        CAD_TBILL_TELERATE("CAD-TBILL-Telerate"),
        CHF_USD_BASIS_SWAPS_11_00_ICAP("CHF USD-Basis Swaps-11:00-ICAP"),
        CHF_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("CHF-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        CHF_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP("CHF-3M LIBOR SWAP-CME vs LCH-ICAP"),
        CHF_3_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        CHF_3_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP("CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP"),
        CHF_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP("CHF-6M LIBOR SWAP-CME vs LCH-ICAP"),
        CHF_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        CHF_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP("CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP"),
        CHF_6_M_LIBORSWAP_CME_VS_LCH_ICAP_BLOOMBERG("CHF-6M LIBORSWAP-CME vs LCH-ICAP-Bloomberg"),
        CHF_ANNUAL_SWAP_RATE_11_00_ICAP("CHF-Annual Swap Rate-11:00-ICAP"),
        CHF_ANNUAL_SWAP_RATE_REFERENCE_BANKS("CHF-Annual Swap Rate-Reference Banks"),
        CHF_ANNUAL_SWAP_RATE("CHF-Annual Swap Rate"),
        CHF_BASIS_SWAP_3_M_VS_6_M_LIBOR_11_00_ICAP("CHF-Basis Swap-3m vs 6m-LIBOR-11:00-ICAP"),
        CHF_ISDAFIX_SWAP_RATE("CHF-ISDAFIX-Swap Rate"),
        CHF_LIBOR_BBA_BLOOMBERG("CHF-LIBOR-BBA-Bloomberg"),
        CHF_LIBOR_BBA("CHF-LIBOR-BBA"),
        CHF_LIBOR_ISDA("CHF-LIBOR-ISDA"),
        CHF_LIBOR_REFERENCE_BANKS("CHF-LIBOR-Reference Banks"),
        CHF_OIS_11_00_ICAP("CHF-OIS-11:00-ICAP"),
        CHF_SARON_OIS_COMPOUND("CHF-SARON-OIS-COMPOUND"),
        CHF_TOIS_OIS_COMPOUND("CHF-TOIS-OIS-COMPOUND"),
        CL_CLICP_BLOOMBERG("CL-CLICP-Bloomberg"),
        CNH_HIBOR_REFERENCE_BANKS("CNH-HIBOR-Reference Banks"),
        CNH_HIBOR_TMA("CNH-HIBOR-TMA"),
        CNY_7_REPO_COMPOUNDING_DATE("CNY 7-Repo Compounding Date"),
        CNY_CNREPOFIX_CFXS_REUTERS("CNY-CNREPOFIX=CFXS-Reuters"),
        CNY_PBOCB_REUTERS("CNY-PBOCB-Reuters"),
        CNY_QUARTERLY_7_DAY_REPO_NON_DELIVERABLE_SWAP_RATE_TRADITION_REFERENCE_BANKS("CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION-Reference Banks"),
        CNY_QUARTERLY_7_DAY_REPO_NON_DELIVERABLE_SWAP_RATE_TRADITION("CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION"),
        CNY_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("CNY-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        CNY_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("CNY-Semi-Annual Swap Rate-Reference Banks"),
        CNY_SHIBOR_OIS_COMPOUNDING("CNY-Shibor-OIS-Compounding"),
        CNY_SHIBOR_REUTERS("CNY-SHIBOR-Reuters"),
        COP_IBR_OIS_COMPOUND("COP-IBR-OIS-COMPOUND"),
        CZK_ANNUAL_SWAP_RATE_11_00_BGCANTOR("CZK-Annual Swap Rate-11:00-BGCANTOR"),
        CZK_ANNUAL_SWAP_RATE_REFERENCE_BANKS("CZK-Annual Swap Rate-Reference Banks"),
        CZK_PRIBOR_PRBO("CZK-PRIBOR-PRBO"),
        CZK_PRIBOR_REFERENCE_BANKS("CZK-PRIBOR-Reference Banks"),
        DKK_CIBOR_DKNA_13_BLOOMBERG("DKK-CIBOR-DKNA13-Bloomberg"),
        DKK_CIBOR_DKNA_13("DKK-CIBOR-DKNA13"),
        DKK_CIBOR_REFERENCE_BANKS("DKK-CIBOR-Reference Banks"),
        DKK_CIBOR_2_BLOOMBERG("DKK-CIBOR2-Bloomberg"),
        DKK_CIBOR_2_DKNA_13("DKK-CIBOR2-DKNA13"),
        DKK_CITA_DKNA_14_COMPOUND("DKK-CITA-DKNA14-COMPOUND"),
        DKK_DKKOIS_OIS_COMPOUND("DKK-DKKOIS-OIS-COMPOUND"),
        EUR_BASIS_SWAP_EONIA_VS_3_M_EUR_IBOR_SWAP_RATES_A_360_10_00_ICAP("EUR Basis Swap-EONIA vs 3m EUR+IBOR Swap Rates-A/360-10:00-ICAP"),
        EUR_EURIBOR_ANNUAL_BOND_SWAP_VS_1_M_11_00_ICAP("EUR EURIBOR-Annual Bond Swap vs 1m-11:00-ICAP"),
        EUR_EURIBOR_BASIS_SWAP_1_M_VS_3_M_EURIBOR_11_00_ICAP("EUR EURIBOR-Basis Swap-1m vs 3m-Euribor-11:00-ICAP"),
        EUR_EURIBOR_BASIS_SWAP_3_M_VS_6_M_11_00_ICAP("EUR EURIBOR-Basis Swap-3m vs 6m-11:00-ICAP"),
        EUR_USD_BASIS_SWAPS_11_00_ICAP("EUR USD-Basis Swaps-11:00-ICAP"),
        EUR_3_M_EURIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("EUR-3M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        EUR_3_M_EURIBOR_SWAP_CME_VS_LCH_ICAP("EUR-3M EURIBOR SWAP-CME vs LCH-ICAP"),
        EUR_3_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        EUR_3_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP("EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP"),
        EUR_6_M_EURIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("EUR-6M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        EUR_6_M_EURIBOR_SWAP_CME_VS_LCH_ICAP("EUR-6M EURIBOR SWAP-CME vs LCH-ICAP"),
        EUR_6_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        EUR_6_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP("EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP"),
        EUR_ANNUAL_SWAP_RATE_10_00_BGCANTOR("EUR-Annual Swap Rate-10:00-BGCANTOR"),
        EUR_ANNUAL_SWAP_RATE_10_00_BLOOMBERG("EUR-Annual Swap Rate-10:00-Bloomberg"),
        EUR_ANNUAL_SWAP_RATE_10_00_ICAP("EUR-Annual Swap Rate-10:00-ICAP"),
        EUR_ANNUAL_SWAP_RATE_10_00_SWAP_MARKER("EUR-Annual Swap Rate-10:00-SwapMarker"),
        EUR_ANNUAL_SWAP_RATE_10_00_TRADITION("EUR-Annual Swap Rate-10:00-TRADITION"),
        EUR_ANNUAL_SWAP_RATE_10_00("EUR-Annual Swap Rate-10:00"),
        EUR_ANNUAL_SWAP_RATE_11_00_BLOOMBERG("EUR-Annual Swap Rate-11:00-Bloomberg"),
        EUR_ANNUAL_SWAP_RATE_11_00_ICAP("EUR-Annual Swap Rate-11:00-ICAP"),
        EUR_ANNUAL_SWAP_RATE_11_00_SWAP_MARKER("EUR-Annual Swap Rate-11:00-SwapMarker"),
        EUR_ANNUAL_SWAP_RATE_11_00("EUR-Annual Swap Rate-11:00"),
        EUR_ANNUAL_SWAP_RATE_3_MONTH_SWAP_MARKER("EUR-Annual Swap Rate-3 Month-SwapMarker"),
        EUR_ANNUAL_SWAP_RATE_3_MONTH("EUR-Annual Swap Rate-3 Month"),
        EUR_ANNUAL_SWAP_RATE_4_15_TRADITION("EUR-Annual Swap Rate-4:15-TRADITION"),
        EUR_ANNUAL_SWAP_RATE_REFERENCE_BANKS("EUR-Annual Swap Rate-Reference Banks"),
        EUR_EONIA_AVERAGE("EUR-EONIA-AVERAGE"),
        EUR_EONIA_OIS_10_00_BGCANTOR("EUR-EONIA-OIS-10:00-BGCANTOR"),
        EUR_EONIA_OIS_10_00_ICAP("EUR-EONIA-OIS-10:00-ICAP"),
        EUR_EONIA_OIS_10_00_TRADITION("EUR-EONIA-OIS-10:00-TRADITION"),
        EUR_EONIA_OIS_11_00_ICAP("EUR-EONIA-OIS-11:00-ICAP"),
        EUR_EONIA_OIS_4_15_TRADITION("EUR-EONIA-OIS-4:15-TRADITION"),
        EUR_EONIA_OIS_COMPOUND_BLOOMBERG("EUR-EONIA-OIS-COMPOUND-Bloomberg"),
        EUR_EONIA_OIS_COMPOUND("EUR-EONIA-OIS-COMPOUND"),
        EUR_EONIA_SWAP_INDEX("EUR-EONIA-Swap-Index"),
        EUR_EURIBOR_ACT_365_BLOOMBERG("EUR-EURIBOR-Act/365-Bloomberg"),
        EUR_EURIBOR_ACT_365("EUR-EURIBOR-Act/365"),
        EUR_EURIBOR_REFERENCE_BANKS("EUR-EURIBOR-Reference Banks"),
        EUR_EURIBOR_REUTERS("EUR-EURIBOR-Reuters"),
        EUR_EURIBOR_TELERATE("EUR-EURIBOR-Telerate"),
        EUR_EURONIA_OIS_COMPOUND("EUR-EURONIA-OIS-COMPOUND"),
        EUR_ISDA_EURIBOR_SWAP_RATE_11_00("EUR-ISDA-EURIBOR Swap Rate-11:00"),
        EUR_ISDA_EURIBOR_SWAP_RATE_12_00("EUR-ISDA-EURIBOR Swap Rate-12:00"),
        EUR_ISDA_LIBOR_SWAP_RATE_10_00("EUR-ISDA-LIBOR Swap Rate-10:00"),
        EUR_ISDA_LIBOR_SWAP_RATE_11_00("EUR-ISDA-LIBOR Swap Rate-11:00"),
        EUR_LIBOR_BBA_BLOOMBERG("EUR-LIBOR-BBA-Bloomberg"),
        EUR_LIBOR_BBA("EUR-LIBOR-BBA"),
        EUR_LIBOR_REFERENCE_BANKS("EUR-LIBOR-Reference Banks"),
        EUR_TAM_CDC("EUR-TAM-CDC"),
        EUR_TEC_10_CNO_SWAP_MARKER("EUR-TEC10-CNO-SwapMarker"),
        EUR_TEC_10_CNO("EUR-TEC10-CNO"),
        EUR_TEC_10_REFERENCE_BANKS("EUR-TEC10-Reference Banks"),
        EUR_TEC_5_CNO_SWAP_MARKER("EUR-TEC5-CNO-SwapMarker"),
        EUR_TEC_5_CNO("EUR-TEC5-CNO"),
        EUR_TEC_5_REFERENCE_BANKS("EUR-TEC5-Reference Banks"),
        EUR_TMM_CDC_COMPOUND("EUR-TMM-CDC-COMPOUND"),
        GBP_USD_BASIS_SWAPS_11_00_ICAP("GBP USD-Basis Swaps-11:00-ICAP"),
        GBP_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("GBP-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        GBP_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP("GBP-6M LIBOR SWAP-CME vs LCH-ICAP"),
        GBP_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        GBP_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP("GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP"),
        GBP_ISDA_SWAP_RATE("GBP-ISDA-Swap Rate"),
        GBP_LIBOR_BBA_BLOOMBERG("GBP-LIBOR-BBA-Bloomberg"),
        GBP_LIBOR_BBA("GBP-LIBOR-BBA"),
        GBP_LIBOR_ISDA("GBP-LIBOR-ISDA"),
        GBP_LIBOR_REFERENCE_BANKS("GBP-LIBOR-Reference Banks"),
        GBP_SEMI_ANNUAL_SWAP_RATE_11_00_TRADITION("GBP-Semi Annual Swap Rate-11:00-TRADITION"),
        GBP_SEMI_ANNUAL_SWAP_RATE_4_15_TRADITION("GBP-Semi Annual Swap Rate-4:15-TRADITION"),
        GBP_SEMI_ANNUAL_SWAP_RATE_11_00_ICAP("GBP-Semi-Annual Swap Rate-11:00-ICAP"),
        GBP_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("GBP-Semi-Annual Swap Rate-Reference Banks"),
        GBP_SEMI_ANNUAL_SWAP_RATE_SWAP_MARKER_26("GBP-Semi-Annual Swap Rate-SwapMarker26"),
        GBP_SEMI_ANNUAL_SWAP_RATE("GBP-Semi-Annual Swap Rate"),
        GBP_SONIA_OIS_11_00_ICAP("GBP-SONIA-OIS-11:00-ICAP"),
        GBP_SONIA_OIS_11_00_TRADITION("GBP-SONIA-OIS-11:00-TRADITION"),
        GBP_SONIA_OIS_4_15_TRADITION("GBP-SONIA-OIS-4:15-TRADITION"),
        GBP_WMBA_RONIA_COMPOUND("GBP-WMBA-RONIA-COMPOUND"),
        GBP_WMBA_SONIA_COMPOUND("GBP-WMBA-SONIA-COMPOUND"),
        GRD_ATHIBOR_ATHIBOR("GRD-ATHIBOR-ATHIBOR"),
        GRD_ATHIBOR_REFERENCE_BANKS("GRD-ATHIBOR-Reference Banks"),
        GRD_ATHIBOR_TELERATE("GRD-ATHIBOR-Telerate"),
        GRD_ATHIMID_REFERENCE_BANKS("GRD-ATHIMID-Reference Banks"),
        GRD_ATHIMID_REUTERS("GRD-ATHIMID-Reuters"),
        HKD_HIBOR_HIBOR_BLOOMBERG("HKD-HIBOR-HIBOR-Bloomberg"),
        HKD_HIBOR_HIBOR("HKD-HIBOR-HIBOR="),
        HKD_HIBOR_HKAB_BLOOMBERG("HKD-HIBOR-HKAB-Bloomberg"),
        HKD_HIBOR_HKAB("HKD-HIBOR-HKAB"),
        HKD_HIBOR_ISDC("HKD-HIBOR-ISDC"),
        HKD_HIBOR_REFERENCE_BANKS("HKD-HIBOR-Reference Banks"),
        HKD_HONIX_OIS_COMPOUND("HKD-HONIX-OIS-COMPOUND"),
        HKD_ISDA_SWAP_RATE_11_00("HKD-ISDA-Swap Rate-11:00"),
        HKD_ISDA_SWAP_RATE_4_00("HKD-ISDA-Swap Rate-4:00"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_11_00_BGCANTOR("HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_11_00_TRADITION("HKD-Quarterly-Annual Swap Rate-11:00-TRADITION"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_4_00_BGCANTOR("HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_REFERENCE_BANKS("HKD-Quarterly-Annual Swap Rate-Reference Banks"),
        HKD_QUARTERLY_QUARTERLY_SWAP_RATE_11_00_ICAP("HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP"),
        HKD_QUARTERLY_QUARTERLY_SWAP_RATE_4_00_ICAP("HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP"),
        HKD_QUARTERLY_QUARTERLY_SWAP_RATE_REFERENCE_BANKS("HKD-Quarterly-Quarterly Swap Rate-Reference Banks"),
        HUF_BUBOR_REFERENCE_BANKS("HUF-BUBOR-Reference Banks"),
        HUF_BUBOR_REUTERS("HUF-BUBOR-Reuters"),
        IDR_IDMA_BLOOMBERG("IDR-IDMA-Bloomberg"),
        IDR_IDRFIX("IDR-IDRFIX"),
        IDR_JIBOR_REUTERS("IDR-JIBOR-Reuters"),
        IDR_SBI_REUTERS("IDR-SBI-Reuters"),
        IDR_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("IDR-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        IDR_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("IDR-Semi-Annual Swap Rate-Reference Banks"),
        IDR_SOR_REFERENCE_BANKS("IDR-SOR-Reference Banks"),
        IDR_SOR_REUTERS("IDR-SOR-Reuters"),
        IDR_SOR_TELERATE("IDR-SOR-Telerate"),
        ILS_TELBOR_REFERENCE_BANKS("ILS-TELBOR-Reference Banks"),
        ILS_TELBOR_01_REUTERS("ILS-TELBOR01-Reuters"),
        INR_BMK("INR-BMK"),
        INR_CMT("INR-CMT"),
        INR_FBIL_MIBOR_OIS_COMPOUND("INR-FBIL-MIBOR-OIS-COMPOUND"),
        INR_INBMK_REUTERS("INR-INBMK-REUTERS"),
        INR_MIBOR_OIS_COMPOUND("INR-MIBOR-OIS-COMPOUND"),
        INR_MIFOR("INR-MIFOR"),
        INR_MIOIS("INR-MIOIS"),
        INR_MITOR_OIS_COMPOUND("INR-MITOR-OIS-COMPOUND"),
        INR_REFERENCE_BANKS("INR-Reference Banks"),
        INR_SEMI_ANNUAL_SWAP_RATE_NON_DELIVERABLE_16_00_TULLETT_PREBON("INR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon"),
        INR_SEMI_ANNUAL_SWAP_RATE_11_30_BGCANTOR("INR-Semi-Annual Swap Rate-11:30-BGCANTOR"),
        INR_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("INR-Semi-Annual Swap Rate-Reference Banks"),
        ISK_REIBOR_REFERENCE_BANKS("ISK-REIBOR-Reference Banks"),
        ISK_REIBOR_REUTERS("ISK-REIBOR-Reuters"),
        JPY_USD_BASIS_SWAPS_11_00_ICAP("JPY USD-Basis Swaps-11:00-ICAP"),
        JPY_ANNUAL_SWAP_RATE_11_00_TRADITION("JPY-Annual Swap Rate-11:00-TRADITION"),
        JPY_ANNUAL_SWAP_RATE_3_00_TRADITION("JPY-Annual Swap Rate-3:00-TRADITION"),
        JPY_BBSF_BLOOMBERG_10_00("JPY-BBSF-Bloomberg-10:00"),
        JPY_BBSF_BLOOMBERG_15_00("JPY-BBSF-Bloomberg-15:00"),
        JPY_ISDA_SWAP_RATE_10_00("JPY-ISDA-Swap Rate-10:00"),
        JPY_ISDA_SWAP_RATE_15_00("JPY-ISDA-Swap Rate-15:00"),
        JPY_LIBOR_BBA_BLOOMBERG("JPY-LIBOR-BBA-Bloomberg"),
        JPY_LIBOR_BBA("JPY-LIBOR-BBA"),
        JPY_LIBOR_FRASETT("JPY-LIBOR-FRASETT"),
        JPY_LIBOR_ISDA("JPY-LIBOR-ISDA"),
        JPY_LIBOR_REFERENCE_BANKS("JPY-LIBOR-Reference Banks"),
        JPY_LTPR_MHCB("JPY-LTPR-MHCB"),
        JPY_LTPR_TBC("JPY-LTPR-TBC"),
        JPY_MUTANCALL_TONAR("JPY-MUTANCALL-TONAR"),
        JPY_OIS_11_00_ICAP("JPY-OIS-11:00-ICAP"),
        JPY_OIS_11_00_TRADITION("JPY-OIS-11:00-TRADITION"),
        JPY_OIS_3_00_TRADITION("JPY-OIS-3:00-TRADITION"),
        JPY_QUOTING_BANKS_LIBOR("JPY-Quoting Banks-LIBOR"),
        JPY_STPR_QUOTING_BANKS("JPY-STPR-Quoting Banks"),
        JPY_TIBOR_17096("JPY-TIBOR-17096"),
        JPY_TIBOR_17097("JPY-TIBOR-17097"),
        JPY_TIBOR_DTIBOR_01("JPY-TIBOR-DTIBOR01"),
        JPY_TIBOR_TIBM_10_BANKS("JPY-TIBOR-TIBM (10 Banks)"),
        JPY_TIBOR_TIBM_5_BANKS("JPY-TIBOR-TIBM (5 Banks)"),
        JPY_TIBOR_TIBM_ALL_BANKS_BLOOMBERG("JPY-TIBOR-TIBM (All Banks)-Bloomberg"),
        JPY_TIBOR_TIBM_ALL_BANKS("JPY-TIBOR-TIBM (All Banks)"),
        JPY_TIBOR_TIBM_REFERENCE_BANKS("JPY-TIBOR-TIBM-Reference Banks"),
        JPY_TIBOR_TIBM("JPY-TIBOR-TIBM"),
        JPY_TIBOR_ZTIBOR("JPY-TIBOR-ZTIBOR"),
        JPY_TONA_OIS_COMPOUND("JPY-TONA-OIS-COMPOUND"),
        JPY_TSR_REFERENCE_BANKS("JPY-TSR-Reference Banks"),
        JPY_TSR_REUTERS_10_00("JPY-TSR-Reuters-10:00"),
        JPY_TSR_REUTERS_15_00("JPY-TSR-Reuters-15:00"),
        JPY_TSR_TELERATE_10_00("JPY-TSR-Telerate-10:00"),
        JPY_TSR_TELERATE_15_00("JPY-TSR-Telerate-15:00"),
        KRW_BOND_3222("KRW-Bond-3222"),
        KRW_CD_3220("KRW-CD-3220"),
        KRW_CD_KSDA_BLOOMBERG("KRW-CD-KSDA-Bloomberg"),
        KRW_QUARTERLY_ANNUAL_SWAP_RATE_3_30_ICAP("KRW-Quarterly Annual Swap Rate-3:30-ICAP"),
        MXN_TIIE_BANXICO_BLOOMBERG("MXN-TIIE-Banxico-Bloomberg"),
        MXN_TIIE_BANXICO_REFERENCE_BANKS("MXN-TIIE-Banxico-Reference Banks"),
        MXN_TIIE_BANXICO("MXN-TIIE-Banxico"),
        MYR_KLIBOR_BNM("MYR-KLIBOR-BNM"),
        MYR_KLIBOR_REFERENCE_BANKS("MYR-KLIBOR-Reference Banks"),
        MYR_QUARTERLY_SWAP_RATE_11_00_TRADITION("MYR-Quarterly Swap Rate-11:00-TRADITION"),
        MYR_QUARTERLY_SWAP_RATE_TRADITION_REFERENCE_BANKS("MYR-Quarterly Swap Rate-TRADITION-Reference Banks"),
        NOK_NIBOR_NIBR_REFERENCE_BANKS("NOK-NIBOR-NIBR-Reference Banks"),
        NOK_NIBOR_NIBR("NOK-NIBOR-NIBR"),
        NOK_NIBOR_OIBOR("NOK-NIBOR-OIBOR"),
        NOK_NIBOR_REFERENCE_BANKS("NOK-NIBOR-Reference Banks"),
        NZD_BBR_BID("NZD-BBR-BID"),
        NZD_BBR_FRA("NZD-BBR-FRA"),
        NZD_BBR_ISDC("NZD-BBR-ISDC"),
        NZD_BBR_REFERENCE_BANKS("NZD-BBR-Reference Banks"),
        NZD_BBR_TELERATE("NZD-BBR-Telerate"),
        NZD_NZIONA_OIS_COMPOUND("NZD-NZIONA-OIS-COMPOUND"),
        NZD_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("NZD-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        NZD_SEMI_ANNUAL_SWAP_RATE_BGCANTOR_REFERENCE_BANKS("NZD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"),
        NZD_SWAP_RATE_ICAP_REFERENCE_BANKS("NZD-Swap Rate-ICAP-Reference Banks"),
        NZD_SWAP_RATE_ICAP("NZD-Swap Rate-ICAP"),
        PHP_PHIREF_BAP("PHP-PHIREF-BAP"),
        PHP_PHIREF_BLOOMBERG("PHP-PHIREF-Bloomberg"),
        PHP_PHIREF_REFERENCE_BANKS("PHP-PHIREF-Reference Banks"),
        PHP_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("PHP-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        PHP_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("PHP-Semi-Annual Swap Rate-Reference Banks"),
        PLN_POLONIA_OIS_COMPOUND("PLN-POLONIA-OIS-COMPOUND"),
        PLN_WIBOR_REFERENCE_BANKS("PLN-WIBOR-Reference Banks"),
        PLN_WIBOR_WIBO("PLN-WIBOR-WIBO"),
        PLZ_WIBOR_REFERENCE_BANKS("PLZ-WIBOR-Reference Banks"),
        PLZ_WIBOR_WIBO("PLZ-WIBOR-WIBO"),
        REPOFUNDS_RATE_FRANCE_OIS_COMPOUND("REPOFUNDS RATE-FRANCE-OIS-COMPOUND"),
        REPOFUNDS_RATE_GERMANY_OIS_COMPOUND("REPOFUNDS RATE-GERMANY-OIS-COMPOUND"),
        REPOFUNDS_RATE_ITALY_OIS_COMPOUND("REPOFUNDS RATE-ITALY-OIS-COMPOUND"),
        RON_ANNUAL_SWAP_RATE_11_00_BGCANTOR("RON-Annual Swap Rate-11:00-BGCANTOR"),
        RON_ANNUAL_SWAP_RATE_REFERENCE_BANKS("RON-Annual Swap Rate-Reference Banks"),
        RON_RBOR_REUTERS("RON-RBOR-Reuters"),
        RUB_ANNUAL_SWAP_RATE_11_00_BGCANTOR("RUB-Annual Swap Rate-11:00-BGCANTOR"),
        RUB_ANNUAL_SWAP_RATE_12_45_TRADITION("RUB-Annual Swap Rate-12:45-TRADITION"),
        RUB_ANNUAL_SWAP_RATE_4_15_TRADITION("RUB-Annual Swap Rate-4:15-TRADITION"),
        RUB_ANNUAL_SWAP_RATE_REFERENCE_BANKS("RUB-Annual Swap Rate-Reference Banks"),
        RUB_ANNUAL_SWAP_RATE_TRADITION_REFERENCE_BANKS("RUB-Annual Swap Rate-TRADITION-Reference Banks"),
        RUB_MOSPRIME_NFEA("RUB-MOSPRIME-NFEA"),
        RUB_MOSPRIME_REFERENCE_BANKS("RUB-MOSPRIME-Reference Banks"),
        RUB_RUONIA_OIS_COMPOUND("RUB-RUONIA-OIS-COMPOUND"),
        SAR_SRIOR_REFERENCE_BANKS("SAR-SRIOR-Reference Banks"),
        SAR_SRIOR_SUAA("SAR-SRIOR-SUAA"),
        SEK_ANNUAL_SWAP_RATE_SESWFI("SEK-Annual Swap Rate-SESWFI"),
        SEK_ANNUAL_SWAP_RATE("SEK-Annual Swap Rate"),
        SEK_SIOR_OIS_COMPOUND("SEK-SIOR-OIS-COMPOUND"),
        SEK_STIBOR_BLOOMBERG("SEK-STIBOR-Bloomberg"),
        SEK_STIBOR_REFERENCE_BANKS("SEK-STIBOR-Reference Banks"),
        SEK_STIBOR_SIDE("SEK-STIBOR-SIDE"),
        SGD_SEMI_ANNUAL_CURRENCY_BASIS_SWAP_RATE_11_00_TULLETT_PREBON("SGD-Semi-Annual Currency Basis Swap Rate-11:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_CURRENCY_BASIS_SWAP_RATE_16_00_TULLETT_PREBON("SGD-Semi-Annual Currency Basis Swap Rate-16:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("SGD-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        SGD_SEMI_ANNUAL_SWAP_RATE_11_00_TULLETT_PREBON("SGD-Semi-Annual Swap Rate-11:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_SWAP_RATE_11_00_TRADITION("SGD-Semi-Annual Swap Rate-11.00-TRADITION"),
        SGD_SEMI_ANNUAL_SWAP_RATE_16_00_TULLETT_PREBON("SGD-Semi-Annual Swap Rate-16:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_SWAP_RATE_ICAP_REFERENCE_BANKS("SGD-Semi-Annual Swap Rate-ICAP-Reference Banks"),
        SGD_SEMI_ANNUAL_SWAP_RATE_ICAP("SGD-Semi-Annual Swap Rate-ICAP"),
        SGD_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("SGD-Semi-Annual Swap Rate-Reference Banks"),
        SGD_SEMI_ANNUAL_SWAP_RATE_TRADITION_REFERENCE_BANKS("SGD-Semi-Annual Swap Rate-TRADITION-Reference Banks"),
        SGD_SIBOR_REFERENCE_BANKS("SGD-SIBOR-Reference Banks"),
        SGD_SIBOR_REUTERS("SGD-SIBOR-Reuters"),
        SGD_SIBOR_TELERATE("SGD-SIBOR-Telerate"),
        SGD_SONAR_OIS_COMPOUND("SGD-SONAR-OIS-COMPOUND"),
        SGD_SONAR_OIS_VWAP_COMPOUND("SGD-SONAR-OIS-VWAP-COMPOUND"),
        SGD_SOR_REFERENCE_BANKS("SGD-SOR-Reference Banks"),
        SGD_SOR_REUTERS("SGD-SOR-Reuters"),
        SGD_SOR_TELERATE("SGD-SOR-Telerate"),
        SGD_SOR_VWAP_REFERENCE_BANKS("SGD-SOR-VWAP-Reference Banks"),
        SGD_SOR_VWAP("SGD-SOR-VWAP"),
        SKK_BRIBOR_BLOOMBERG("SKK-BRIBOR-Bloomberg"),
        SKK_BRIBOR_BRBO("SKK-BRIBOR-BRBO"),
        SKK_BRIBOR_NBSK_07("SKK-BRIBOR-NBSK07"),
        SKK_BRIBOR_REFERENCE_BANKS("SKK-BRIBOR-Reference Banks"),
        THB_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("THB-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        THB_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("THB-Semi-Annual Swap Rate-Reference Banks"),
        THB_SOR_REFERENCE_BANKS("THB-SOR-Reference Banks"),
        THB_SOR_REUTERS("THB-SOR-Reuters"),
        THB_SOR_TELERATE("THB-SOR-Telerate"),
        THB_THBFIX_REFERENCE_BANKS("THB-THBFIX-Reference Banks"),
        THB_THBFIX_REUTERS("THB-THBFIX-Reuters"),
        TRY_ANNUAL_SWAP_RATE_11_00_TRADITION("TRY Annual Swap Rate-11:00-TRADITION"),
        TRY_ANNUAL_SWAP_RATE_11_15_BGCANTOR("TRY-Annual Swap Rate-11:15-BGCANTOR"),
        TRY_ANNUAL_SWAP_RATE_REFERENCE_BANKS("TRY-Annual Swap Rate-Reference Banks"),
        TRY_SEMI_ANNUAL_SWAP_RATE_TRADITION_REFERENCE_BANKS("TRY-Semi-Annual Swap Rate-TRADITION-Reference Banks"),
        TRY_TRYIBOR_REFERENCE_BANKS("TRY-TRYIBOR-Reference Banks"),
        TRY_TRYIBOR_REUTERS("TRY-TRYIBOR-Reuters"),
        TWD_QUARTERLY_ANNUAL_SWAP_RATE_11_00_BGCANTOR("TWD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"),
        TWD_QUARTERLY_ANNUAL_SWAP_RATE_REFERENCE_BANKS("TWD-Quarterly-Annual Swap Rate-Reference Banks"),
        TWD_REFERENCE_DEALERS("TWD-Reference Dealers"),
        TWD_REUTERS_6165("TWD-Reuters-6165"),
        TWD_TAIBIR_01("TWD-TAIBIR01"),
        TWD_TAIBIR_02("TWD-TAIBIR02"),
        TWD_TAIBOR_BLOOMBERG("TWD-TAIBOR-Bloomberg"),
        TWD_TAIBOR_REUTERS("TWD-TAIBOR-Reuters"),
        TWD_TELERATE_6165("TWD-Telerate-6165"),
        TWD_TWCPBA("TWD-TWCPBA"),
        USD_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("USD-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        USD_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP("USD-3M LIBOR SWAP-CME vs LCH-ICAP"),
        USD_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("USD-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        USD_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP("USD-6M LIBOR SWAP-CME vs LCH-ICAP"),
        USD_ANNUAL_SWAP_RATE_11_00_BGCANTOR("USD-Annual Swap Rate-11:00-BGCANTOR"),
        USD_ANNUAL_SWAP_RATE_11_00_TRADITION("USD-Annual Swap Rate-11:00-TRADITION"),
        USD_ANNUAL_SWAP_RATE_4_00_TRADITION("USD-Annual Swap Rate-4:00-TRADITION"),
        USD_BA_H_15("USD-BA-H.15"),
        USD_BA_REFERENCE_DEALERS("USD-BA-Reference Dealers"),
        USD_BMA_MUNICIPAL_SWAP_INDEX("USD-BMA Municipal Swap Index"),
        USD_CD_H_15("USD-CD-H.15"),
        USD_CD_REFERENCE_DEALERS("USD-CD-Reference Dealers"),
        USD_CMS_REFERENCE_BANKS_ICAP_SWAP_PX("USD-CMS-Reference Banks-ICAP SwapPX"),
        USD_CMS_REFERENCE_BANKS("USD-CMS-Reference Banks"),
        USD_CMS_REUTERS("USD-CMS-Reuters"),
        USD_CMS_TELERATE("USD-CMS-Telerate"),
        USD_CMT_T_7051("USD-CMT-T7051"),
        USD_CMT_T_7052("USD-CMT-T7052"),
        USD_COF_11_FHLBSF("USD-COF11-FHLBSF"),
        USD_COF_11_REUTERS("USD-COF11-Reuters"),
        USD_COF_11_TELERATE("USD-COF11-Telerate"),
        USD_CP_H_15("USD-CP-H.15"),
        USD_CP_REFERENCE_DEALERS("USD-CP-Reference Dealers"),
        USD_FEDERAL_FUNDS_H_15_BLOOMBERG("USD-Federal Funds-H.15-Bloomberg"),
        USD_FEDERAL_FUNDS_H_15_OIS_COMPOUND("USD-Federal Funds-H.15-OIS-COMPOUND"),
        USD_FEDERAL_FUNDS_H_15("USD-Federal Funds-H.15"),
        USD_FEDERAL_FUNDS_REFERENCE_DEALERS("USD-Federal Funds-Reference Dealers"),
        USD_FFCB_DISCO("USD-FFCB-DISCO"),
        USD_ISDA_SWAP_RATE_3_00("USD-ISDA-Swap Rate-3:00"),
        USD_ISDA_SWAP_RATE("USD-ISDA-Swap Rate"),
        USD_ISDAFIX_3_SWAP_RATE_3_00("USD-ISDAFIX3-Swap Rate-3:00"),
        USD_ISDAFIX_3_SWAP_RATE("USD-ISDAFIX3-Swap Rate"),
        USD_LIBOR_BBA_BLOOMBERG("USD-LIBOR-BBA-Bloomberg"),
        USD_LIBOR_BBA("USD-LIBOR-BBA"),
        USD_LIBOR_ISDA("USD-LIBOR-ISDA"),
        USD_LIBOR_LIBO("USD-LIBOR-LIBO"),
        USD_LIBOR_REFERENCE_BANKS("USD-LIBOR-Reference Banks"),
        USD_MUNICIPAL_SWAP_LIBOR_RATIO_11_00_ICAP("USD-Municipal Swap Libor Ratio-11:00-ICAP"),
        USD_MUNICIPAL_SWAP_RATE_11_00_ICAP("USD-Municipal Swap Rate-11:00-ICAP"),
        USD_OIS_11_00_BGCANTOR("USD-OIS-11:00-BGCANTOR"),
        USD_OIS_11_00_LON_ICAP("USD-OIS-11:00-LON-ICAP"),
        USD_OIS_11_00_NY_ICAP("USD-OIS-11:00-NY-ICAP"),
        USD_OIS_11_00_TRADITION("USD-OIS-11:00-TRADITION"),
        USD_OIS_3_00_BGCANTOR("USD-OIS-3:00-BGCANTOR"),
        USD_OIS_3_00_NY_ICAP("USD-OIS-3:00-NY-ICAP"),
        USD_OIS_4_00_TRADITION("USD-OIS-4:00-TRADITION"),
        USD_OVERNIGHT_BANK_FUNDING_RATE("USD-Overnight Bank Funding Rate"),
        USD_PRIME_H_15("USD-Prime-H.15"),
        USD_PRIME_REFERENCE_BANKS("USD-Prime-Reference Banks"),
        USD_S_P_INDEX_HIGH_GRADE("USD-S&P Index-High Grade"),
        USD_SIBOR_REFERENCE_BANKS("USD-SIBOR-Reference Banks"),
        USD_SIBOR_SIBO("USD-SIBOR-SIBO"),
        USD_SIFMA_MUNICIPAL_SWAP_INDEX("USD-SIFMA Municipal Swap Index"),
        USD_TBILL_H_15_BLOOMBERG("USD-TBILL-H.15-Bloomberg"),
        USD_TBILL_H_15("USD-TBILL-H.15"),
        USD_TBILL_SECONDARY_MARKET("USD-TBILL-Secondary Market"),
        USD_TIBOR_ISDC("USD-TIBOR-ISDC"),
        USD_TIBOR_REFERENCE_BANKS("USD-TIBOR-Reference Banks"),
        USD_TREASURY_RATE_ICAP_BROKER_TEC("USD-Treasury Rate-ICAP BrokerTec"),
        USD_TREASURY_RATE_SWAP_MARKER_100("USD-Treasury Rate-SwapMarker100"),
        USD_TREASURY_RATE_SWAP_MARKER_99("USD-Treasury Rate-SwapMarker99"),
        USD_TREASURY_RATE_T_19901("USD-Treasury Rate-T19901"),
        USD_TREASURY_RATE_T_500("USD-Treasury Rate-T500"),
        USD_TREASURY_19901_3_00_ICAP("USD-Treasury-19901-3:00-ICAP"),
        VND_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("VND-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        VND_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("VND-Semi-Annual Swap Rate-Reference Banks"),
        ZAR_DEPOSIT_REFERENCE_BANKS("ZAR-DEPOSIT-Reference Banks"),
        ZAR_DEPOSIT_SAFEX("ZAR-DEPOSIT-SAFEX"),
        ZAR_JIBAR_REFERENCE_BANKS("ZAR-JIBAR-Reference Banks"),
        ZAR_JIBAR_SAFEX("ZAR-JIBAR-SAFEX"),
        ZAR_PRIME_AVERAGE_REFERENCE_BANKS("ZAR-PRIME-AVERAGE-Reference Banks"),
        ZAR_PRIME_AVERAGE("ZAR-PRIME-AVERAGE"),
        ZAR_QUARTERLY_SWAP_RATE_1_00_TRADITION("ZAR-Quarterly Swap Rate-1:00-TRADITION"),
        ZAR_QUARTERLY_SWAP_RATE_5_30_TRADITION("ZAR-Quarterly Swap Rate-5:30-TRADITION"),
        ZAR_QUARTERLY_SWAP_RATE_TRADITION_REFERENCE_BANKS("ZAR-Quarterly Swap Rate-TRADITION-Reference Banks");
        private final String value;
        private final static Map<String, Attributes.OtherLegReferenceRate> CONSTANTS = new HashMap<String, Attributes.OtherLegReferenceRate>();

        static {
            for (Attributes.OtherLegReferenceRate c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherLegReferenceRate(String value) {
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
        public static Attributes.OtherLegReferenceRate fromValue(String value) {
            Attributes.OtherLegReferenceRate constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum OtherLegReferenceRateTermUnit {

        DAYS("DAYS"),
        WEEK("WEEK"),
        MNTH("MNTH"),
        YEAR("YEAR");
        private final String value;
        private final static Map<String, Attributes.OtherLegReferenceRateTermUnit> CONSTANTS = new HashMap<String, Attributes.OtherLegReferenceRateTermUnit>();

        static {
            for (Attributes.OtherLegReferenceRateTermUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private OtherLegReferenceRateTermUnit(String value) {
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
        public static Attributes.OtherLegReferenceRateTermUnit fromValue(String value) {
            Attributes.OtherLegReferenceRateTermUnit constant = CONSTANTS.get(value);
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

    public enum ReferenceRate {

        AED_EBOR_REUTERS("AED-EBOR-Reuters"),
        AUD_AONIA_OIS_COMPOUND_SWAP_MARKER("AUD-AONIA-OIS-COMPOUND-SwapMarker"),
        AUD_AONIA_OIS_COMPOUND("AUD-AONIA-OIS-COMPOUND"),
        AUD_BBR_AUBBSW("AUD-BBR-AUBBSW"),
        AUD_BBR_BBSW_BLOOMBERG("AUD-BBR-BBSW-Bloomberg"),
        AUD_BBR_BBSW("AUD-BBR-BBSW"),
        AUD_BBR_BBSY_BID("AUD-BBR-BBSY (BID)"),
        AUD_BBR_ISDC("AUD-BBR-ISDC"),
        AUD_LIBOR_BBA_BLOOMBERG("AUD-LIBOR-BBA-Bloomberg"),
        AUD_LIBOR_BBA("AUD-LIBOR-BBA"),
        AUD_LIBOR_REFERENCE_BANKS("AUD-LIBOR-Reference Banks"),
        AUD_QUARTERLY_SWAP_RATE_ICAP_REFERENCE_BANKS("AUD-Quarterly Swap Rate-ICAP-Reference Banks"),
        AUD_QUARTERLY_SWAP_RATE_ICAP("AUD-Quarterly Swap Rate-ICAP"),
        AUD_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("AUD-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        AUD_SEMI_ANNUAL_SWAP_RATE_BGCANTOR_REFERENCE_BANKS("AUD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"),
        AUD_SEMI_ANNUAL_SWAP_RATE_ICAP_REFERENCE_BANKS("AUD-Semi-Annual Swap Rate-ICAP-Reference Banks"),
        AUD_SEMI_ANNUAL_SWAP_RATE_ICAP("AUD-Semi-annual Swap Rate-ICAP"),
        AUD_SWAP_RATE_REUTERS("AUD-Swap Rate-Reuters"),
        BRL_CDI("BRL-CDI"),
        CAD_BA_CDOR_BLOOMBERG("CAD-BA-CDOR-Bloomberg"),
        CAD_BA_CDOR("CAD-BA-CDOR"),
        CAD_BA_ISDD("CAD-BA-ISDD"),
        CAD_BA_REFERENCE_BANKS("CAD-BA-Reference Banks"),
        CAD_BA_REUTERS("CAD-BA-Reuters"),
        CAD_BA_TELERATE("CAD-BA-Telerate"),
        CAD_CORRA_OIS_COMPOUND("CAD-CORRA-OIS-COMPOUND"),
        CAD_ISDA_SWAP_RATE("CAD-ISDA-Swap Rate"),
        CAD_LIBOR_BBA_BLOOMBERG("CAD-LIBOR-BBA-Bloomberg"),
        CAD_LIBOR_BBA_SWAP_MARKER("CAD-LIBOR-BBA-SwapMarker"),
        CAD_LIBOR_BBA("CAD-LIBOR-BBA"),
        CAD_LIBOR_REFERENCE_BANKS("CAD-LIBOR-Reference Banks"),
        CAD_REPO_CORRA("CAD-REPO-CORRA"),
        CAD_TBILL_ISDD("CAD-TBILL-ISDD"),
        CAD_TBILL_REFERENCE_BANKS("CAD-TBILL-Reference Banks"),
        CAD_TBILL_REUTERS("CAD-TBILL-Reuters"),
        CAD_TBILL_TELERATE("CAD-TBILL-Telerate"),
        CHF_USD_BASIS_SWAPS_11_00_ICAP("CHF USD-Basis Swaps-11:00-ICAP"),
        CHF_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("CHF-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        CHF_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP("CHF-3M LIBOR SWAP-CME vs LCH-ICAP"),
        CHF_3_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        CHF_3_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP("CHF-3M LIBOR SWAP-EUREX vs LCH-ICAP"),
        CHF_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP("CHF-6M LIBOR SWAP-CME vs LCH-ICAP"),
        CHF_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        CHF_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP("CHF-6M LIBOR SWAP-EUREX vs LCH-ICAP"),
        CHF_6_M_LIBORSWAP_CME_VS_LCH_ICAP_BLOOMBERG("CHF-6M LIBORSWAP-CME vs LCH-ICAP-Bloomberg"),
        CHF_ANNUAL_SWAP_RATE_11_00_ICAP("CHF-Annual Swap Rate-11:00-ICAP"),
        CHF_ANNUAL_SWAP_RATE_REFERENCE_BANKS("CHF-Annual Swap Rate-Reference Banks"),
        CHF_ANNUAL_SWAP_RATE("CHF-Annual Swap Rate"),
        CHF_BASIS_SWAP_3_M_VS_6_M_LIBOR_11_00_ICAP("CHF-Basis Swap-3m vs 6m-LIBOR-11:00-ICAP"),
        CHF_ISDAFIX_SWAP_RATE("CHF-ISDAFIX-Swap Rate"),
        CHF_LIBOR_BBA_BLOOMBERG("CHF-LIBOR-BBA-Bloomberg"),
        CHF_LIBOR_BBA("CHF-LIBOR-BBA"),
        CHF_LIBOR_ISDA("CHF-LIBOR-ISDA"),
        CHF_LIBOR_REFERENCE_BANKS("CHF-LIBOR-Reference Banks"),
        CHF_OIS_11_00_ICAP("CHF-OIS-11:00-ICAP"),
        CHF_SARON_OIS_COMPOUND("CHF-SARON-OIS-COMPOUND"),
        CHF_TOIS_OIS_COMPOUND("CHF-TOIS-OIS-COMPOUND"),
        CL_CLICP_BLOOMBERG("CL-CLICP-Bloomberg"),
        CNH_HIBOR_REFERENCE_BANKS("CNH-HIBOR-Reference Banks"),
        CNH_HIBOR_TMA("CNH-HIBOR-TMA"),
        CNY_7_REPO_COMPOUNDING_DATE("CNY 7-Repo Compounding Date"),
        CNY_CNREPOFIX_CFXS_REUTERS("CNY-CNREPOFIX=CFXS-Reuters"),
        CNY_PBOCB_REUTERS("CNY-PBOCB-Reuters"),
        CNY_QUARTERLY_7_DAY_REPO_NON_DELIVERABLE_SWAP_RATE_TRADITION_REFERENCE_BANKS("CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION-Reference Banks"),
        CNY_QUARTERLY_7_DAY_REPO_NON_DELIVERABLE_SWAP_RATE_TRADITION("CNY-Quarterly 7 day Repo Non Deliverable Swap Rate-TRADITION"),
        CNY_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("CNY-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        CNY_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("CNY-Semi-Annual Swap Rate-Reference Banks"),
        CNY_SHIBOR_OIS_COMPOUNDING("CNY-Shibor-OIS-Compounding"),
        CNY_SHIBOR_REUTERS("CNY-SHIBOR-Reuters"),
        COP_IBR_OIS_COMPOUND("COP-IBR-OIS-COMPOUND"),
        CZK_ANNUAL_SWAP_RATE_11_00_BGCANTOR("CZK-Annual Swap Rate-11:00-BGCANTOR"),
        CZK_ANNUAL_SWAP_RATE_REFERENCE_BANKS("CZK-Annual Swap Rate-Reference Banks"),
        CZK_PRIBOR_PRBO("CZK-PRIBOR-PRBO"),
        CZK_PRIBOR_REFERENCE_BANKS("CZK-PRIBOR-Reference Banks"),
        DKK_CIBOR_DKNA_13_BLOOMBERG("DKK-CIBOR-DKNA13-Bloomberg"),
        DKK_CIBOR_DKNA_13("DKK-CIBOR-DKNA13"),
        DKK_CIBOR_REFERENCE_BANKS("DKK-CIBOR-Reference Banks"),
        DKK_CIBOR_2_BLOOMBERG("DKK-CIBOR2-Bloomberg"),
        DKK_CIBOR_2_DKNA_13("DKK-CIBOR2-DKNA13"),
        DKK_CITA_DKNA_14_COMPOUND("DKK-CITA-DKNA14-COMPOUND"),
        DKK_DKKOIS_OIS_COMPOUND("DKK-DKKOIS-OIS-COMPOUND"),
        EUR_BASIS_SWAP_EONIA_VS_3_M_EUR_IBOR_SWAP_RATES_A_360_10_00_ICAP("EUR Basis Swap-EONIA vs 3m EUR+IBOR Swap Rates-A/360-10:00-ICAP"),
        EUR_EURIBOR_ANNUAL_BOND_SWAP_VS_1_M_11_00_ICAP("EUR EURIBOR-Annual Bond Swap vs 1m-11:00-ICAP"),
        EUR_EURIBOR_BASIS_SWAP_1_M_VS_3_M_EURIBOR_11_00_ICAP("EUR EURIBOR-Basis Swap-1m vs 3m-Euribor-11:00-ICAP"),
        EUR_EURIBOR_BASIS_SWAP_3_M_VS_6_M_11_00_ICAP("EUR EURIBOR-Basis Swap-3m vs 6m-11:00-ICAP"),
        EUR_USD_BASIS_SWAPS_11_00_ICAP("EUR USD-Basis Swaps-11:00-ICAP"),
        EUR_3_M_EURIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("EUR-3M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        EUR_3_M_EURIBOR_SWAP_CME_VS_LCH_ICAP("EUR-3M EURIBOR SWAP-CME vs LCH-ICAP"),
        EUR_3_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        EUR_3_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP("EUR-3M EURIBOR SWAP-EUREX vs LCH-ICAP"),
        EUR_6_M_EURIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("EUR-6M EURIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        EUR_6_M_EURIBOR_SWAP_CME_VS_LCH_ICAP("EUR-6M EURIBOR SWAP-CME vs LCH-ICAP"),
        EUR_6_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        EUR_6_M_EURIBOR_SWAP_EUREX_VS_LCH_ICAP("EUR-6M EURIBOR SWAP-EUREX vs LCH-ICAP"),
        EUR_ANNUAL_SWAP_RATE_10_00_BGCANTOR("EUR-Annual Swap Rate-10:00-BGCANTOR"),
        EUR_ANNUAL_SWAP_RATE_10_00_BLOOMBERG("EUR-Annual Swap Rate-10:00-Bloomberg"),
        EUR_ANNUAL_SWAP_RATE_10_00_ICAP("EUR-Annual Swap Rate-10:00-ICAP"),
        EUR_ANNUAL_SWAP_RATE_10_00_SWAP_MARKER("EUR-Annual Swap Rate-10:00-SwapMarker"),
        EUR_ANNUAL_SWAP_RATE_10_00_TRADITION("EUR-Annual Swap Rate-10:00-TRADITION"),
        EUR_ANNUAL_SWAP_RATE_10_00("EUR-Annual Swap Rate-10:00"),
        EUR_ANNUAL_SWAP_RATE_11_00_BLOOMBERG("EUR-Annual Swap Rate-11:00-Bloomberg"),
        EUR_ANNUAL_SWAP_RATE_11_00_ICAP("EUR-Annual Swap Rate-11:00-ICAP"),
        EUR_ANNUAL_SWAP_RATE_11_00_SWAP_MARKER("EUR-Annual Swap Rate-11:00-SwapMarker"),
        EUR_ANNUAL_SWAP_RATE_11_00("EUR-Annual Swap Rate-11:00"),
        EUR_ANNUAL_SWAP_RATE_3_MONTH_SWAP_MARKER("EUR-Annual Swap Rate-3 Month-SwapMarker"),
        EUR_ANNUAL_SWAP_RATE_3_MONTH("EUR-Annual Swap Rate-3 Month"),
        EUR_ANNUAL_SWAP_RATE_4_15_TRADITION("EUR-Annual Swap Rate-4:15-TRADITION"),
        EUR_ANNUAL_SWAP_RATE_REFERENCE_BANKS("EUR-Annual Swap Rate-Reference Banks"),
        EUR_EONIA_AVERAGE("EUR-EONIA-AVERAGE"),
        EUR_EONIA_OIS_10_00_BGCANTOR("EUR-EONIA-OIS-10:00-BGCANTOR"),
        EUR_EONIA_OIS_10_00_ICAP("EUR-EONIA-OIS-10:00-ICAP"),
        EUR_EONIA_OIS_10_00_TRADITION("EUR-EONIA-OIS-10:00-TRADITION"),
        EUR_EONIA_OIS_11_00_ICAP("EUR-EONIA-OIS-11:00-ICAP"),
        EUR_EONIA_OIS_4_15_TRADITION("EUR-EONIA-OIS-4:15-TRADITION"),
        EUR_EONIA_OIS_COMPOUND_BLOOMBERG("EUR-EONIA-OIS-COMPOUND-Bloomberg"),
        EUR_EONIA_OIS_COMPOUND("EUR-EONIA-OIS-COMPOUND"),
        EUR_EONIA_SWAP_INDEX("EUR-EONIA-Swap-Index"),
        EUR_EURIBOR_ACT_365_BLOOMBERG("EUR-EURIBOR-Act/365-Bloomberg"),
        EUR_EURIBOR_ACT_365("EUR-EURIBOR-Act/365"),
        EUR_EURIBOR_REFERENCE_BANKS("EUR-EURIBOR-Reference Banks"),
        EUR_EURIBOR_REUTERS("EUR-EURIBOR-Reuters"),
        EUR_EURIBOR_TELERATE("EUR-EURIBOR-Telerate"),
        EUR_EURONIA_OIS_COMPOUND("EUR-EURONIA-OIS-COMPOUND"),
        EUR_ISDA_EURIBOR_SWAP_RATE_11_00("EUR-ISDA-EURIBOR Swap Rate-11:00"),
        EUR_ISDA_EURIBOR_SWAP_RATE_12_00("EUR-ISDA-EURIBOR Swap Rate-12:00"),
        EUR_ISDA_LIBOR_SWAP_RATE_10_00("EUR-ISDA-LIBOR Swap Rate-10:00"),
        EUR_ISDA_LIBOR_SWAP_RATE_11_00("EUR-ISDA-LIBOR Swap Rate-11:00"),
        EUR_LIBOR_BBA_BLOOMBERG("EUR-LIBOR-BBA-Bloomberg"),
        EUR_LIBOR_BBA("EUR-LIBOR-BBA"),
        EUR_LIBOR_REFERENCE_BANKS("EUR-LIBOR-Reference Banks"),
        EUR_TAM_CDC("EUR-TAM-CDC"),
        EUR_TEC_10_CNO_SWAP_MARKER("EUR-TEC10-CNO-SwapMarker"),
        EUR_TEC_10_CNO("EUR-TEC10-CNO"),
        EUR_TEC_10_REFERENCE_BANKS("EUR-TEC10-Reference Banks"),
        EUR_TEC_5_CNO_SWAP_MARKER("EUR-TEC5-CNO-SwapMarker"),
        EUR_TEC_5_CNO("EUR-TEC5-CNO"),
        EUR_TEC_5_REFERENCE_BANKS("EUR-TEC5-Reference Banks"),
        EUR_TMM_CDC_COMPOUND("EUR-TMM-CDC-COMPOUND"),
        GBP_USD_BASIS_SWAPS_11_00_ICAP("GBP USD-Basis Swaps-11:00-ICAP"),
        GBP_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("GBP-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        GBP_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP("GBP-6M LIBOR SWAP-CME vs LCH-ICAP"),
        GBP_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP_BLOOMBERG("GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP-Bloomberg"),
        GBP_6_M_LIBOR_SWAP_EUREX_VS_LCH_ICAP("GBP-6M LIBOR SWAP-EUREX vs LCH-ICAP"),
        GBP_ISDA_SWAP_RATE("GBP-ISDA-Swap Rate"),
        GBP_LIBOR_BBA_BLOOMBERG("GBP-LIBOR-BBA-Bloomberg"),
        GBP_LIBOR_BBA("GBP-LIBOR-BBA"),
        GBP_LIBOR_ISDA("GBP-LIBOR-ISDA"),
        GBP_LIBOR_REFERENCE_BANKS("GBP-LIBOR-Reference Banks"),
        GBP_SEMI_ANNUAL_SWAP_RATE_11_00_TRADITION("GBP-Semi Annual Swap Rate-11:00-TRADITION"),
        GBP_SEMI_ANNUAL_SWAP_RATE_4_15_TRADITION("GBP-Semi Annual Swap Rate-4:15-TRADITION"),
        GBP_SEMI_ANNUAL_SWAP_RATE_11_00_ICAP("GBP-Semi-Annual Swap Rate-11:00-ICAP"),
        GBP_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("GBP-Semi-Annual Swap Rate-Reference Banks"),
        GBP_SEMI_ANNUAL_SWAP_RATE_SWAP_MARKER_26("GBP-Semi-Annual Swap Rate-SwapMarker26"),
        GBP_SEMI_ANNUAL_SWAP_RATE("GBP-Semi-Annual Swap Rate"),
        GBP_SONIA_OIS_11_00_ICAP("GBP-SONIA-OIS-11:00-ICAP"),
        GBP_SONIA_OIS_11_00_TRADITION("GBP-SONIA-OIS-11:00-TRADITION"),
        GBP_SONIA_OIS_4_15_TRADITION("GBP-SONIA-OIS-4:15-TRADITION"),
        GBP_WMBA_RONIA_COMPOUND("GBP-WMBA-RONIA-COMPOUND"),
        GBP_WMBA_SONIA_COMPOUND("GBP-WMBA-SONIA-COMPOUND"),
        GRD_ATHIBOR_ATHIBOR("GRD-ATHIBOR-ATHIBOR"),
        GRD_ATHIBOR_REFERENCE_BANKS("GRD-ATHIBOR-Reference Banks"),
        GRD_ATHIBOR_TELERATE("GRD-ATHIBOR-Telerate"),
        GRD_ATHIMID_REFERENCE_BANKS("GRD-ATHIMID-Reference Banks"),
        GRD_ATHIMID_REUTERS("GRD-ATHIMID-Reuters"),
        HKD_HIBOR_HIBOR_BLOOMBERG("HKD-HIBOR-HIBOR-Bloomberg"),
        HKD_HIBOR_HIBOR("HKD-HIBOR-HIBOR="),
        HKD_HIBOR_HKAB_BLOOMBERG("HKD-HIBOR-HKAB-Bloomberg"),
        HKD_HIBOR_HKAB("HKD-HIBOR-HKAB"),
        HKD_HIBOR_ISDC("HKD-HIBOR-ISDC"),
        HKD_HIBOR_REFERENCE_BANKS("HKD-HIBOR-Reference Banks"),
        HKD_HONIX_OIS_COMPOUND("HKD-HONIX-OIS-COMPOUND"),
        HKD_ISDA_SWAP_RATE_11_00("HKD-ISDA-Swap Rate-11:00"),
        HKD_ISDA_SWAP_RATE_4_00("HKD-ISDA-Swap Rate-4:00"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_11_00_BGCANTOR("HKD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_11_00_TRADITION("HKD-Quarterly-Annual Swap Rate-11:00-TRADITION"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_4_00_BGCANTOR("HKD-Quarterly-Annual Swap Rate-4:00-BGCANTOR"),
        HKD_QUARTERLY_ANNUAL_SWAP_RATE_REFERENCE_BANKS("HKD-Quarterly-Annual Swap Rate-Reference Banks"),
        HKD_QUARTERLY_QUARTERLY_SWAP_RATE_11_00_ICAP("HKD-Quarterly-Quarterly Swap Rate-11:00-ICAP"),
        HKD_QUARTERLY_QUARTERLY_SWAP_RATE_4_00_ICAP("HKD-Quarterly-Quarterly Swap Rate-4:00-ICAP"),
        HKD_QUARTERLY_QUARTERLY_SWAP_RATE_REFERENCE_BANKS("HKD-Quarterly-Quarterly Swap Rate-Reference Banks"),
        HUF_BUBOR_REFERENCE_BANKS("HUF-BUBOR-Reference Banks"),
        HUF_BUBOR_REUTERS("HUF-BUBOR-Reuters"),
        IDR_IDMA_BLOOMBERG("IDR-IDMA-Bloomberg"),
        IDR_IDRFIX("IDR-IDRFIX"),
        IDR_JIBOR_REUTERS("IDR-JIBOR-Reuters"),
        IDR_SBI_REUTERS("IDR-SBI-Reuters"),
        IDR_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("IDR-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        IDR_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("IDR-Semi-Annual Swap Rate-Reference Banks"),
        IDR_SOR_REFERENCE_BANKS("IDR-SOR-Reference Banks"),
        IDR_SOR_REUTERS("IDR-SOR-Reuters"),
        IDR_SOR_TELERATE("IDR-SOR-Telerate"),
        ILS_TELBOR_REFERENCE_BANKS("ILS-TELBOR-Reference Banks"),
        ILS_TELBOR_01_REUTERS("ILS-TELBOR01-Reuters"),
        INR_BMK("INR-BMK"),
        INR_CMT("INR-CMT"),
        INR_FBIL_MIBOR_OIS_COMPOUND("INR-FBIL-MIBOR-OIS-COMPOUND"),
        INR_INBMK_REUTERS("INR-INBMK-REUTERS"),
        INR_MIBOR_OIS_COMPOUND("INR-MIBOR-OIS-COMPOUND"),
        INR_MIFOR("INR-MIFOR"),
        INR_MIOIS("INR-MIOIS"),
        INR_MITOR_OIS_COMPOUND("INR-MITOR-OIS-COMPOUND"),
        INR_REFERENCE_BANKS("INR-Reference Banks"),
        INR_SEMI_ANNUAL_SWAP_RATE_NON_DELIVERABLE_16_00_TULLETT_PREBON("INR-Semi Annual Swap Rate-Non-deliverable-16:00-Tullett Prebon"),
        INR_SEMI_ANNUAL_SWAP_RATE_11_30_BGCANTOR("INR-Semi-Annual Swap Rate-11:30-BGCANTOR"),
        INR_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("INR-Semi-Annual Swap Rate-Reference Banks"),
        ISK_REIBOR_REFERENCE_BANKS("ISK-REIBOR-Reference Banks"),
        ISK_REIBOR_REUTERS("ISK-REIBOR-Reuters"),
        JPY_USD_BASIS_SWAPS_11_00_ICAP("JPY USD-Basis Swaps-11:00-ICAP"),
        JPY_ANNUAL_SWAP_RATE_11_00_TRADITION("JPY-Annual Swap Rate-11:00-TRADITION"),
        JPY_ANNUAL_SWAP_RATE_3_00_TRADITION("JPY-Annual Swap Rate-3:00-TRADITION"),
        JPY_BBSF_BLOOMBERG_10_00("JPY-BBSF-Bloomberg-10:00"),
        JPY_BBSF_BLOOMBERG_15_00("JPY-BBSF-Bloomberg-15:00"),
        JPY_ISDA_SWAP_RATE_10_00("JPY-ISDA-Swap Rate-10:00"),
        JPY_ISDA_SWAP_RATE_15_00("JPY-ISDA-Swap Rate-15:00"),
        JPY_LIBOR_BBA_BLOOMBERG("JPY-LIBOR-BBA-Bloomberg"),
        JPY_LIBOR_BBA("JPY-LIBOR-BBA"),
        JPY_LIBOR_FRASETT("JPY-LIBOR-FRASETT"),
        JPY_LIBOR_ISDA("JPY-LIBOR-ISDA"),
        JPY_LIBOR_REFERENCE_BANKS("JPY-LIBOR-Reference Banks"),
        JPY_LTPR_MHCB("JPY-LTPR-MHCB"),
        JPY_LTPR_TBC("JPY-LTPR-TBC"),
        JPY_MUTANCALL_TONAR("JPY-MUTANCALL-TONAR"),
        JPY_OIS_11_00_ICAP("JPY-OIS-11:00-ICAP"),
        JPY_OIS_11_00_TRADITION("JPY-OIS-11:00-TRADITION"),
        JPY_OIS_3_00_TRADITION("JPY-OIS-3:00-TRADITION"),
        JPY_QUOTING_BANKS_LIBOR("JPY-Quoting Banks-LIBOR"),
        JPY_STPR_QUOTING_BANKS("JPY-STPR-Quoting Banks"),
        JPY_TIBOR_17096("JPY-TIBOR-17096"),
        JPY_TIBOR_17097("JPY-TIBOR-17097"),
        JPY_TIBOR_DTIBOR_01("JPY-TIBOR-DTIBOR01"),
        JPY_TIBOR_TIBM_10_BANKS("JPY-TIBOR-TIBM (10 Banks)"),
        JPY_TIBOR_TIBM_5_BANKS("JPY-TIBOR-TIBM (5 Banks)"),
        JPY_TIBOR_TIBM_ALL_BANKS_BLOOMBERG("JPY-TIBOR-TIBM (All Banks)-Bloomberg"),
        JPY_TIBOR_TIBM_ALL_BANKS("JPY-TIBOR-TIBM (All Banks)"),
        JPY_TIBOR_TIBM_REFERENCE_BANKS("JPY-TIBOR-TIBM-Reference Banks"),
        JPY_TIBOR_TIBM("JPY-TIBOR-TIBM"),
        JPY_TIBOR_ZTIBOR("JPY-TIBOR-ZTIBOR"),
        JPY_TONA_OIS_COMPOUND("JPY-TONA-OIS-COMPOUND"),
        JPY_TSR_REFERENCE_BANKS("JPY-TSR-Reference Banks"),
        JPY_TSR_REUTERS_10_00("JPY-TSR-Reuters-10:00"),
        JPY_TSR_REUTERS_15_00("JPY-TSR-Reuters-15:00"),
        JPY_TSR_TELERATE_10_00("JPY-TSR-Telerate-10:00"),
        JPY_TSR_TELERATE_15_00("JPY-TSR-Telerate-15:00"),
        KRW_BOND_3222("KRW-Bond-3222"),
        KRW_CD_3220("KRW-CD-3220"),
        KRW_CD_KSDA_BLOOMBERG("KRW-CD-KSDA-Bloomberg"),
        KRW_QUARTERLY_ANNUAL_SWAP_RATE_3_30_ICAP("KRW-Quarterly Annual Swap Rate-3:30-ICAP"),
        MXN_TIIE_BANXICO_BLOOMBERG("MXN-TIIE-Banxico-Bloomberg"),
        MXN_TIIE_BANXICO_REFERENCE_BANKS("MXN-TIIE-Banxico-Reference Banks"),
        MXN_TIIE_BANXICO("MXN-TIIE-Banxico"),
        MYR_KLIBOR_BNM("MYR-KLIBOR-BNM"),
        MYR_KLIBOR_REFERENCE_BANKS("MYR-KLIBOR-Reference Banks"),
        MYR_QUARTERLY_SWAP_RATE_11_00_TRADITION("MYR-Quarterly Swap Rate-11:00-TRADITION"),
        MYR_QUARTERLY_SWAP_RATE_TRADITION_REFERENCE_BANKS("MYR-Quarterly Swap Rate-TRADITION-Reference Banks"),
        NOK_NIBOR_NIBR_REFERENCE_BANKS("NOK-NIBOR-NIBR-Reference Banks"),
        NOK_NIBOR_NIBR("NOK-NIBOR-NIBR"),
        NOK_NIBOR_OIBOR("NOK-NIBOR-OIBOR"),
        NOK_NIBOR_REFERENCE_BANKS("NOK-NIBOR-Reference Banks"),
        NZD_BBR_BID("NZD-BBR-BID"),
        NZD_BBR_FRA("NZD-BBR-FRA"),
        NZD_BBR_ISDC("NZD-BBR-ISDC"),
        NZD_BBR_REFERENCE_BANKS("NZD-BBR-Reference Banks"),
        NZD_BBR_TELERATE("NZD-BBR-Telerate"),
        NZD_NZIONA_OIS_COMPOUND("NZD-NZIONA-OIS-COMPOUND"),
        NZD_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("NZD-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        NZD_SEMI_ANNUAL_SWAP_RATE_BGCANTOR_REFERENCE_BANKS("NZD-Semi-Annual Swap Rate-BGCANTOR-Reference Banks"),
        NZD_SWAP_RATE_ICAP_REFERENCE_BANKS("NZD-Swap Rate-ICAP-Reference Banks"),
        NZD_SWAP_RATE_ICAP("NZD-Swap Rate-ICAP"),
        PHP_PHIREF_BAP("PHP-PHIREF-BAP"),
        PHP_PHIREF_BLOOMBERG("PHP-PHIREF-Bloomberg"),
        PHP_PHIREF_REFERENCE_BANKS("PHP-PHIREF-Reference Banks"),
        PHP_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("PHP-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        PHP_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("PHP-Semi-Annual Swap Rate-Reference Banks"),
        PLN_POLONIA_OIS_COMPOUND("PLN-POLONIA-OIS-COMPOUND"),
        PLN_WIBOR_REFERENCE_BANKS("PLN-WIBOR-Reference Banks"),
        PLN_WIBOR_WIBO("PLN-WIBOR-WIBO"),
        PLZ_WIBOR_REFERENCE_BANKS("PLZ-WIBOR-Reference Banks"),
        PLZ_WIBOR_WIBO("PLZ-WIBOR-WIBO"),
        REPOFUNDS_RATE_FRANCE_OIS_COMPOUND("REPOFUNDS RATE-FRANCE-OIS-COMPOUND"),
        REPOFUNDS_RATE_GERMANY_OIS_COMPOUND("REPOFUNDS RATE-GERMANY-OIS-COMPOUND"),
        REPOFUNDS_RATE_ITALY_OIS_COMPOUND("REPOFUNDS RATE-ITALY-OIS-COMPOUND"),
        RON_ANNUAL_SWAP_RATE_11_00_BGCANTOR("RON-Annual Swap Rate-11:00-BGCANTOR"),
        RON_ANNUAL_SWAP_RATE_REFERENCE_BANKS("RON-Annual Swap Rate-Reference Banks"),
        RON_RBOR_REUTERS("RON-RBOR-Reuters"),
        RUB_ANNUAL_SWAP_RATE_11_00_BGCANTOR("RUB-Annual Swap Rate-11:00-BGCANTOR"),
        RUB_ANNUAL_SWAP_RATE_12_45_TRADITION("RUB-Annual Swap Rate-12:45-TRADITION"),
        RUB_ANNUAL_SWAP_RATE_4_15_TRADITION("RUB-Annual Swap Rate-4:15-TRADITION"),
        RUB_ANNUAL_SWAP_RATE_REFERENCE_BANKS("RUB-Annual Swap Rate-Reference Banks"),
        RUB_ANNUAL_SWAP_RATE_TRADITION_REFERENCE_BANKS("RUB-Annual Swap Rate-TRADITION-Reference Banks"),
        RUB_MOSPRIME_NFEA("RUB-MOSPRIME-NFEA"),
        RUB_MOSPRIME_REFERENCE_BANKS("RUB-MOSPRIME-Reference Banks"),
        RUB_RUONIA_OIS_COMPOUND("RUB-RUONIA-OIS-COMPOUND"),
        SAR_SRIOR_REFERENCE_BANKS("SAR-SRIOR-Reference Banks"),
        SAR_SRIOR_SUAA("SAR-SRIOR-SUAA"),
        SEK_ANNUAL_SWAP_RATE_SESWFI("SEK-Annual Swap Rate-SESWFI"),
        SEK_ANNUAL_SWAP_RATE("SEK-Annual Swap Rate"),
        SEK_SIOR_OIS_COMPOUND("SEK-SIOR-OIS-COMPOUND"),
        SEK_STIBOR_BLOOMBERG("SEK-STIBOR-Bloomberg"),
        SEK_STIBOR_REFERENCE_BANKS("SEK-STIBOR-Reference Banks"),
        SEK_STIBOR_SIDE("SEK-STIBOR-SIDE"),
        SGD_SEMI_ANNUAL_CURRENCY_BASIS_SWAP_RATE_11_00_TULLETT_PREBON("SGD-Semi-Annual Currency Basis Swap Rate-11:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_CURRENCY_BASIS_SWAP_RATE_16_00_TULLETT_PREBON("SGD-Semi-Annual Currency Basis Swap Rate-16:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("SGD-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        SGD_SEMI_ANNUAL_SWAP_RATE_11_00_TULLETT_PREBON("SGD-Semi-Annual Swap Rate-11:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_SWAP_RATE_11_00_TRADITION("SGD-Semi-Annual Swap Rate-11.00-TRADITION"),
        SGD_SEMI_ANNUAL_SWAP_RATE_16_00_TULLETT_PREBON("SGD-Semi-Annual Swap Rate-16:00-Tullett Prebon"),
        SGD_SEMI_ANNUAL_SWAP_RATE_ICAP_REFERENCE_BANKS("SGD-Semi-Annual Swap Rate-ICAP-Reference Banks"),
        SGD_SEMI_ANNUAL_SWAP_RATE_ICAP("SGD-Semi-Annual Swap Rate-ICAP"),
        SGD_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("SGD-Semi-Annual Swap Rate-Reference Banks"),
        SGD_SEMI_ANNUAL_SWAP_RATE_TRADITION_REFERENCE_BANKS("SGD-Semi-Annual Swap Rate-TRADITION-Reference Banks"),
        SGD_SIBOR_REFERENCE_BANKS("SGD-SIBOR-Reference Banks"),
        SGD_SIBOR_REUTERS("SGD-SIBOR-Reuters"),
        SGD_SIBOR_TELERATE("SGD-SIBOR-Telerate"),
        SGD_SONAR_OIS_COMPOUND("SGD-SONAR-OIS-COMPOUND"),
        SGD_SONAR_OIS_VWAP_COMPOUND("SGD-SONAR-OIS-VWAP-COMPOUND"),
        SGD_SOR_REFERENCE_BANKS("SGD-SOR-Reference Banks"),
        SGD_SOR_REUTERS("SGD-SOR-Reuters"),
        SGD_SOR_TELERATE("SGD-SOR-Telerate"),
        SGD_SOR_VWAP_REFERENCE_BANKS("SGD-SOR-VWAP-Reference Banks"),
        SGD_SOR_VWAP("SGD-SOR-VWAP"),
        SKK_BRIBOR_BLOOMBERG("SKK-BRIBOR-Bloomberg"),
        SKK_BRIBOR_BRBO("SKK-BRIBOR-BRBO"),
        SKK_BRIBOR_NBSK_07("SKK-BRIBOR-NBSK07"),
        SKK_BRIBOR_REFERENCE_BANKS("SKK-BRIBOR-Reference Banks"),
        THB_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("THB-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        THB_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("THB-Semi-Annual Swap Rate-Reference Banks"),
        THB_SOR_REFERENCE_BANKS("THB-SOR-Reference Banks"),
        THB_SOR_REUTERS("THB-SOR-Reuters"),
        THB_SOR_TELERATE("THB-SOR-Telerate"),
        THB_THBFIX_REFERENCE_BANKS("THB-THBFIX-Reference Banks"),
        THB_THBFIX_REUTERS("THB-THBFIX-Reuters"),
        TRY_ANNUAL_SWAP_RATE_11_00_TRADITION("TRY Annual Swap Rate-11:00-TRADITION"),
        TRY_ANNUAL_SWAP_RATE_11_15_BGCANTOR("TRY-Annual Swap Rate-11:15-BGCANTOR"),
        TRY_ANNUAL_SWAP_RATE_REFERENCE_BANKS("TRY-Annual Swap Rate-Reference Banks"),
        TRY_SEMI_ANNUAL_SWAP_RATE_TRADITION_REFERENCE_BANKS("TRY-Semi-Annual Swap Rate-TRADITION-Reference Banks"),
        TRY_TRYIBOR_REFERENCE_BANKS("TRY-TRYIBOR-Reference Banks"),
        TRY_TRYIBOR_REUTERS("TRY-TRYIBOR-Reuters"),
        TWD_QUARTERLY_ANNUAL_SWAP_RATE_11_00_BGCANTOR("TWD-Quarterly-Annual Swap Rate-11:00-BGCANTOR"),
        TWD_QUARTERLY_ANNUAL_SWAP_RATE_REFERENCE_BANKS("TWD-Quarterly-Annual Swap Rate-Reference Banks"),
        TWD_REFERENCE_DEALERS("TWD-Reference Dealers"),
        TWD_REUTERS_6165("TWD-Reuters-6165"),
        TWD_TAIBIR_01("TWD-TAIBIR01"),
        TWD_TAIBIR_02("TWD-TAIBIR02"),
        TWD_TAIBOR_BLOOMBERG("TWD-TAIBOR-Bloomberg"),
        TWD_TAIBOR_REUTERS("TWD-TAIBOR-Reuters"),
        TWD_TELERATE_6165("TWD-Telerate-6165"),
        TWD_TWCPBA("TWD-TWCPBA"),
        USD_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("USD-3M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        USD_3_M_LIBOR_SWAP_CME_VS_LCH_ICAP("USD-3M LIBOR SWAP-CME vs LCH-ICAP"),
        USD_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP_BLOOMBERG("USD-6M LIBOR SWAP-CME vs LCH-ICAP-Bloomberg"),
        USD_6_M_LIBOR_SWAP_CME_VS_LCH_ICAP("USD-6M LIBOR SWAP-CME vs LCH-ICAP"),
        USD_ANNUAL_SWAP_RATE_11_00_BGCANTOR("USD-Annual Swap Rate-11:00-BGCANTOR"),
        USD_ANNUAL_SWAP_RATE_11_00_TRADITION("USD-Annual Swap Rate-11:00-TRADITION"),
        USD_ANNUAL_SWAP_RATE_4_00_TRADITION("USD-Annual Swap Rate-4:00-TRADITION"),
        USD_BA_H_15("USD-BA-H.15"),
        USD_BA_REFERENCE_DEALERS("USD-BA-Reference Dealers"),
        USD_BMA_MUNICIPAL_SWAP_INDEX("USD-BMA Municipal Swap Index"),
        USD_CD_H_15("USD-CD-H.15"),
        USD_CD_REFERENCE_DEALERS("USD-CD-Reference Dealers"),
        USD_CMS_REFERENCE_BANKS_ICAP_SWAP_PX("USD-CMS-Reference Banks-ICAP SwapPX"),
        USD_CMS_REFERENCE_BANKS("USD-CMS-Reference Banks"),
        USD_CMS_REUTERS("USD-CMS-Reuters"),
        USD_CMS_TELERATE("USD-CMS-Telerate"),
        USD_CMT_T_7051("USD-CMT-T7051"),
        USD_CMT_T_7052("USD-CMT-T7052"),
        USD_COF_11_FHLBSF("USD-COF11-FHLBSF"),
        USD_COF_11_REUTERS("USD-COF11-Reuters"),
        USD_COF_11_TELERATE("USD-COF11-Telerate"),
        USD_CP_H_15("USD-CP-H.15"),
        USD_CP_REFERENCE_DEALERS("USD-CP-Reference Dealers"),
        USD_FEDERAL_FUNDS_H_15_BLOOMBERG("USD-Federal Funds-H.15-Bloomberg"),
        USD_FEDERAL_FUNDS_H_15_OIS_COMPOUND("USD-Federal Funds-H.15-OIS-COMPOUND"),
        USD_FEDERAL_FUNDS_H_15("USD-Federal Funds-H.15"),
        USD_FEDERAL_FUNDS_REFERENCE_DEALERS("USD-Federal Funds-Reference Dealers"),
        USD_FFCB_DISCO("USD-FFCB-DISCO"),
        USD_ISDA_SWAP_RATE_3_00("USD-ISDA-Swap Rate-3:00"),
        USD_ISDA_SWAP_RATE("USD-ISDA-Swap Rate"),
        USD_ISDAFIX_3_SWAP_RATE_3_00("USD-ISDAFIX3-Swap Rate-3:00"),
        USD_ISDAFIX_3_SWAP_RATE("USD-ISDAFIX3-Swap Rate"),
        USD_LIBOR_BBA_BLOOMBERG("USD-LIBOR-BBA-Bloomberg"),
        USD_LIBOR_BBA("USD-LIBOR-BBA"),
        USD_LIBOR_ISDA("USD-LIBOR-ISDA"),
        USD_LIBOR_LIBO("USD-LIBOR-LIBO"),
        USD_LIBOR_REFERENCE_BANKS("USD-LIBOR-Reference Banks"),
        USD_MUNICIPAL_SWAP_LIBOR_RATIO_11_00_ICAP("USD-Municipal Swap Libor Ratio-11:00-ICAP"),
        USD_MUNICIPAL_SWAP_RATE_11_00_ICAP("USD-Municipal Swap Rate-11:00-ICAP"),
        USD_OIS_11_00_BGCANTOR("USD-OIS-11:00-BGCANTOR"),
        USD_OIS_11_00_LON_ICAP("USD-OIS-11:00-LON-ICAP"),
        USD_OIS_11_00_NY_ICAP("USD-OIS-11:00-NY-ICAP"),
        USD_OIS_11_00_TRADITION("USD-OIS-11:00-TRADITION"),
        USD_OIS_3_00_BGCANTOR("USD-OIS-3:00-BGCANTOR"),
        USD_OIS_3_00_NY_ICAP("USD-OIS-3:00-NY-ICAP"),
        USD_OIS_4_00_TRADITION("USD-OIS-4:00-TRADITION"),
        USD_OVERNIGHT_BANK_FUNDING_RATE("USD-Overnight Bank Funding Rate"),
        USD_PRIME_H_15("USD-Prime-H.15"),
        USD_PRIME_REFERENCE_BANKS("USD-Prime-Reference Banks"),
        USD_S_P_INDEX_HIGH_GRADE("USD-S&P Index-High Grade"),
        USD_SIBOR_REFERENCE_BANKS("USD-SIBOR-Reference Banks"),
        USD_SIBOR_SIBO("USD-SIBOR-SIBO"),
        USD_SIFMA_MUNICIPAL_SWAP_INDEX("USD-SIFMA Municipal Swap Index"),
        USD_TBILL_H_15_BLOOMBERG("USD-TBILL-H.15-Bloomberg"),
        USD_TBILL_H_15("USD-TBILL-H.15"),
        USD_TBILL_SECONDARY_MARKET("USD-TBILL-Secondary Market"),
        USD_TIBOR_ISDC("USD-TIBOR-ISDC"),
        USD_TIBOR_REFERENCE_BANKS("USD-TIBOR-Reference Banks"),
        USD_TREASURY_RATE_ICAP_BROKER_TEC("USD-Treasury Rate-ICAP BrokerTec"),
        USD_TREASURY_RATE_SWAP_MARKER_100("USD-Treasury Rate-SwapMarker100"),
        USD_TREASURY_RATE_SWAP_MARKER_99("USD-Treasury Rate-SwapMarker99"),
        USD_TREASURY_RATE_T_19901("USD-Treasury Rate-T19901"),
        USD_TREASURY_RATE_T_500("USD-Treasury Rate-T500"),
        USD_TREASURY_19901_3_00_ICAP("USD-Treasury-19901-3:00-ICAP"),
        VND_SEMI_ANNUAL_SWAP_RATE_11_00_BGCANTOR("VND-Semi-Annual Swap Rate-11:00-BGCANTOR"),
        VND_SEMI_ANNUAL_SWAP_RATE_REFERENCE_BANKS("VND-Semi-Annual Swap Rate-Reference Banks"),
        ZAR_DEPOSIT_REFERENCE_BANKS("ZAR-DEPOSIT-Reference Banks"),
        ZAR_DEPOSIT_SAFEX("ZAR-DEPOSIT-SAFEX"),
        ZAR_JIBAR_REFERENCE_BANKS("ZAR-JIBAR-Reference Banks"),
        ZAR_JIBAR_SAFEX("ZAR-JIBAR-SAFEX"),
        ZAR_PRIME_AVERAGE_REFERENCE_BANKS("ZAR-PRIME-AVERAGE-Reference Banks"),
        ZAR_PRIME_AVERAGE("ZAR-PRIME-AVERAGE"),
        ZAR_QUARTERLY_SWAP_RATE_1_00_TRADITION("ZAR-Quarterly Swap Rate-1:00-TRADITION"),
        ZAR_QUARTERLY_SWAP_RATE_5_30_TRADITION("ZAR-Quarterly Swap Rate-5:30-TRADITION"),
        ZAR_QUARTERLY_SWAP_RATE_TRADITION_REFERENCE_BANKS("ZAR-Quarterly Swap Rate-TRADITION-Reference Banks");
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

    public enum ReferenceRateTermUnit {

        DAYS("DAYS"),
        WEEK("WEEK"),
        MNTH("MNTH"),
        YEAR("YEAR");
        private final String value;
        private final static Map<String, Attributes.ReferenceRateTermUnit> CONSTANTS = new HashMap<String, Attributes.ReferenceRateTermUnit>();

        static {
            for (Attributes.ReferenceRateTermUnit c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ReferenceRateTermUnit(String value) {
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
        public static Attributes.ReferenceRateTermUnit fromValue(String value) {
            Attributes.ReferenceRateTermUnit constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
