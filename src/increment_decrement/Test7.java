package increment_decrement;

class Test7 {
    public static void main(String[] args) {
        System.out.println(10 < Float.NaN);   // Comparison 1
        System.out.println(10 <= Float.NaN);  // Comparison 2
        System.out.println(10 > Float.NaN);   // Comparison 3
        System.out.println(10 >= Float.NaN);  // Comparison 4
        System.out.println(10 == Float.NaN);  // Comparison 5
        System.out.println(Float.NaN == Float.NaN); // Comparison 6
        System.out.println(10 != Float.NaN);  // Comparison 7 (corrected)
        System.out.println(Float.NaN != Float.NaN); // Comparison 8 (corrected)
    }
}