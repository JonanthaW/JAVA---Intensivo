package InheritanceLibrary.inheritance;

public class Books {
    private String name;
    private int pageQuantity;
    private float price;

    public Books(String name, int pageQuantity, float price) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Book name cannot be empty");
        }
        this.name = name;
        if (pageQuantity <= 0) {
            throw new IllegalArgumentException("Page quantity cannot be less than or equal to 0");
        }
        this.pageQuantity = pageQuantity;
        if (price < 0f) {
            throw new IllegalArgumentException("Price cannot be less than 0");
        }
        this.price = price;
    }

    // Add getter methods if needed
    public String getName() {
        return name;
    }

    public int getPageQuantity() {
        return pageQuantity;
    }

    public float getPrice() {
        return price;
    }
}
