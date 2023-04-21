## Java Conditionals and Control Flow

## If-Then Statement

```
public class Order {
  public static void main(String[] args) {
    double itemCost = 30.99;
    
    // Write an if-then statement:
  }
}
```

1. The code editor contains an `Order` class to track retail shipments.

    Write an `if-then` statement that prints `High value item!` when `itemCost` is greater than `24.00`.

## If-Then-Else

```
public class Order {
  
  public static void main(String[] args) {
    
    boolean isFilled = false;
    
    // Write an if-then-else statement:
    
    
  }
  
}
```

1. In the code editor, there is an `isFilled` value, that represents whether the order is ready to ship.

    Write an if-then-else statement that:

* When `isFilled` is `true`, print `Shipping`.
* When `isFilled` is `false`, print `Order not ready`.

## If-Then-Else-If

```
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
	 	// declare conditional statement here
    
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}
```

1. We need to calculate the shipping costs for our orders.

    There’s a new instance field, `String` `shipping`, that we use to calculate the cost.

    Use a chained `if-then-else` to check for different values within the `calculateShipping()` method.

    When the `shipping` instance field equals `Regular`, the method should return `0`.

    When the `shipping` instance field equals `Express`, the method should return `1.75`.

    Else the method should return `.50`.

## Nested Conditional Statements

```
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
  
  public Order(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here

      
    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express", "ship50");
    Order chemistrySet = new Order(false, 72.50, "Regular", "freeShipping");
    
    book.ship();
    chemistrySet.ship();
  }
}
```

1. The company offers a temporary deal that, if the consumer uses the coupon `ship50`, the company will reduce the express shipping price.

    Let’s rewrite the body of `else`-`if` statement from the last exercise. Inside the `else`-`if` statement, create a nested `if`-`then` statement that checks if `couponCode` equals `ship50`.

    If the nested condition is `true`, return the value `.85`.

    If the condition is `false`, use a nested `else` statement to return the value `1.75`.