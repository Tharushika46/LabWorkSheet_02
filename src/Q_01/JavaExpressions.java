package Q_01;

import java.lang.Math;

public class JavaExpressions {
    public static void main(String[] args) {
        int A = 5;
        int B = 10;
        int C = 2;
        int X = 20;
        int Y = 5;
        int R = 7;
        final double Pi = 3.14;
        System.out.println("a. " + Math.sqrt((B * B) - 4 * A * C));
        System.out.println("b. " + Math.sqrt(X + 4 * (Y * Y * Y)));
        System.out.println("c. " + Math.cbrt(X*Y));
        System.out.println("d. " + Pi*R*R);
    }
}
