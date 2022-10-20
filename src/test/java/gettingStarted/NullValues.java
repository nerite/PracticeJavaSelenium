package gettingStarted;

public class NullValues {

    public static void main(String[] args) {

        String nullString = null;
        int intValue = 0;
        String blankString = "";

        System.out.println("Null string value: " + nullString);
        System.out.println("intValue: " + intValue);

//        Null string value: null
//        intValue: 0

        System.out.println("\nIs a null string the same as a blank one? : " + blankString.equals(nullString));

//        Is a null string the same as a blank one? : false

        System.out.println("\nIs a null string the same as a blank one? : " + nullString.equals(blankString));

//        Exception in thread "main" java.lang.NullPointerException
//        at gettingStarted.NullValues.main(NullValues.java:21)

    }

}
