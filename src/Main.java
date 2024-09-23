import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<>(Arrays.asList(1,3,5,7,7,9)); //a pesquisa binária só funciona em listas ordenadas.

        PesquisaBinaria novaPesquisa = new PesquisaBinaria();

        System.out.println(minhaLista);

        System.out.println(novaPesquisa.pesquisaBinaria(minhaLista,7));
        System.out.println(novaPesquisa.pesquisaBinaria(minhaLista, -1));

    }
}
