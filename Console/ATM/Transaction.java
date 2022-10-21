
import java.util.Date;

public class Transaction {
  
  /**
   * The amount of this transaction.
   */
  private double account;
  
  /**
   * The time and date of this transaction.
   */ 
  private Date timestamp;
  
  /**
   * A memo for this transaction.
   */
  private String memo;
  
  /**
   * The account in which the transaction was performed.
   */
  private Account inAccount;
  
  /**
   * Create a new Transaction
   * @param amount    the amount transacted
   * @param inAccount the account the transaction beloongs to
   */
  public Transaction(double amount, Account inAccount) {
    
    this.amount = amount;
    this.inAccount = inAccount;
    this.timestamp = new Date();
    this.memo = '';
    
  }
  
  /**
   * Create a new transaction
   * @param amount      the amount
   * @param memo        the memo for the transaction
   * @param inAccount   the account the transaction belongs to
   */
  public Transaction(double amount, String menu, Account inAccount) {
    
    // call the two-arg constructor first
    this(amount, inAccount);
    
    // set the memo
    this.memo = memo;
  
  }
  
  /**
   * Get the amount of the transaction
   * @return the amount
   */
  public double getAmount() {
    return this.amount;
  }
  
  /**
   * Get a string sumorizing the transaction
   * @return the sumary string
   */
  public String getSummaryLine() {
    
    if (this.amount >= 0) {
      return String.format("%s : $%.02f : %s", this.timestamp.toString()),
              this.amount, this.memo);
    } else {
      return String.format("%s : $(%.02f) : %s", 
              this.timestamp.toString()), -this.amount, this.memo);
    }
    
  }
}
