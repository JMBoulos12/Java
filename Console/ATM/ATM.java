
import java.util.Scanner;

public class ATM {
  
  public static void main(String[] args) {
    
    //init Scanner
    Scanner sc = new Scanner(System.in);
    
    //init Bank
    Bank theBank = new Bank("Bank of JM");
    
    // add a user, which also creates a savings account
    User aUser = theBank.addUser("JeanMarc", "Boulos", "1234");
    
    // add a checking account for our user
    Account newAccount = new Account("Checking", aUser, theBank);
    aUser.addAccount(newAccount);
    theBank.addAccount(newAccount);
    
    User curUser;
    while (true) {
      
      // stay in the login prompt until successful login
      curUser = ATM.mainMenuPrompt(theBank, sc);
      
      // stay in main menu until user quits
      ATM.printUserMenu(curUser, sc);
        
    }
    
  }
  
  public static User mainMenuPrompt(Bank theBank, Scanner sc) {
    
    // inits
    String userID;
    String pin;
    User authUser;
    
    //prompt the user for user ID/pin combo until a correct one is reached
    do {
      
        System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());
        System.out.print("Enter user ID: ");
        userID = sc.nextLine();
        System.out.print("Enter pin: ");
        pin = sc.nextLine();
        
        // try to get the user to object corresponding to the ID and pin combo
        authUser = theBank.userLogin(userID, pin);
        if (authUser == null) {
          System.out.println("");
        }
    } while();
  }
  
}  
