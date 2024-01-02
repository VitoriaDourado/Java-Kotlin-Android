package Estaticos;

public class Estatico {
    protected static int contador=0;

    public static int h=10;

    public Estatico(){
        contador++;
    }

    public static String mensagem(){//método estático
        return "Olá, seu nome é: ";
    }
    public static void mensagem_2(){
        System.out.println("Testando método void");
        System.out.println(mensagem());
        int o = h;
        System.out.println(h);
    }
}
