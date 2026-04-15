public class UC1_FeetMeasurementEquality {

    public boolean areEqual(double feet1, double feet2) {
        return feet1 == feet2;
    }

    public static void main(String[] args) {
        UC1_FeetMeasurementEquality app = new UC1_FeetMeasurementEquality();
        System.out.println(app.areEqual(5.0, 5.0));
    }
}
