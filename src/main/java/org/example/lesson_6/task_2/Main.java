package org.example.lesson_6.task_2;

public class Main {
    public static void main(String[] args) {
        System.out.println(deleteDuplicates("root"));
        System.out.println(deleteDuplicates("rot"));
        System.out.println(deleteDuplicates("rroott"));
        System.out.println(deleteDuplicates("r"));
        System.out.println(deleteDuplicates("1111111"));
        System.out.println(deleteDuplicates(""));
    }

    public static String deleteDuplicates(String str) {
        StringBuilder res = new StringBuilder();

        char currentSymbol = str.charAt(0);
        if (str.length() == 0) throw new IllegalStateException("String is empty");

        if (str.length() == 1) res.append(currentSymbol);

        for (int i = 1; i < str.length(); i++) {
            if (currentSymbol != str.charAt(i)) {
                res.append(currentSymbol);
                currentSymbol = str.charAt(i);
            }
            if (i == str.length() - 1) {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
