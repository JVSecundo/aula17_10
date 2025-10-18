package app;

import verificador.VerificadorVoto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 1 - Verificador de Idade para Votação");
        
    // t diferentes idades
    
        int[] idades = {12, 15, 16, 17, 18, 25};
        
        for (int idade : idades) {
            String resultado = VerificadorVoto.podeVotar(idade);
            System.out.println("Idade " + idade + " anos: " + resultado);
        }
    }
}
