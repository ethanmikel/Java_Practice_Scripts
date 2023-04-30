/**
 * Write a description of class bankAccouunt here.
 *
 * Ethan Mikel
 * @version (a version number or a date)
 */
public class Account
{
    private String name;
    private int accountNumber;
    private double balance; 
    public Account()
    {
        name = "";
        accountNumber = 0;
        balance = 0.0;
    }
    public Account(String name, int accountNumber, double balence)
    {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balence;
    }
    public String toString() 
    {
        return ("Account Holder: " + this.name + "  Account Number: " + this.accountNumber + "  Balence: " + this.balance);
    }
    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.print("Deposited: " + amount);
    }
    public void withdraw(double amount)
     {
      if (balance > amount) {
        this.balance -= amount;
        System.out.print("Withdrew: " + amount);
      }
      else {
        System.out.print("Withdrew: Error Not Enough Funds for Withdrawal");
      }
    }
     public double getBalance() {
        return balance;
    }
    public String getName() {
       return name;
    }
    public void setName(String n) {
       name = n;
    }
    public int getAccountNumber() {
       return accountNumber;
    }
    public void setAccountNumber(int a) {
       accountNumber = a;
    }
}
