package aula2;

public class exoperadores {
    public static void main (String[]args) {
        /* crie as variveis nome, cor,
          raça de um cachorro
          Depois crie uma condição verificando
          se o cachorro tem mais de 2 anos para poder
          tomar a vacina, se tiver, pode tomar a vacina.
          Se não,não pode
         */


        String nome = "rex";
        int idade = 4;
        String raca = "Poodle";
        String cor = "albino";

        String resultadoidade;
        resultadoidade = ( idade >= 2) ? "Pode tomar a vacina" : "idade insuficiente";
        resultadoidade = ( idade >= 2) ? "Pode tomar a vacina ":  "idade insuficiente";

        System.out.println( "O nome do cachorro é  : " + nome + "idade do cachorro é : " + idade + "A raca dio cachorro é" + raca + "A cor do cachorro é" + cor );















        System.out.println("se o cachorro tiver mais de 4 anos ou igual pode");
        System.out.println(idade >=4);





    }

    public static class exercicioformatação {
        public static void main(String[]args){
            /*Crie o cadastro de um carro com as seguintes variaveis.
            Nome, Marca, placa, ano, valor com os dados de sua escolha.

            Feito isso crie um anuncio com souf, utilizando as tags
            aprendidas na aula.
             */


            String nome = "Galant";
            String marca = "Mitsubishi";
            String placa = "DML5158";
            int ano = 2026;
            double valor = 70000;


            /*System.out.printf("O nome do carro " + nome + " A marca do carro " + marca + " A placa do carro " + placa +
            " O ano do carro " + ano + " O valor do carro " + valor );
            */

            System.out.printf("Vende se carro seminovo: %s\nDa marca: %s\n",nome,marca);
            System.out.printf("A placa do carro é: %s\nSeu ano é: %d\n",placa,ano);
            System.out.printf("Promoção de 100000 por apenas: %.0f",valor);




        }

    }
}