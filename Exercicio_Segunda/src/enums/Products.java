package enums;

public enum Products {
    PEN {
        public Category getCategory() {
            return Category.CAT1;
        }

        public int getPrice() {
            return 1;
        }

    },
    PAPER {
        public Category getCategory() {
            return Category.CAT1;
        }

        public int getPrice() {
            return 2;
        }

    },
    FILE {
        public Category getCategory() {
            return Category.CAT3;
        }

        public int getPrice() {
            return 30;
        }

    },
    NOTEBOOK {
        public Category getCategory() {
            return Category.CAT2;
        }

        public int getPrice() {
            return 15;
        }

    };

    public abstract Category getCategory();

    public abstract int getPrice();

}
