package Lesson1;

@SuppressWarnings({"DataFlowIssue", "MismatchedReadAndWriteOfArray"})
public class Task1 {
    public static void main(String[] args) throws ExceptionRadius {
        String[] sArray = {"first str", null, "third str"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        division(10, 0);
        printValueByIndex(array,12);
        printStringArray(sArray);
        printRadius();

    }
    // division by zero
    public static void division(double firstNum, double secondNum){
        if(secondNum ==  0) throw new ArithmeticException("На ноль делить нельзя!!!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }
    // out of bounds
    public static void printValueByIndex(int[] array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемента под таким индексом не существует");
        else System.out.printf("Элемент с индексом %d равен %d.\n",index, array[index]);
    }

    // Null pointer exception
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Элемент отсутствует!!!");
            System.out.println(item);
        }
    }
    public static void printRadius() throws ExceptionRadius {
//        int i = 0;
        
        int[] radius = new int[-1];
        for (int item: radius){
            if (item>0) throw new ExceptionRadius("Ошибка радиуса, не может быть отрицательный");
            System.out.println(item);
        }
    }

}
