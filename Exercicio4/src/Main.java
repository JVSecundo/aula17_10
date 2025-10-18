
public class Main {
    
    
    public static void main(String[] args) {

// diferentes exemplos de nomes

        String primeiroNome1 = "João";
        String sobrenome1 = "Silva";
        
        String primeiroNome2 = "Maria";
        String sobrenome2 = "Santos";
        
        String primeiroNome3 = "Pedro";
        String sobrenome3 = "Oliveira";
        
        String primeiroNome4 = "Ana";
        String sobrenome4 = "Costa";
        
// nomes completos usando a classe FormatadorNome

        String nomeCompleto1 = FormatadorNome.montarNomeCompleto(primeiroNome1, sobrenome1);
        String nomeCompleto2 = FormatadorNome.montarNomeCompleto(primeiroNome2, sobrenome2);
        String nomeCompleto3 = FormatadorNome.montarNomeCompleto(primeiroNome3, sobrenome3);
        String nomeCompleto4 = FormatadorNome.montarNomeCompleto(primeiroNome4, sobrenome4);
        
//os resultados

        System.out.println("=== Concatenador de Nome Completo ===");
        System.out.println();
        System.out.println("Exemplo 1:");
        System.out.printf("Primeiro Nome: %s%n", primeiroNome1);
        System.out.printf("Sobrenome: %s%n", sobrenome1);
        System.out.printf("Nome Completo: %s%n", nomeCompleto1);
        System.out.println();
        
        System.out.println("Exemplo 2:");
        System.out.printf("Primeiro Nome: %s%n", primeiroNome2);
        System.out.printf("Sobrenome: %s%n", sobrenome2);
        System.out.printf("Nome Completo: %s%n", nomeCompleto2);
        System.out.println();
        
//  adicionais

        System.out.println("Exemplos adicionais:");
        System.out.printf("Nome completo 3: %s%n", nomeCompleto3);
        System.out.printf("Nome completo 4: %s%n", nomeCompleto4);
        System.out.println();
        
//  nomes compostos

        String nomeComposto = FormatadorNome.montarNomeCompleto("José Carlos", "Ferreira");
        System.out.printf("Teste com nome composto: %s%n", nomeComposto);
    }
}