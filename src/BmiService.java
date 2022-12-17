public class BmiService {

    public double calculate(int a, int b) {

        double result;
        byte x = 2;

        result = a /(Math.pow(b,x)) * 10000;
        return result;
    }

}
