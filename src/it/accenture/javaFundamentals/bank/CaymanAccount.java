package it.accenture.javaFundamentals.bank;



public class CaymanAccount extends Account{

    protected String secretCode;

    public CaymanAccount(double balance, String secretCode) {
        super(balance);
        this.secretCode = secretCode;
    }

    @Override
    public double deposit(double amount){
        balance += amount*1.1;
        return balance;
    }

    public void evadeTaxes(){
        balance = balance*1.05;
    }
}
