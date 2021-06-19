package com.kk.arr_vec;

import java.util.Arrays;
import java.util.HashSet;

public class Pairs {
  public static void main(String[] args) {

    Integer[] input = {10, 5, 2, 3, -6, 9, 11, 2, 2};
    int sum = 4;

    // Remove Duplicates ... Result should contain pair with distinct numbers
    Integer[] hashSet = new HashSet<>(Arrays.asList(input)).toArray(new Integer[0]);

    Arrays.sort(hashSet);

    System.out.println(
        Arrays.toString(
            findPairs(
                hashSet,
                sum))); // result.toString() is returning address instead of values in it. Need to
    // check
    // where went wrong
    // Update need to use Arrays.toString(result)

  }

  static int[] findPairs(Integer[] arr, int sum) {

    int start = 0;
    int end = arr.length - 1;

    boolean found = false;
    int[] result = new int[2];

    while (!found && start < end) {
      if (arr[start] + arr[end] == sum) {
        result[0] = arr[start];
        result[1] = arr[end];
        found = true;
      } else if (arr[start] + arr[end] > sum) {
        end -= 1;
      } else {
        start += 1;
      }
    }
    return result;
  }
}
