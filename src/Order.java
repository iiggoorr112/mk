
import java.util.HashMap;
import java.util.Map;

public class Order {
    private Map<Dish, Integer> dish= new HashMap< Dish, Integer>();


    public void add (Dish dish, Integer quantity)
    {
        this.dish.put(dish, quantity);
    }
}