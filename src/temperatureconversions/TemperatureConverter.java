package temperatureconversions;

public class TemperatureConverter {
    public void convertFarenheitToCelsius(double fahrenheit){
        System.out.println(5 * (fahrenheit - 32) / 9);
    }
    public void convertFarenheitToKelvin(double fahrenheit){
        System.out.println(5 * (fahrenheit - 32) / 9 + 273.15);
    }
    public void convertCelsiusToFarenheit(double celsius){
        System.out.println(1.8 * celsius + 32);
    }
    public void convertCelsiusToKelvin(double celsius){
        System.out.println(celsius + 273.15);
    }
    public void convertKelvinToFarenheit(double kelvin){
        System.out.println(1.8 * kelvin - 459.67);
    }
    public void convertKelvinToCelsius(double kelvin){
        System.out.println(kelvin - 273.15);
    }


}
