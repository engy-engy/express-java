package org.example.lesson_2.homework.if_switch;

/**
 * App, которая меняет значения двух переменных местами без использования третьей переменной.
 */
public class ChangeVariableValue {

    public static void changeVariableValue(int a, int b) {
     System.out.println("До обмена 'a': " + a);
     System.out.println("До обмена 'b': " + b);

     a = a + b;
     b = a - b;
     a = a - b;

     System.out.println("После обмена 'a': " + a);
     System.out.println("После обмена 'b': " + b);
    }

}
