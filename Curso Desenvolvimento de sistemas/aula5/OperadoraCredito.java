package aula5;

import java.util.Scanner;

public class OperadoraCredito {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String nome, cpf;
        int idade, dividas;
        double salario;
        System.out.println(" Para solicitar um emprestimo, digite "
        + " os seus dados ");
        System.out.println(" Digite o seu nome por favor ");
        nome = entrada.nextLine();
        System.out.println(" Digite seu cpf por favor ");
        cpf = entrada.nextLine();
        System.out.println(" Digite sua idade por favor ");
        idade = entrada.nextInt();
        System.out.println(" Você possui dividas\n[1] para sim\n"
          + "[2] para não");
        dividas = entrada.nextInt();
        System.out.println(" Digite seu salario por favor ");
        salario = entrada.nextDouble();

        if (dividas == 2 && idade > 18 ){
            System.out.printf("Aceita emprestimo");
        }else if (dividas == 1 && idade > 18 && salario > 5000) {
            System.out.println("devera entrar em analise");
        }else if (dividas == 1 && idade > 18 & salario < 5000) {
            System.out.println("Emprestimo negado");
        }else {
            System.out.println("Emprestimo negado");
            System.err.println("Error, prencha novamnte!");
        }

        }


    }

