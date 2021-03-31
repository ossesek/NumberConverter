package pl.nc;

public class Converter {

    public static String convertToRoman(int numberToConvert) {
        String romanNumber ="";

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0;i<values.length;i++) { //104
            while(numberToConvert >= values[i]) {
                numberToConvert -= values[i];
                romanNumber += romanLiterals[i];
            }
        }

        return romanNumber;
    }

    public static String convertToHex(int numberToConvert){

        String hexNumber = Integer.toHexString(numberToConvert);

        if (hexNumber.length() > 1){
            return "0x" + hexNumber;
        }else{
            return "0x0" + hexNumber;
        }
    }
}