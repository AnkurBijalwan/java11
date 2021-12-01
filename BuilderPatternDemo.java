/**
 * Small demo to illustrate builder pattern
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Subway s= new Subway.Builder(Sandwich.ALOO_PATTY,Bread.Flat_Bread).build();
            System.out.println(s instanceof Subway);
    }
}

class Subway {
    private Sandwich sandwich;
    private Bread bread;
    private Flavour flavour;
    private Cheese cheese;
    private Veggie veggie;

    public static class Builder {
        private Sandwich sandwich;
        private Bread bread;
        private Flavour flavour;
        private Cheese cheese;
        private Veggie veggie;

        public Builder(Sandwich s, Bread b) {
            this.sandwich = s;
            this.bread = b;
        }

        public Builder setFlavour(Flavour f) {
            this.flavour = f;
            return this;
        }

        public Builder setCheese(Cheese c) {
            this.cheese = c;
            return this;
        }

        public Builder setVeggie(Veggie v) {
            this.veggie = v;
            return this;
        }

        public Subway build() {
            return new Subway(this);
        }

    }

    private Subway(Builder b) {
        sandwich = b.sandwich;
        bread = b.bread;
        flavour = b.flavour;
        cheese = b.cheese;
        veggie = b.veggie;
    }
}

enum Sandwich {
    ALOO_PATTY, CHICKEN_KOFTA, CORN_PEAS, PANEER_TIKKA
}

enum Bread {
    Wheat, Italian, Oregano, Flat_Bread
}

enum Flavour {
    veggie, meat, cheese
}

enum Cheese {
    crispy, spicy
}

enum Veggie {
    Lettuce, cucumber, tomatoes, onions, olives, pickle
}

enum Sauce {
    RED_CHILLI, MUSTARD, Mint, Sweet
}
