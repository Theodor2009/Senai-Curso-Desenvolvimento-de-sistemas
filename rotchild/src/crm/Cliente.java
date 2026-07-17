package crm;
// MVP
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Cliente {
    ArrayList<String> nmClientes = new ArrayList<String>();
    ArrayList<String> nuCpf = new ArrayList<String>();
    ArrayList<Integer> nuIdade = new ArrayList<Integer>();
    ArrayList<Double> vrSalario = new ArrayList<Double>();
    ArrayList<Date> dtCadastro = new ArrayList<Date>();
    ArrayList<String> flAtivo = new ArrayList<String>();
    ArrayList<Integer> idClientes = new ArrayList<Integer>();
    Integer resposta;

    Scanner inputText = new Scanner(System.in);
    Scanner inputNumber = new Scanner(System.in);


    void cadastrarCliente(){
        System.out.println("Iremos iniciar o cadastrro....");
        System.out.print("Insira o seu nome: ");
        nmClientes.add(inputText.nextLine());
        System.out.print("Insira o seu CPF: ");
        nuCpf.add(inputText.nextLine());
        System.out.print("Insira a sua idade: ");
        nuIdade.add(inputNumber.nextInt());
        System.out.print("Insira o seu salário: ");
        vrSalario.add(inputNumber.nextDouble());
        dtCadastro.add(new Date());
        flAtivo.add("s");
        int novoId = nmClientes.size() - 1;
        idClientes.add(novoId);
        System.out.println("Cadastro realizado com sucesso!");
        System.out.println("ID do cliente: " + novoId);


    }
    void atualizarCliente(){
        System.out.println("Iremos iniciar a atualização do cadastro");
        System.out.print("Digite o id do cliente que você deseja atualizar: ");
        this.resposta = inputNumber.nextInt();
        inputText.nextLine();
        System.out.print("Insira o nome a ser atualizado: ");
        nmClientes.set(this.resposta, inputText.nextLine());
        System.out.print("Insira o CPF a ser atualizado: ");
        nuCpf.set(this.resposta, inputText.nextLine());
        System.out.print("Insira a idade a ser atualizada: ");
        nuIdade.set(this.resposta, inputNumber.nextInt());
        System.out.print("Insira o salário a ser atualizado: ");
        vrSalario.set(this.resposta, inputNumber.nextDouble());
        inputText.nextLine();
        System.out.print("Insira o status a ser atualizado: ");
        flAtivo.set(this.resposta, inputText.nextLine());

    }

    void deletarCliente(){
        System.out.print("Digite o id do cliente que você deseja excluir: ");
        resposta = inputNumber.nextInt();
        nmClientes.remove(resposta);
        nuCpf.remove(resposta);
        nuIdade.remove(resposta);
        vrSalario.remove(resposta);
        flAtivo.remove(resposta);
        idClientes.remove(resposta);

        System.out.println("Cliente excluido com sucesso!");

    }
    void consultarCliente(){
        System.out.println("Qual cliente você deseja consultar?");
        resposta = inputNumber.nextInt();
        System.out.println("nome: " + nmClientes.get(resposta));
        System.out.println("cpf: " + nuCpf.get(resposta));
        System.out.println("idade: " + nuIdade.get(resposta));
        System.out.println("salario: " + vrSalario.get(resposta));
        System.out.println("data de cadastro: " + dtCadastro.get(resposta));
        System.out.println("ativo: " + flAtivo.get(resposta));
        System.out.println("id: " + idClientes.get(resposta));
    }

}
