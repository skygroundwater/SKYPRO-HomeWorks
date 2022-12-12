package Maps;

import java.util.*;

public class PhoneBook {

    public static void addComponent(String string, Integer integer, Map<String, Integer> map){
        try {
            if(map.containsKey(string) && Objects.equals(map.get(string), integer)) throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("Компонент с таким ключом и значением уже присутствует в коллекции");
        }
        map.put(string,integer);
    }
    public static Map<String,Integer> getAnotherMap(Map<String, List<Integer>> allLists){
        Map<String, Integer> newMap = new HashMap<>();
        for(Map.Entry<String, List<Integer>> pair: allLists.entrySet()) {
            int sum = 0;
            for (int i = 0; i < pair.getValue().size(); i++) {
                sum = pair.getValue().get(i) + sum;
                newMap.put(pair.getKey(), sum);
            }
        }
        return newMap;
    }
    public static void main(String[] args) {
        //Задание 1
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Метелев Олег", "89045100596");
        phoneBook.put("Родионова Арина", "89045100596");
        phoneBook.put("Дуравкин Алексей", "43234123434");
        phoneBook.put("Тратата Тратата", "843234451234");
        phoneBook.put("Пупупу пупупу", "3241231235");
        phoneBook.put("Тилитили татата", "3241252346456");
        phoneBook.put("Шопоголик", "695234553451");
        phoneBook.put("Стервозина", "123452345352");
        phoneBook.put("Щука Щуковна", "6585647824653");
        phoneBook.put("Задира Задировна", "4364361354234");
        phoneBook.put("Хорошо Хорошевич", "434514532345");
        phoneBook.put("Здарова Здаровыч", "2346263456345");
        phoneBook.put("Телефон Телефоныч", "3241235345");
        phoneBook.put("Твёрдознак Твёрдознакыч", "42354345354");
        phoneBook.put("Шапито Шапитов", "2342543453245");
        phoneBook.put("Куробяка Олегов", "97846456345");
        phoneBook.put("Обломов Облом", "4324535345");
        phoneBook.put("Артемий Виссарионов", "5674566465");
        phoneBook.put("Стопудов Стопудняк", "25435513245");
        phoneBook.put("Гаврилов Гавриил", "253454571ё324");
        for (Map.Entry<String,String> pair: phoneBook.entrySet()) System.out.println(pair);
        System.out.println();

        //Задание 2
        Map<String, Integer> map = new HashMap<>();
        addComponent("Обед", 2, map);
        addComponent("Ужин", 3, map);
        addComponent("Завтрак", 4, map);
        addComponent("Обед", 2,map);
        addComponent("Ужин", 4, map);
        for (Map.Entry<String,Integer> pair: map.entrySet()) System.out.println(pair);
        System.out.println();

        //Задание 3
        Map<String, List<Integer>> allLists= new HashMap<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,2,4));
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(2,3,6));
        ArrayList<Integer> arrayList3 = new ArrayList<>(List.of(3,4,8));
        allLists.put("first", arrayList1);
        allLists.put("second", arrayList2);
        allLists.put("third", arrayList3);
        for(Map.Entry<String, Integer> pair: getAnotherMap(allLists).entrySet()) System.out.println(pair);
        System.out.println();

        //Задание 4
        Map<Integer, String> integersStrings = new HashMap<>();
        integersStrings.put(1, "что-то");
        integersStrings.put(2,"кто-то");
        integersStrings.put(3,"где-то");
        integersStrings.put(4,"там-то");
        integersStrings.put(5,"зачем-то");
        integersStrings.put(6,"ты-то");
        integersStrings.put(7,"она-то");
        integersStrings.put(8,"он-то");
        integersStrings.put(9,"вы-то");
        integersStrings.put(10,"они-то");
        for (Map.Entry<Integer,String> pair: integersStrings.entrySet()) System.out.println(pair.getKey() +": " + pair.getValue());
    }
}
