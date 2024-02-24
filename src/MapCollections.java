import java.util.HashMap;
import java.util.Map;
public class MapCollections {
    public static void main(String[] args) {
        // como se crea un mapa
        Map<String, String> paises = new HashMap<>();
        // como agrego elementos
        paises.put("US", "USA");
        paises.put("BR", "BRAZIL");
        paises.put("COL", "COLOMBIA");
        // AGREGAR REP[ETIDOS
        //paises.put("COL", "COLOMBIA X2");
        // tamano
        int tamana = paises.size();
        String valor = paises.get("COL");
        // eliminar
        paises.remove("US");
        // contiene
        boolean key =  paises.containsKey("BR");
        boolean value =  paises.containsValue("BRAZIL");
        //Entry
        for (Map.Entry pais: paises.entrySet() ) {
            System.out.println(pais.getKey() + "/" +  pais.getValue());
        }
    }
}
