
package Response.Rates.Swap.Fixed_Float.InstRefDataReporting.V1;

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
 * Derived
 * <p>
 * Derived Attributes
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FullName",
    "ClassificationType",
    "CommodityDerivativeIndicator",
    "UnderlyingAssetType",
    "SingleorMultiCurrency",
    "IssuerorOperatoroftheTradingVenueIdentifier",
    "ShortName",
    "ISOReferenceRate"
})
public class Derived implements Serializable
{

    /**
     * Full Name
     * <p>
     * Full name of the financial instrument
     * (Required)
     * 
     */
    @JsonProperty("FullName")
    @JsonPropertyDescription("Full name of the financial instrument")
    @NotNull
    private String fullName;
    /**
     * Classification Type
     * <p>
     * Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority
     * (Required)
     * 
     */
    @JsonProperty("ClassificationType")
    @JsonPropertyDescription("Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority")
    @NotNull
    private String classificationType;
    /**
     * Commodity Derivative Indicator
     * <p>
     * Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU
     * (Required)
     * 
     */
    @JsonProperty("CommodityDerivativeIndicator")
    @JsonPropertyDescription("Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU")
    @NotNull
    private String commodityDerivativeIndicator;
    /**
     * Underlying Asset Type
     * <p>
     * The type of the underlying asset as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("UnderlyingAssetType")
    @JsonPropertyDescription("The type of the underlying asset as defined by CFI code: ISO 10962 (2015)")
    @NotNull
    private Derived.UnderlyingAssetType underlyingAssetType;
    /**
     * Single or Multi Currency
     * <p>
     * Indicates whether the swap is single or multi-currency
     * (Required)
     * 
     */
    @JsonProperty("SingleorMultiCurrency")
    @JsonPropertyDescription("Indicates whether the swap is single or multi-currency")
    @NotNull
    private Derived.SingleorMultiCurrency singleorMultiCurrency;
    /**
     * Issuer or Operator of the Trading Venue Identifier
     * <p>
     * ISIN Issuer Long Name
     * (Required)
     * 
     */
    @JsonProperty("IssuerorOperatoroftheTradingVenueIdentifier")
    @JsonPropertyDescription("ISIN Issuer Long Name")
    @NotNull
    private String issuerorOperatoroftheTradingVenueIdentifier;
    /**
     * Short Name
     * <p>
     * Short name of financial instrument in accordance with ISO 18774
     * (Required)
     * 
     */
    @JsonProperty("ShortName")
    @JsonPropertyDescription("Short name of financial instrument in accordance with ISO 18774")
    @NotNull
    private String shortName;
    /**
     * ISO Reference Rate
     * <p>
     * First leg reference rate represented in ISO 20022 acceptable format
     * (Required)
     * 
     */
    @JsonProperty("ISOReferenceRate")
    @JsonPropertyDescription("First leg reference rate represented in ISO 20022 acceptable format")
    @NotNull
    private Derived.ISOReferenceRate iSOReferenceRate;
    private final static long serialVersionUID = -768379914300830005L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Derived() {
    }

    /**
     * 
     * @param underlyingAssetType
     * @param issuerorOperatoroftheTradingVenueIdentifier
     * @param iSOReferenceRate
     * @param fullName
     * @param classificationType
     * @param commodityDerivativeIndicator
     * @param shortName
     * @param singleorMultiCurrency
     */
    public Derived(String fullName, String classificationType, String commodityDerivativeIndicator, Derived.UnderlyingAssetType underlyingAssetType, Derived.SingleorMultiCurrency singleorMultiCurrency, String issuerorOperatoroftheTradingVenueIdentifier, String shortName, Derived.ISOReferenceRate iSOReferenceRate) {
        super();
        this.fullName = fullName;
        this.classificationType = classificationType;
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
        this.underlyingAssetType = underlyingAssetType;
        this.singleorMultiCurrency = singleorMultiCurrency;
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
        this.shortName = shortName;
        this.iSOReferenceRate = iSOReferenceRate;
    }

    /**
     * Full Name
     * <p>
     * Full name of the financial instrument
     * (Required)
     * 
     */
    @JsonProperty("FullName")
    public String getFullName() {
        return fullName;
    }

