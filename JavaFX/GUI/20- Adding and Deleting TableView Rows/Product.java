/*
 * @author Jean Marc Boulos
 * @since 29/11/2022
 */
public class Product {
  
  private String name;
  private double price;
  private int quantity;
  
  public Product() {
    this.name = "";
    this.price = 0;
    this.quantity = 0;
  }
  
  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public double getPrice() {
    return price;
  }
  
  public void setPrice(double price) {
    this.price = price;
  }
  
  double int getQuantity() {
    return quantity;
  }
  
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
}
