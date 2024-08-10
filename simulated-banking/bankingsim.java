import java.util.Scanner;

public class bankingsim {
  public static void main(String[] args) {
    Bank bank = new Bank();
    Scanner sc = new Scanner(System.in);

    System.out.println("Hi there! Welcome to Banking Sim 1.0.");

    while (true) {
      System.out.println("\n1. Add Account");
      System.out.println("2. Make a Deposit");
      System.out.println("3. Make a Withdrawal");
      System.out.println("4. Check Current Balance");
      System.out.println("5. End");
      int menuChoice = sc.nextInt();
      sc.nextLine();

      switch (menuChoice) {
        case 1:
          System.out.println("Enter account name: ");
          String name = sc.nextLine();
          System.out.println("Enter starting balance: ");
          double startingBalance = sc.nextDouble();
          sc.nextLine();
          Account account = new Account(name, startingBalance);
          bank.addAccount(account);
          break;

        case 2:
          System.out.println("Enter account name: ");
          String depositName = sc.nextLine();
          Account depositAccount = bank.getAccount(depositName);
          if (depositAccount != null) {
            System.out.print("Enter amount: ");
            double depositAmount = sc.nextDouble();
            depositAccount.deposit(depositAmount);
          }
          break;

        case 3:
          System.out.println("Enter account name: ");
          String withdrawName = sc.nextLine();
          Account withdrawAccount = bank.getAccount(withdrawName);
          if (withdrawAccount != null) {
            System.out.println("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            withdrawAccount.withdraw(withdrawAmount);
          }
          break;

        case 4:
          System.out.println("Enter account holder name: ");
          String balanceName = sc.nextLine();
          Account balanceAccount = bank.getAccount(balanceName);
          if (balanceAccount != null) {
            System.out.println("Current balance: $" + balanceAccount.getBalance());
          }
          break;

        case 5:
          System.out.println("Thanks for playing! Sort of?");
          sc.close();
          System.exit(0);

        default:
          System.out.println("Invalid selection, sorry!");
      }
    }
  }
}
