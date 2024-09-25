public class TestAccount {
  public static void main(String[] args) {
    
    //Create two accounts using parmeterized constructors
    Account acc1 = new Account("A001", "John", 5000);
    Account acc2 = new Account("A002", "Doe", 4000);

    //Display the balance of both accounts
    System.out.print("Account 1 Balance: $" + acc1.getBalance());
    System.out.print("Account 2 Balance: $" + acc2.getBalance());

    //Transfer $1000 from acc1 to acc2
    System.out.print("Transferring $1000 from Account 1 to Account 2...");
    acc1.transferTo(acc2, 1000);

    //Display the balance of both accounts again
    System.out.print("Account 1 Balance after transfer: $" + acc1.getBalance());
    System.out.print("Account 2 Balance after transfer: $" + acc2.getBalance());
  }

  
  
}
