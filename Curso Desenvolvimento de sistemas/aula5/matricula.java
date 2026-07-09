package aula5;

import java.util.Scanner;

public class matricula {

    public  static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriculado;
        String nome;
        System.out.println("Qual o seu nome");
        nome = entrada.nextLine();
        System.out.println("Já está matriculado no curso?");
        System.out.println("[1] Para sim\n[2] Para não");
        matriculado = entrada.nextInt();
        if (matriculado == 1){
            System.out.println("Poderá entrar no curso");
        }else if (matriculado == 2){
            System.out.println("Acesso Bloqueado");
        } else {
            System.err.println("Digite entre 1 e 2");
        }






    }
}
