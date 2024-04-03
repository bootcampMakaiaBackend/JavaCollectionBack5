import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class SetCollections {
    public static void main(String[] args) {

        // agregando swagger
    // como se crea un elementos
    Set<String> vocales = new HashSet<>();
    //como agrego elementos
     vocales.add("A");
     vocales.add("E");
     vocales.add("I");
     vocales.add("o");
     //agregador repetido
     vocales.add("A");
     //tamano
        int tamano = vocales.size();
        Iterator<String> vocal = vocales.iterator();
        while(vocal.hasNext()){
            String v = vocal.next();
            System.out.println(v);
        }
        vocales.stream().forEach(System.out::println);



    }

}
