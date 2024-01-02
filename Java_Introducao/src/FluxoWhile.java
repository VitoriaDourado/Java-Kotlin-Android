public class FluxoWhile {
    public static void main(String[] args) {
        int i = 0;
            while (i < 5){//crecsente
                System.out.println(i + " ");
                i++;
            }

        System.out.println();
            i = 0;
            while (i<10) {//dois em dois
                System.out.println(i + " ");
                i += 2;
            }

        System.out.println();
        i = 10;
        while (i>=0 ) {//decrescente
            System.out.println(i + " ");
            i --;
        }

        System.out.println();
        i = 10;
        while (i>=0) {//decrescente 2 em 2
            System.out.println(i + " ");
            i -= 2;
        }
    }
}
