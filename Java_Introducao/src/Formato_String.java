public class Formato_String {
    public static void main(String[] args) {
        String str = "Curso de Android";
        System.out.println("Tamanho string: " + str.length());
        System.out.println("Terceira posição da string: " + str.charAt(2));
        System.out.println(str.equals("Curso de Android"));
        System.out.println(str.startsWith("Curso"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(0, 5));
        System.out.println(str.replace("Curso", "Curso top"));
        System.out.println(str.replace("o", "x"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str2 = "                           Curso de Android                    ";
        System.out.println(str2.trim());
    }
}
