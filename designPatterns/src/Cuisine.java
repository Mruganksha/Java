public interface Cuisine {
    void cook();
}

// Concrete Cuisine Types
class IndianCuisine implements Cuisine {
    public void cook() {
        System.out.println("Cooking Indian Cuisine.");
    }
}

class ChineseCuisine implements Cuisine {
    public void cook() {
        System.out.println("Cooking Chinese Cuisine.");
    }
}

class ItalianCuisine implements Cuisine {
    public void cook() {
        System.out.println("Cooking Italian Cuisine.");
    }
}

// Abstract Factory
interface CuisineFactory {
    Cuisine createCuisine();
}

// Concrete Factories
class IndianCuisineFactory implements CuisineFactory {
    public Cuisine createCuisine() {
        return new IndianCuisine();
    }
}

class ChineseCuisineFactory implements CuisineFactory {
    public Cuisine createCuisine() {
        return new ChineseCuisine();
    }
}

class ItalianCuisineFactory implements CuisineFactory {
    public Cuisine createCuisine() {
        return new ItalianCuisine();
    }
}