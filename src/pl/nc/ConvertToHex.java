package pl.nc;

public class ConvertToHex extends Converter{

    public ConvertToHex() {
    }

    @Override
    protected String convert(int numberToConvert) {
        String hexNumber = "";
        hexNumber = Integer.toHexString(numberToConvert);

        if (hexNumber.length() > 1){
            return "0x" + hexNumber;
        }else{
            return "0x0" + hexNumber;
        }
    }

}
