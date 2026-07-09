package Aula8;
import java.util.Random;
import java.util.Scanner;
public class Acertanumero{
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio = aleatorio.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;
        System.out.println("Adivinhe o número (de 1 a 100!) ");
        do {
            System.out.println("Qual o seu palpite");
            palpite = entrada.nextInt();
            tentativas++;
            if (palpite > numeroAleatorio) {
                System.err.println("Tente um número menor");
            } else if (palpite < numeroAleatorio) {
                System.err.println("Tente um número maior");
            }
        }while ( palpite != numeroAleatorio);
        System.out.printf("Parabéns! Você acertou em %d tentativas \n",tentativas);




        }
    }
