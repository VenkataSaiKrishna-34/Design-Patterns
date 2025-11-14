package AdapterDesignPattern;

import java.util.List;

public class PhonePe {
    private BankInterface bankAdapter;

    PhonePe(BankInterface bankAdapter){
        this.bankAdapter = bankAdapter;
    }

    public void printTrasanctions(String userId, Long timestamp){
        List<Transaction> transactions = bankAdapter.getTransactions(userId, timestamp);

        for (Transaction transaction : transactions){
            System.out.println("Transaction ID = " + transaction.getId() + ", Amount = " + transaction.getAmount());
        }
    }

    public void printBalance(String userId){
        System.out.println(bankAdapter.getBalance(userId));
    }

    public void transferAmount(String receiverId, Double amount){
        bankAdapter.transferAmount(receiverId, amount);
    }
}
