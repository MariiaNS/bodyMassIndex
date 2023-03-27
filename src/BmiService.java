public class BmiService {
    public double calculate(double m, double h) {
        double bodyMassIndex = m / Math.pow(h, 2);
        return (int) bodyMassIndex;
    }
}
