public class BMIservice {
    public int calculate(double heightM, double weightKg) {
        double index = weightKg / (heightM * heightM);
        int bmi = (int) index;
        return bmi;
    }
}
