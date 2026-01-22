package dsa.Stack;

import java.util.Stack;

public class Stock_Span_Problem {

    // Function to calculate stock span
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>(); // stack to store indices of stock prices

        // Span of first day is always 1
        span[0] = 1;
        s.push(0); // push index 0

        // Calculate span for rest of the days
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];

            // Pop elements from stack while current price is higher than price at stack's top index
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }

            // If stack becomes empty, all previous prices are smaller → span = i + 1
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Else span = distance between current day and last higher price
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            // Push current index onto stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100}; // stock prices
        int span[] = new int[stocks.length];           // array to store span values

        stockSpan(stocks, span); // calculate span

        System.out.println("Stock spans:");
        for (int i = 0; i < stocks.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
