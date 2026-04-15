public class UC2_FeetAndInchesEquality {

    static class Feet {
        private double value;

        Feet(double value) {
            this.value = value;
        }

        boolean isEqual(Feet other) {
            return this.value == other.value;
        }
    }

    static class Inches {
        private double value;

        Inches(double value) {
            this.value = value;
        }

        boolean isEqual(Inches other) {
            return this.value == other.value;
        }
    }

    public static boolean checkFeetEquality(double value1, double value2) {
        Feet feet1 = new Feet(value1);
        Feet feet2 = new Feet(value2);
        return feet1.isEqual(feet2);
    }

    public static boolean checkInchesEquality(double value1, double value2) {
        Inches inch1 = new Inches(value1);
        Inches inch2 = new Inches(value2);
        return inch1.isEqual(inch2);
    }

    public static void main(String[] args) {
        System.out.println("Feet equality: " + checkFeetEquality(5.0, 5.0));
        System.out.println("Feet equality: " + checkFeetEquality(5.0, 3.0));

        System.out.println("Inches equality: " + checkInchesEquality(10.0, 10.0));
        System.out.println("Inches equality: " + checkInchesEquality(10.0, 8.0));
    }
}