public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1986;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assitir!");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("true") ) {
            System.out.println("Filme Liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

    }
}
