package pl.nc;

public abstract class Converter {
    private final int numberToConvert;

    public Converter(int numberToConvert) {
        this.numberToConvert = numberToConvert;
    }

    public int getNumberToConvert() {
        return numberToConvert;
    }

    protected abstract String convert();

    public void displayResult(){
        String result = convert();
        System.out.println("Your converted value: " + result);
    }

}