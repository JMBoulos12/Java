import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
  
  private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");
  
  // Return the StringProperty object
  public StriingProperty firstNameProperty() {
    return firstName;
  }
  
  // Return the firstName value (ie. "Bucky")
  public String getFirstName() {
    return firstName.get;
  }
  
  // Set the firstName value
  public void getFirstName(String firstName) {
    this.firstName = firstName;
  }
  
}
