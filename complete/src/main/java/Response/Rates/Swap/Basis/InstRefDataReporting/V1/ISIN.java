
package Response.Rates.Swap.Basis.InstRefDataReporting.V1;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ISIN",
    "Status",
    "StatusReason",
    "LastUpdateDateTime",
    "Parent"
})
public class ISIN implements Serializable
{

    /**
     * Identification
     * <p>
     * International Securities Identification Number (ISO 6166)
     * (Required)
     * 
     */
    @JsonProperty("ISIN")
    @JsonPropertyDescription("International Securities Identification Number (ISO 6166)")
    @NotNull
    private String iSIN;
    /**
     * Status
     * <p>
     * Status of the ISIN
     * (Required)
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("Status of the ISIN")
    @NotNull
    private ISIN.Status status;
    /**
     * Status Reason
     * <p>
     * The reason for ISIN Status change
     * 
     */
    @JsonProperty("StatusReason")
    @JsonPropertyDescription("The reason for ISIN Status change")
    private String statusReason = "";
    /**
     * Last Update DateTime
     * <p>
     * Last Update DateTime
     * 
     */
    @JsonProperty("LastUpdateDateTime")
    @JsonPropertyDescription("Last Update DateTime")
    private String lastUpdateDateTime;
    /**
     * Parent
     * <p>
     * ISIN of the parent level
     * 
     */
    @JsonProperty("Parent")
    @JsonPropertyDescription("ISIN of the parent level")
    private String parent;
    private final static long serialVersionUID = -3938906180889158240L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ISIN() {
    }

    /**
     * 
     * @param lastUpdateDateTime
     * @param parent
     * @param statusReason
     * @param iSIN
     * @param status
     */
    public ISIN(String iSIN, ISIN.Status status, String statusReason, String lastUpdateDateTime, String parent) {
        super();
        this.iSIN = iSIN;
        this.status = status;
        this.statusReason = statusReason;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.parent = parent;
    }

    /**
     * Identification
     * <p>
     * International Securities Identification Number (ISO 6166)
     * (Required)
     * 
     */
    @JsonProperty("ISIN")
    public String getISIN() {
        return iSIN;
    }

    /**
     * Identification
     * <p>
     * International Securities Identification Number (ISO 6166)
     * (Required)
     * 
     */
    @JsonProperty("ISIN")
    public void setISIN(String iSIN) {
        this.iSIN = iSIN;
    }

    public ISIN withISIN(String iSIN) {
        this.iSIN = iSIN;
        return this;
    }

    /**
     * Status
     * <p>
     * Status of the ISIN
     * (Required)
     * 
     */
    @JsonProperty("Status")
    public ISIN.Status getStatus() {
        return status;
    }

    /**
     * Status
     * <p>
     * Status of the ISIN
     * (Required)
     * 
     */
    @JsonProperty("Status")
    public void setStatus(ISIN.Status status) {
        this.status = status;
    }

    public ISIN withStatus(ISIN.Status status) {
        this.status = status;
        return this;
    }

    /**
     * Status Reason
     * <p>
     * The reason for ISIN Status change
     * 
     */
    @JsonProperty("StatusReason")
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Status Reason
     * <p>
     * The reason for ISIN Status change
     * 
     */
    @JsonProperty("StatusReason")
    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public ISIN withStatusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /**
     * Last Update DateTime
     * <p>
     * Last Update DateTime
     * 
     */
    @JsonProperty("LastUpdateDateTime")
    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * Last Update DateTime
     * <p>
     * Last Update DateTime
     * 
     */
    @JsonProperty("LastUpdateDateTime")
    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public ISIN withLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
        return this;
    }

    /**
     * Parent
     * <p>
     * ISIN of the parent level
     * 
     */
    @JsonProperty("Parent")
    public String getParent() {
        return parent;
    }

    /**
     * Parent
     * <p>
     * ISIN of the parent level
     * 
     */
    @JsonProperty("Parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public ISIN withParent(String parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iSIN", iSIN).append("status", status).append("statusReason", statusReason).append("lastUpdateDateTime", lastUpdateDateTime).append("parent", parent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lastUpdateDateTime).append(parent).append(statusReason).append(iSIN).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ISIN) == false) {
            return false;
        }
        ISIN rhs = ((ISIN) other);
        return new EqualsBuilder().append(lastUpdateDateTime, rhs.lastUpdateDateTime).append(parent, rhs.parent).append(statusReason, rhs.statusReason).append(iSIN, rhs.iSIN).append(status, rhs.status).isEquals();
    }

    public enum Status {

        NEW("New"),
        UPDATED("Updated"),
        EXPIRED("Expired"),
        DELETED("Deleted");
        private final String value;
        private final static Map<String, ISIN.Status> CONSTANTS = new HashMap<String, ISIN.Status>();

        static {
            for (ISIN.Status c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Status(String value) {
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
        public static ISIN.Status fromValue(String value) {
            ISIN.Status constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
