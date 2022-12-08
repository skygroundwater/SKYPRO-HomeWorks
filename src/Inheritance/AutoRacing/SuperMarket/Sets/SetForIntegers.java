package Inheritance.AutoRacing.SuperMarket.Sets;
import java.util.HashSet;
import java.util.Set;
public class SetForIntegers {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 20; i++) {
            integers.add(random.nextInt(1000));
        }
        integers.removeIf(integer -> integer % 2 != 0);

        int [][] Mas = new int[15][3];
        for (int i = 0; i < Mas.length; i++){
            for (int h = 0; h<Mas[i].length; h++){
                Mas[i][h] = (int)(Math.random() * 8) + 2;
                if(h == Mas[i].length - 1){
                    Mas[i][h] = Mas[i][h-2] * Mas[i][h-1];
                    for(int q = 0; q < i; q++){
                        if(Mas[i][h] == Mas[q][h]){
                            if(Mas[i][h-1] == Mas[q][h-1]||Mas[i][h-2] == Mas[q][h-2]) --i;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < Mas.length; i++){
            System.out.print("Задание №" + (i + 1 + " Умножить "));
            for(int h = 0; h < Mas[i].length; h++){
                if(h == 0)
                    System.out.print(Mas[i][h] + " на ");
                if(h == 1)
                    System.out.println(Mas[i][h]);
            }
        }
    }
}
