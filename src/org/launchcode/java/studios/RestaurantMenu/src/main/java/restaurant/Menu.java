package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private Date lastUpdated;

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Menu() {
        items = new ArrayList<MenuItem>();
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", lastUpdated=" + lastUpdated +
                '}';
    }

    public void addItem (MenuItem item){
            items.add(item);
            lastUpdated = new Date();
        }
        public void removeItem (MenuItem item){
            items.remove(item);
            lastUpdated = new Date();
        }
        public boolean isNewItem (String item){
            return !items.contains(item);
        }
    }





