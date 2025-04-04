class GenericCalculator<T extends Number> {
    public double add(T a, T b) {
        return a.doubleValue() + b.doubleValue(); // Adds two numbers
    }

    public double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue(); // Multiplies two numbers
    }
}

