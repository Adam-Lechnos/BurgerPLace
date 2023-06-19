public class Item {
    private String type;
    private String name;
    protected String size;
    private double price;

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.size = "MEDIUM";
        this.price = price;
    }
    public String getType() {
        return type;
    }

    public String getName() {

        if (type.equalsIgnoreCase("DRINK") || (type.equalsIgnoreCase("SIDE"))){
            return size + " " + name;
        }

        return name + " " + type;
    }

    public double getBasePrice() {
        return price;
    }
    public double getAdjustedPrice(){
        return switch (size.toUpperCase()){
            case "SMALL" -> getBasePrice() - .50;
            case "LARGE" -> getBasePrice() + 1.00;
            default -> getBasePrice();
        };
    }
    public void setSize(String size) {
        this.size = size.equalsIgnoreCase("small") ? "SMALL" :
                (size.equalsIgnoreCase("LARGE") ? "LARGE" : "MEDIUM");
    }
    public static void printItem(String item, double price){
        System.out.printf("%20s: %6.2f %n",item,price);
    }

    public void printItem(){
        printItem(getName(), getAdjustedPrice());
    }
    public void printReceipt(){
        printItem(getName(),getAdjustedPrice());
        System.out.println("-".repeat(30));
        printItem();
    }

}
