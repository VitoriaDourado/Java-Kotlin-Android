public class IF_aninhado {
    public static void main(String[] args) {
        int v = 12;
            if(v%2 == 0){//Nível 1
                if(v%3 == 0){//Nível 2
                    if(v%4 == 0){//Nível 3
                        System.out.println("O número é divisível por 4 e por ele mesmo "+ v);
                    }
                    System.out.println("O número é divisível por 6");
                }
                System.out.println("O número é divisível por 2");
            }else{
                System.out.println("O número é divisível por " + v);
            }
    }
}
