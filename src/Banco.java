import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 2500;
        int opcao = 0;
        double valor = 0;

        String menu = ("Operações" +
                "\n1 - Consultar valores" +
                "\n2 - Transferir" +
                "\n3 - Receber" +
                "\n4 - Sair" +
                "\n\nDigite a opção desejada: ");


        System.out.println("********************" +
                "\n\nDados iniciais do cliente:" +
                "\nNome: Renato Ghirelli" +
                "\nTipo de conta: Corrente" +
                "\nSaldo inicial: R$ 2500,00" +
                "\n\n********************\n");


        while (opcao != 4) {
            System.out.println(menu);
            opcao = sc.nextInt();



            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor que irá transferir: R$");
                    valor = sc.nextDouble();

                    if (valor > saldo) {

                        System.out.println("Limite insuficiente!");

                    } else {
                        saldo = saldo - valor;
                        System.out.println("Transfrência realizada com sucesso, saldo atualizado: R$" + (saldo));
                    }
                    break;

                case 3:
                    System.out.println("Digite o valor que irá receber: R$");
                    valor = sc.nextDouble();
                    saldo = saldo + valor;
                    System.out.println("Trânsferencia recebida com sucesso! Saldo atualizado: R$" + (saldo));
                    break;

                default:
                    if (opcao == 4) {
                        System.out.println("Obrigado por usar os nossos serviços!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
            }
        }

    }
}
