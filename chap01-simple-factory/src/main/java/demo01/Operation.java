package demo01;

/**
 * 业务的封装
 */
public class Operation {
    public static double GetResult(double numberA, double numberB, String operate) {
        double result = 0d;
         switch (operate) {
             case "+": {
                 result = numberA + numberB;
                 break;
             }
             case "-": {
                 result = numberA - numberB;
                 break;
             }
             case "*": {
                 result = numberA * numberB;
                 break;
             }
             case "/": {
                 result = numberA / numberB;
                 break;
             }
         }
        return result;
    }
}
