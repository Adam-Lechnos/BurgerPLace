public class Meal {

    private Item drink;
    private Item side;
    private Burger burger;

    public Meal() {
        this("Coke","Fries");
        burger.addTopping("Lettuce","Tomato","Cheese");
    }

    public Meal(String drink, String side){
        this.drink  = new Item("Drink", drink, 2.00);
        this.side = new Item("Side", side, 3.00);
        this.burger = new Burger(4.50);
    }

    public void setDrinkSize(String size){
        drink.setSize(size);
    }

    public void setSideSize(String size){
        side.setSize(size);
    }

    public void addBurgerToppings(String extra1){
        addBurgerToppings(extra1, null, null);
    }
    public void addBurgerToppings(String extra1, String extra2){
        addBurgerToppings(extra1, extra2, null);
    }
    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addTopping(extra1,extra2,extra3);
    }

    public double getTotalPrice(){
        return burger.getAdjustedPrice() + side.getAdjustedPrice() + drink.getAdjustedPrice();
    }

    public double getTax(){
        return getTotalPrice() * .08875;
    }
    public void printReceipt(){
        burger.printReceipt();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("GROSS TOTAL: ",getTotalPrice());
        Item.printItem("TAX: ", getTax());
        Item.printItem("NET TOTAL: ", (getTotalPrice() + getTax()));
    }

}
