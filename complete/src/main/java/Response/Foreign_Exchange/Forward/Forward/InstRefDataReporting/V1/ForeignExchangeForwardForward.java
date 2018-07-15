
package Response.Foreign_Exchange.Forward.Forward.InstRefDataReporting.V1;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Foreign_Exchange.Forward.Forward.InstRefDataReporting.V1
 * <p>
 * Record template for Foreign_Exchange.Forward.Forward
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TemplateVersion",
    "Header",
    "ISIN",
    "Derived",
    "Attributes"
})
public class ForeignExchangeForwardForward implements Serializable
{

    /**
     * Template Version
     * <p>
     * Template Version
     * (Required)
     * 
     */
    @JsonProperty("TemplateVersion")
    @JsonPropertyDescription("Template Version")
    @NotNull
    private Long templateVersion;
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
    @JsonProperty("ISIN")
    @Valid
    @NotNull
    private ISIN iSIN;
    /**
     * Derived
     * <p>
     * Derived Attributes
     * (Required)
     * 
     */
    @JsonProperty("Derived")
    @JsonPropertyDescription("Derived Attributes")
    @Valid
    @NotNull
    private Derived derived;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("Attributes")
    @Valid
    @NotNull
    private Attributes attributes;
    private final static long serialVersionUID = 5107344866569281517L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForeignExchangeForwardForward() {
    }

    /**
     * 
     * @param header
     * @param templateVersion
     * @param attributes
     * @param derived
     * @param iSIN
     */
    public ForeignExchangeForwardForward(Long templateVersion, Header header, ISIN iSIN, Derived derived, Attributes attributes) {
        super();
        this.templateVersion = templateVersion;
        this.header = header;
        this.iSIN = iSIN;
        this.derived = derived;
        this.attributes = attributes;
    }

    /**
     * Template Version
     * <p>
     * Template Version
     * (Required)
     * 
     */
    @JsonProperty("TemplateVersion")
    public Long getTemplateVersion() {
        return templateVersion;
    }

    /**
     * Template Version
     * <p>
     * Template Version
     * (Required)
     * 
     */
    @JsonProperty("TemplateVersion")
    public void setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
    }

    public ForeignExchangeForwardForward withTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
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

    public ForeignExchangeForwardForward withHeader(Header header) {
        this.header = header;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISIN")
    public ISIN getISIN() {
        return iSIN;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("ISIN")
    public void setISIN(ISIN iSIN) {
        this.iSIN = iSIN;
    }

    public ForeignExchangeForwardForward withISIN(ISIN iSIN) {
        this.iSIN = iSIN;
        return this;
    }

    /**
     * Derived
     * <p>
     * Derived Attributes
     * (Required)
     * 
     */
    @JsonProperty("Derived")
    public Derived getDerived() {
        return derived;
    }

    /**
     * Derived
     * <p>
     * Derived Attributes
     * (Required)
     * 
     */
    @JsonProperty("Derived")
    public void setDerived(Derived derived) {
        this.derived = derived;
    }

    public ForeignExchangeForwardForward withDerived(Derived derived) {
        this.derived = derived;
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

    public ForeignExchangeForwardForward withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("templateVersion", templateVersion).append("header", header).append("iSIN", iSIN).append("derived", derived).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(header).append(templateVersion).append(attributes).append(derived).append(iSIN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ForeignExchangeForwardForward) == false) {
            return false;
        }
        ForeignExchangeForwardForward rhs = ((ForeignExchangeForwardForward) other);
        return new EqualsBuilder().append(header, rhs.header).append(templateVersion, rhs.templateVersion).append(attributes, rhs.attributes).append(derived, rhs.derived).append(iSIN, rhs.iSIN).isEquals();
    }

}
