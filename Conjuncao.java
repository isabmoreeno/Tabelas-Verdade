import java.util.Scanner;

public class Conjuncao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean[] valoresA = new boolean[4];
        boolean[] valoresB = new boolean[4];

        System.out.println("TABELA VERDADE - CONJUNÇÃO");
        System.out.println("Digite V para verdadeiro e F para falso.");

        for (int i = 0; i < 4; i++) {
            System.out.print("Proposição " + (i + 1) + " - Valor A (V/F): ");
            String a = scanner.next().toUpperCase();

            System.out.print("Proposição " + (i + 1) + " - Valor B (V/F): ");
            String b = scanner.next().toUpperCase();

            valoresA[i] = a.equals("V");
            valoresB[i] = b.equals("V");
        }

        System.out.println("\nTABELA VERDADE - CONJUNÇÃO (AND - &&)");
        System.out.println("A\tB\tA && B");
        for (int i = 0; i < 4; i++) {
            System.out.println(valoresA[i] + "\t" + valoresB[i] + "\t" + (valoresA[i] && valoresB[i]));
        }

        scanner.close();
    }
}
