package Conceito_Heranca;

public class Gerente extends Funcionario{
    @Override
    public void pagarImposto() {
        System.out.println("O Gerente paga 15% de imposto");
    }
}
