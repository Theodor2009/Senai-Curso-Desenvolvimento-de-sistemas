package aula7;

import java.util.Scanner;

public class switchcase2 {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        String tipoUsuario;

        System.out.println(" Escreva o seu tipo de usuário");
        System.out.println("Gerente\nSupervisor\nVendedor");
        tipoUsuario = entrada.nextLine();
        switch (tipoUsuario){
            case "Gerente":
                System.out.println(" Tem acesso total aos módulos ");
                break;
            case "Supervisor":
                System.out.println(" Tem acesso aos módulos de Dashboard" +
                "e vendas");
                break;
            case "Vendedor":
                System.out.println(" Tem acesso apenas ao módulo de vendas");
                break;







        }



    }
}
