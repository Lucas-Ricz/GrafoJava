import java.util.*;

public class TesteGrafo {

    public static void main(String[] args) {
        Grafo grafo = new Grafo();
        
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(1, 3);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(2, 4);
        grafo.adicionarAresta(3, 4);
        grafo.adicionarAresta(4, 5);

        System.out.println(grafo.saoVizinhos(1, 2)); // true
        System.out.println(grafo.saoVizinhos(4, 5)); // true
        System.out.println(grafo.saoVizinhos(1, 4)); // false
        System.out.println(grafo.saoVizinhos(1, 5)); // false

        List<Integer> vizinhos = grafo.obterVizinhos(2);
        // Saida: 1 3 4
        
        List<Integer> vizinhos5 = grafo.obterVizinhos(5);
        // Saida: 4
    }

}
