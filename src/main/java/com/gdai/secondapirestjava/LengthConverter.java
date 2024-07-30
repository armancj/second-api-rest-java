package com.gdai.secondapirestjava;

public class LengthConverter {

    static void kilometerToMile(ConversionDetails conversionDetails){
        float km = conversionDetails.getFromValue();
        float mile = km * 0.621371f;
        conversionDetails.setToValue(mile);
    }
    static void mileToKilometer(ConversionDetails conversionDetails){
        float mile = conversionDetails.getFromValue();
        float km = mile * 1.03934f;
        conversionDetails.setToValue(km);
    }
}
