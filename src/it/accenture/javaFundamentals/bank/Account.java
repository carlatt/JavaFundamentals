package it.accenture.javaFundamentals.bank;

public abstract class Account {
    protected double balance;

    public Account(double bal){
        this.balance = bal;
    }

    public abstract double deposit(double amount);
    /*{
        this.balance += amount;
        return balance;
    }*/

    public double withdraw(double amount) throws InsufficientBalanceException {
        //if(amount > balance){ // NO GRAZIE!
        //    System.out.println("saldo non disponibile");
        //    return balance;
        //}

        if (amount > balance){
            throw new InsufficientBalanceException("Saldo non disponibile", balance, amount);
        }

        this.balance -= amount;
        return  balance;
    }

    public double transfer(double amount, Account other) throws InsufficientBalanceException {
        double newBalance = this.withdraw(amount);
        other.deposit(amount);
        return newBalance;
    }
}
