public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    } else {
      System.out.println("Low value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
    } else {
      System.out.println("Order not ready");
    }
    
    double shippingCost = calculateShipping();
    
    System.out.println("Shipping cost: ");
    System.out.println(shippingCost);
  }
  
  public double calculateShipping() {
    double shippingCost;
    switch (shipping) {
      case "Regular":
        shippingCost = 0;
        break;
      case "Express":    
        shippingCost = 1.75;
        break;
      default:
        shippingCost = .50; 
    }
    return shippingCost;
  }
  
  public static void main(String[] args) {
    // create instances and call methods here!
    Order shoes = new Order(true, 55.00, "Express");

    // if-else
    if (shoes.isFilled) {
      System.out.println("Your order is shipping");
    } else {
      System.out.println("Your order is not ready");
    }

    // switch case
    switch (shoes.shipping) {
      case "Regular":
        System.out.println("The delivery method is Regular shipping");
        break;
      case "Express":
        System.out.println("The delivery method is Express shipping");
        break;
    }

    // if-then-else
    if (shoes.billAmount < 50) {
      System.out.println("Your order is less than 50.00");
    } else if (shoes.billAmount == 50) {
      System.out.println("Your order is equal to 50.00");
    } else if (shoes.billAmount > 50) {
      System.out.println("Your order is greater than 50.00");
    }
  }
}