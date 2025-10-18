
public class Main {
    
    
    public static void main(String[] args) {
//diferentes valores de lado      

        double lado1 = 5.0;
        double lado2 = 3.5;
        double lado3 = 10.0;
        
//calculando as áreas usando a classe CalculadoraGeometria

        double area1 = CalculadoraGeometria.calcularAreaQuadrado(lado1);
        double area2 = CalculadoraGeometria.calcularAreaQuadrado(lado2);
        double area3 = CalculadoraGeometria.calcularAreaQuadrado(lado3);
        
// resultados

        System.out.println("=== Calculadora de Área de Quadrado ===");
        System.out.println();
        System.out.printf("Lado: %.1f -> Área: %.2f%n", lado1, area1);
        System.out.printf("Lado: %.1f -> Área: %.2f%n", lado2, area2);
        System.out.printf("Lado: %.1f -> Área: %.2f%n", lado3, area3);
        System.out.println();
        
//  valor zero

        double ladoZero = 0.0;
        double areaZero = CalculadoraGeometria.calcularAreaQuadrado(ladoZero);
        System.out.printf("Teste com lado zero: %.1f -> Área: %.2f%n", ladoZero, areaZero);
        
       
// Teste adicional com valor decimal

        double ladoDecimal = 2.5;
        double areaDecimal = CalculadoraGeometria.calcularAreaQuadrado(ladoDecimal);
        System.out.printf("Teste com lado decimal: %.1f -> Área: %.2f%n", ladoDecimal, areaDecimal);
    }
}