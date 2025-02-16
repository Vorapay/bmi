public class BmiService {
    public int calculate(double heightMeter, int weightKilogram) {
        int bodyMassIndex = (int) (weightKilogram / (heightMeter * heightMeter));
        return bodyMassIndex;
    }
}
