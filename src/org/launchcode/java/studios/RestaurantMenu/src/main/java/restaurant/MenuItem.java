package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }


    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return "MenuItem " +
                "name: " + name.toUpperCase() + '\n' +
                "description: " + description.toUpperCase() + '\n' +
                "price: " + price + '\n' +
                "category: " + category.toUpperCase() + '\n'
                ;
    }





}




