public class funcoes_strings {
    public static void main(String[] args) {
        String original = "AFIJSDJIFJ adufuhsdhfu AUSFHUSHF";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2); //Começa a partir de alguns indice.
        String s05 = original.substring(2, 9); //Recortar as strings 2 até o 9
        String s06 = original.replace('a', 'x'); //Troca uma coisa por outra.
        String s07 = original.replace("AFI", "xxx");
        int i = original.indexOf("fuh"); //Primeira ocorrencia
        int j = original.lastIndexOf("SHF"); //Ultima ocorrencia.

        System.out.println("Original: " + original);
        System.out.println("LowerCase: " + s01);
        System.out.println("UpperCase: " + s02);
        System.out.println("trim: " + s03);  //Retira os espaços dos cantos
        System.out.println("Substring: " + s04);
        System.out.println("Substring 2 - 9: " + s05);
        System.out.println("Replace: " + s06);
        System.out.println("Replace: " + s07);
        System.out.println("indexof: " + i);
        System.out.println("lastindexof: " + j);
    }
}