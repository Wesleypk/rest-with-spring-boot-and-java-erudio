package br.com.erudio.services.converters;

import br.com.erudio.exception.UnsupportedMathOperationExeption;

public class NumberConverter {

    public static Double convertToDouble(String strNumber) throws IllegalArgumentException{
        if(strNumber == null || strNumber.isEmpty())
            throw new UnsupportedMathOperationExeption("Please set a numeric value!");
        String number = strNumber.replace(",",".");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber == "");
        String number = strNumber.replace(",",".");
        return  (number.matches("[-+]?[0-9]*\\.?[0-9]+"));
    }
}
