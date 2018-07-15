
package Response.Rates.Forward.FRA_Index.InstRefDataReporting.V1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * Response
 * <p>
 * Response template
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "record",
        "requestContext",
        "responseCode"
})
public class Response implements Serializable
{

    /**
     * Record
     * <p>
     * Record
     *
     */
    @JsonProperty("record")
    @JsonPropertyDescription("Record")
    private String record;
    /**
     * RequestContext
     * <p>
     * RequestContext
     *
     */
    @JsonProperty("requestContext")
    @JsonPropertyDescription("RequestContext")
    private String requestContext;
    /**
     * ResponseCode
     * <p>
     * ResponseCode
     *
     */
    @JsonProperty("responseCode")
    @JsonPropertyDescription("ResponseCode")
    private String responseCode;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2702087077142061573L;

    /**
     * No args constructor for use in serialization
     *
     */
    public Response() {
    }

    /**
     *
     * @param requestContext
     * @param record
     * @param responseCode
     */
    public Response(String record, String requestContext, String responseCode) {
        super();
        this.record = record;
        this.requestContext = requestContext;
        this.responseCode = responseCode;
    }

    /**
     * Record
     * <p>
     * Record
     *
     */
    @JsonProperty("record")
    public String getRecord() {
        return record;
    }

    /**
     * Record
     * <p>
     * Record
     *
     */
    @JsonProperty("record")
    public void setRecord(String record) {
        this.record = record;
    }

    public Response withRecord(String record) {
        this.record = record;
        return this;
    }

    /**
     * RequestContext
     * <p>
     * RequestContext
     *
     */
    @JsonProperty("requestContext")
    public String getRequestContext() {
        return requestContext;
    }

    /**
     * RequestContext
     * <p>
     * RequestContext
     *
     */
    @JsonProperty("requestContext")
    public void setRequestContext(String requestContext) {
        this.requestContext = requestContext;
    }

    public Response withRequestContext(String requestContext) {
        this.requestContext = requestContext;
        return this;
    }

    /**
     * ResponseCode
     * <p>
     * ResponseCode
     *
     */
    @JsonProperty("responseCode")
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * ResponseCode
     * <p>
     * ResponseCode
     *
     */
    @JsonProperty("responseCode")
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public Response withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("record", record).append("requestContext", requestContext).append("responseCode", responseCode).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(requestContext).append(record).append(responseCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(requestContext, rhs.requestContext).append(record, rhs.record).append(responseCode, rhs.responseCode).isEquals();
    }

}
