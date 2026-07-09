package aula4;

import javax.swing.*;

public class Exerciciocondicional {
    public static void main(String[] args) {
        /*
        Crie 3 comdições, onde elas irão fazer aas seguintes validações:
        1° Maria tem mais de 18 anos,
         se for igual sim,
        então Maria Poderá entrar na festa.
        2° Tadeu tem mais de 16 anos, se for igual sim,
         então Tadeu não poderá trabalhar como menor aprendiz.
        3° Se o carro custar mais de 100mil reais
          então Marcos não poderá comprar o carro no momento.

         */


        String nome = "Maria", nome2 = "Tadeu";
        int idadeMaria = 18, idadeTadeu = 16;
        double valorCarro = 69990, saldoJoão = 100000;

        if (idadeMaria >= 18) {
            System.out.printf(" %s Poderá entrar na festa, pois ela antingiu "
                    + " a maior idade ", nome);
        } else {
            System.out.printf("  Não poderá entrar na festa, pois ela não "
                    + " a maior idade ", nome);
        }
        if (idadeTadeu > 16) {
            System.out.printf(" %s Não poderá trabalhar como menor aprendiz, pois tem "
                    + " pois ele passou da idade maxima ", nome2);
        } else {
            System.out.printf(" %s poderá trabalhar como menor aprendiz "
                    , nome2);
        }
        if (valorCarro > saldoJoão) {
            System.out.printf(" O saldo de João é insuficiente: %.2f",saldoJoão );
        }else {
            System.out.printf(" João poderá comprar o carro, saldo: %.2f ", saldoJoão);
        }
    }

}




















