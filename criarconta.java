public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta;
        primeiraConta.saldo = 300;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;

        saldo = 50;

        System.out.println("Primeira conta tem" + primeiraConta.saldo);
        System.out.println("Segunda conta tem" + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 150;
        System.out.println("Agora a segunda conta está"
                          + "na agencia" + segundaConta.agencia);
        
    }
}