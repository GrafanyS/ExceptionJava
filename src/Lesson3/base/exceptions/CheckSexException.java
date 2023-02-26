package Lesson3.base.exceptions;

public class CheckSexException extends RuntimeException{
    public CheckSexException() {
        super("Секс - это пусто!!!");
    }
}
