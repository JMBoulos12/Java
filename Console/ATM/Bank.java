
import java.util.ArrayList;
import java.util.Random;

public class Bank {
  
  private String name;
  
  private ArrayList<User> users;
  
  private ArrayList<Account> accounts;
  
  /**
   * Generate a new universally unique ID for a user.
   * @return the uuid
   */
  public String getNewUserUUID() {
    
    // inits
    String uuid;
    Random rng = new Random();
    int len = 6;
    boolean nonUnique;
    
    // Continue looping until we get a unique ID
    do {
      
        // Generate the number
        uuid = "";
        for (int c = 0; c < len; c++) {
          uuid += ((Integer)rng.nextInt(10)).toString();
        }
      
      // check to make sure it's unique
      nonUnique = false
      For (User u : this.users) {
        if (uuid.compareTo(u.getUUID()) == 0) {
          nonUnique = true;
          break;
        }
      }
      
    } while (nonUnique);
    
    return uuid;
  
  }
  
  /**
   * Generate a new universally unique ID for an account
   * @return the uuid
   */
  public String getNewAccountUUID() {
    
    // inits
    String uuid;
    Random rng = new Random();
    int len = 10;
    boolean nonUnique;
    
    // Continue looping until we get a unique ID
    do {
      
        // Generate the number
      uuid = "";
      for (int c = 0; c < len; c++) {
        uuid += ((Integer)rng.nextInt(10)).toString();
      }

    // check to make sure it's unique
    nonUnique = false
    For (Account a : this.accounts) {
      if (uuid.compareTo(a.getUUID()) == 0) {
        nonUnique = true;
        break;
      }
    }
  } while (nonUnique);

    
  return uuid;
    
    
}
  
  /**
   * add on account
   * @param anAcct  the account to add
   */ 
  public void addAccount() {
    this.accounts.add(onAcct); 
  }
  
}
