package dsa.Stack;

import java.util.Stack;

public class maxArea_histogram {

    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // ---------------------------
        // ✅ NEXT SMALLER RIGHT (NSR)
        // ---------------------------
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsr[i] = arr.length; // no smaller element on right
            } else {
                nsr[i] = s.peek();   // index of next smaller element
            }

            s.push(i);
        }

        // --------------------------
        // ✅ NEXT SMALLER LEFT (NSL)
        // --------------------------
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {   // ✅ loop goes forward!
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nsl[i] = -1; // no smaller element on left
            } else {
                nsl[i] = s.peek();
            }

            s.push(i);
        }

        // -------------------------------------
        // ✅ Compute Area = height * width
        // width = nsr[i] - nsl[i] - 1
        // -------------------------------------
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max Area in Histogram = " + maxArea);
    }

    public static void main(String args[]) {
        int arr[] = {2, 1, 5, 6, 2, 3}; // histogram heights
        maxArea(arr);
    }
}
