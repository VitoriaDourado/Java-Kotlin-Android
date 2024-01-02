package Conceito_Heranca;

public class Operario extends Funcionario{
    @Override
    public void saudaçao() {
        super.saudaçao();
        System.out.println("Olá, tudo bem?");
    }

    @Override
    public void pagarImposto() {
        System.out.println("O Operário paga 7% de imposto");
    }

    @Override
    protected float horaExtra(int h, int f) {
        return (h*2)+(f*3);
    }

}
