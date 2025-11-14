package AdapterDesignPattern.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ICICITransaction {
    private String id;
    private Long timestamp;
    private Double amount;
    private String userId;
    private Boolean isCredit;
    private Boolean isTransactionSuccess;
}