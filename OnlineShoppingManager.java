import java.util.Vector;
class roduct {
    String name;
    double price;
    String category;
    public roduct(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;

    }
}

public class OnlineShoppingManager {
    private Vector<roduct> inventory;

    public OnlineShoppingManager() {
        inventory = new Vector<>();
    }

    public void addroduct(String name, double price, String category) {
        roduct product = new roduct(name, price, category);
        inventory.add(product);
    }

    public void removeroduct(String name) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        for (roduct product : inventory) {
            System.out.println("Name: " + product.name + ", Price: " + product.price + ", Category: " + product.category );
        }
    }

    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        // Add some products to the inventory
        manager.addroduct("Laptop", 40000, "Electronics");
        manager.addroduct("T-shirt", 550, "Clothing");
        manager.addroduct("Book", 920, "Books");

        // Display all products in the inventory
        manager.displayInventory();

        // Remove a product
        manager.removeroduct("Book");

        // Display updated inventory
        manager.displayInventory();

        manager.removeroduct("Laptop");

        // Display updated inventory
        manager.displayInventory();
    }
}