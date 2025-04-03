public class ComboMeal {
    private String mainDish;
    private String side;
    private String drink;

    private ComboMeal(Builder builder) {
        this.mainDish = builder.mainDish;
        this.side = builder.side;
        this.drink = builder.drink;
    }

    public void showCombo() {
        System.out.println("Combo Meal: " + mainDish + ", " + side + ", " + drink);
    }

    public static class Builder {
        private String mainDish;
        private String side;
        private String drink;

        public Builder setMainDish(String mainDish) {
            this.mainDish = mainDish;
            return this;
        }

        public Builder setSide(String side) {
            this.side = side;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public ComboMeal build() {
            return new ComboMeal(this);
        }
    }
}