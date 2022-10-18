import java.util.Scanner;


public class SecondTasks {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        // System.out.print("Input word for repeat: ");
        // String inputStr = inp.nextLine();
        // System.out.print("Inpur number of repeat: ");
        // Integer inputNumber = Integer.parseInt(inp.nextLine());
        // System.out.println(repeat(inputStr, inputNumber));

        // System.out.print("Input numbers: ");
        // String[] inputNumbers = inp.nextLine().split(", ");
        // System.out.println(differenceMaxMin(convertArrayToInt(inputNumbers)));

        // System.out.print("Input numbers: ");
        // String[] inputNumbers = inp.nextLine().split(", ");
        // System.out.println(isAvgWhole(convertArrayToInt(inputNumbers)));

        // System.out.print("Input numbers: ");
        // String[] inputNumbers = inp.nextLine().split(", ");
        // int[] result = cumulativeSum(convertArrayToInt(inputNumbers));
        // for (int i=0; i<result.length - 1; i++) {
        //     System.out.print(result[i]);
        //     System.out.print(", ");
        // }
        // System.out.println(result[result.length - 1]);

        // System.out.print("Input number: ");
        // String inputNumber = inp.nextLine();
        // System.out.println(getDecimalPlaces(inputNumber));
        
        // System.out.print("Input number: ");
        // int inputNumber = Integer.parseInt(inp.nextLine());
        // System.out.println(Fibonacci(inputNumber));

        // System.out.print("Input code: ");
        // String inputCode = inp.nextLine();
        // System.out.println(isValid(inputCode));

        // System.out.print("Input strings: ");
        // String[] inputStrings = inp.nextLine().split(", ");
        // System.out.println(isStrangePair(inputStrings[0], inputStrings[1]));

        // System.out.print("Input string and prefix: ");
        // String[] inputForPrefix = inp.nextLine().split(", ");
        // System.out.println(isPrefix(inputForPrefix[0], inputForPrefix[1]));
        // System.out.print("Input string and suffix: ");
        // String[] inputForSuffix = inp.nextLine().split(", ");
        // System.out.println(isSuffix(inputForSuffix[0], inputForSuffix[1]));

        // System.out.print("Input step: ");
        // int inputStep = Integer.parseInt(inp.nextLine());
        // System.out.println(boxSeq(inputStep));

        inp.close();
    }


    private static int[] convertArrayToInt(String[] stringArray) {
        int[] result = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            result[i] = Integer.parseInt(stringArray[i]);
        }
        return result;
    }


    private static String repeat(String str, int numberOfRepeat) {
        String newStr = "";

        for (int i=0; i<str.length(); i++) {
            String oneChar = String.valueOf(str.charAt(i));
            String temp = "";

            for (int j = 0; j < numberOfRepeat; j++) {
                temp += oneChar;
            }
            newStr += temp;

        }

        return newStr;
    }


    private static Integer differenceMaxMin(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        return (max - min);
    }


    private static boolean isAvgWhole(int[] numbers) {
        int sumOfArray = 0;

        for (int i=0; i<numbers.length; i++) {
            sumOfArray += numbers[i];
        }
        
        return sumOfArray % numbers.length == 0;
        
    }


    private static int[] cumulativeSum(int[] numbers) {
        if (numbers.length == 0) {
            return numbers;
        }
        int[] sumArray = new int[numbers.length];
        int sumOfArray = numbers[0];
        sumArray[0] = numbers[0];

        for (int i=1; i<numbers.length; i++) {
            sumArray[i] = (numbers[i] + sumOfArray);
            sumOfArray += numbers[i];
        }
        
        return sumArray;
    }

    private static Integer getDecimalPlaces(String number) {
        String fractionalPart = number.split("\\.")[1];
        return fractionalPart.length();
    }


    private static Integer Fibonacci(int number) {

        if (number == 0 || number == 1) return 0;
        else if (number == 2) return 1;
        
        return Fibonacci(number - 1) + Fibonacci(number - 2);    
    }


    private static boolean isValid(String str) {
        try {
            int test = Integer.parseInt(str);
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }


    private static boolean isStrangePair(String firstStr, String secondStr) {

        return ((firstStr.charAt(0) == secondStr.charAt(secondStr.length() - 1))
                && (firstStr.charAt(firstStr.length() - 1) == secondStr.charAt(0)));
        
    }


    private static boolean isPrefix(String word, String prefix) {
        return (word.indexOf(prefix) == 0);
    }


    private static boolean isSuffix(String word, String suffix) {
        return (word.indexOf(suffix) == word.length() - suffix.length());
    }


    private static int boxSeq(int step) {
        int start = 0;
        if (step == 0) return 0;
        for (int i=1; i<=step; i++) {
            if (i % 2 == 1) start += 3;
            else start -= 1;
        }        

        return start;
    }
}
