import java.util.HashMap;
import java.util.Map;

// Prototype Interface
public abstract class Dish implements Cloneable {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract Dish clone();
}

// Concrete Dishes
class PaneerButterMasala extends Dish {
    public PaneerButterMasala() {
        this.name = "Paneer Butter Masala";
    }

    public Dish clone() {
        return new PaneerButterMasala();
    }
}

class ShahiPaneer extends Dish {
    public ShahiPaneer() {
        this.name = "Shahi Paneer";
    }

    public Dish clone() {
        return new ShahiPaneer();
    }
}

// Dish Registry
class DishRegistry {
    private static Map<String, Dish> dishMap = new HashMap<>();

    static {
        dishMap.put("PaneerButterMasala", new PaneerButterMasala());
        dishMap.put("ShahiPaneer", new ShahiPaneer());
    }

    public static Dish getSimilarDish(String name) {
        return dishMap.getOrDefault(name, new ShahiPaneer()).clone();
    }
}