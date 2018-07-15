
package Request.Foreign_Exchange.Swap.FX_Swap.InstRefDataReporting;

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
    "InstrumentISINNearLeg",
    "InstrumentISINFarLeg",
    "DeliveryType",
    "PriceMultiplier"
})
public class Attributes implements Serializable
{

    /**
     * Instrument ISIN - Near Leg
     * <p>
     * ISIN code of the underlying instrument - Near Leg
     * (Required)
     * 
     */
    @JsonProperty("InstrumentISINNearLeg")
    @JsonPropertyDescription("ISIN code of the underlying instrument - Near Leg")
    @Pattern(regexp = "^[A-Z]{2}[A-Z0-9]{9}[0-9]$")
    @NotNull
    private String instrumentISINNearLeg;
    /**
     * Instrument ISIN - Far leg
     * <p>
     * ISIN code of the underlying instrument - Far Leg
     * (Required)
     * 
     */
    @JsonProperty("InstrumentISINFarLeg")
    @JsonPropertyDescription("ISIN code of the underlying instrument - Far Leg")
    @Pattern(regexp = "^[A-Z]{2}[A-Z0-9]{9}[0-9]$")
    @NotNull
    private String instrumentISINFarLeg;
    /**
     * Delivery Type
     * <p>
     * The Delivery Type as defined by CFI code: ISO 10962 (2015)
     * 
     */
    @JsonProperty("DeliveryType")
    @JsonPropertyDescription("The Delivery Type as defined by CFI code: ISO 10962 (2015)")
    private Attributes.DeliveryType deliveryType = Attributes.DeliveryType.fromValue("PHYS");
    /**
     * Price Multiplier
     * <p>
     * Number of units of the underlying instrument represented by a single derivative contract. Number of units of the underlying instrument represented by a single derivative contract. For an option on an index, the amount per index point. For spreadbets the movement in the price of the underlying instrument on which the spreadbet is based
     * 
     */
    @JsonProperty("PriceMultiplier")
    @JsonPropertyDescription("Number of units of the underlying instrument represented by a single derivative contract. Number of units of the underlying instrument represented by a single derivative contract. For an option on an index, the amount per index point. For spreadbets the movement in the price of the underlying instrument on which the spreadbet is based")
    @DecimalMin("0")
    private Double priceMultiplier = 1.0D;
    private final static long serialVersionUID = 5241809613210508174L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param instrumentISINNearLeg
     * @param deliveryType
     * @param instrumentISINFarLeg
     * @param priceMultiplier
     */
    public Attributes(String instrumentISINNearLeg, String instrumentISINFarLeg, Attributes.DeliveryType deliveryType, Double priceMultiplier) {
        super();
        this.instrumentISINNearLeg = instrumentISINNearLeg;
        this.instrumentISINFarLeg = instrumentISINFarLeg;
        this.deliveryType = deliveryType;
        this.priceMultiplier = priceMultiplier;
    }

    /**
     * Instrument ISIN - Near Leg
     * <p>
     * ISIN code of the underlying instrument - Near Leg
     * (Required)
     * 
     */
    @JsonProperty("InstrumentISINNearLeg")
    public String getInstrumentISINNearLeg() {
        return instrumentISINNearLeg;
    }

    /**
     * Instrument ISIN - Near Leg
     * <p>
     * ISIN code of the underlying instrument - Near Leg
     * (Required)
     * 
     */
    @JsonProperty("InstrumentISINNearLeg")
    public void setInstrumentISINNearLeg(String instrumentISINNearLeg) {
        this.instrumentISINNearLeg = instrumentISINNearLeg;
    }

    public Attributes withInstrumentISINNearLeg(String instrumentISINNearLeg) {
        this.instrumentISINNearLeg = instrumentISINNearLeg;
        return this;
    }

    /**
     * Instrument ISIN - Far leg
     * <p>
     * ISIN code of the underlying instrument - Far Leg
     * (Required)
     * 
     */
    @JsonProperty("InstrumentISINFarLeg")
    public String getInstrumentISINFarLeg() {
        return instrumentISINFarLeg;
    }

    /**
     * Instrument ISIN - Far leg
     * <p>
     * ISIN code of the underlying instrument - Far Leg
     * (Required)
     * 
     */
    @JsonProperty("InstrumentISINFarLeg")
    public void setInstrumentISINFarLeg(String instrumentISINFarLeg) {
        this.instrumentISINFarLeg = instrumentISINFarLeg;
    }

    public Attributes withInstrumentISINFarLeg(String instrumentISINFarLeg) {
        this.instrumentISINFarLeg = instrumentISINFarLeg;
        return this;
    }

    /**
     * Delivery Type
     * <p>
     * The Delivery Type as defined by CFI code: ISO 10962 (2015)
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
        return new ToStringBuilder(this).append("instrumentISINNearLeg", instrumentISINNearLeg).append("instrumentISINFarLeg", instrumentISINFarLeg).append("deliveryType", deliveryType).append("priceMultiplier", priceMultiplier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deliveryType).append(instrumentISINFarLeg).append(instrumentISINNearLeg).append(priceMultiplier).toHashCode();
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
        return new EqualsBuilder().append(deliveryType, rhs.deliveryType).append(instrumentISINFarLeg, rhs.instrumentISINFarLeg).append(instrumentISINNearLeg, rhs.instrumentISINNearLeg).append(priceMultiplier, rhs.priceMultiplier).isEquals();
    }

    public enum DeliveryType {

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

}
