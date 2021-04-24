
package assignment03;

class BankAccount {
    
    private String owner;
    private double balance;
    public String getOwner(){
        return this.owner;
    }
    
    public void setOwner(String owner){
        this.owner = owner;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
}
