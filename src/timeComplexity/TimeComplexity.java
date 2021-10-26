package timeComplexity;

public class TimeComplexity {

    public static void main(String[] args) {
        int n = 13;
        System.out.println(n);
        FactorialComplexity(n);
    }

    public static void LogarithmicComplexity(int n) {
        for (int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void LinearComplexity(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    public static void NlogNComplexity(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            }
        }
    }

    public static void QuadraticComplexity(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("First loop ");
            for (int j = 0; j < n; j++) {                    //Nested FOR loops, have the time complexity of O(nˆ2)
                System.out.println("Second loop" + i + j);
            }
        }
    }

    public static void FactorialComplexity(int n) {
        for (int i = 1; i <= factorial(n); i++) {
            System.out.println("Factorial Complexity: " + i);
        }
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

