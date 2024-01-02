public class Vetores_Letras_Nomes {
    public static void main(String[] args) {
        char letras[] = {'a','b','c','d','e'};
        Character letras_2[] = {'A','B','C','D','E'};
        for(int i=0; i<5;i++){
            System.out.println("Vetor de letras minúsculas " +letras[i]+ " ,vetor de letras maiúsculas: "+letras_2[i]);
        }
        System.out.println("---------------------------------------------------");
        char[] alfabeto = new char[26];
        char L = 'a';
        for(int i=0; i<alfabeto.length; i++){
            alfabeto[i] = L;
            L++;
        }
        for(int i=0; i<alfabeto.length; i++){
            System.out.print(alfabeto[i]+ " ");
        }
        System.out.println("----------------------------");
        String nomes[] = {"Vitória", "João", "Dourado", "Lopes"};
        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]+ " - ");
        }
    }
}
