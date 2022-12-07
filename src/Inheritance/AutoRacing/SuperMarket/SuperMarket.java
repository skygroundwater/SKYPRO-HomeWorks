package Inheritance.AutoRacing.SuperMarket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class SuperMarket {
    private static final Queue<String> buyers1 = new ArrayDeque<>(5);
    private static final Queue<String> buyers2 = new ArrayDeque<>(5);
    private static final Queue<String> buyers3 = new ArrayDeque<>(5);
    public static void add1(String buyer){
        try {
            if (buyers1.size() > 4 && buyers2.size() > 4 && buyers3.size() > 4)
                throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("Место в магазине закончилось. Подождите на улице");
            return;
        }
        if(buyers3.size() >= buyers1.size() && buyers2.size() >= buyers1.size()) buyers1.offer(buyer);
        else if(buyers1.size() >= buyers2.size() && buyers3.size() >= buyers2.size()) buyers2.offer(buyer);
        else buyers3.offer(buyer);
    }
    public static void add(String buyer){

        if(buyers1.size() < 5) buyers1.offer(buyer);
        else if(buyers2.size() < 5) buyers2.offer(buyer);
        else
        try {
        throw new RuntimeException("Очереди слишком длинные. Вызываем Галину!");
        }catch (RuntimeException e){
            if(buyers3.size() < 5) buyers3.offer(buyer);
            else
                try {
                    throw e;
                }catch (RuntimeException t){
                    System.out.println("Место в магазине закончилось. Подождите на улице");
                }
        }
    }
    public static void showAllQueues(){
        System.out.println("Очередь 1");
        System.out.println(buyers1);
        System.out.println("Очередь 2");
        System.out.println(buyers2);
        System.out.println("Очередь 3");
        System.out.println(buyers3);
    }
    public static void main(String[] args) {
        add1("Петровна");
        add1("Семеновна");
        add1("Блондинка");
        add1("Алкаш");
        add1("Задрот");
        add1("Корешок");
        add1("Чебурашка");
        add1("Крокодил");
        add1("Гена");
        add1("Шапокляк");
        add1("Голубой");
        add1("Вертолет");
        add1("Пионер");
        add1("Макулатура");
        add1("Комсомолец");
        add1("Это уже лишний");
        showAllQueues();
    }
}
