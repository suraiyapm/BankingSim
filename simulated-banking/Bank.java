import java.util.ArrayList;

public class Bank {
  private ArrayList<Account> accounts;

  public Bank() {
    accounts = new ArrayList<>();
  }

  public void addAccount(Account account) {
    accounts.add(account);
    System.out.println("Account for " + account.getAccountName() + " added!");
  }

  public Account getAccount(String accountName) {
    for(Account account : accounts) {
      if(account.getAccountName().equals(accountName)) {
        return account;
      }
    }
    System.out.println("Account not found, sorry D:");
    return null;
  }
}
