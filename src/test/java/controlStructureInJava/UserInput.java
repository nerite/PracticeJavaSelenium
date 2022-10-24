package controlStructureInJava;



import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.print("Enter the temperature in Fahrenheit: ");
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        float temperature = scanner.nextFloat();
        System.out.print("Enter a name : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("The input temperature is : " + temperature);
        System.out.println("The name entered is : " + name);
        if(temperature >= 84) {
            System.out.println("It's a hot day! Remember to stay hydrated.");
        }else{
            System.out.println("A t-shirt and shorts may not be the best option today.");
        }
        System.out.println("Have a Nice day !!!! ");

        String result = ( temperature >= 84) ? "hot" : "not so hot" ;
        System.out.println("The weather today is " + result);

       // String tempLevel = null;
//        if(temperature >= 84){
//            tempLevel = "Hot";
//        }
//        if(temperature >= 70 && temperature < 84){
//            tempLevel = "Warm";
//        }
//        if(temperature >= 55 && temperature < 70){
//            tempLevel = "Cool";
//        }
//        if(temperature < 55) {
//            tempLevel = "Cold";
//        }
        // ---------------------------------------------------
//        if(temperature >= 84){
//            tempLevel = "Hot";
//        }
//        else if(temperature >= 70){
//            tempLevel = "Warm";
//        }
//        else if(temperature >= 55){
//            tempLevel = "Cool";
//        }
//        else {
//            tempLevel = "Cold";
//        }
        //-------------------------------------------------------

        String tempLevel = (temperature >= 84) ? "Hot"
                : (temperature >= 70 && temperature < 84) ? "Warm"
                : (temperature >= 55 && temperature < 70) ? "Cool" : "Cold";
        System.out.println("Temperature Level = " + tempLevel);

    }

}


