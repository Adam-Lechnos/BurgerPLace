# BurgerPLace
Java packaged created for fun, for creating and printing an order at a burger restaurant

### Order Default Meal

* Create new `Meal` object, without any arguments

```
Meal meal = new Meal();
meal.printReceipt();
```

### Order Customized Meal

* Create new `Meal` object, with arguments `(String Drink, String Side)`
* Optional - Add toppings by calling the `addBurgerToppings` method with arguments `(String topping1, String topping2 [optional], String topping3 [optional])`
* Optional - Set Drink Size and/or Side menu size by calling the method `setDrinkSize()` and/or `setSideSize()`, with one arguments as `(size) (small|medium|large)`

```
Meal meal = new Meal("Sprite","Chilli");
meal.addBurgerToppings("Cheese","Bacon");
meal.setDrinkSize("large");
meal.printReceipt();
```
