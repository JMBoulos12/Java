
import java.util.ArrayList;

public class Account {
  
  /**
   * The name of the amount.
   */
  private String name;

  /**
   * The account ID number.
   */
  private String uuid;
  
  /**
   * The User object that owns this account.
   */
  private User holder;
  
  /**
   * The list of transactions for this account.
   */
  private ArrayList<Transactions> transaction;
  
  /**
   * Create a new Account
   * @param   name    the name of the Account
   * @param   holder  the User object that holds this account
   * @param   theBank the bank that issues the account
   */ 
  public Account(String name, User holder, Bank theBank) {
    
    // set the account name and holder
    this.name = name;
    this.holder = holder;
    
    // get new account UUID
    this.uuid = theBank.getNewAccountUUID();
    
    //init transactions 
    this.transactions = new ArrayList<Transaction>();

  }
  
  /**
   * Get the account ID
   * @return the uuid
   */
  public String getUUID() {
    return this.uuid;
  }
  
  /**
   * Get summary line for the account
   * @return the string summary
   */
  public String getSummaryLine() {
    
    // get the account's balance
    double balance = this.getBalance();
    
    // format the summary line, depending on the whether the balance is
    // negative
    if (balance >= 0) {
          return String.format("%s : $%.02f : %s", this.uuid, balance,
                            this.name);
      } else {
          return String.format("%s : $(%.02f) : %s", this.uuid, balance,
                              this.name);
    } 
  }
  
  /**
   * Get the balance of this account by adding the amounts of the transactions
   * @return the balance value
   */
  public double getBalance() {
    
    double balance = 0;
    for (Transaction t : this.transactions) {
      balance += t.getAmount();
    }
    return balance;
  }
  
  /**
   * Print the transaction history of the account
   */
  public void printTransHistory() {
    
    System.out.printf("\nTransaction history for account %s\n", this.uuid);
    for (int t = this.transactions.size()-1; t >= 0; t--) {
        System.out.println(this.transaction.get(t).getSummaryLine());
    }
    System.out.println(); 
  }
  
  /**
   * Add a new transaction in this account
   * @param amount    the amount transacted
   * @param memo      the transaction memo
   */
    public void addTransaction(double amount, String memo) {
      
      // create a new transaction object and add it to our list
      Transaction newTrans = new Transaction(amount, memo, this);
      this.transactions.add(newTrans);
    }
  
}
  
  

