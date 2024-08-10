public class Account {
  private String accountName;
  private double balance;

  public Account(String accountName, double initialBalance) {
    this.accountName = accountName;
    this.balance = initialBalance;
  }

  public String getAccountName() {
    return accountName;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    //Check for valid amount
    if (amount > 0) {
      balance += amount;
      System.out.println("Amount deposited: $" + amount);
    } else {
      System.out.println("Amount not valid.");
    }
  }

  public void withdraw(double amount) {
    //First check is for valid amount
    if (amount > 0) {
      //Second is for sufficient funds
      if (amount <= balance) {
        balance -= amount;
        System.out.println("Amount withdrawn: $" + amount);
      } else {
        System.out.println("Insufficient funds");
      }
    } else {
      //For invalid amount
      System.out.println("Invalid amount");
    }
  }
}
