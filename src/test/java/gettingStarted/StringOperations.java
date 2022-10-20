package gettingStarted;

public class StringOperations {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName + " " + lastName);

        String x = "100";
        int y = 50;

        System.out.println("String x + int y = " + (x + y));

//        John Doe
//        String x + int y = 10050

        char[] ch = {'L', 'O', 'O', 'N', 'Y', 'C', 'O', 'R', 'N'};

        String name = new String(ch);

        System.out.println("The character array: " + ch);
        System.out.println("The string: " + name);

//        The character array: [C@3d646c37
//        The string: LOONYCORN

        System.out.println("\n----------------------------------------");

        String phrase = "   Live and let live!  ";
        System.out.println("The original string: " + phrase);
        System.out.println("The length of the string: " + phrase.length());
        System.out.println("The string in uppercase: " + phrase.toUpperCase());
        System.out.println("The string in lowercase: " + phrase.toLowerCase());
        System.out.println("The trimmed string: " + phrase.trim());

        System.out.println("\n----------------------------------------");

        System.out.println("\nWhat is the location of the first 't'? : " + phrase.indexOf('t'));
        System.out.println("What is the location of the first 'v'? : " + phrase.indexOf('v'));
        System.out.println("What is the location of the first '!'? : " + phrase.indexOf('!'));
        System.out.println("What is the location of the first 'x'? : " + phrase.indexOf('x'));

        System.out.println("\nWhat is the location of the last 't'? : " + phrase.lastIndexOf('t'));
        System.out.println("What is the location of the last 'v'? : " + phrase.lastIndexOf('v'));

        System.out.println("\nWhat is character at position 3? : " + phrase.charAt(3));
        System.out.println("What is character at position 33? : " + phrase.charAt(33));

    }

}
