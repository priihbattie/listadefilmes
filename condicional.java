public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2003;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.2;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2003){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme de ação sobrenatural que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}