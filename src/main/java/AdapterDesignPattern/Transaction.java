package AdapterDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Transaction {
    private String id;
    private String userId;
    private Long timestamp;
    private Double amount;
    private TransactionType transactionType;
    private TransactionStatus status;

    public Transaction() {

    }
}
