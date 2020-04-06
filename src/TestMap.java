import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("anh", 20);
        hashMap.put("bao", 30);
        hashMap.put("dao", 24);
        hashMap.put("cuong", 21);
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println();
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
