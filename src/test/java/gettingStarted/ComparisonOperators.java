package gettingStarted;

public class ComparisonOperators {

    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println("x == true : " + (x == true));
        System.out.println("x == false : " + (x == false));
        System.out.println("x != false : " + (x != false));

        System.out.println("x == y : " + (x == y));
        System.out.println("x != y : " + (x != y));

        System.out.println("\n --------------------------------------");

        int a = 5, b = 7;

        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a == 5 : " + (a == 5));
        System.out.println("a != 5 : " + (a != 5));
        System.out.println("b == 5 : " + (b == 5));
        System.out.println("b != 5 : " + (b != 5));

        System.out.format("\nFinal a = %d \t Final b = %d", a, b);
        System.out.println("\n --------------------------------------");

        System.out.println("a < 10 : " + (a < 10));
        System.out.println("a > 10 : " + (a > 10));
        System.out.println("a < b : " + (a < b));
        System.out.println("a < 5 : " + (a < 5));
        System.out.println("a <= 5 : " + (a <= 5));
        System.out.println("a > 5 : " + (a > 5));
        System.out.println("a >= 5 : " + (a >= 5));

        System.out.format("\nFinal a = %d \t Final b = %d", a, b);

        System.out.println("\n --------Comparing Strings-------------");

        String c = "Java";
        String d = "Beverage";

        System.out.println("c.equals(\"Java\") : " + (c.equals("Java")));
        System.out.println("c.equals(d) : " + (c.equals(d)));
        System.out.println("c.equals(\"java\") : " + (c.equals("java")));
        System.out.println("c.equalsIgnoreCase(\"java\") : " + (c.equalsIgnoreCase("java")));
        System.out.println("!c.equalsIgnoreCase(\"java\") : " + (!c.equalsIgnoreCase("java")));

        System.out.format("\nFinal c = %s \t Final d = %s", c, d);

    }

}
