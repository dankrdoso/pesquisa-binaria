import java.util.List;

public class PesquisaBinaria {
    public Integer pesquisaBinaria(List<Integer> lista, int x){
        int menor = 0;  //o primeiro indice do vetor é 0.
        int maior = lista.size() - 1;   //ultimo indice do vetor.

        while (menor <= maior) {
            int meio = (menor + maior) / 2;
            int elemento = (int) lista.get(meio);

            if (elemento == x) {
                return meio; //se o elemento do meio do vetor for a chave, a busca é encerrada.
            }
            if (elemento > x) {
                maior = meio -1; //se o valor do meio for maior que X, então o valor estará na metade esquerda da lista.
            } else {
                menor = meio +1; //se o valor do meio for menor, então o valor estará na metade direita da lista.
            }
        }
        return null;  //não encontrado, retorna nulo.
    }
}
