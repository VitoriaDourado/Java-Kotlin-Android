public class FOR {
    public static void main(String[] args) {
        int i;
        for(i = 0; i <10; i ++){//imprimindo de um em um
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 9; i >= 0; i--){//imprimindo de forma decrescente
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 0; i <= 18; i+=2){//imprimindo de 2 em 2
            System.out.print(i + " ");
        }
        System.out.println();
        for(i = 18; i >= 0; i-=2){//imprimindo de forma decrescente de 2 em 2
            System.out.print(i + " ");
        }
    }
}
