public class Vetores_Numeros {
    public static void main(String[] args) {
       // int x=50, z=43, a=100, t=5;
        int[] v = new int[4];
        v[0] = 50;
        v[1] = 43;
        v[2] = 100;
        v[3] = 5;
        for(int i = 0; i < v.length; i++){
            System.out.println("O vetor na posição "+i+ " contém o valor: "+v[i]);
        }
        System.out.println("-----------------------------------------------------");
        int[] numeros ={1,2,3,4,5,6,7,8,9};
        for(int i = 0; i < numeros.length; i++){
            System.out.println("O vetor na posição "+i+ " contém o valor: "+numeros[i]);
        }
        System.out.println("---------------------------------------------------");
        float decimais[] = {1f,2f,3f,4f,5f};
        float soma = 0f;
        for (int i=0; i<decimais.length;i++){
            soma+=decimais[i];
            System.out.println("A soma é: " +soma);
        }
    }
}
