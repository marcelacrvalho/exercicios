package exerciciosbasico.propriedadesString;

public class ImprimeString {

    public static void main(String[] args) {
        
        String nome = "Stephany";

        for(int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
    }
}
