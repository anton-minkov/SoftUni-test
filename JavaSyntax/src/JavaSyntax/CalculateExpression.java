package JavaSyntax;

import java.util.Scanner;

/**
 * Created by anton on 16-3-21.
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextFloat();
        double b = input.nextFloat();
        double c = input.nextFloat();

        double stepen1 = (a + b + c) / Math.sqrt(c);
        double f1 = Math.pow(((a * a + b * b) / (a * a - b * b)), stepen1);

        double stepen2 = a - b;
        double f2 = Math.pow((a * a + b * b - c * c * c), stepen2);
        System.out.println(String.format("F1 result: " + f1 + "; F2 result: " + f2 + "; Diff: " + Math.abs((a+b+c)/3- (f1+f2)/2)));
}
}
