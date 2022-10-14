package tasks;

public class FirstTasks {
    
    public static void main(String[] args) {

        // System.out.println(remainder(1, 3));
        // System.out.println(remainder(3, 4));
        // System.out.println(remainder(-9, 45));
        // System.out.println(remainder(5, 5));

        // System.out.println(triArea(3, 2));
        // System.out.println(triArea(7, 4));
        // System.out.println(triArea(10, 10));

        // System.out.println(animals(2, 3, 5));
        // System.out.println(animals(1, 2, 3));
        // System.out.println(animals(5, 2, 8));

        // System.out.println(profitableGamble(0.2, 50, 9));
        // System.out.println(profitableGamble(0.9, 1, 2));
        // System.out.println(profitableGamble(0.9, 3, 2));

        // System.out.println(operation(24, 15,9));
        // System.out.println(operation(24, 26 ,2));
        // System.out.println(operation(15, 11, 11));

        // System.out.println(ctoa("A"));
        // System.out.println(ctoa("m"));
        // System.out.println(ctoa("["));
        // System.out.println(ctoa("/"));

        // System.out.println(addUpTo(3));
        // System.out.println(addUpTo(10));
        // System.out.println(addUpTo(7));

        // System.out.println(nextEdge(8, 10));
        // System.out.println(nextEdge(5, 7));
        // System.out.println(nextEdge(9, 2));

        // System.out.println(sumOfCubes(new int[] {1, 5, 9}));
        // System.out.println(sumOfCubes(new int[] {3, 4, 5}));
        // System.out.println(sumOfCubes(new int[] {2}));
        // System.out.println(sumOfCubes(new int[] {}));

        // System.out.println(abcMath(42, 5, 10));
        // System.out.println(abcMath(5, 2, 1));
        // System.out.println(abcMath(1, 2, 3));

        System.exit(1);
    }

    private static Integer remainder(int firstNumber, int secondNumber) {
        return (firstNumber % secondNumber);
    }

    private static double triArea(int h, int a) {
        return (h * a * 0.5);
    }

    private static Integer animals(int chickens, int cows, int pigs) {
        return (chickens * 2 + cows * 4 + pigs * 4);
    }

    private static boolean profitableGamble(double prob, int price, int pay) {
        return ((prob * price) > pay);
    }

    private static String operation(float n, float a, float b) {
          
        if ((a + b) == n) return "added";
        if ((a - b) == n) return "substracted";
        if ((a * b) == n) return "multiplication";
        if ((a / b) == n) return "divinded";
        return "none";

    }

    private static Integer ctoa(String str) {
        char aChar = str.charAt(0);
        int ascii = aChar;
        return ascii;
    }

    private static Integer addUpTo(int num) {
        int sum;
        sum = 0;
        for (int i=1; i <= num; i++) {
                sum += i;
        }
        return sum;
    }

    private static Integer nextEdge(int a, int b) {
        return (a + b - 1);
    }
    
    private static Integer sumOfCubes(int[] numbers) {
        int sum;
        sum = 0;

        for (int i=0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 3);
        }
        return sum;
    }

    private static boolean abcMath(int a, int b, int c) {
        for (int i=0; i<b; i++) {
            a *= 2;
        }
        if (a % c == 0) return true; 
        else return false;
    }    
}