    /**
     * Full Name
     * <p>
     * Full name of the financial instrument
     * (Required)
     * 
     */
    @JsonProperty("FullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Derived withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Classification Type
     * <p>
     * Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority
     * (Required)
     * 
     */
    @JsonProperty("ClassificationType")
    public String getClassificationType() {
        return classificationType;
    }

    /**
     * Classification Type
     * <p>
     * Indicates the type of security using ISO 10962 standard, Classification of Financial Instruments (CFI code) values. ISO 10962 is maintained by ANNA (Association of National Numbering Agencies) acting as Registration Authority
     * (Required)
     * 
     */
    @JsonProperty("ClassificationType")
    public void setClassificationType(String classificationType) {
        this.classificationType = classificationType;
    }

    public Derived withClassificationType(String classificationType) {
        this.classificationType = classificationType;
        return this;
    }

    /**
     * Commodity Derivative Indicator
     * <p>
     * Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU
     * (Required)
     * 
     */
    @JsonProperty("CommodityDerivativeIndicator")
    public String getCommodityDerivativeIndicator() {
        return commodityDerivativeIndicator;
    }

    /**
     * Commodity Derivative Indicator
     * <p>
     * Indication as to whether the financial instrument falls within the definition of commodities derivative under Article 2(1)(30) of Regulation (EU) No 600/2014 or is a derivative relating to emission allowances referred to in Section C(4) of Annex I to Directive 2014/65/EU
     * (Required)
     * 
     */
    @JsonProperty("CommodityDerivativeIndicator")
    public void setCommodityDerivativeIndicator(String commodityDerivativeIndicator) {
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
    }

    public Derived withCommodityDerivativeIndicator(String commodityDerivativeIndicator) {
        this.commodityDerivativeIndicator = commodityDerivativeIndicator;
        return this;
    }

    /**
     * Underlying Asset Type
     * <p>
     * The type of the underlying asset as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("UnderlyingAssetType")
    public Derived.UnderlyingAssetType getUnderlyingAssetType() {
        return underlyingAssetType;
    }

    /**
     * Underlying Asset Type
     * <p>
     * The type of the underlying asset as defined by CFI code: ISO 10962 (2015)
     * (Required)
     * 
     */
    @JsonProperty("UnderlyingAssetType")
    public void setUnderlyingAssetType(Derived.UnderlyingAssetType underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
    }

    public Derived withUnderlyingAssetType(Derived.UnderlyingAssetType underlyingAssetType) {
        this.underlyingAssetType = underlyingAssetType;
        return this;
    }

    /**
     * Single or Multi Currency
     * <p>
     * Indicates whether the swap is single or multi-currency
     * (Required)
     * 
     */
    @JsonProperty("SingleorMultiCurrency")
    public Derived.SingleorMultiCurrency getSingleorMultiCurrency() {
        return singleorMultiCurrency;
    }

    /**
     * Single or Multi Currency
     * <p>
     * Indicates whether the swap is single or multi-currency
     * (Required)
     * 
     */
    @JsonProperty("SingleorMultiCurrency")
    public void setSingleorMultiCurrency(Derived.SingleorMultiCurrency singleorMultiCurrency) {
        this.singleorMultiCurrency = singleorMultiCurrency;
    }

    public Derived withSingleorMultiCurrency(Derived.SingleorMultiCurrency singleorMultiCurrency) {
        this.singleorMultiCurrency = singleorMultiCurrency;
        return this;
    }

    /**
     * Issuer or Operator of the Trading Venue Identifier
     * <p>
     * ISIN Issuer Long Name
     * (Required)
     * 
     */
    @JsonProperty("IssuerorOperatoroftheTradingVenueIdentifier")
    public String getIssuerorOperatoroftheTradingVenueIdentifier() {
        return issuerorOperatoroftheTradingVenueIdentifier;
    }

    /**
     * Issuer or Operator of the Trading Venue Identifier
     * <p>
     * ISIN Issuer Long Name
     * (Required)
     * 
     */
    @JsonProperty("IssuerorOperatoroftheTradingVenueIdentifier")
    public void setIssuerorOperatoroftheTradingVenueIdentifier(String issuerorOperatoroftheTradingVenueIdentifier) {
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
    }

    public Derived withIssuerorOperatoroftheTradingVenueIdentifier(String issuerorOperatoroftheTradingVenueIdentifier) {
        this.issuerorOperatoroftheTradingVenueIdentifier = issuerorOperatoroftheTradingVenueIdentifier;
        return this;
    }

    /**
     * Short Name
     * <p>
     * Short name of financial instrument in accordance with ISO 18774
     * (Required)
     * 
     */
    @JsonProperty("ShortName")
    public String getShortName() {
        return shortName;
    }

    /**
     * Short Name
     * <p>
     * Short name of financial instrument in accordance with ISO 18774
     * (Required)
     * 
     */
    @JsonProperty("ShortName")
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Derived withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * ISO Reference Rate
     * <p>
     * First leg reference rate represented in ISO 20022 acceptable format
     * (Required)
     * 
     */
    @JsonProperty("ISOReferenceRate")
    public Derived.ISOReferenceRate getISOReferenceRate() {
        return iSOReferenceRate;
    }

    /**
     * ISO Reference Rate
     * <p>
     * First leg reference rate represented in ISO 20022 acceptable format
     * (Required)
     * 
     */
    @JsonProperty("ISOReferenceRate")
    public void setISOReferenceRate(Derived.ISOReferenceRate iSOReferenceRate) {
        this.iSOReferenceRate = iSOReferenceRate;
    }

    public Derived withISOReferenceRate(Derived.ISOReferenceRate iSOReferenceRate) {
        this.iSOReferenceRate = iSOReferenceRate;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fullName", fullName).append("classificationType", classificationType).append("commodityDerivativeIndicator", commodityDerivativeIndicator).append("underlyingAssetType", underlyingAssetType).append("singleorMultiCurrency", singleorMultiCurrency).append("issuerorOperatoroftheTradingVenueIdentifier", issuerorOperatoroftheTradingVenueIdentifier).append("shortName", shortName).append("iSOReferenceRate", iSOReferenceRate).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(underlyingAssetType).append(issuerorOperatoroftheTradingVenueIdentifier).append(iSOReferenceRate).append(fullName).append(classificationType).append(commodityDerivativeIndicator).append(shortName).append(singleorMultiCurrency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Derived) == false) {
            return false;
        }
        Derived rhs = ((Derived) other);
        return new EqualsBuilder().append(underlyingAssetType, rhs.underlyingAssetType).append(issuerorOperatoroftheTradingVenueIdentifier, rhs.issuerorOperatoroftheTradingVenueIdentifier).append(iSOReferenceRate, rhs.iSOReferenceRate).append(fullName, rhs.fullName).append(classificationType, rhs.classificationType).append(commodityDerivativeIndicator, rhs.commodityDerivativeIndicator).append(shortName, rhs.shortName).append(singleorMultiCurrency, rhs.singleorMultiCurrency).isEquals();
    }

