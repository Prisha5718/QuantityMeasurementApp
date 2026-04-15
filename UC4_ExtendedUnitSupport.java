public class UC4_ExtendedUnitSupport {

    enum LengthUnit {
        FEET(1.0),
        INCHES(1.0 / 12.0),
        YARDS(3.0),
        CENTIMETERS(0.393701 / 12.0);

        private final double toFeetFactor;

        LengthUnit(double toFeetFactor) {
            this.toFeetFactor = toFeetFactor;
        }

        public double toFeet(double value) {
            return value * toFeetFactor;
        }
    }

    static class QuantityLength {
        private double value;
        private LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit) {
            this.value = value;
            this.unit = unit;
        }

        private double convertToFeet() {
            return unit.toFeet(value);
        }

        public boolean isEqual(QuantityLength other) {
            return this.convertToFeet() == other.convertToFeet();
        }
    }

    public static void main(String[] args) {
        QuantityLength length1 = new QuantityLength(1, LengthUnit.YARDS);
        QuantityLength length2 = new QuantityLength(3, LengthUnit.FEET);

        QuantityLength length3 = new QuantityLength(30.48, LengthUnit.CENTIMETERS);
        QuantityLength length4 = new QuantityLength(1, LengthUnit.FEET);

        System.out.println("1 yard == 3 feet : " + length1.isEqual(length2));
        System.out.println("30.48 cm == 1 foot : " + length3.isEqual(length4));
    }
}
