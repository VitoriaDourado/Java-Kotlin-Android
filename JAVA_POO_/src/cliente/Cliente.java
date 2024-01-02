package cliente;

public class Cliente {
    private String nome;

    public String nome2;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected float consumo;

    private int ano_nascimento;
    //Get e Set

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        if(ano_nascimento < 1960 || ano_nascimento > 2005){
            this.ano_nascimento=0;
        }
        this.ano_nascimento = ano_nascimento;
    }
}

//Plublic: não realiza restrições
//Private: Atributo ou método fica disponível somente a classe a que pertence
//Protected: Disponível ao pacote que pertence