package Exceptions;

public class IllegalNumbers extends Exception{
    public IllegalNumbers(){

    }
    public IllegalNumbers(long number){
        super(String.valueOf(number));
    }
}
