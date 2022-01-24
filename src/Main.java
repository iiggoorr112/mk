import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
    Map <Integer,Dish> menu = new HashMap<Integer,Dish>();
    menu.put(1, new Dish("гамбургер",3.50));
    menu.put(2, new Dish(" чизбургер", 5.00));
    menu.put(3, new Dish("биг-мак", 2.00));
    menu.put(4, new Dish("картошка фри", 3.80));
    menu.put(5, new Dish("картошка по-деревенски", 3.70));
    menu.put(6, new Dish("кола", 3.10));
    menu.put(7, new Dish("сет", 13.80));

        Order order1 = new Order();
        order1.add(menu.get("mmmm "), 2);
        order1.add(menu.get("Toast Bread"), 3);
        order1.add(menu.get("Mixed Rice"), 1);

        System.out.println("Total for order 1: " + order1.getTotal());

        //Create another order and add items from the menu to it.
        Order order2 = new Order();
        order2.add(menu.get("Chicken Rice"), 1);
        order2.add(menu.get("Mixed Rice"), 1);
        order2.add(menu.get("Toast Bread"), 2);

    }
}