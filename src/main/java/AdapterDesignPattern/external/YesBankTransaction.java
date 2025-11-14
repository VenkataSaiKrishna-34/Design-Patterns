package AdapterDesignPattern.external;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class YesBankTransaction {
    private String id;
    private Long timestamp;
    private Double amount;
    private String userId;
    private TransactionType transactionType;
    private Boolean isTransactionSuccess;
}
