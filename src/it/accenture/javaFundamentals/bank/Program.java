package it.accenture.javaFundamentals.bank;

public class Program {
    public static void main(String[] args) {
        //Account a1 = new Account(1000);
        CaymanAccount c1 = new CaymanAccount(2000, "xyz");

        Account a2 =  c1;   // legale perche CaymanAccount estende Account (upcasting)
        //Account a3 = new String("ciccio"); // non possibile perchè Stringa non è un Account
        //a2.deposit(1000); //legale: CaymanAccount ha il metodo deposit
        //a3.deposit(1000); //illegale: String non ha il metodo deposit

        Account a4 = new CaymanAccount(5, "0");
        CaymanAccount c2 = (CaymanAccount) a4;  // downcasting in questo caso funzionante ma può dare problemi

        try {
            a4.withdraw(5);
            System.out.println("ritirati 5");
            a4.withdraw(2);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getBalance());
            System.out.println(e.getRequestedAmount());
        }



    }
}
