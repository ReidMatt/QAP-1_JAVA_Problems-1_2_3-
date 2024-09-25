public class Account {
  //Instance variables
  private String id;
  private String name;
  private int balance = 0;

  //Constructor with id and name
  public Account(String id, String name) {
    this.id = id;
    this.name = name;
  }

  //Constructor with id, name, and balance
  public Account(String id, String name, int balance) {
    this.id = id;
    this.name = name;
    this.balance = balance;
  }

  //Getter for id
  public String getID() {
    return id;
  }

  //Getter for name
  public String getName(){
    return name;
  }

  //Getter for balance
  public int getBalance() {
    return balance;
  }

  //Method to credit amount to the account balance
  public int credit(int amount) {
    balance += amount;
    return balance;
  }

  //Method to debit amount from the account balance
  public int debit(int amount) {
    if (amount <= balance) {
      balance -= amount;
    } else {
      System.out.print("Amount exceeded balance");
    }
    return balance;
  }

  //Method to transfer amount to another account
  public int transferTo(Account another, int amount) { 
    if (amount <= balance) {
      this.balance -= amount;
      another.balance += amount;
    } else {
      System.out.print("Amount exceeded balance");
    }
    return balance;
  }

  //toString method to display account details @Override
  public String toString() {
    return "Account[id=" + id + ", name=" +name + ",balance=" + balance + "]";
  }
}



