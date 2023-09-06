public class Main {
    public static void main(String[] args) {
        BMIservice service = new BMIservice();
        double height = 1.87;
        double weight = 98;
        int bmi = service.calculate(height, weight);
        System.out.println(bmi);
    }
}