    public enum ISOReferenceRate {

        _7_REPO_COMPOUNDING_DATE("7-Repo Compounding Date"),
        AONIA_OIS_COMPOUND_SWAP_MA("AONIA-OIS-COMPOUND-SwapMa"),
        AONIA_OIS_COMPOUND("AONIA-OIS-COMPOUND"),
        ATHIBOR_ATHIBOR("ATHIBOR-ATHIBOR"),
        ATHIBOR_REFERENCE_BANKS("ATHIBOR-Reference Banks"),
        ATHIBOR_TELERATE("ATHIBOR-Telerate"),
        ATHIMID_REFERENCE_BANKS("ATHIMID-Reference Banks"),
        ATHIMID_REUTERS("ATHIMID-Reuters"),
        BA_H_15("BA-H.15"),
        BA_ISDD("BA-ISDD"),
        BA_REFERENCE_BANKS("BA-Reference Banks"),
        BA_REFERENCE_DEALERS("BA-Reference Dealers"),
        BA_REUTERS("BA-Reuters"),
        BA_TELERATE("BA-Telerate"),
        BBR_AUBBSW("BBR-AUBBSW"),
        BBR_BBSY_BID("BBR-BBSY (BID)"),
        BBR_BID("BBR-BID"),
        BBR_FRA("BBR-FRA"),
        BBR_ISDC("BBR-ISDC"),
        BBR_REFERENCE_BANKS("BBR-Reference Banks"),
        BBR_TELERATE("BBR-Telerate"),
        BBSF_BLOOMBERG_10_00("BBSF-Bloomberg-10:00"),
        BBSF_BLOOMBERG_15_00("BBSF-Bloomberg-15:00"),
        BBSW("BBSW"),
        BMK("BMK"),
        BOND_3222("Bond-3222"),
        BRIBOR_BLOOMBERG("BRIBOR-Bloomberg"),
        BRIBOR_BRBO("BRIBOR-BRBO"),
        BRIBOR_NBSK_07("BRIBOR-NBSK07"),
        BRIBOR_REFERENCE_BANKS("BRIBOR-Reference Banks"),
        BUBO("BUBO"),
        CD_3220("CD-3220"),
        CD_H_15("CD-H.15"),
        CD_KSDA_BLOOMBERG("CD-KSDA-Bloomberg"),
        CD_REFERENCE_DEALERS("CD-Reference Dealers"),
        CDI("CDI"),
        CDOR("CDOR"),
        CIBO("CIBO"),
        CITA_DKNA_14_COMPOUND("CITA-DKNA14-COMPOUND"),
        CL_CLICP_BLOOMBERG("CL-CLICP-Bloomberg"),
        CMS_REFERENCE_BANKS_ICAP("CMS-Reference Banks-ICAP"),
        CMS_REFERENCE_BANKS("CMS-Reference Banks"),
        CMS_REUTERS("CMS-Reuters"),
        CMS_TELERATE("CMS-Telerate"),
        CMT_T_7051("CMT-T7051"),
        CMT_T_7052("CMT-T7052"),
        CMT("CMT"),
        CNREPOFIX_CFXS_REUTERS("CNREPOFIX=CFXS-Reuters"),
        COF_11_FHLBSF("COF11-FHLBSF"),
        COF_11_REUTERS("COF11-Reuters"),
        COF_11_TELERATE("COF11-Telerate"),
        CORRA_OIS_COMPOUND("CORRA-OIS-COMPOUND"),
        CP_H_15("CP-H.15"),
        CP_REFERENCE_DEALERS("CP-Reference Dealers"),
        DEPOSIT_REFERENCE_BANKS("DEPOSIT-Reference Banks"),
        DEPOSIT_SAFEX("DEPOSIT-SAFEX"),
        DKKOIS_OIS_COMPOUND("DKKOIS-OIS-COMPOUND"),
        EBOR_REUTERS("EBOR-Reuters"),
        EONA("EONA"),
        EONS("EONS"),
        EURI("EURI"),
        FBIL_MIBOR_OIS_COMPOUND("FBIL-MIBOR-OIS-COMPOUND"),
        FEDERAL_FUNDS_H_15_BLOOMB("Federal Funds-H.15-Bloomb"),
        FEDERAL_FUNDS_H_15_OIS_CO("Federal Funds-H.15-OIS-CO"),
        FEDERAL_FUNDS_H_15("Federal Funds-H.15"),
        FEDERAL_FUNDS_REFERENCE_D("Federal Funds-Reference D"),
        FFCB_DISCO("FFCB-DISCO"),
        FUNDS_RATE_FRANCE_OIS_COM("FUNDS RATE-FRANCE-OIS-COM"),
        FUNDS_RATE_GERMANY_OIS_CO("FUNDS RATE-GERMANY-OIS-CO"),
        FUNDS_RATE_ITALY_OIS_COMP("FUNDS RATE-ITALY-OIS-COMP"),
        HIBOR_HIBOR_BLOOMBERG("HIBOR-HIBOR-Bloomberg"),
        HIBOR_HIBOR("HIBOR-HIBOR"),
        HIBOR_HKAB_BLOOMBERG("HIBOR-HKAB-Bloomberg"),
        HIBOR_HKAB("HIBOR-HKAB"),
        HIBOR_ISDC("HIBOR-ISDC"),
        HIBOR_REFERENCE_BANKS("HIBOR-Reference Banks"),
        HIBOR_TMA("HIBOR-TMA"),
        HONIX_OIS_COMPOUND("HONIX-OIS-COMPOUND"),
        IBR_OIS_COMPOUND("IBR-OIS-COMPOUND"),
        IDMA_BLOOMBERG("IDMA-Bloomberg"),
        IDRFIX("IDRFIX"),
        INBMK_REUTERS("INBMK-REUTERS"),
        ISDA("ISDA"),
        JIBA("JIBA"),
        JIBOR_REUTERS("JIBOR-Reuters"),
        KLIBOR_BNM("KLIBOR-BNM"),
        KLIBOR_REFERENCE_BANKS("KLIBOR-Reference Banks"),
        LIBO("LIBO"),
        LTPR_MHCB("LTPR-MHCB"),
        LTPR_TBC("LTPR-TBC"),
        MAAA("MAAA"),
        MIBOR_OIS_COMPOUND("MIBOR-OIS-COMPOUND"),
        MIFOR("MIFOR"),
        MIOIS("MIOIS"),
        MITOR_OIS_COMPOUND("MITOR-OIS-COMPOUND"),
        MOSP("MOSP"),
        MUTANCALL_TONAR("MUTANCALL-TONAR"),
        NIBO("NIBO"),
        NZIONA_OIS_COMPOUND("NZIONA-OIS-COMPOUND"),
        OIS_11_00_BGCANTOR("OIS-11:00-BGCANTOR"),
        OIS_11_00_ICAP("OIS-11:00-ICAP"),
        OIS_11_00_LON_ICAP("OIS-11:00-LON-ICAP"),
        OIS_11_00_NY_ICAP("OIS-11:00-NY-ICAP"),
        OIS_11_00_TRADITION("OIS-11:00-TRADITION"),
        OIS_3_00_BGCANTOR("OIS-3:00-BGCANTOR"),
        OIS_3_00_NY_ICAP("OIS-3:00-NY-ICAP"),
        OIS_3_00_TRADITION("OIS-3:00-TRADITION"),
        OIS_4_00_TRADITION("OIS-4:00-TRADITION"),
        OVERNIGHT_BANK_FUNDING_RA("Overnight Bank Funding Ra"),
        PBOCB_REUTERS("PBOCB-Reuters"),
        PHIREF_BAP("PHIREF-BAP"),
        PHIREF_BLOOMBERG("PHIREF-Bloomberg"),
        PHIREF_REFERENCE_BANKS("PHIREF-Reference Banks"),
        POLONIA_OIS_COMPOUND("POLONIA-OIS-COMPOUND"),
        PRBO("PRBO"),
        PRIME_AVERAGE_REFERENCE_B("PRIME-AVERAGE-Reference B"),
        PRIME_AVERAGE("PRIME-AVERAGE"),
        PRIME_H_15("Prime-H.15"),
        PRIME_REFERENCE_BANKS("Prime-Reference Banks"),
        QUOTING_BANKS_LIBOR("Quoting Banks-LIBOR"),
        RBOR_REUTERS("RBOR-Reuters"),
        REFERENCE_BANKS("Reference Banks"),
        REFERENCE_DEALERS("Reference Dealers"),
        REIBOR_REFERENCE_BANKS("REIBOR-Reference Banks"),
        REIBOR_REUTERS("REIBOR-Reuters"),
        REPO_CORRA("REPO-CORRA"),
        REUTERS_6165("Reuters-6165"),
        RUONIA_OIS_COMPOUND("RUONIA-OIS-COMPOUND"),
        S_P_INDEX_HIGH_GRADE("S&P Index-High Grade"),
        SARON_OIS_COMPOUND("SARON-OIS-COMPOUND"),
        SBI_REUTERS("SBI-Reuters"),
        SHIBOR_OIS_COMPOUNDING("Shibor-OIS-Compounding"),
        SHIBOR_REUTERS("SHIBOR-Reuters"),
        SIBOR_REFERENCE_BANKS("SIBOR-Reference Banks"),
        SIBOR_REUTERS("SIBOR-Reuters"),
        SIBOR_SIBO("SIBOR-SIBO"),
        SIBOR_TELERATE("SIBOR-Telerate"),
        SIOR_OIS_COMPOUND("SIOR-OIS-COMPOUND"),
        SONAR_OIS_COMPOUND("SONAR-OIS-COMPOUND"),
        SONAR_OIS_VWAP_COMPOUND("SONAR-OIS-VWAP-COMPOUND"),
        SONIA_OIS_11_00_ICAP("SONIA-OIS-11:00-ICAP"),
        SONIA_OIS_11_00_TRADITION("SONIA-OIS-11:00-TRADITION"),
        SONIA_OIS_4_15_TRADITION("SONIA-OIS-4:15-TRADITION"),
        SOR_REFERENCE_BANKS("SOR-Reference Banks"),
        SOR_REUTERS("SOR-Reuters"),
        SOR_TELERATE("SOR-Telerate"),
        SOR_VWAP_REFERENCE_BANKS("SOR-VWAP-Reference Banks"),
        SOR_VWAP("SOR-VWAP"),
        SRIOR_REFERENCE_BANKS("SRIOR-Reference Banks"),
        SRIOR_SUAA("SRIOR-SUAA"),
        STBO("STBO"),
        STPR_QUOTING_BANKS("STPR-Quoting Banks"),
        SWAP("SWAP"),
        TAIBIR_01("TAIBIR01"),
        TAIBIR_02("TAIBIR02"),
        TAIBOR_BLOOMBERG("TAIBOR-Bloomberg"),
        TAIBOR_REUTERS("TAIBOR-Reuters"),
        TAM_CDC("TAM-CDC"),
        TBILL_H_15_BLOOMBERG("TBILL-H.15-Bloomberg"),
        TBILL_H_15("TBILL-H.15"),
        TBILL_ISDD("TBILL-ISDD"),
        TBILL_REFERENCE_BANKS("TBILL-Reference Banks"),
        TBILL_REUTERS("TBILL-Reuters"),
        TBILL_SECONDARY_MARKET("TBILL-Secondary Market"),
        TBILL_TELERATE("TBILL-Telerate"),
        TEC_10_CNO_SWAP_MARKER("TEC10-CNO-SwapMarker"),
        TEC_10_CNO("TEC10-CNO"),
        TEC_10_REFERENCE_BANKS("TEC10-Reference Banks"),
        TEC_5_CNO_SWAP_MARKER("TEC5-CNO-SwapMarker"),
        TEC_5_CNO("TEC5-CNO"),
        TEC_5_REFERENCE_BANKS("TEC5-Reference Banks"),
        TELERATE_6165("Telerate-6165"),
        THBFIX_REFERENCE_BANKS("THBFIX-Reference Banks"),
        THBFIX_REUTERS("THBFIX-Reuters"),
        TIBO("TIBO"),
        TIIE_BANXICO_BLOOMBERG("TIIE-Banxico-Bloomberg"),
        TIIE_BANXICO_REFERENCE_BA("TIIE-Banxico-Reference Ba"),
        TIIE_BANXICO("TIIE-Banxico"),
        TLBO("TLBO"),
        TMM_CDC_COMPOUND("TMM-CDC-COMPOUND"),
        TOIS_OIS_COMPOUND("TOIS-OIS-COMPOUND"),
        TONA_OIS_COMPOUND("TONA-OIS-COMPOUND"),
        TREA("TREA"),
        TRYIBOR_REFERENCE_BANKS("TRYIBOR-Reference Banks"),
        TRYIBOR_REUTERS("TRYIBOR-Reuters"),
        TSR_REFERENCE_BANKS("TSR-Reference Banks"),
        TSR_REUTERS_10_00("TSR-Reuters-10:00"),
        TSR_REUTERS_15_00("TSR-Reuters-15:00"),
        TSR_TELERATE_10_00("TSR-Telerate-10:00"),
        TSR_TELERATE_15_00("TSR-Telerate-15:00"),
        TWCPBA("TWCPBA"),
        WIBO("WIBO"),
        WMBA_RONIA_COMPOUND("WMBA-RONIA-COMPOUND"),
        WMBA_SONIA_COMPOUND("WMBA-SONIA-COMPOUND");
        private final String value;
        private final static Map<String, Derived.ISOReferenceRate> CONSTANTS = new HashMap<String, Derived.ISOReferenceRate>();

