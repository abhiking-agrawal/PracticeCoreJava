package com.small_programs;

/**
 * https://www.geeksforgeeks.org/binary-search/
 */


public class BinarySearch {

    int binarySearch(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch obj = new BinarySearch();
        int arr[] = { 21, 32, 45, 103, 401 };
        int n = arr.length;
        int x = 145;
        int result = obj.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}
