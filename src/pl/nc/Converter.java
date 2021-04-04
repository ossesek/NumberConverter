package pl.nc;

public abstract class Converter {

    protected abstract String convert(int numberToConvert);

    public void displayResult(int numberToConvert){
        String result = convert(numberToConvert);
        System.out.println("Your converted value: " + result);
    }

}