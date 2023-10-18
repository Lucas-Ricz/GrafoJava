import java.util.*;

public class Grafo {
    //A chave é o vértice e o valor é uma lista de inteiros contendo os vértices vizinhos.
    private Map<Integer, List<Integer>> adjacencias;

    public Grafo() {
        adjacencias = new HashMap<>();
    }
    
    //Adiciona um vértice ao grafo. Se o vértice já existe, o método não faz nada.
    public void adicionarVertice(int v) {
        if (!adjacencias.containsKey(v)) {
            adjacencias.put(v, new ArrayList<>());
        }
    }

    //Adiciona uma aresta entre dois vértices. Antes de adicionar a aresta, o método garante que ambos os vértices existem no grafo.
    public void adicionarAresta(int v1, int v2) {
        adicionarVertice(v1);
        adicionarVertice(v2);

        List<Integer> lista1 = adjacencias.get(v1);
        List<Integer> lista2 = adjacencias.get(v2);
        lista1.add(v2);
        lista2.add(v1);
    }
    
    //Retorna true se os vértices passados como argumento são vizinhos e false caso contrário. 
    public boolean saoVizinhos(int v1, int v2) {
        List<Integer> lista = adjacencias.get(v1);
        return lista.contains(v2);
    }

    //Imprime e retorna uma lista com os vértices vizinhos ao vértice passado como argumento.
    public List<Integer> obterVizinhos(int v) {
        System.out.println(adjacencias.get(v));
        return adjacencias.get(v);
    }

}
