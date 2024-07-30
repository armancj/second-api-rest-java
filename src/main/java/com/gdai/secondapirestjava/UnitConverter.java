package com.gdai.secondapirestjava;

public class UnitConverter {

    static void convert(ConversionDetails conversionDetails) {
        String fromUnit = conversionDetails.getFromUnit();
        String toUnit = conversionDetails.getToUnit();

        if (fromUnit.equals("km") && toUnit.equals("mile"))
            LengthConverter.kilometerToMile(conversionDetails);

        if(fromUnit.equals("mile") && toUnit.equals("km"))
            LengthConverter.mileToKilometer(conversionDetails);



    }
}
