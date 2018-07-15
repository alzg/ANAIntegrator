
package Response.Foreign_Exchange.Forward.Forward.InstRefDataReporting.V1;

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


/**
 * Header
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssetClass",
    "InstrumentType",
    "UseCase",
    "Level"
})
public class Header implements Serializable
{

    /**
     * Asset Class
     * <p>
     * As defined by CFI code: ISO 10962 (2015); Character #2
     * (Required)
     * 
     */
    @JsonProperty("AssetClass")
    @JsonPropertyDescription("As defined by CFI code: ISO 10962 (2015); Character #2")
    @NotNull
    private Header.AssetClass assetClass;
    /**
     * Instrument Type
     * <p>
     * As defined by CFI code: ISO 10962 (2015); Character #1
     * (Required)
     * 
     */
    @JsonProperty("InstrumentType")
    @JsonPropertyDescription("As defined by CFI code: ISO 10962 (2015); Character #1")
    @NotNull
    private Header.InstrumentType instrumentType;
    /**
     * Product
     * <p>
     * Unique label that defines the product
     * (Required)
     * 
     */
    @JsonProperty("UseCase")
    @JsonPropertyDescription("Unique label that defines the product")
    @NotNull
    private Header.UseCase useCase;
    /**
     * Level
     * <p>
     * Label assigned to the ISIN to describe its level in the hierarchy
     * (Required)
     * 
     */
    @JsonProperty("Level")
    @JsonPropertyDescription("Label assigned to the ISIN to describe its level in the hierarchy")
    @NotNull
    private Header.Level level;
    private final static long serialVersionUID = -49758305886422534L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Header() {
    }

    /**
     * 
     * @param instrumentType
     * @param useCase
     * @param level
     * @param assetClass
     */
    public Header(Header.AssetClass assetClass, Header.InstrumentType instrumentType, Header.UseCase useCase, Header.Level level) {
        super();
        this.assetClass = assetClass;
        this.instrumentType = instrumentType;
        this.useCase = useCase;
        this.level = level;
    }

    /**
     * Asset Class
     * <p>
     * As defined by CFI code: ISO 10962 (2015); Character #2
     * (Required)
     * 
     */
    @JsonProperty("AssetClass")
    public Header.AssetClass getAssetClass() {
        return assetClass;
    }

    /**
     * Asset Class
     * <p>
     * As defined by CFI code: ISO 10962 (2015); Character #2
     * (Required)
     * 
     */
    @JsonProperty("AssetClass")
    public void setAssetClass(Header.AssetClass assetClass) {
        this.assetClass = assetClass;
    }

    public Header withAssetClass(Header.AssetClass assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    /**
     * Instrument Type
     * <p>
     * As defined by CFI code: ISO 10962 (2015); Character #1
     * (Required)
     * 
     */
    @JsonProperty("InstrumentType")
    public Header.InstrumentType getInstrumentType() {
        return instrumentType;
    }

    /**
     * Instrument Type
     * <p>
     * As defined by CFI code: ISO 10962 (2015); Character #1
     * (Required)
     * 
     */
    @JsonProperty("InstrumentType")
    public void setInstrumentType(Header.InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public Header withInstrumentType(Header.InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    /**
     * Product
     * <p>
     * Unique label that defines the product
     * (Required)
     * 
     */
    @JsonProperty("UseCase")
    public Header.UseCase getUseCase() {
        return useCase;
    }

    /**
     * Product
     * <p>
     * Unique label that defines the product
     * (Required)
     * 
     */
    @JsonProperty("UseCase")
    public void setUseCase(Header.UseCase useCase) {
        this.useCase = useCase;
    }

    public Header withUseCase(Header.UseCase useCase) {
        this.useCase = useCase;
        return this;
    }

    /**
     * Level
     * <p>
     * Label assigned to the ISIN to describe its level in the hierarchy
     * (Required)
     * 
     */
    @JsonProperty("Level")
    public Header.Level getLevel() {
        return level;
    }

    /**
     * Level
     * <p>
     * Label assigned to the ISIN to describe its level in the hierarchy
     * (Required)
     * 
     */
    @JsonProperty("Level")
    public void setLevel(Header.Level level) {
        this.level = level;
    }

    public Header withLevel(Header.Level level) {
        this.level = level;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("assetClass", assetClass).append("instrumentType", instrumentType).append("useCase", useCase).append("level", level).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instrumentType).append(useCase).append(assetClass).append(level).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Header) == false) {
            return false;
        }
        Header rhs = ((Header) other);
        return new EqualsBuilder().append(instrumentType, rhs.instrumentType).append(useCase, rhs.useCase).append(assetClass, rhs.assetClass).append(level, rhs.level).isEquals();
    }

    public enum AssetClass {

        FOREIGN_EXCHANGE("Foreign_Exchange");
        private final String value;
        private final static Map<String, Header.AssetClass> CONSTANTS = new HashMap<String, Header.AssetClass>();

        static {
            for (Header.AssetClass c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private AssetClass(String value) {
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
        public static Header.AssetClass fromValue(String value) {
            Header.AssetClass constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum InstrumentType {

        FORWARD("Forward");
        private final String value;
        private final static Map<String, Header.InstrumentType> CONSTANTS = new HashMap<String, Header.InstrumentType>();

        static {
            for (Header.InstrumentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private InstrumentType(String value) {
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
        public static Header.InstrumentType fromValue(String value) {
            Header.InstrumentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum Level {

        INST_REF_DATA_REPORTING("InstRefDataReporting");
        private final String value;
        private final static Map<String, Header.Level> CONSTANTS = new HashMap<String, Header.Level>();

        static {
            for (Header.Level c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Level(String value) {
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
        public static Header.Level fromValue(String value) {
            Header.Level constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum UseCase {

        FORWARD("Forward");
        private final String value;
        private final static Map<String, Header.UseCase> CONSTANTS = new HashMap<String, Header.UseCase>();

        static {
            for (Header.UseCase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private UseCase(String value) {
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
        public static Header.UseCase fromValue(String value) {
            Header.UseCase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
