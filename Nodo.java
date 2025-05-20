public class Nodo {
    
    private String nombre;

    //Constructor
    public Nodo(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }

    //Asegurar que se compara solo con nodos para evitar errores
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Nodo)) return false;
        Nodo otro = (Nodo) obj;
        return this.nombre.equals(otro.nombre);
    }

    //Para que el hashmap funcione bien
    @Override
    public int hashCode(){
        return nombre.hashCode();
    }
    @Override
    public String toString(){
        return nombre;
    }
}
