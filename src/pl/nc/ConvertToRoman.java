package pl.nc;

public class ConvertToRoman extends Converter{

    public ConvertToRoman(int numberToConvert) {
        super(numberToConvert);
    }

    @Override
    protected String convert() {
        int numberToConvert = getNumberToConvert();
        StringBuilder romanNumber = new StringBuilder();
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0; i<values.length; i++) {
            while(numberToConvert >= values[i]) {
                numberToConvert -= values[i];
                romanNumber.append(romanValues[i]);
            }
        }
        return romanNumber.toString();
    }
}
