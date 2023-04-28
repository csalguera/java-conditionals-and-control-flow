## Java Conditionals and Control Flow

## Contents

* [If-Then Statement](https://github.com/csalguera/java-conditionals-and-control-flow#if-then-statement)
* [If-Then-Else](https://github.com/csalguera/java-conditionals-and-control-flow#if-then-else)
* [If-Then-Else-If](https://github.com/csalguera/java-conditionals-and-control-flow#if-then-else-if)
* [Nested Conditional Statements](https://github.com/csalguera/java-conditionals-and-control-flow#nested-conditional-statements)
* [Switch Statement](https://github.com/csalguera/java-conditionals-and-control-flow#switch-statement)
* [Review](https://github.com/csalguera/java-conditionals-and-control-flow#review)

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

    Write an `if-then` statement that prints `"High value item!"` when `itemCost` is greater than `24.00`.

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

* When `isFilled` is `true`, print `"Shipping"`.
* When `isFilled` is `false`, print `"Order not ready"`.

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

    When the `shipping` instance field equals `"Regular"`, the method should return `0`.

    When the `shipping` instance field equals `"Express"`, the method should return `1.75`.

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

1. The company offers a temporary deal that, if the consumer uses the coupon `"ship50"`, the company will reduce the express shipping price.

    Let’s rewrite the body of `else`-`if` statement from the last exercise. Inside the `else`-`if` statement, create a nested `if`-`then` statement that checks if `couponCode` equals `"ship50"`.

    If the nested condition is `true`, return the value `.85`.

    If the condition is `false`, use a nested `else` statement to return the value `1.75`.

## Switch Statement

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
    double shippingCost;
	 	// declare switch statement here
    
    
    return shippingCost;
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

1. We’ll rewrite the `calculateShipping()` method so it uses a `switch` statement instead.

    There’s an uninitialized variable `shippingCost` in `calculateShipping()`. Assign the correct value to `shippingCost` using a `switch` statement:

    We’ll check the value of the instance field `shipping`.

    When `shipping` matches `"Regular"`, `shippingCost` should be `0`.
    When `shipping` matches `"Express"`, `shippingCost` should be `1.75`.
    The default should assign `.50` to `shippingCost`.
    **Make sure the method returns** `shippingCost` **after the** `switch` **statement.**

## Review

```
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

  }
}
```

Our complete Order program is in the text editor but the main() method is empty.

Create different Order instances and see if you can run the code in all the different conditional blocks!