public class Continua_Break {
    public static void main(String[] args) {
        System.out.println("Continue no FOR: ");
        for(int i = 0; i <= 20; i ++) {
            if (i % 2 == 0) {
                continue; // Pular para a próxima posição com base na posição (Imprime os impares)
            }
            System.out.print(i + " ");
        }
            System.out.println();
            System.out.println("Break do for");

            for(int i = 0; i <= 20; i ++) {
                if (i == 10) {
                    break; //Para a posição
                }
                System.out.print(i + " ");
            }
        System.out.println();
        System.out.println("CONTINUE NO WHILE: ");

        int a = 0;
        while (a <= 20){
            a++;
            if(a % 2 == 1){
                continue;//Imprimir os pares
            }
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Break no while:");

        a=0;
        while (a <= 20){
            a++;
            if(a == 10){
                break;
            }
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Continue com DO_WHILE: ");

        int b = 0;
        do{
            b++;
            if(b % 3 == 0){
                continue;//não imprime os numeros divisiveis por 3
            }
            System.out.print(b + " ");
        }while (b <= 20);

        System.out.println();
        System.out.println("Break com DO_WHILE: ");
        b = 0;
        do{
            b++;
            if(b == 10){
                break;
            }
            System.out.print(b + " ");
        }while (b <= 20);
    }
}
