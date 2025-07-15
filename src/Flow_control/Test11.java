package Flow_control;

class Test11 {
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] x = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Iterate through the 2D array and print each element
        for (int[] x1 : x) {
            for (int x2 : x1) {
                System.out.println(x2);
            }
        }
    }
}