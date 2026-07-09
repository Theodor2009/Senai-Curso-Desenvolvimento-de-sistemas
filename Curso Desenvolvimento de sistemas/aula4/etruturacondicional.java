package aula4;

import java.sql.SQLOutput;

public class etruturacondicional {
    public static void main(String[] args) {
        int x = 5, y = 10, z = 2;
        if(x==y){
            System.out.println("X é igual a Y");
        } else if (x==y/z) {
            System.out.println("X é igual a Y dividido por Z");
        }
        else{
            System.out.println("Não temos letrs iguais");


        }
    }
}