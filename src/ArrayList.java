import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // como se crea un arrayList
        List<String> palabras = new java.util.ArrayList<>();
        // como agrego elementos
        palabras.add("hola");
        palabras.add("como");
        palabras.add("Betek");
        //como busco un valor?
        boolean conteienePalabra = palabras.contains("hola");
        //eliminar elementos
        palabras.remove("hola");
        //obtener el tamano del arreglo
        int tamano = palabras.size();
        // como itero??
        //es la forma normal...
        for (int i = 0; i < palabras.size() ; i++) {

            String palabra = palabras.get(i);
            System.out.println(palabra);
        }
        //for each
        for (String palabra: palabras) {
            System.out.println(palabra);
        }
        //Iterator
        Iterator iterator = palabras.iterator();
        while(iterator.hasNext()){
            System.out.printf((String) iterator.next());
        }
        //Lambdas
        palabras.stream()
                .forEach( palabra -> System.out.printf(palabra));


    }
}