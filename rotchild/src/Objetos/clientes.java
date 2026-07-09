package Objetos;

public class clientes {
    String nome;
    Integer Idade;
    Double Salario;
    Boolean PossuiDividas;
    void comprar(){
        if (PossuiDividas == true){
            System.out.printf("%s não poderá comprar, pois possui divídas\n", this,nome);
        }else{
            System.out.printf("%s poderá realizar a compra, pois não possui divídas\n");
        }
    };
    void vender(){
        System.out.println("Você está aprovadopara realizar a vendas");
    };
}
