package services;

public class Endpoints {

    private static String ENDPOINT
            = "https://parabank.parasoft.com/parabank/services/bank/";

    public static String CREATE_ACCOUNT
            = ENDPOINT + "createAccount?customerId=%s&newAccountType=0&fromAccountId=15897";

    public static String GET_ACCOUNT
            = ENDPOINT + "accounts/%d";

    public static String DEPOSIT
            = ENDPOINT + "deposit?accountId=%d&amount=%.2f";

    public static String WITHDRAW
            = ENDPOINT + "withdraw?accountId=%d&amount=%.2f";

}
