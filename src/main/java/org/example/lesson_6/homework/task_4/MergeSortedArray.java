package org.example.lesson_6.homework.task_4;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[i - n];
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1; // i=-1
        int j = n - 1; // j=2
        int k = m + n - 1; // k=2

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else nums1[k--] = nums2[j--];
        }

        // Если остались элементы в nums2, добавляем их
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        // example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge2(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

        // example 2
        int[] nums3 = {2, 5, 6};
        int[] nums4 = {};
        merge2(nums3, 3, nums4, 0);
        System.out.println(Arrays.toString(nums3));

        // example 3
        int[] nums5 = {0, 0, 0};
        int[] nums6 = {2, 5, 6};
        merge2(nums5, 0, nums6, 3);
        System.out.println(Arrays.toString(nums5));

        // example 4
        int[] nums7 = {4, 5, 6, 0, 0, 0};
        int[] nums8 = {1, 2, 3};
        merge2(nums7, 3, nums8, 3);
        System.out.println(Arrays.toString(nums7));


    }
}
