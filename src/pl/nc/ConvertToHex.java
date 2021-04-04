package pl.nc;

public class ConvertToHex extends Converter{
    String hexNumber = null;

    @Override
    protected String convert(int numberToConvert) {
        hexNumber = Integer.toHexString(numberToConvert);

        if (hexNumber.length() > 1){
            return "0x" + hexNumber;
        }else{
            return "0x0" + hexNumber;
        }
    }

}
