package lesson11;


import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer>tournirTable = new HashMap<>();
        tournirTable.put("динамо",5);
        tournirTable.put("спартак",4);
        tournirTable.put("шахнет",3);
        tournirTable.put("динамо",7);
        System.out.println(tournirTable);

        for(Map.Entry<String,Integer>comanda:tournirTable.entrySet()){
            System.out.println(comanda.getKey());
            System.out.println(comanda.getValue());
        }

        // это второй такой же метод
//        for(String key:tournirTable.keySet()){
//            System.out.println(key);
//            System.out.println(tournirTable.get(key));
//        }
    }
}

