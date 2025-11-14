package AdapterDesignPattern.external;

import java.util.List;

public class ICICIApi {

    //fetch transactions
    public List<ICICITransaction> getTransactions(String userId, Long timestamp){
        return List.of(new ICICITransaction("TRANSACTION_ID", 0L, 100.0, "USER_ID", true, true));
    }

    //fetch balance
    public Double getBalance(String userId){
        return 1000.0;
    }

    //sendMoney
    public void transferMoney(String receiverId, Double amount){
        System.out.println(amount + "Amount Transfered to User ID: " + receiverId);
    }
}
