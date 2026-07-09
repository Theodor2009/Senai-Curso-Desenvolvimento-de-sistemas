package Aula10;

import java.util.Scanner;

public class ExercicioCombinado2 {
    public static void main(String[] args) {
        Scanner inputTexto = new Scanner(System.in);
        Scanner inputNumero = new Scanner(System.in);
        String nome, cpf;
        double salario, valorFinanciar;
        int idade = 19, filhos;
        String estadoCivil;
        int resposta;

        System.out.println("Bem vindo ao sistema!");
        do {
            System.out.println("Preencha os seus dados abaixo");
            System.out.println("Digite o seu nome");
            nome = inputTexto.nextLine();
            System.out.println("Digite o seu cpf");
            cpf =  inputTexto.nextLine();
            System.out.println("Digite o seu salario");
            salario = inputNumero.nextDouble();
            System.out.println("Digite o valor a ser financiado");
            valorFinanciar = inputNumero.nextDouble();
            System.out.println("Digite a sua idade");
            idade = inputNumero.nextInt();
            System.out.println("Digite a quantidade dos seus filhos");
            filhos = inputNumero.nextInt();
            System.out.println("Digite a seu estado civil");
            estadoCivil = inputTexto.nextLine();

            System.out.println("Para prossiguirmos DIGITE\n" +
                    "[1] Para cagastrar seus dados\n" +
                    "[2] Para solicitar um financiamneto\n" +
                    "[4] Para verifica a versão do sistema\n" +
                    "[0] Para sair do sistema\n");
            resposta = inputNumero.nextInt();





            switch(resposta){
                case 1:
                    System.out.printf("Seu nome: %s\n",nome);
                    System.out.printf("Seu cpf: %s\n",cpf);
                    System.out.printf("Seu salário é: %.2f\n",salario);
                    System.out.printf("O valor a financiar é: %.2f\n",valorFinanciar);
                    System.out.printf("Sua idade é: %d\n",idade);
                    System.out.printf("A quantidade de filhos que"
                                    + " Você tem é: %d\n",filhos);
                    System.out.printf("Seu estado estado civil é: %s\n",estadoCivil);
                    System.out.println("O usuario precisa ter 70 pontos pro imprestimo");
                    if (salario > valorFinanciar /60 ){
                        System.out.printf("Você ganha 10Pts");
                    } break;

                case 2:
                    System.out.println("O valor solicitado para o financiamento");
                    System.out.println(valorFinanciar);

                    if (valorFinanciar/60 <= salario * 0.3){

                    }else {
                        System.err.println("Salário icompativel com o financiamneto,POBRE NOJENTO");
                    }

                    System.out.println("O valor solicitado para o financiamento foi:");
                    System.out.println(valorFinanciar);
                    int Pontos = 0;

                    if (salario > (valorFinanciar/60)) {
                        Pontos += 10;
                    }
                    if (valorFinanciar > (salario*10)){
                        Pontos -= 10;
                    }else {
                        Pontos +=30;
                    }

                    if (idade >= 30) {
                       Pontos = 10;
                    } else if (idade > 20 && idade < 30) {
                      Pontos += 5;
                    } else if (idade == 18) {
                      Pontos += 1;
                    }else {
                        System.out.println("reprovado");
                        break;
                    }

                    break;
                case 3:System.out.println("Preencha os seus dados a ser alterado");
                    System.out.println("Digite o nome a ser alterado");
                    nome = inputTexto.nextLine();
                    System.out.println("Digite o " +
                            "cpf a ser alterado");
                    cpf =  inputTexto.nextLine();
                    System.out.println("Digite o salario a ser alterado");
                    salario = inputNumero.nextDouble();
                    System.out.println("Digite o valor financiado a ser alterado");
                    valorFinanciar = inputNumero.nextDouble();
                    System.out.println("Digite a idade a ser alterado");
                    idade = inputNumero.nextInt();
                    System.out.println("Digite a quantidade dos seus filhos a ser alterado");
                    filhos = inputNumero.nextInt();
                    System.out.println("Digite o estado civil a ser alterado");
                    estadoCivil = inputTexto.nextLine();
                    break;
                case 4:
                    System.out.println("(O sistema está na versão 1.0.0 - Online");
                    break;

                default:
                    System.err.println("Erro, digite um numero entre" + "0 e 4");

                    System.out.println("O usuario precisa ter 70 pontos pro imprestimo");
                    if (salario > valorFinanciar /60 ){
                        System.out.printf("Você ganha 10Pts");
                    } break;





            }
        }

        while(resposta !=0);



    }
}
