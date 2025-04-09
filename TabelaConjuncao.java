public class TabelaConjuncao {
    public static void main(String[] args) {
        boolean[] valores = {true, false};

        System.out.println("Tabela Verdade - Conjunção\n");
        System.out.println("A\t\tB\t\tA && B");

        for (boolean a : valores) {
            for (boolean b : valores) {
                boolean resultado = a && b;
                System.out.println(a + "\t" + b + "\t" + resultado);
            }
        }
    }
}
