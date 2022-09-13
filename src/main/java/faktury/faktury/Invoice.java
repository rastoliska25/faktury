package faktury.faktury;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
@Data
public class Invoice {

    private Integer InvoiceId;
    private String Name;
    private Integer NumericSequenceId;
}

