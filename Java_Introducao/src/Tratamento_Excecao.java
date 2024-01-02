import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Excecao {
    public static void main(String[] args) {
        String str = "ABC";
        String nome = "null";
        Scanner scanner = new Scanner(System.in);

        try{
            int y = scanner.nextInt();
            int x = 10/0;
            System.out.println("Tamanho da string nome: " + nome.length());
            System.out.println(str.charAt(1));//codigo
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Posição inválida");//tratamento de exceção
        }catch (NullPointerException e){
            System.out.println("Não existe nome digitado");
        }catch (ArithmeticException e){
            System.out.println("Não existe divisão por zero");
        }catch (InputMismatchException e){
            System.out.println("O número digitado deve ser do tipo inteiro");
        }finally {
            System.out.println("Executando finally");
        }
    }
}
