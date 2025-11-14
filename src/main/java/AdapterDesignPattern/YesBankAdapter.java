package AdapterDesignPattern;

import AdapterDesignPattern.external.TransactionType;
import AdapterDesignPattern.external.YesBankApi;
import AdapterDesignPattern.external.YesBankTransaction;

import java.util.ArrayList;
import java.util.List;

public class YesBankAdapter implements BankInterface {

    YesBankApi yesBankApi = new YesBankApi();
    @Override
    public List<Transaction> getTransactions(String userId, Long timestamp) {
        List<YesBankTransaction> yesBankTransactions = yesBankApi.fetchTransactions(userId, timestamp);
        List<Transaction> transactions = new ArrayList<>();

        for(YesBankTransaction yesBankTransaction : yesBankTransactions){
            Transaction transaction = new Transaction();
            transaction.setId(yesBankTransaction.getId());
            transaction.setUserId(yesBankTransaction.getUserId());
            transaction.setAmount(yesBankTransaction.getAmount());
            transaction.setTimestamp(yesBankTransaction.getTimestamp());

            if(yesBankTransaction.getIsTransactionSuccess()){
                transaction.setStatus(TransactionStatus.SUCCESS);
            } else {
                transaction.setStatus(TransactionStatus.FAILED);
            }

            if(yesBankTransaction.getTransactionType() == TransactionType.CREDIT){
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
        return yesBankApi.fetchBalance(userId);
    }

    @Override
    public void transferAmount(String receiverId, Double amount) {
        yesBankApi.sendMoney(receiverId, amount);
    }
}
