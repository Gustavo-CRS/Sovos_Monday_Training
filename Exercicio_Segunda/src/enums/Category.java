package enums;

public enum Category {
    CAT1 {
        public double getValue() {
            return 1.05;
        }
    },
    CAT2 {
        public double getValue() {
            return 1.1;
        }
    },
    CAT3 {
        public double getValue() {
            return 1.15;
        }
    };

    public abstract double getValue();
}
