package aula5;

import java.util.Scanner;

public class estacinamento {
    /*Um sistema de estacionamento precisa validar a entrada de veículos.
    Se o motorista possuir ticket válido, a cancela deve abrir automaticamente.
    Caso contrário, o acesso deve ser negado.*/
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

         int sim;
        System.out.println("o senhor possui ticket?");
        System.out.println("[1] para sim\n[2] para nao");
        sim = entrada.nextInt();
        if (sim == 1){
            System.out.println("Entrada permitida");
        }
        else if (sim == 2){
            System.out.println("entrada negada");
        }
        else {
            System.err.println("erro");
        }





    }

}
