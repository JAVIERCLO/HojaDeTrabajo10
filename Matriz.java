import java.util.Map;

public class Matriz {
    //Usando un valor muy grande en comparación con los pesos para simular el infinito
    private final int infinito = 10000000;
    private int[][] matriz;
    private Nodo[] nodos;
    //Constructor
    public Matriz(Grafo grafo) {
        int n = grafo.getNodos().size();
        matriz = new int[n][n];
        nodos = new Nodo[n];
        Map<Nodo, Integer> indices = grafo.getIndiceNodos();
        
        for (Nodo nodo : grafo.getNodos()) {
            int i = indices.get(nodo);
            nodos[i] = nodo;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = infinito;
                }
            }
        }

        for (Arista arista : grafo.getAristas()) {
            int i = indices.get(arista.getOrigen());
            int j = indices.get(arista.getDestino());
            matriz[i][j] = arista.getPeso();
        }
    }

    public int[][] getMatriz(){
        return matriz;
    }
    public Nodo[] getNodos(){
        return nodos;
    }
    public int getPeso(Nodo origen, Nodo destino){
        int i = getIndice(origen);
        int j = getIndice(destino);
        return matriz[i][j];
    }
    public int getIndice(Nodo nodo){
        for (int i = 0; i < nodos.length; i++) {
            if (nodos[i].equals(nodo)) return i;
        }
        throw new IllegalArgumentException("Nodo no encontrado");
    }

    public void mostrarMatriz() {
        System.out.println("Matriz de adyacencia:");
        for (int i = 0; i < nodos.length; i++) {
            for (int j = 0; j < nodos.length; j++) {
                if (matriz[i][j] == infinito){
                    System.out.print("∞\t");
                }else{
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}