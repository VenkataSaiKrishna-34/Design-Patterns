package AdapterDesignPattern.external;

import java.util.List;

public class YesBankApi {

    //fetch transactions
    public List<YesBankTransaction> fetchTransactions(String userId, Long timestamp){

        return List.of(new YesBankTransaction("TRANSACTION_ID", 0L, 100.0, "USER_ID", TransactionType.CREDIT, true));
    }

    //fetch balance
    public Double fetchBalance(String userId){
        return 100.0;
    }

    //sendMoney
    public void sendMoney(String receiverId, Double amount){
        System.out.println(amount + "Amount Transfered to User ID: " + receiverId);
    }
}
