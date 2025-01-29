package org.example.lesson_6.homework.task_1;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalStateException("No two sum solution");
    }

    public static int[] twoSum2(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int component = target - arr[i];
            if (map.containsKey(component)) {
                return new int[] {map.get(component), i};
            }
            map.put(arr[i], i);
        }
        throw new IllegalStateException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 26;

        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSum2(arr, target)));
    }
}
