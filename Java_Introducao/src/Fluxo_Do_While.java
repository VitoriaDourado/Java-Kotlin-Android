public class Fluxo_Do_While {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.print(i+ " ");//contagem crescente
            i++;
        }while (i < 10);
        System.out.println();

        int b = 0;
        do{
            System.out.print(b+ " ");//contagem crescente 2 em 2
            b+=2;
        }while (b < 10);
        System.out.println();

        int c = 9;
        do{
            System.out.print(c+ " ");//contagem decrescente
            c--;
        }while (c > 0);
        System.out.println();

        int d = 9;
        do{
            System.out.print(d+ " ");//contagem decrescente 2 em 2
            d-=2;
        }while (d > 0);
    }
}
