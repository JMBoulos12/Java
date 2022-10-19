
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
    
    // add to holder and bank lists
    holder.addAccount(this);
    theBox.addAccount(this);
  }
  
}
  
  
