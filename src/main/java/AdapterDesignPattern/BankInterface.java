package AdapterDesignPattern;

import java.util.List;

public interface BankInterface {
    public List<Transaction> getTransactions(String userId, Long timestamp);

    public Double getBalance(String userId);

    public void transferAmount(String receiverId, Double amount);
}
