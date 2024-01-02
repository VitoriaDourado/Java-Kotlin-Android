package programers;

public class Programadores {
    public static void main(String[] args) {
        System.out.println(Senioridade.JUNIOR+" "+ Senioridade.JUNIOR.getId());

        for(Senioridade s: Senioridade.values()){
            System.out.println("O programador "+s+ " deve ter: "+s.getId()+ " ano de experiência");
        }
    }
}
