package CollectionsSetsAndMaps;
import java.util.*;
import java.util.stream.Collectors;

public class SetsAndMaps {
    public static Set<Integer> findEvenNumbers(List<Integer> list) {
        Set<Integer> set = new TreeSet<>();
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                set.add(integer);
            }
        }
        return set;
    }

    public static List<Integer> findOddNumbers(List<Integer> list) {
        List<Integer> linkedList = new LinkedList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                linkedList.add(integer);
            }
        }
        return linkedList;
    }

    public static Set<String> findUniqueWords(List<String> list) {
        return new TreeSet<>(list);
    }

    public static int countWords(ArrayList<String> WordsArr, String word) {
        return Collections.frequency(WordsArr, word);
    }

    public static void findDoublesOfWords(ArrayList<String> list) {
        Map<String, Integer> frequency = list.stream().collect(Collectors.toMap(e -> e , e -> 1, Integer::sum));
        frequency.forEach((k, v) -> System.out.println("Word " + k + ", Doubles = " + v));
    }

    public static void findDoublesOfWords2(ArrayList<String> list){
        Map<String, Integer> letters = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String tempString = list.get(i);
            if (!letters.containsKey(tempString)) {
                letters.put(tempString, 1);
            } else {
                letters.put(tempString, letters.get(tempString) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : letters.entrySet()) {
            System.out.println("Word " + entry.getKey() + ", Doubles = " + entry.getValue());
        }
    }

    public static void main (String[]args){
        ArrayList<Integer> nums = new ArrayList<>(List.of(7, 1, 2, 8, 8, 4, 4, 9, 9, 5, 5, 6, 7));
        ArrayList<String> instruments = new ArrayList<>(List.of("axe", "axe", "hammer", "scraper", "brush", "brush", "drill", "drill", "scotch", "saw", "rubber"));

    }
}