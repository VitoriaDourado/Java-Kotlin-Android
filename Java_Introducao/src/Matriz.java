public class Matriz {
    public static void main(String[] args) {
        int [][] matriz = new int [4][5];
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length;j++){
                matriz[i][j]= i+j;
            }
        }
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        int[][] mt = new int [4][];
        mt[0] = new int[5];
        mt[1] = new int[3];
        mt[2] = new int[8];
        mt[3] = new int[9];
        for(int i=0; i< mt.length; i++){
            for(int j=0; j<mt[i].length;j++){
                mt[i][j]= i+j;
            }
        }
        for(int i=0; i< mt.length; i++) {
            for (int j = 0; j < mt[i].length; j++) {
                System.out.print(mt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
