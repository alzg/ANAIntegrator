
package Request.Rates.Swap.Cross_Currency_Fixed_Float.InstRefDataReporting;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Request.Rates.Swap.Cross_Currency_Fixed_Float.InstRefDataReporting
 * <p>
 * Request template for Rates Swap Cross_Currency_Fixed_Float
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Header",
    "Attributes"
})
public class RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting implements Serializable
{

    /**
     * Header
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Header")
    @Valid
    @NotNull
    private Header header;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Attributes")
    @Valid
    @NotNull
    private Attributes attributes;
    private final static long serialVersionUID = -6879512271612325070L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting() {
    }

    /**
     * 
     * @param header
     * @param attributes
     */
    public RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting(Header header, Attributes attributes) {
        super();
        this.header = header;
        this.attributes = attributes;
    }

    /**
     * Header
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Header")
    public Header getHeader() {
        return header;
    }

    /**
     * Header
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("Header")
    public void setHeader(Header header) {
        this.header = header;
    }

    public RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting withHeader(Header header) {
        this.header = header;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("header", header).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(header).append(attributes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting) == false) {
            return false;
        }
        RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting rhs = ((RequestRatesSwapCrossCurrencyFixedFloatInstRefDataReporting) other);
        return new EqualsBuilder().append(header, rhs.header).append(attributes, rhs.attributes).isEquals();
    }

}
