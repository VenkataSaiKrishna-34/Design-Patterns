package AdapterDesignPattern;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAdapter());

        phonePe.printTrasanctions("12345", 0L);

        phonePe.printBalance("12345");

        phonePe.transferAmount("12345", 100.0);

        /*
            -> Now in Future if we want to change the Bank from YesBank to ICICI Bank then we just need to pass the ICIC Banka Adapter
            -> If we dont have the adapter for every bank, then we will have to implement the full new Bank API in all over the phonepe class and also where ever its being used
            -> In future if we move to a new bank, then we just need to write an adapter for that bank and pass that adapter instance to phonepe class from the client
         */
    }
}
