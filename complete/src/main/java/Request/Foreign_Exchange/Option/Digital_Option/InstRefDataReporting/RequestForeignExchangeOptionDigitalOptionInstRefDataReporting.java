
package Request.Foreign_Exchange.Option.Digital_Option.InstRefDataReporting;

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
 * Request.Foreign_Exchange.Option.Digital_Option.InstRefDataReporting
 * <p>
 * Request template for Foreign_Exchange Option Digital_Option
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Header",
    "Attributes"
})
public class RequestForeignExchangeOptionDigitalOptionInstRefDataReporting implements Serializable
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
    private final static long serialVersionUID = 926747549858984451L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestForeignExchangeOptionDigitalOptionInstRefDataReporting() {
    }

    /**
     * 
     * @param header
     * @param attributes
     */
    public RequestForeignExchangeOptionDigitalOptionInstRefDataReporting(Header header, Attributes attributes) {
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

    public RequestForeignExchangeOptionDigitalOptionInstRefDataReporting withHeader(Header header) {
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

    public RequestForeignExchangeOptionDigitalOptionInstRefDataReporting withAttributes(Attributes attributes) {
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
        if ((other instanceof RequestForeignExchangeOptionDigitalOptionInstRefDataReporting) == false) {
            return false;
        }
        RequestForeignExchangeOptionDigitalOptionInstRefDataReporting rhs = ((RequestForeignExchangeOptionDigitalOptionInstRefDataReporting) other);
        return new EqualsBuilder().append(header, rhs.header).append(attributes, rhs.attributes).isEquals();
    }

}
