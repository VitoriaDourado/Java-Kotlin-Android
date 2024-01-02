import java.util.Scanner;

public class Entrada_Matrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas: ");
        int t = scanner.nextInt();
        System.out.println("Digite o número de colunas: ");
        int c = scanner.nextInt();

        int [][] matriz = new int [t][c];
        System.out.println("Digite os elementos da matriz: ");
        for(int i=0; i<t;i++){
            for(int j=0; j<c; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("matriz lida, agora vamos imprimir...");
        for(int i=0; i<t;i++){
            for(int j=0; j<c; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
