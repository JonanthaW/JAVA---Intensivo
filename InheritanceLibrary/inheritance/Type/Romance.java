package InheritanceLibrary.inheritance.Type;
import InheritanceLibrary.inheritance.Books;

public class Romance extends Books {
    
    private String tags = "Lovely, Beatiful, Incredible";

    public Romance(String name, int pageQuantity, float price) {
        super(name, pageQuantity, price);
        getTags();
    }

    public void setTags(String tags) {
        if (tags.isEmpty()) {
            System.out.println("Tags cannot be empty");
        } else {
            this.tags = tags;
        }
    }

    // Add getter method if needed
    public String getTags() {
        return tags;
    }
}
