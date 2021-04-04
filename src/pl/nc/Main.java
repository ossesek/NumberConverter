package pl.nc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intValueToConvert = 0;
        String conversionType = null;
        Converter convertToHex = new ConvertToHex();
        Converter convertToRoman = new ConvertToRoman();

        System.out.println("Choose number and conversion type (Roman/Hexadecimal) ");
        String userChoice = scanner.nextLine();
        String[] parts = userChoice.split(" ");

        try{
            intValueToConvert = Integer.parseInt(parts[0]);
        } catch (NumberFormatException e){
            System.err.println("Input String cannot be parsed to Integer");
            System.exit(1);
        }

        if(intValueToConvert <= 0){
            System.err.println("The number must be greater than zero");
            System.exit(1);
        } else if (parts.length < 2){
            System.err.println("Select conversion type (Roman/Hexadecimal)");
            System.exit(1);
        } else {
            conversionType = parts[1].toUpperCase();
        }

        if(conversionType.charAt(0) != 'R' && conversionType.charAt(0) != 'H'){
            System.err.println("Select the correct conversion type (Roman/Hexadecimal)");
            System.exit(1);
        } else if (conversionType.charAt(0) == 'R') {
            convertToRoman.displayResult(intValueToConvert);
        } else {
            convertToHex.displayResult(intValueToConvert);
        }

    }
}
