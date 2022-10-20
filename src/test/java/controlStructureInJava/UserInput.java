package controlStructureInJava;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        System.out.print("Enter the temperature in Fahrenheit: ");
        Scanner tempInput = new Scanner(System.in);
        //int temperature = tempInput.nextInt();
        float temperature = tempInput.nextFloat();

        // double temperature = tempInput.nextDouble();   // doesn't let to enter double value
        System.out.println("The input temperature is : " + temperature);

    }

}


