package api;


import org.junit.Test;

public class Main_Tests {

    // Метод выводит в консоль все чётные числа.
    @Test
    public void arrayTest(){
        EvenNumbers.evenNumber();
    }

    // Метод принимает на вход две строки (a и b) и сравнивает их
    String a = "Хочу";
    String b = "Работать";
    @Test
    public void stringTest(){
        StringComparison.stringComparation(a,b);
    }

    // Метод принимает на вход два целых числа (a и b) и совершает с ними  действиясогласно ТЗ
    int d = 3;
    int c= 6;

    @Test
    public void intTest(){
        IntegerOperations.intOperation(d,c);
    }
}

