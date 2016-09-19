public class Account{
  
  private int accountNumber;
  private double balance = 0.0;
  
  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    setBalance(balance);
  }
  
  public Account(int accountNumber){
    this.accountNumber = accountNumber;
    setBalance(balance); 
  }
  
  public int getAccountNumber(){
    return accountNumber;
  }
  
  public double getBalance(){
    return balance;
  }
  
  public void setBalance(double balance){
    if (balance < 0.0){
      throw new IllegalArgumentException("Balance cannot be less than 0.00");
    }
    this.balance = balance;
  }
  
  public void credit(double amount){
    this.balance += amount;
  }
  
  public void debit(double amount){
    this.balance -= amount;
  }
  
  public String toString(){
    return String.format("A/C no.:%d, Balance:$%.02f", this.accountNumber, this.balance);
  }
}
