public class BmiService {
    public int calculate(double heightMeter, int weightKilogram) {
        int v=(int) (weightKilogram/(heightMeter*heightMeter));
        return v;
    }
}
