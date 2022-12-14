package faktury.faktury;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@lombok.Data
public class Data {

    private Integer TotalItems;
    private Integer TotalPages;
    private List<Invoice> Data;

}
