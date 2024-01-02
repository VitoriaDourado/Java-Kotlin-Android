import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

public class Tratamento_Arquivo {
    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\vitoria.dourado\\IdeaProjects\\Java_Introducao\\src\\Teste.txt";
        try {
            FileReader arquivoreader = new FileReader(caminhoArquivo);//Destaca o arquivo a ser lido
            BufferedReader leitor = new BufferedReader(arquivoreader);// Realiza a otimização de leitura de arquivo

            String linha;
            while ((linha = leitor.readLine())!=null){
                System.out.println(linha);
            }
            leitor.close();
        }catch (IOException e){
            System.out.println("Ocorreu um erro na leitura de seu arquivo");
        }
    }
}
