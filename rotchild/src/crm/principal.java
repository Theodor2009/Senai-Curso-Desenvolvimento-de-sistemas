package crm;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cliente cli = new Cliente();
        Integer resposta;
        do {
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("[1]  Cadastrar cliente");
            System.out.println("[2]  Atualizar cliente");
            System.out.println("[3]  Remover cliente");
            System.out.println("[4]  consultar cliente");
            System.out.println("[99] Sair do sistema");
            resposta = input.nextInt();
            switch (resposta) {
                case 1:
                    cli.cadastrarCliente();
                    break;
                case 2:
                    cli.atualizarCliente();
                    break;
                case 3:
                    cli.deletarCliente();
                    break;
                case 4:
                    cli.consultarCliente();
                    break;
                case 99:
                    System.out.println("Saindo do sistema....");
                    break;
                default:
                    System.out.println("Digite de 1 a 4, ou digite 99 para sair do sistema");
            }

        } while (resposta != 99) ;
    }
}