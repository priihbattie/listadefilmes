public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDaMicaela = new Conta();
        contaDaMicaela.saldo = 500;
        contaDaMicaela.deposita = (45);
        System.out.println(contaDaMicaela.saldo);

        boolean conseguiuRetirar = contaDaMicaela.saca(25);
        System.out.println(contaDaMicaela.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMicaela = new Conta();
        contaDaMicaela.deposita(1000);
        boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
        if(sucessoTransferencia) {
            System.out.println("Transferencia com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMicaela.saldo);
        System.out.println(contaDoLucas.saldo);

        contaDoLucas.titular = "Lucas Ferreira";
        System.out.println(contaDoLucas.titular);
    }
}