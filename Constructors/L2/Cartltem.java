class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to the cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            this.quantity =quantity- qty;
            System.out.println(qty + " " + itemName);
        }
    }
    double getTotalCost() {
        return price * quantity;
    }

    void displayDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : ₹" + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: ₹" + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 55000, 1);
        item1.displayDetails();
        item1.addItem(1);
        item1.displayDetails();
    }
}