        static {
            for (Derived.ISOReferenceRate c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ISOReferenceRate(String value) {
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
        public static Derived.ISOReferenceRate fromValue(String value) {
            Derived.ISOReferenceRate constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum SingleorMultiCurrency {

        SINGLE_CURRENCY("Single Currency"),
        CROSS_CURRENCY("Cross Currency");
        private final String value;
        private final static Map<String, Derived.SingleorMultiCurrency> CONSTANTS = new HashMap<String, Derived.SingleorMultiCurrency>();

        static {
            for (Derived.SingleorMultiCurrency c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private SingleorMultiCurrency(String value) {
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
        public static Derived.SingleorMultiCurrency fromValue(String value) {
            Derived.SingleorMultiCurrency constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    public enum UnderlyingAssetType {

        BASIS_SWAP_FLOAT_FLOAT("Basis Swap (Float - Float)"),
        FIXED_FLOATING("Fixed - Floating"),
        FIXED_FIXED("Fixed - Fixed"),
        INFLATION_RATE_INDEX("Inflation Rate Index"),
        OVERNIGHT_INDEX_SWAP_OIS("Overnight Index Swap (OIS)"),
        ZERO_COUPON("Zero Coupon"),
        OTHER("Other");
        private final String value;
        private final static Map<String, Derived.UnderlyingAssetType> CONSTANTS = new HashMap<String, Derived.UnderlyingAssetType>();

        static {
            for (Derived.UnderlyingAssetType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private UnderlyingAssetType(String value) {
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
        public static Derived.UnderlyingAssetType fromValue(String value) {
            Derived.UnderlyingAssetType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
