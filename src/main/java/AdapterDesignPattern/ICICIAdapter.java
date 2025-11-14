package AdapterDesignPattern;

import AdapterDesignPattern.external.ICICIApi;
import AdapterDesignPattern.external.ICICITransaction;

import java.util.ArrayList;
import java.util.List;

public class ICICIAdapter implements BankInterface {

    ICICIApi iciciApi = new ICICIApi();
    @Override
    public List<Transaction> getTransactions(String userId, Long timestamp) {
        List<ICICITransaction> iciciTransactions = iciciApi.getTransactions(userId, timestamp);
        List<Transaction> transactions = new ArrayList<>();

        for(ICICITransaction iciciTransaction : iciciTransactions){
            Transaction transaction = new Transaction();
            transaction.setId(iciciTransaction.getId());
            transaction.setUserId(iciciTransaction.getUserId());
            transaction.setAmount(iciciTransaction.getAmount());
            transaction.setTimestamp(iciciTransaction.getTimestamp());

            if(iciciTransaction.getIsTransactionSuccess()){
                transaction.setStatus(TransactionStatus.SUCCESS);
            } else {
                transaction.setStatus(TransactionStatus.FAILED);
            }

            if(iciciTransaction.getIsCredit()){
                transaction.setTransactionType(AdapterDesignPattern.TransactionType.CREDIT);
            } else {
                transaction.setTransactionType(AdapterDesignPattern.TransactionType.DEBIT);
            }

            transactions.add(transaction);
        }

        return transactions;
    }

    @Override
    public Double getBalance(String userId) {
        return iciciApi.getBalance(userId);
    }

    @Override
    public void transferAmount(String receiverId, Double amount) {
        iciciApi.transferMoney(receiverId, amount);
    }
}
