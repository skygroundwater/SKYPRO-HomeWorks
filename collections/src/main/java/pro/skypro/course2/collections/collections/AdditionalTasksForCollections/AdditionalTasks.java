package pro.skypro.course2.collections.collections.AdditionalTasksForCollections;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AdditionalTasks {
    private Map<String,Item> hashMap;
    private Item item;
    public AdditionalTasks(Map<String, Item> hashMap) {
        this.hashMap = hashMap;
    }

    public HashMap<String, Integer> countSameWordsFromTheString(String str) {
        String[] words = str.split(" ");
        HashMap<String, Integer> countSameWords = new HashMap<>();
        for (String word : words) {
            if (countSameWords.containsKey(word)) {
                int counter = countSameWords.get(word);
                countSameWords.put(word, counter + 1);
            } else {
                countSameWords.put(word, 1);
            }
        }
        return countSameWords;
    }
    public double secondLargestValue(double[] doubles){
        Arrays.sort(doubles);
        return doubles[1];
    }
    public void add(String key, String value){
        Item item = new Item(value);
        hashMap.put(key, item);
    }
    public void remove(String key){
        hashMap.remove(key);
    }
    public void removeAll(){
        hashMap.clear();
    }
    public Map<String,Item> showInfo(){
        return hashMap;
    }
    public Map<String,Item> mapShare(){
        Set<String> keys = hashMap.keySet();
        hashMap.remove("c");
        if(!hashMap.containsKey("b")){
            hashMap.put("b", new Item("aaa"));
        }else {
            hashMap.get("b").setName("aaa");
        }
        return hashMap;
    }
    public Map<String,Item> mapAB(){
        if(hashMap.containsKey("a") && hashMap.containsKey("b")){
            hashMap.put("b" + "a",  new Item(hashMap.get("a").toString() + hashMap.get("b").toString()));
        }
        return hashMap;
    }
    public Map<String,Item> topping() {
        if (hashMap.containsKey("ice cream")) {
            hashMap.get("yogurt").setName(hashMap.get("ice cream").toString());
        }
        if (hashMap.containsKey("spinach")) {
            hashMap.get("spinach").setName("nuts");
        }
        return hashMap;
    }
    public Map<String,Integer> word0(String text){
        String[] textArray = text.split(" ");
        Map<String,Integer> words = new HashMap<>();
        for (String string: textArray){
            words.put(string, 0);
        }
        return words;
    }
    public Map<String,Integer> wordLen(String text){
        String[] textArray = text.split(" ");
        Map<String,Integer> words = new HashMap<>();
        for (String string: textArray){
            words.put(string, string.length());
        }
        return words;
    }
    public Map<String,String> pairs (String text){
        String[] textArray = text.split(" ");
        Map<String,String> words = new HashMap<>();
        for (String string: textArray){
            words.put(String.valueOf(string.charAt(0)), String.valueOf(string.charAt(string.length()-1)));
        }
        return words;
    }
    public String evenOrOdd(String forParse) {
        try {
            int number = Integer.parseInt(forParse);
            if (number % 2 == 0) {
                return "Вы ввели четное число";
            } else {
                return "Вы ввели нечетное число";
            }
        }catch (RuntimeException e) {
            return "Вы ввели значение в неправильном формате. Повторите попытку";
        }
    }
}
