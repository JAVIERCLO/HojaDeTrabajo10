import java.util.*;

public class Grafo {
    
    private Map<String, Nodo> nodos;
    private List<Arista> aristas;

    public Grafo(){
        this.nodos = new LinkedHashMap<>();
        this.aristas = new ArrayList<>();
    }
    public void agregarNodo(){
        nodos.putIfAbsent(nombre, new Nodo(nombre));

    }
    public void agregarArista(){
        Nodo origen = nodos.get(origen);
        Nodo destino = nodos.get(destino);
        if(origen == null || destino == null){
            throw new IllegalArgumentException("No se puede agregar el arista porque el nodo no existe");
        }
        aristas.add(new Arista(origen, destino, peso));
    }

    public Collection<Nodo> getNodos(){
        return nodos.values();
    }

    public List<Arista> getAristas(){
        return aristas;
    }

    public Map<String, Integer> getIndices(){
        Map<String, Integer> indices = new LinkedHashMap<>();
        int i = 0;
        for(String nombre : nodos.keySet()){
            indices.put(nombre, i++);
        }
        return indices;
    }

    public Matriz MatrizDeAdyacencia(){
        return new Matriz(this);
    }

    private static Grafo createSamplegraph(){
        /*
         * A: Ciudad de Guatemala
         * B: Zacapa
         * C: Chiquimula
         * D: Quetzaltenango
         * E: Cobán
         * El peso es el indicado en la matriz en el documento de la hoja de trabajo
         */
        Grafo grafo = new Grafo();

        grafo.agregarNodo("A");
        grafo.agregarNodo("B");
        grafo.agregarNodo("C");
        grafo.agregarNodo("D");
        grafo.agregarNodo("E");

        grafo.agregarArista("A", "B", 3);
        grafo.agregarArista("A", "D", 7);
        grafo.agregarArista("B", "C", 1);
        grafo.agregarArista("B", "E", 8);
        grafo.agregarArista("C", "D", 2);
        grafo.agregarArista("D", "E", 3);
        grafo.agregarArista("E", "A", 4);

        return grafo;
    }
}
