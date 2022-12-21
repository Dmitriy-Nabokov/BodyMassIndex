public class BmiService {

    public double calculate(int massOfBody, int heightOfBody) {

        double result;
        byte degree = 2;

        result = massOfBody /(Math.pow(heightOfBody,degree)) * 10000;
        return result;
    }

}
