
public class Main {
    
    
    public static void main(String[] args) {
        
        double celsius1 = 0.0;      //ponto de congelamento da água
        double celsius2 = 100.0;    // Ponto de ebulição da água
        double celsius3 = 25.0;     //Temperatura ambiente agradável
        double celsius4 = -10.0;    //temperatura negativa
        double celsius5 = 37.0;     // temperatura corporal normal
        


        double fahrenheit1 = ConversorTemperatura.celsiusParaFahrenheit(celsius1);
        double fahrenheit2 = ConversorTemperatura.celsiusParaFahrenheit(celsius2);
        double fahrenheit3 = ConversorTemperatura.celsiusParaFahrenheit(celsius3);
        double fahrenheit4 = ConversorTemperatura.celsiusParaFahrenheit(celsius4);
        double fahrenheit5 = ConversorTemperatura.celsiusParaFahrenheit(celsius5);
        
    //os resultados

        System.out.println("=== Conversor de Temperatura (Celsius para Fahrenheit) ===");
        System.out.println();
        System.out.printf("%.1f°C -> %.1f°F (Ponto de congelamento da água)%n", celsius1, fahrenheit1);
        System.out.printf("%.1f°C -> %.1f°F (Ponto de ebulição da água)%n", celsius2, fahrenheit2);
        System.out.printf("%.1f°C -> %.1f°F (Temperatura ambiente agradável)%n", celsius3, fahrenheit3);
        System.out.printf("%.1f°C -> %.1f°F (Temperatura negativa)%n", celsius4, fahrenheit4);
        System.out.printf("%.1f°C -> %.1f°F (Temperatura corporal normal)%n", celsius5, fahrenheit5);
        System.out.println();
        
        
        double celsiusDecimal = 36.5;
        double fahrenheitDecimal = ConversorTemperatura.celsiusParaFahrenheit(celsiusDecimal);
        System.out.printf("Teste decimal: %.1f°C -> %.2f°F%n", celsiusDecimal, fahrenheitDecimal);
    }
}