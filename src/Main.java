public class Main {
    public static void main(String[] args) {

//        Item fries = new Item("Side", "Fries", 4.00);
//        fries.setSize("LARGE");
//        fries.printReceipt();

//        Burger burger = new Burger(5.00);
//        //burger.printItem();
//        burger.addTopping("BACON","CHEESE","TOMATO");
//        burger.printReceipt();

        Meal meal = new Meal("Sprite","Chilli");
        meal.addBurgerToppings("Cheese","Bacon");
        meal.setDrinkSize("large");
        meal.printReceipt();

    }

}
