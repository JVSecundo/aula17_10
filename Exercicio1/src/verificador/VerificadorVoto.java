package verificador;

public class VerificadorVoto {
    public static String podeVotar(int idade) {
        if (idade >= 16) {
            return "Pode votar.";
        } else {
            return "Não pode votar.";
        }
    }
    public static void main(String[] args) {
        int[] testes = {15, 16, 18};
        for (int idade : testes) {
            System.out.println("idade=" + idade + ": " + VerificadorVoto.podeVotar(idade));
        }
    }
}
