package faktury.faktury;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
@AllArgsConstructor
@Data
public class Invoice {

    private Integer NumericSequenceId;
    private String AttachmentFileName;
    private BigDecimal TotalDiscountAmount;
    private BigDecimal TotalWithoutDiscount;
    private BigDecimal BaseTaxBasicRate;
    private BigDecimal BaseTaxBasicRateHc;
    private BigDecimal BaseTaxReducedRate1;
    private BigDecimal BaseTaxReducedRate1Hc;
    private BigDecimal BaseTaxReducedRate2;
    private BigDecimal BaseTaxReducedRate2Hc;
    private BigDecimal BaseTaxZeroRate;
    private BigDecimal BaseTaxZeroRateHc;
    private Integer ConstantSymbolId;
    private Integer CurrencyId;
    private String DateLastChange;
    private String DateOfAccountingEvent;
    private String DateOfIssue;
    private String DateOfLastReminder;
    private String DateOfMaturity;
    private String DateOfPayment;
    private String DateOfTaxing;
    private String DateOfVatApplication;
    private String Description;
    private BigDecimal Discount;
    private Integer DocumentNumber;
    private Integer DocumentSerialNumber;
    private Integer EetResponsibility;
    private BigDecimal ExchangeRate;
    private BigDecimal ExchangeRateAmount;
    private Integer Exported;
    private Boolean HasVatRegimeOss;
    private Boolean IsEet;
    private Boolean IsSentToAccountant;
    private Boolean IsSentToPurchaser;
    private String ItemsTextPrefix;
    private String ItemsTextSuffix;
    private String LanguageCode;
    private Integer LanguageId;
    private Integer Maturity;
    private Integer MyCompanyDocumentAdrressId;
    private String Note;
    private String OrderNumber;
    private Integer PaymentOptionId;
    private Integer PaymentStatus;
    private Integer PurchaserDocumentAddressId;
    private Integer PurchaserId;
    private Integer RemindersCount;
    private String ReportColorValue;
    private Integer ReportId;
    private BigDecimal RoundingDifference;
    private BigDecimal TaxBasicRate;
    private BigDecimal TaxBasicRateHc;
    private BigDecimal TaxReducedRate1;
    private BigDecimal TaxReducedRate1Hc;
    private BigDecimal TaxReducedRate2;
    private BigDecimal TaxReducedRate2Hc;
    private BigDecimal TotalBasicRate;
    private BigDecimal TotalBasicRateHc;
    private BigDecimal TotalReducedRate1;
    private BigDecimal TotalReducedRate1Hc;
    private BigDecimal TotalReducedRate2;
    private BigDecimal TotalReducedRate2Hc;
    private BigDecimal TotalVat;
    private BigDecimal TotalVatHc;
    private BigDecimal TotalWithoutVat;
    private BigDecimal TotalWithoutVatHc;
    private BigDecimal TotalWithVat;
    private BigDecimal TotalWithVatHc;
    private String VariableSymbol;
    private Integer VatOnPayStatus;
    private BigDecimal VatRateBasic;
    private BigDecimal VatRateReduced1;
    private BigDecimal VatRateReduced2;
    private Boolean IsIncomeTax;
    private Integer RecountVersion;
    private Integer Id;

}

