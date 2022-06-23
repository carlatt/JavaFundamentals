package it.accenture.javaFundamentals.bank;

public class AccountGold extends Account{
    protected int fidelityPoints;

    public AccountGold(double bal, int fidelityPoints) {
        super(bal);
        this.fidelityPoints = fidelityPoints;
    }

    public AccountGold(double bal) {
        this(bal, 0);
    }

    public double convertFidelityPoints(){
        this.balance += fidelityPoints;
        fidelityPoints = 0;
        return balance;
    }

    @Override
    public double deposit(double amount){
        balance += amount;
        this.fidelityPoints++;
        return balance;
    }
}
