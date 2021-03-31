package pl.nc;

import java.util.Scanner;

public class Main {

    static String finalValue;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValueToConvert = 0;


        System.out.println("Choose a number to convert: ");
        String numberToConvert = scanner.nextLine();

        try{
            intValueToConvert = Integer.parseInt(numberToConvert);
        } catch (NumberFormatException e){
            System.err.println("Input String cannot be parsed to Integer");
            System.exit(1);
        }

        if(intValueToConvert <= 0){
            System.err.println("The number must be greater than zero");
            System.exit(1);
        }

        finalValue = Converter.convertToRoman(intValueToConvert);
        System.out.println("Your final value: " + finalValue);
    }
}
