package Conceito_Heranca;

public abstract class Funcionario{//final usado na classe restringe a mesma de herança
    public String nome;
    protected int idade;
    protected float salario;
    protected float bonus;

    public abstract void pagarImposto();
        // Lógico

    public final int teste = 20;//não consegue realiza a mudança para outro valor na variável
    protected float horaExtra(int h, int f){
        return(h*1.5f)+(f*2.0f);
    }
    public void saudaçao(){//com final o método não será disponível para realizar o Override
        System.out.println("Olá");
    }
}
