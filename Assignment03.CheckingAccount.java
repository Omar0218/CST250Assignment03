
package assignment03;

public class CheckingAccount extends BankAccount {
    
    private double insufficientFundsFee;
    public double getInsufficientFundsFee(){
        return insufficientFundsFee;
    }
    
    public void setInsufficientFundsFee(double insufficientFundsFee){
        this.insufficientFundsFee = insufficientFundsFee;
    }
    
    public CheckingAccount(String owner, double balance, double insufficientFundsFee){
        super(owner, balance);
        this.insufficientFundsFee = insufficientFundsFee;
    }
    
    public void processCheck(double checkAmount){
        setBalance(getBalance() + checkAmount);
    }
    
    public void withdraw(double checkAmount){
        setBalance(getBalance() - checkAmount);
        if(getBalance() < 0){
            setBalance(getBalance() - insufficientFundsFee);
        }
    }
     
      
}
