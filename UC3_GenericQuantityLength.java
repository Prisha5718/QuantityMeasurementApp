public class UC3_GenericQuantityLength {

    static class QuantityLength {
        private double value;
        private String unit;

        private static final double FEET_TO_FEET = 1.0;
        private static final double INCH_TO_FEET = 1.0 / 12.0;

        public QuantityLength(double value, String unit) {
            this.value = value;
            this.unit = unit.toLowerCase();
        }

        private double toFeet() {
            switch (unit) {
                case "feet":
                    return value * FEET_TO_FEET;
                case "inches":
                    return value * INCH_TO_FEET;
                default:
                    throw new IllegalArgumentException("Unsupported unit: " + unit);
            }
        }

        public boolean isEqual(QuantityLength other) {
            return this.toFeet() == other.toFeet();
        }
    }

    public static void main(String[] args) {
        QuantityLength length1 = new QuantityLength(1, "feet");
        QuantityLength length2 = new QuantityLength(12, "inches");

        System.out.println("Are equal: " + length1.isEqual(length2));
    }
}
