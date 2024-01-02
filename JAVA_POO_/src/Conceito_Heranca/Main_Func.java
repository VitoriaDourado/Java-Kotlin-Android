package Conceito_Heranca;

public class Main_Func {
    public static void main(String[] args) {
        Operario op =new Operario();
        op.nome = "Vitória";
        op.idade = 20;
        op.salario = 1456f;
        op.bonus = 100f;
        float h = op.horaExtra(10, 10);
        System.out.println("O ganho mensal do funcionario: " +op.nome+ " é "+(op.salario+op.bonus+h));
        op.saudaçao();

        System.out.println(op.teste);

        int c = Categorias.JUNIOR;
        System.out.println(Categorias.SENIOR);

        Funcionario f1 = new Gerente();
        Funcionario f2 = new Operario();
       //polimorfismo(f1);

        }
    private static void polimsorfismo(Funcionario f){
        f.pagarImposto();
    }
}
