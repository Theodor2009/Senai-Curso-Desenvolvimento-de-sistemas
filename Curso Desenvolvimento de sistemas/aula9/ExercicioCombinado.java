package aula9;


import java.util.Random;
import java.util.Scanner;

public class ExercicioCombinado { public static void main(String[] args) {
    /**  /** Você foi contratado como desenvolvedor junior em uma empresa do setor industrial.
     * Sua missão é desenvolver um protótipo de sistema para controle de produção diária
     * de máquina automatizadas. Cada máquina da linha de produção gera uma quantidade
     * de peças por turno, e o sistema deve monitorar a produção e alertar a supervisão
     * em casos fora do padrão.
     * A fábrica possui 5 máquinas principais, e cada uma trabalha em 3 turnos(
     * manhã, tarde e noite). O gerente de produção deseja saber:
     * Qual a quantidade total de peças produzidas por máquina no dia.
     * Se algum turno teve produção abaixo de 100 peças, deve-se gerar um alerta de baixa
     * produtividade.
     * Calcular a média de produção diária por máquina.
     */

    Random numeroAleatrorio = new Random();
    String turno1 = "Manhã", turno2 = "Tarde", turno3 = "Noite";
    double mediaTurno = 0;
    int maquina;
    for (int i = 1; i <= 3; i++) {
        System.out.printf("Turno%d\n", i);
        for (int j = 1; j <= 5; j++) {
            System.out.printf("Maquina%d = %d\n",j, maquina = numeroAleatrorio.nextInt(100));
            mediaTurno += maquina;
        }
       String alerta = mediaTurno < 100 ? "Fabricação do turno abaixo do esperado": "Meta do turno ok";
        System.out.println(alerta);
        System.out.printf("Média do turno Turno%d = %.2f\n",i,mediaTurno);

    }

}
}