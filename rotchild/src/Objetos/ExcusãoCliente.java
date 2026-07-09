package Objetos;

import java.util.Scanner;
    public class ExcusãoCliente {
        public static void main(String[] args){
            clientes cli = new clientes();
            Scanner input = new Scanner(System.in);
            System.out.println("Qual o seu nome?");
            cli.nome = input.nextLine();
            System.out.println("Qual a sua idade?");
            cli.Idade = input.nextInt();
            System.out.println("Você possui dívidas?");
            System.out.println("true = Sim, false = não");
            cli.PossuiDividas = input.nextBoolean();
            System.out.println("Qual o seu salario");
            cli.Salario = input.nextDouble();
            input.nextInt();
            int resposta;
            resposta = input.nextInt();
            do {
                if (resposta == 1) {
                    cli.comprar();
                    break;
                } else if (resposta == 2) {
                    cli.vender();
                    break;
                } else {
                    System.out.println("Digite um valor válido");
                }
            }while(resposta != 1 || resposta != 2);
    }}


