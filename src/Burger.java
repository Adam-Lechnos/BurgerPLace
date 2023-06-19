public class Burger extends Item {

    private Item extra1;
    private Item extra2;
    private Item extra3;


    public Burger(double price) {
        super("BURGER", "REGULAR", price);
    }

    public double getToppingPrice(String topping) {
        if (topping == null){
            return 0.00;
        }

        return switch (topping.toUpperCase()) {
            case "CHEESE", "BACON" -> 1.00;
            case "MAYO" -> .50;
            default -> 0.00;
        };
    }

    public void addTopping(String extra1){
        addTopping(extra1, null, null);
    }
    public void addTopping(String extra1, String extra2){
        addTopping(extra1, extra2, null);
    }
    public void addTopping(String extra1, String extra2, String extra3) {
        this.extra1 = extra1 != null ? new Item("TOPPING1", extra1, getToppingPrice(extra1)) : null;
        this.extra2 = extra2 != null ? new Item("TOPPING2", extra2, getToppingPrice(extra2)) : null;
        this.extra3 = extra3 != null ?  new Item("TOPPING3", extra3, getToppingPrice(extra3)) : null;
    }

    @Override
    public double getAdjustedPrice(){
        return getBasePrice() +
                (extra1 != null ? extra1.getAdjustedPrice() : 0) +
                (extra2 != null ? extra2.getAdjustedPrice() : 0) +
                (extra3 != null ? extra3.getAdjustedPrice() : 0);
    }

    public void printItem(){
        if (extra1 != null){
            extra1.printItem();
        }
        if (extra2 != null){
            extra2.printItem();
        }
        if (extra3 != null){
            extra3.printItem();
        }
    }

    @Override
    public void printReceipt() {
        super.printReceipt();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL BURGER",getAdjustedPrice());
        //System.out.printf("TOTAL BURGER: %6.2f %n",getAdjustedPrice());
    }
}
