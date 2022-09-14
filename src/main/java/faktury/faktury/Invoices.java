package faktury.faktury;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
@Data
public class Invoices {

    private Integer TotalItems;
    private Integer TotalPages;

}
