public class TestAccount{
  public static void main(String[] args){
    //Testing constructors and toString()
    Account a1 = new Account(123, 1000.00);
    Account a2 = new Account(456);
    System.out.println(a1);
    System.out.println("Before setting balance to a2");
    System.out.println(a2);
    a2.setBalance(200.00);
    System.out.println("After setting balance to a2");
    System.out.println(a2);
    
    //Testing getAccountNumber() and getBalance()
    System.out.println("Account number of a1: " + a1.getAccountNumber());
    System.out.printf("Balance of a1: %.02f\n", a1.getBalance());
    System.out.println("Account number of a2: " + a2.getAccountNumber());
    System.out.printf("Balance of a2: %.02f\n", a2.getBalance());
    
    //Testing credit() and debit()
    System.out.printf("Before credit: %.02f\n", a1.getBalance());
    a1.credit(200.00);
    System.out.printf("After credit: %.02f\n", a1.getBalance());
    
    System.out.printf("Before debit: %.02f\n", a2.getBalance());
    a2.debit(10.00);
    System.out.printf("After debit: %.02f\n", a2.getBalance());
    
    //Testing if exception works
    Account a3 = new Account(789, -100.00);
    System.out.println(a3);
  }
}
