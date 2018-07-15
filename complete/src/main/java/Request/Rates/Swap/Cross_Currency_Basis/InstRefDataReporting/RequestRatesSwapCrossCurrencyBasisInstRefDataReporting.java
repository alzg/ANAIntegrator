
package Request.Rates.Swap.Cross_Currency_Basis.InstRefDataReporting;

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
 * Request.Rates.Swap.Cross_Currency_Basis.InstRefDataReporting
 * <p>
 * Request template for Rates Swap Cross_Currency_Basis
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Header",
    "Attributes"
})
public class RequestRatesSwapCrossCurrencyBasisInstRefDataReporting implements Serializable
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
    private final static long serialVersionUID = -5829719039020421077L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestRatesSwapCrossCurrencyBasisInstRefDataReporting() {
    }

    /**
     * 
     * @param header
     * @param attributes
     */
    public RequestRatesSwapCrossCurrencyBasisInstRefDataReporting(Header header, Attributes attributes) {
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

    public RequestRatesSwapCrossCurrencyBasisInstRefDataReporting withHeader(Header header) {
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

    public RequestRatesSwapCrossCurrencyBasisInstRefDataReporting withAttributes(Attributes attributes) {
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
        if ((other instanceof RequestRatesSwapCrossCurrencyBasisInstRefDataReporting) == false) {
            return false;
        }
        RequestRatesSwapCrossCurrencyBasisInstRefDataReporting rhs = ((RequestRatesSwapCrossCurrencyBasisInstRefDataReporting) other);
        return new EqualsBuilder().append(header, rhs.header).append(attributes, rhs.attributes).isEquals();
    }

}
