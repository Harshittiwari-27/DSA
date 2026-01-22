package dsa.Stack;


    import java.util.Stack;
import java.util.Arrays;
public class Next_greater_element {


    public static void findNGE(int arr[], int nge[]) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int curr = arr[i];

            // Remove elements smaller than current
            while (!s.isEmpty() && s.peek() <= curr) {
                s.pop();
            }

            // If stack empty → no greater element
            if (s.isEmpty()) {
                nge[i] = -1;
            } else {
                nge[i] = s.peek();
            }

            // Push current element onto stack
            s.push(curr);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        int nge[] = new int[arr.length];

        findNGE(arr, nge);

        System.out.println("Next Greater Elements:");
        System.out.println(Arrays.toString(nge));
    }
}

                    
    

