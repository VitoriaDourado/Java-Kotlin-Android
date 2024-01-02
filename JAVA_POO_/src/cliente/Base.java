package cliente;

public class Base {
    public static void main(String[] args) {
            Cliente c = new Cliente();
            c.setNome("Vitória");
            System.out.println("O nome informado é: " +c.getNome());
            c.consumo = 1000f;
            System.out.println("O consumo é: "+c.consumo);
            c.setAno_nascimento(2003);
            System.out.println("Ano de nascimento: " +c.getAno_nascimento());

            Cliente c2 = new Cliente();
            c2.setNome("João");
            System.out.println("Pessoa1: "+c.getNome());
            System.out.println("Pessoa1: "+c2.getNome());
        }

    }

