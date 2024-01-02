import cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //System.out.println("O seu nome é: " +p.str);
        //System.out.println("O ano de nascimento é: " +p.ano_nascimento);
        p.falar();
        p.ano();

        new Cliente();
        Cliente cl = new Cliente();
        cl.nome2 = "Vitória";
        System.out.println(cl.nome2);
    }
}

//Pessoa -> tipo de objeto(Classe)
//p -> o objeto que representa a classe Pessoa
//New Pessoa -> o espaço de memória que é reservado para o objeto p