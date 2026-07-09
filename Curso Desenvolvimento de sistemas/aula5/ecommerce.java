package aula5;

import java.util.Scanner;

public class ecommerce {
    public static void main(String[]args){
       Scanner entrada = new Scanner(System.in);

        int preço ;
        int clientePremium;
        System.out.println("O senhor é Cliente Premium");
        System.out.println("[1] sim   [2] não");
        clientePremium = entrada.nextInt();
        System.out.println("qual valo da compra");
        preço = entrada.nextInt();


        if (clientePremium == 1 && preço >300){
            System.out.println("voce recebe desconto de 20% ");
        }
        else if (clientePremium == 2 && preço > 300) {
            System.out.println("voce ganha 10% de desconto");
        }
        else {
            System.out.println("pobre nojento");
        }






    }
}
