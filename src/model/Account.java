package model;

public class Account {
    private final int number;
    private double balance;
    private final Client owner;

    public Account(int number, Client owner){
        this.number = number;
        this.owner = owner;
    }
    public boolean deposit(double amount){
        if(amount <= 0){
            return false;
        }
        balance += amount;
        return true;
    }
    public boolean withdraw(double amount){
        if(amount <= 0 || amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }
    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }
    public Client getOwner(){
        return owner;
    }
}
