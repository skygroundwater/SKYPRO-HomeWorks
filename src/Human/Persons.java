package Human;
public class Persons {
    public static void main(String[] args) {
        Human maksim = new Human("Максим",1988, "Минск", "бренд-менеджер");
        Human anya = new Human("Анна", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артём", 1995, "Москва", "директор по развитию бизнеса");
        System.out.println(anya);
        Human vladimir = new Human("Владимир", 2001, "Казань", "");
        System.out.println(vladimir);
    }
}
