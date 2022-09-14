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
public class IssuedInvoiceItems {

    private Integer InvoiceId;
    private BigDecimal TotalWithVatBeforeDiscount;
    private BigDecimal TotalWithoutVatBeforeDiscount;
    private BigDecimal TotalVatBeforeDiscount;
    private String Code;
    private String DateLastChange;
    private Boolean IsRoundedItem;
    private Boolean IsTaxMovement;
    private String ItemType;
    private BigDecimal Price;
    private BigDecimal PriceTotalWithoutVat;
    private BigDecimal PriceTotalWithoutVatHc;
    private BigDecimal PriceTotalWithVat;
    private BigDecimal PriceTotalWithVatHc;
    private BigDecimal PriceUnitVat;
    private BigDecimal PriceUnitVatHc;
    private BigDecimal PriceUnitWithoutVat;
    private BigDecimal PriceUnitWithoutVatHc;
    private BigDecimal PriceUnitWithVat;
    private BigDecimal PriceUnitWithVatHc;
    private BigDecimal TotalPrice;
    private BigDecimal VatRate;
    private BigDecimal VatTotal;
    private BigDecimal VatTotalHc;
    private BigDecimal Amount;
    private String Name;
    private String PriceListItemId;
    private Integer PriceType;
    private String Unit;
    private BigDecimal UnitPrice;
    private String VatCodeId;
    private Integer VatRateType;
    private Integer Id;

}
