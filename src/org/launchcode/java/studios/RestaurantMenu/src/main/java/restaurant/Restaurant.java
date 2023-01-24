package restaurant;



public class Restaurant {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Brisket Chili", "Smoked brisket, Cojita, Red Onion", 7.00, "appetizer");
        MenuItem item2 = new MenuItem("Steak House Burger", "Caramelized onion, Grilled mushroom, and Steak Sauce", 16.00, "main course");
        MenuItem item3 = new MenuItem("American Burger", "Bacon crumbles, Fried mac n'cheese, and Beer cheese sauce", 15.00, "main course");
        MenuItem item4 = new MenuItem("Butternut Salad", "Butter left lettuce, Pistachios, Goat cheese, Candied bacon, Honey dressing", 13.00, "main course");
        MenuItem item5 = new MenuItem("Milkshake", "Vanilla, Chocolate, or Swirl", 7.00, "dessert");


        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);


//        System.out.println(menu);
        System.out.println(item1);
    }
}
