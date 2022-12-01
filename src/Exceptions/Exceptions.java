package Exceptions;
import java.util.Scanner;

public class Exceptions {
    public static boolean checkString(String checkingString){
        for(char illegalChars: checkingString.toCharArray()){
            if(!(illegalChars >= 'A' && illegalChars <= 'Z') && !(illegalChars >= 'a' && illegalChars <= 'z') && !Character.isDigit(illegalChars) && illegalChars != '_') {
                return true;
            }
        }
        return false;
    }
    public static void findException(String login, String password, String confirmPassword) {
        try {
            while (true) {
                if (login.length() > 20 || login.length()<2 || checkString(login)) {
                    throw new WrongLoginException("Логин введён некорректно");
                } else if (password.length() > 19 || password.length() < 4 || checkString(password)) {
                    throw new WrongPasswordException("Пароль введён некорректно");
                } else if (confirmPassword.equals(password)) {
                    return;
                } else {
                    throw new WrongPasswordException("Ошибка подтверждения легитимности пароля");
                }
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }
    public static long sumOfTwoFields(long first, long second){
        try {
            if (first>100000000 || second > 100000000) {
                throw new IllegalNumbers();
            } else {
                long sum;
                sum = first + second;
                return sum;
            }
        }catch (IllegalNumbers i){
            i.printStackTrace();
        }
        return 0;
    }
    public static boolean scannerForCompareLongs(){
        double i = 0;
        double a = 0;
        double b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        i = sc.nextDouble();
        System.out.println("Введите второе число: ");
        a = sc.nextDouble();
        System.out.println("Введите третье число: ");
        b = sc.nextDouble();
        compareLongs(i,a,b);
        return true;
    }
    public static double compareLongs(double i, double a, double b) {
        if ((Math.abs(i)) < (Math.abs(a)) && (Math.abs(i)) < (Math.abs(b))) {
            System.out.println(Math.abs(i));
            return Math.abs(i);
        } else if ((Math.abs(a)) < (Math.abs(i)) && (Math.abs(a)) < (Math.abs(b))) {
            System.out.println(Math.abs(a));
            return Math.abs(a);
        } else {
            System.out.println(Math.abs(b));
            return Math.abs(b);
        }

    }



    public static void main(String[] args) {

        findException("skyGroundWater_96", "FarShMak_69","FarShMak_69");



    }
}
