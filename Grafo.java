public class Grafo {
    
    private static ValueGraph<String, Integer> createSampleGraph(){
        /*
         * A: Ciudad de Guatemala
         * B: Zacapa
         * C: Chiquimula
         * D: Quetzaltenango
         * E: Cobán
         * El peso es el indicado en la matriz en el documento de la hoja de trabajo
         */
        MutableValueGraph<String, Integer> graph = ValueGraphBuilder.directed().build();
        graph.putEdgeValue("A", "B", 3);
        graph.putEdgeValue("A", "D", 7);
        graph.putEdgeValue("B", "C", 1);
        graph.putEdgeValue("B", "E", 8);
        graph.putEdgeValue("C", "D", 2);
        graph.putEdgeValue("D", "E", 3);

        return graph;
    }
}
