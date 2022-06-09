package ordenarhashmap;

import java.util.HashMap;
import java.util.TreeMap;

public class OrdenarHashMap {

    public static void main(String[] args) {

        System.out.println("Creación hashmap");
        HashMap<String, Integer> map = new HashMap<>();

        map.put("e", 1);
        map.put("a", 2);
        map.put("c", 3);
        map.put("b", 4);
        map.put("d", 5);

        System.out.println("Insertamos todos los elementos en el treemap");
        TreeMap<String, Integer> t = new TreeMap<>();

        t.putAll(map);

        System.out.println("Mostramos el treemap (asc)");
        for (String key : t.keySet()) {
            System.out.println("Clave: " + key + ", Valor: " + t.get(key));
        }

        System.out.println("Creamos el hashmap con la clase que le indica como ordenar");
        t = new TreeMap<>(new OrdenarDesc());
        t.putAll(map);

        System.out.println("Mostramos el treemap (desc)");
        for (String key : t.keySet()) {
            System.out.println("Clave: " + key + ", Valor: " + t.get(key));
        }

    }

}
