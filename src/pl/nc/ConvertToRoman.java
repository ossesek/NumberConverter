package pl.nc;

public class ConvertToRoman extends Converter{
    String romanNumber = "";

    @Override
    protected String convert(int numberToConvert) {

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0; i<values.length; i++) {
            while(numberToConvert >= values[i]) {
                numberToConvert -= values[i];
                romanNumber += romanValues[i];
            }
        }
        return romanNumber;
    }
}
