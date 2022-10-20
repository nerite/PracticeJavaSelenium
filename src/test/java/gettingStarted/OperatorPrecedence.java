package gettingStarted;

public class OperatorPrecedence {

    public static void main(String[] args) {

        double a = 2, b = 5, c = 6, d = 10;

        System.out.println("a + b * d = " + (a + b * d));
        System.out.println("(a + b) * d = " + (a + b) * d);
        System.out.println("a + (b * d) = " + (a + (b * d)));

//        a + b * d = 52.0
//        (a + b) * d = 70.0
//        a + (b * d) = 52.0

        System.out.println("a + b / d = " + (a + b / d));
        System.out.println("(a + b) / d = " + ((a + b) / d));
        System.out.println("a + b / d - c = " + (a + b / d - c));
        System.out.println("a + b / (d - c) = " + (a + b / (d - c)));

//        a + b / d = 2.5
//        (a + b) / d = 0.7
//        a + b / d - c = -3.5
//        a + b / (d - c)3.25

    }

}
