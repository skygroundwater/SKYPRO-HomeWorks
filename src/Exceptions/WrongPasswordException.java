package Exceptions;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){

    }
    public WrongPasswordException(String password){
        super(password);
    }
}
