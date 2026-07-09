package aula7;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
    String turno = "Manhã", turno2 = "Tarde", turno3 = "Noite";
        Scanner entrada = new Scanner(System.in);;
        int NumeroTurno;
        System.out.println("Informe o seu horário de entrada");
        System.out.println("Que eu informarei seu turno" );
        NumeroTurno = entrada.nextInt();
        switch (NumeroTurno) {
            case 1:
                System.out.println(" Seu horário de entrada é " + "das 8:00 as 12:00 e 13:00 as 17:00");
                break;
            case 2:
                System.out.println(" Seu horário de entrada é " + "das 14:00 as 18:00 e 19:00 as 23:00");
                break;
            case 3:
                System.out.println(" Seu horário de entrada é " + "das 22:00 as 02:00 e 3:00 as 07:00");
                break;
            default:
                System.err.println("Informe um número entre 1 e 3");
                break;


        }


    }
}
