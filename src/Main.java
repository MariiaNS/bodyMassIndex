public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 98; // m - масса тела в килогаммах
        double h = 1.87; // h - рост в метрах
        double bodyMassIndex = service.calculate(m, h);
        System.out.println(bodyMassIndex);
    }
}