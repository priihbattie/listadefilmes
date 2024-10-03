public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme: Anjos da Noite - Underworld");

        int anoDeLançamento = 2003;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;

        double media = (9.1 + 8.0 + 8.7) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Anjos da Noite - Underworld
                Filme de Terror/Ação com lobisomens e vampiros
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media /2);
        System.out.println(classificacao);

    }
}