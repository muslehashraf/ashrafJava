package homeworks;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework16 {
    public static void main(String[] args) {
        System.out.println("-----------Task-1----------");
        String testData = "{104}LA{101}Paris{102}Berlin{103}Chicago{100}London";
        Map<Integer, String> result = Homework16.parseData(testData);
        System.out.println(result);

        System.out.println("\n-----------Task-2----------");

        HashMap<String, Integer> items1_1 = new HashMap<>();
        items1_1.put("Apple", 3);
        items1_1.put("Mango", 1);
        double totalPrice1_1 = Homework16.calculateTotalPrice1(items1_1);
        System.out.println(totalPrice1_1);

        HashMap<String, Integer> items1_2 = new HashMap<>();
        items1_2.put("Apple", 2);
        items1_2.put("Pineapple", 1);
        items1_2.put("Orange", 3);
        double totalPrice1_2 = Homework16.calculateTotalPrice1(items1_2);
        System.out.println(totalPrice1_2);

//        System.out.println("\n-----------Task-3----------");
//
//        HashMap<String, Integer> items2_1 = new HashMap<>();
//        items2_1.put("Apple", 3);
//        items2_1.put("Mango", 5);
//        double totalPrice2_1 = Homework16.calculateTotalPrice2(items2_1);
//        System.out.println(totalPrice2_1);
//
//        HashMap<String, Integer> items2_2 = new HashMap<>();
//        items2_2.put("Apple", 4);
//        items2_2.put("Pineapple", 8);
//        items2_2.put("Orange", 3);
//        double totalPrice2_2 = Homework16.calculateTotalPrice2(items2_2);
//        System.out.println(totalPrice2_2);
    }




    public static Map<Integer, String> parseData(String data) {
        Map<Integer, String> result = new TreeMap<>();
        Pattern pattern = Pattern.compile("\\{(\\d+)\\}([\\w\\s]+)");
        Matcher matcher = pattern.matcher(data);
        while (matcher.find()) {
            result.put(Integer.parseInt(matcher.group(1)), matcher.group(2));
        }
        return result;
    }

    public static final double APPLE_PRICE = 2.00;
    public static final double ORANGE_PRICE = 3.29;
    public static final double MANGO_PRICE = 4.99;
    public static final double APPLE_DISCOUNT = 0.50;
    public static final int MANGO_FREE_COUNT = 3;
    public static final double PINEAPPLE_PRICE = 5.25;

    public static double calculateTotalPrice1(Map<String, Integer> items) {
        double total = 0;
        if (items.containsKey("Apple")) {
            total += items.get("Apple") * APPLE_PRICE;
        }
        if (items.containsKey("Orange")) {
            total += items.get("Orange") * ORANGE_PRICE;
        }
        if (items.containsKey("Mango")) {
            total += items.get("Mango") * MANGO_PRICE;
        }
        if (items.containsKey("Pineapple")) {
            total += items.get("Pineapple") * PINEAPPLE_PRICE;
        }
        return total;
    }


}