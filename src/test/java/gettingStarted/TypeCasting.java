package gettingStarted;

public class TypeCasting {

    public static void main(String[] args) {

        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

//        9
//        9.0

        float myFloat = 8.5f;
        myDouble = 7.3;
        double floatToDouble = myFloat;
        float intToFloat = myInt;

        System.out.println("Float to Double: " + floatToDouble);
        System.out.println("Int to Float: " + intToFloat);

//        Float to Double: 8.5
//        Int to Float: 9.0

        char myChar = 'A';
        int charToInt = myChar;
        float charToFloat = myChar;

        System.out.println("\nchar value is : " + myChar);
        System.out.println("int value is : " + charToInt);
        System.out.println("float value is : " + charToFloat);

//        char value is : A
//        int value is : 65
//        float value is : 65.0

        float doubleToFloat = (float)myDouble;
        int doubleToInt = (int)myFloat;

        System.out.println("\nFloat to Double: " + floatToDouble);
        System.out.println("Int to Float: " + intToFloat);
        System.out.println("Double to Float: " + doubleToFloat);
        System.out.println("Double to Int: " + doubleToInt);

//        Float to Double: 8.5
//        Int to Float: 9.0
//        Double to Float: 7.3
//        Double to Int: 8

        myInt = 100;
        char intToChar = (char)myInt;

        System.out.println("\ninteger value is : " + myInt);
        System.out.println("character value is : " + intToChar);

//        integer value is : 100
//        character value is : d

    }

}
