import java.util.Scanner;

public class Entrada_De_Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informa um núm,ero do tipo inteiro: ");
        int x = sc.nextInt();
        System.out.println("O número digitado foi: "+x);

        System.out.println("Informa um número do tipo decimal: ");
        Double y = sc.nextDouble();
        System.out.println("O número digitado foi: " +y);

        System.out.println("Informe um nome: ");
        String str = sc.next();
        System.out.println("O nome digitado foi: " +str);
    }
}
