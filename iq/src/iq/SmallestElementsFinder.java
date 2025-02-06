package iq;
//Q.print First And Second Smallest Element from an Array.
public class SmallestElementsFinder {
    public static int[] findFirstAndSecondSmallest(int[] arr) {
		// Edge case: if there are fewer than 2 elements, we can't find both
		// smallest and second smallest
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements");
        }
        // Initialize smallest and second smallest to maximum possible values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : arr) {
            if (number < smallest) {
                // Update second smallest before updating smallest
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }

        // Check if secondSmallest was updated
        if (secondSmallest == Integer.MAX_VALUE) {
            throw new IllegalStateException("There is no second smallest element");
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        try {
            int[] result = findFirstAndSecondSmallest(arr);
            System.out.println("The smallest element is: " + result[0]);
            System.out.println("The second smallest element is: " + result[1]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
		}
	}
}
