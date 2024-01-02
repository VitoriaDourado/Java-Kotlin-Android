public class Funcao {
    //Com retorno - tipo de dado com parametros ou sem parametros
    //sem retorno - void - com parametros ou sem parametros

    void Hello(){//Função sem retorno e sem parametros
        System.out.println("Olá!");
    }
    void Hello(String nome){//FUncção sem retorno e com parametros
        System.out.println("Olá! " + nome + "!");
    }

    String chegada(){ // Função com retorno e sem parametros
        return "Olá";
    }

    String chegada(String nome){//Função com retorno e parametro
        return "Olá " + nome;
    }

    int num(int n1, int n2){
        Hello();
        return n1 + n2;
    }

    public static void main(String[] args) {
        new Funcao().Hello();
        new Funcao().Hello("Vitória");
        String x = new Funcao().chegada();
        System.out.println(x);
        String y = new Funcao().chegada("Vitória");
        System.out.println(y);
        Integer z = new Funcao().num(2, 8);
        System.out.println(z);
    }
}
