import java.util.*;

public class Test {

    public static void main(String[] args) {
       HashMap<String, Integer> months = new LinkedHashMap<>();
        months.put("Gennaio", 1);
        months.put("Febbraio", 2);
        months.put("Marzo", 3);
        months.put("Aprile", 4);
        months.put("Maggio", 5);
        months.put("Giugno", 6);
        months.put("Luglio", 7);
        months.put("Agosto", 8);
        months.put("Settembre", 9);
        months.put("Ottobre", 10);
        months.put("Novembre", 11);
        months.put("Dicembre", 12);

        Set<String> keys = months.keySet();
        System.out.println("Set chiavi presenti nel Map: ");
        System.out.println(keys);

        Collection<Integer> cardinalMonth = months.values();
        System.out.println("Numeri cardinali presenti nel map");
        System.out.println(cardinalMonth);

        Integer[] cardinalMonthArray = cardinalMonth.toArray(new Integer[0]);
        System.out.println("\n Valori del map convertiti in array di interi: ");
        System.out.println(Arrays.toString(cardinalMonthArray));





    }
}
