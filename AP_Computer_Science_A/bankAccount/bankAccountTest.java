
/**
 * Write a description of class bankAccountTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bankAccountTest
{
    public static void String () {
    System.out.println("Welcome To Your American Bank Account! \n");
        
    Account account1 = new Account("Jimmy Kimmel", 156246928, 10000);
    System.out.println("Your Account Information: " + account1);
    account1.deposit(5000.00);
    System.out.println("   Balance: " + account1.getBalance());
    account1.withdraw(4000.00);
    System.out.println("   Balance: " + account1.getBalance());
    account1.deposit(11452.98);
    System.out.println("   Balance: " + account1.getBalance());
    account1.deposit(2013.56);
    System.out.println("   Balance: " + account1.getBalance());
    account1.withdraw(29000.00);
    System.out.println("   Balance: " + account1.getBalance());
    account1.deposit(2156.34);
    System.out.println("   Balance: " + account1.getBalance());
    account1.withdraw(19000.00);
    System.out.println("   Balance: " + account1.getBalance());
    System.out.println("Updated Account Information: " + account1);
  }
}
