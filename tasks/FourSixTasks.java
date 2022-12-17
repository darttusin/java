import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// import java.security.MessageDigest;
// import java.security.NoSuchAlgorithmException;
// import java.util.HashSet;
// import java.util.Set;

public class FourSixTasks {

    public static void main(String[] args) {
        // System.out.println(textProcessor("10 7 hello my name is Bessie and this is my
        // essay"));
        // System.out.println(split("((()))"));
        // System.out.println(toCamelCase("hello_edabit"));
        // System.out.println(toSnakeCase("helloEdabit"));
        // System.out.println(overTime(new String[] { "9", "17", "30", "1.5" }));
        // System.out.println(BMI(new String[] { "205", "pounds", "73", "inches" }));
        // System.out.println(bugger("999"));
        // System.out.println(toStarShorthand("77777geff"));
        // System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        // System.out.println(trouble("451999277", "41177722899"));
        // System.out.println(countUniqueBooks(new String[] { "AZYWABBCATTTA", "A" }));

        // encrypt("Hello");
        // System.out.println(decrypt(new int[] { 72, 33, -73, 84, -12, -3, 13, -13, -68
        // }));
        // System.out.println(canMove("rook", "A8", "H8"));
        // System.out.println(canComplete("butl", "beautiful"));
        // System.out.println(sumDigProd(new int[] { 16, 28 }));
        // sameVowelGroup(new String[] { "hoops", "chuff", "bot", "bottom" });
        // System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        // System.out.println(hexLattice(19));
        // System.out.println(validateCard(1234567890123452l));
        // System.out.println(getSha256Hash("password123"));
        // System.out.println(numToEng(909));

        System.out.println(bell(3));

        System.out.println(translateWord("apple"));
        System.out.println(translateSentence("I like to eat honey waffles."));

        System.out.println(validColor("rgb(255,,255)"));

        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[] { "b" }));

        System.out.println(Arrays.toString(getHashtags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));

        System.out.println(ulam(206));

        System.out.println(longestNonrepeatingSubstring("abcabcbb"));

        System.out.println(convertToRoman(3999));

        System.out.println(formula("16 * 10 = 160 = 14 + 120"));

        System.out.println(palindromeDescendant(11211230));

    }

    // private static String textProcessor(String str) {
    // String[] words = str.split(" ");
    // int symbolCount = Integer.parseInt(words[1]);
    // String outputStr = "";
    // int currentCount = 0;

    // for (int i = 2; i < words.length; i++) {

    // if (currentCount + words[i].length() <= symbolCount) {
    // outputStr += words[i] + " ";
    // currentCount += words[i].length();
    // } else {
    // currentCount = words[i].length();
    // outputStr += "\n" + words[i] + " ";
    // }
    // }
    // return outputStr;
    // }

    // private static String split(String line) {
    // int leftCase = 0;
    // int rightCase = 0;
    // String outputLine = "";
    // String currentLine = "";

    // for (int i = 0; i < line.length(); i++) {
    // if (line.charAt(i) == '(') {
    // leftCase += 1;
    // currentLine += line.substring(i, i + 1);
    // } else if (line.charAt(i) == ')') {
    // rightCase += 1;
    // currentLine += line.substring(i, i + 1);
    // }

    // if (leftCase == rightCase) {
    // outputLine += currentLine + "\n";
    // currentLine = "";
    // leftCase = 0;
    // rightCase = 0;
    // }
    // }
    // return outputLine;
    // }

    // private static String toCamelCase(String word) {
    // String outputString = "";
    // int beginIndex = 0;
    // int currentIndex = 0;

    // while (currentIndex < word.length() - 1) {
    // if (word.substring(currentIndex, currentIndex + 1).equals("_")) {
    // outputString += word.substring(beginIndex, currentIndex)
    // + word.substring(currentIndex + 1, currentIndex + 2).toUpperCase();
    // currentIndex += 2;
    // beginIndex = currentIndex;
    // if (word.indexOf("_", currentIndex + 2) == -1) {
    // return outputString += word.substring(currentIndex, word.length());
    // }
    // } else
    // currentIndex += 1;
    // }
    // return outputString;
    // }

    // private static String toSnakeCase(String word) {
    // String outputString = "";
    // int currentIndex = 0;
    // int beginIndex = 0;

    // while (currentIndex < word.length() - 1) {
    // if (word.substring(currentIndex, currentIndex + 1).matches("^[A-Z]+$")) {
    // outputString += word.substring(beginIndex, currentIndex) + "_"
    // + word.substring(currentIndex, currentIndex + 1).toLowerCase();
    // currentIndex += 1;
    // beginIndex = currentIndex;

    // if (!word.substring(currentIndex, word.length() -
    // 1).chars().anyMatch(Character::isUpperCase)) {
    // return outputString += word.substring(currentIndex, word.length());
    // }
    // } else
    // currentIndex += 1;
    // }
    // return outputString;
    // }

    // private static String overTime(String[] args) {
    // double beginWork = Double.parseDouble(args[0]);
    // double endWork = Double.parseDouble(args[1]);
    // double hourlyRate = Double.parseDouble(args[2]);
    // double overRate = Double.parseDouble(args[3]);

    // if (endWork > 17.00)
    // return "$" + String.valueOf((17.00 - beginWork) * hourlyRate + (endWork -
    // 17.00) * hourlyRate * overRate);
    // else
    // return "$" + String.valueOf((endWork - beginWork) * hourlyRate);
    // }

    // private static String BMI(String[] args) {
    // double weight = Double.parseDouble(args[0]);
    // double height = Double.parseDouble(args[2]);
    // double indexBMI = 0;

    // if (args[1].equals("pounds"))
    // weight *= 0.45;
    // if (args[3].equals("inches")) {
    // height *= 2.54;
    // height /= 100;
    // }

    // indexBMI = Math.ceil((weight / (height * height)));

    // if (indexBMI > 25)
    // return indexBMI + " Overweight";
    // else if (indexBMI < 18.5)
    // return indexBMI + " Underweight";
    // else
    // return indexBMI + " Normal weight";
    // }

    // private static int bugger(String str) {
    // int currentNum = toCalculate(str);
    // int itterations = 1;

    // if (str.length() == 1) {
    // return 0;
    // }
    // while (currentNum > 9) {
    // itterations += 1;
    // currentNum = toCalculate(Integer.toString(currentNum));
    // }
    // return itterations;
    // }

    // public static int toCalculate(String str) {
    // int outputNum = 1;
    // int arraySum[] = new int[str.length()];

    // for (int i = 0; i < str.length(); i++) {
    // arraySum[i] = Integer.parseInt(str.substring(i, i + 1));
    // }
    // for (int i = 0; i < arraySum.length; i++) {
    // outputNum *= arraySum[i];
    // }
    // return outputNum;
    // }

    // private static String toStarShorthand(String lines) {
    // String outputStr = "";
    // int counter = 0;
    // String line = lines + "NN";

    // for (int i = 0; i < line.length() - 1; i++) {
    // if (!line.substring(i, i + 1).equals(line.substring(i + 1, i + 2)) && counter
    // == 0) {
    // outputStr += line.substring(i, i + 1);
    // }

    // else if (line.substring(i, i + 1).equals(line.substring(i + 1, i + 2))) {
    // counter += 1;
    // } else {
    // outputStr += line.substring(i, i + 1) + "*" + (counter + 1);
    // counter = 0;
    // }
    // }
    // return outputStr;
    // }

    // private static boolean doesRhyme(String line1, String line2) {
    // String lineCheck1 = line1;
    // String lineCheck2 = line2;
    // if (lineCheck1.substring(lineCheck1.length() - 1,
    // lineCheck1.length()).matches("[?!.]($|\\s)")) {
    // lineCheck1 = lineCheck1.substring(0, lineCheck1.length() - 1);
    // }

    // if (lineCheck2.substring(lineCheck2.length() - 1,
    // lineCheck2.length()).matches("[?!.]($|\\s)")) {
    // lineCheck2 = lineCheck2.substring(0, lineCheck2.length() - 1);
    // }

    // if (lineCheck1.substring(lineCheck1.length() - 2, lineCheck1.length())
    // .equals(lineCheck2.substring(lineCheck2.length() - 2, lineCheck2.length())))
    // {
    // return true;
    // } else
    // return false;
    // }

    // private static Boolean trouble(String first, String second) {
    // int numChar = 0;
    // for (int i = 0; i < first.length() - 2; i++) {
    // if ((first.charAt(i) == first.charAt(i + 1)) && (first.charAt(i) ==
    // first.charAt(i + 2))) {
    // numChar = first.charAt(i);
    // }
    // }
    // if (numChar == 0) {
    // return false;
    // }

    // for (int i = 0; i < second.length() - 1; i++) {
    // if ((second.charAt(i) == numChar) && (second.charAt(i + 1) == numChar)) {
    // return true;
    // }
    // }
    // return false;
    // }

    // private static int countUniqueBooks(String[] args) {
    // String[] strArray = args[0].split("");
    // Set<String> s = new HashSet<String>();
    // int counter = 0;

    // for (int i = 0; i < strArray.length; i++) {
    // if (strArray[i].equals(args[1])) {
    // counter += 1;
    // }
    // if (counter % 2 != 0) {
    // s.add(strArray[i]);
    // }
    // }
    // return s.size() - 1;
    // }

    // private static void encrypt(String string) {
    // int len = string.length();
    // int code = 0;
    // int[] arrEncrypt = new int[len];

    // for (int j = 0; j < len; j++) {
    // arrEncrypt[j] = string.charAt(j) - code;
    // code = string.charAt(j);
    // System.out.print(arrEncrypt[j]);
    // System.out.print(" ");
    // }
    // System.out.println(" ");
    // }

    // private static String decrypt(int[] numbers) {
    // String string = "";
    // int code = 0;
    // for (int j = 0; j < numbers.length; j++) {
    // string += (char) (numbers[j] + code);
    // code = numbers[j] + code;
    // }
    // return string;
    // }

    // private static boolean canMove(String p, String c, String t) {
    // if (p.equals("pawn")) {
    // if (c.charAt(0) == t.charAt(0)) {

    // if (c.charAt(1) == '2' && t.charAt(1) == '4') {
    // return true;
    // }

    // if (c.charAt(1) == '7' && t.charAt(1) == '5') {
    // return true;
    // }

    // if (Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 1) {
    // return true;
    // }
    // }
    // }

    // if (p.equals("bishop")) {
    // if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == Math.abs((int)
    // c.charAt(1) - (int) t.charAt(1))) {
    // return true;
    // }
    // }

    // if (p.equals("rook")) {
    // if (c.charAt(0) == t.charAt(0)
    // || c.charAt(1) == t.charAt(1)) {
    // return true;
    // }
    // }

    // if (p.equals("knight")) {

    // if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == 2
    // && Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 1) {
    // return true;
    // }

    // if (Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 2
    // && Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == 1) {
    // return true;
    // }
    // }
    // if (p.equals("king")) {
    // if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) <= 1
    // && Math.abs((int) c.charAt(1) - (int) t.charAt(1)) <= 1) {
    // return true;
    // }
    // }
    // if (p.equals("queen")) {
    // if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == Math.abs((int)
    // c.charAt(1) - (int) t.charAt(1))) {
    // return true;
    // }

    // if (c.charAt(0) == t.charAt(0)
    // || c.charAt(1) == t.charAt(1)) {
    // return true;
    // }

    // }

    // return false;
    // }

    // private static boolean canComplete(String start, String string) {
    // int in = 0;

    // for (int w = 0; w < string.length(); w++) {
    // if (string.charAt(w) == start.charAt(in))
    // in++;
    // }

    // if (in == start.length())
    // return true;
    // else
    // return false;
    // }

    // private static int sumDigProd(int[] inp) {
    // int result = 0;
    // for (int i = 0; i < inp.length; i++) {
    // result += inp[i];
    // }

    // while (result > 9) {
    // String _sumStr = Integer.toString(result);
    // result = 1;
    // for (int i = 0; i < _sumStr.length(); i++) {
    // result *= Character.getNumericValue(_sumStr.charAt(i));
    // }
    // }

    // return result;
    // }

    // private static void sameVowelGroup(String[] strings) {

    // char[] chars = strings[0].toCharArray();
    // Set<Character> v = new HashSet<>();
    // for (char _char : chars) {
    // if (_char == 'a' || _char == 'e' || _char == 'i' || _char == 'o' || _char ==
    // 'u' || _char == 'y') {
    // v.add(_char);
    // }
    // }
    // for (String _string : strings) {
    // boolean isValid = true;
    // for (char c : _string.toCharArray()) {
    // if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y')) {
    // if (!v.contains(c)) {
    // isValid = false;
    // break;
    // }
    // }
    // }
    // if (isValid) {
    // System.out.print(_string + " ");
    // }
    // }

    // }

    // private static boolean validateCard(long numero) {
    // int strLen = String.valueOf(numero).length();
    // if ((strLen < 14) || (strLen > 19))
    // return false;

    // int last_digit = (int) (numero % 10);
    // numero /= 10;
    // StringBuilder stringNumber = new
    // StringBuilder(String.valueOf(numero)).reverse();

    // int temp = 0;
    // for (int i = 0; i < stringNumber.length(); i += 2) {
    // temp = Integer.parseInt(stringNumber.charAt(i) + "") * 2;
    // if (temp / 10 > 0) {
    // temp = temp / 10 + temp % 10;
    // }
    // stringNumber.replace(i, i + 1, String.valueOf(temp));
    // }
    // temp = 0;
    // for (char x : stringNumber.toString().toCharArray()) {
    // temp += Integer.parseInt(x + "");
    // }

    // return ((10 - (temp % 10)) == last_digit);
    // }

    // private static String numToEng(int n) {
    // String[] ones = { "zero", "one", "two", "three", "four", "five", "six",
    // "seven",
    // "eight", "nine" };
    // String[] twenties = { "ten", "eleven", "twelve", "thirten", "fourten",
    // "fifteen",
    // "sixteen", "seventeen", "eighten", "nineteen" };
    // String[] tens = { "", "twenty", "thirty", "forty", "fifty", "sixty",
    // "seventy", "eighty",
    // "ninety" };
    // String numero = Integer.toString(n);

    // int digitCount = numero.length();

    // if (digitCount == 1)
    // return ones[Integer.parseInt(numero)];
    // if (digitCount == 2)
    // return twenties[Integer.parseInt(numero)];
    // if (digitCount == 3) {
    // StringBuilder sb = new StringBuilder();
    // int[] digits = new int[3];
    // int k = 0;
    // while (n != 0) {
    // digits[k] = n % 10;
    // n = n / 10;
    // k++;
    // }
    // sb.append(ones[digits[2]]).append(" hundred ");
    // if (digits[1] == 1) {
    // int c = digits[1] + digits[2];
    // sb.append(twenties[c]);
    // return sb.toString();
    // }
    // if (digits[1] > 1)
    // sb.append(tens[digits[1] - 1]).append(" ");
    // if (digits[0] > 0)
    // sb.append(ones[digits[0]]);
    // return sb.toString();
    // }
    // return "";
    // }

    // private static String getSha256Hash(String msg) {
    // String result = "";
    // MessageDigest md;
    // try {
    // md = MessageDigest.getInstance("SHA-256");
    // byte[] hashes = md.digest(msg.getBytes());
    // for (int i = 0; i < hashes.length; i++) {
    // String hex = Integer.toHexString(0xff & hashes[i]);
    // if (hex.length() == 1)
    // result += 0;
    // result += hex;
    // }
    // } catch (NoSuchAlgorithmException e) {
    // e.printStackTrace();
    // }
    // return result;
    // }

    // private static String correctTitle(String str) {
    // String[] strings = str.split(" ");
    // String output = "";

    // for (int i = 0; i < strings.length; i++) {
    // if (i > 0) {
    // output += " ";
    // }
    // String[] _strings = strings[i].split("-");
    // for (int j = 0; j < _strings.length; j++) {
    // if (j > 0) {
    // output += "-";
    // }
    // if (_strings[j].equalsIgnoreCase("and")
    // || _strings[j].equalsIgnoreCase("the")
    // || _strings[j].equalsIgnoreCase("of")
    // || _strings[j].equalsIgnoreCase("in")) {
    // output += _strings[j].toLowerCase();
    // } else {
    // output += _strings[j].substring(0, 1).toUpperCase();
    // output += _strings[j].substring(1).toLowerCase();
    // }
    // }
    // }

    // return output;
    // }

    // private static String hexLattice(int n) {
    // int i = 0;
    // boolean isHex = false;
    // while (3 * i * (i + 1) + 1 <= n) {
    // if (3 * i * (i + 1) + 1 == n)
    // isHex = true;
    // i++;
    // }
    // String str = "";
    // if (isHex) {
    // int l = i;
    // int m = i;
    // String str2;
    // for (int j = 0; j < 2 * i - 1; j++) {
    // str += "\n";
    // str2 = "";
    // for (int k = 1; k < m; k++) {
    // str2 += " ";
    // }
    // str += str2;
    // for (int k = 0; k < l; k++) {
    // str += " o";
    // }
    // str += str2 + " ";
    // l += (j < i - 1) ? 1 : -1;
    // m += (j < i - 1) ? -1 : 1;
    // }
    // str = str.replaceFirst("\n", "");
    // return str;
    // } else
    // return "Invalid";
    // }

    private static int bell(int n) {
        int[][] bell = new int[n + 1][n + 1];
        bell[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];
            for (int j = 1; j <= i; j++)
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
        }
        return bell[n][0];
    }

    private static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e'
                || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u');
    }

    private static String translateWord(String string) {
        int stringlength = string.length();
        int index = -1;
        if (isVowel(string.charAt(0)))
            return string + "yay";
        for (int i = 0; i < stringlength; i++) {
            if (isVowel(string.charAt(i))) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return "-1";
        return string.substring(index) + string.substring(0, index) + "ay";
    }

    private static String translateSentence(String string) {
        String[] words = string.split(" ");
        String newSentence = "";
        boolean isCapitalFlag;
        boolean isDotFlag;
        for (String string2 : words) {
            isCapitalFlag = false;
            isDotFlag = false;
            if (Character.isUpperCase(string2.charAt(0))) {
                isCapitalFlag = true;
                string2 = string2.toLowerCase();
            }
            if (string2.charAt(string2.length() - 1) == '.') {
                string2 = string2.substring(0, string2.length() - 1);
                isDotFlag = true;
            }
            String translated = translateWord(string2);
            if (isCapitalFlag)
                translated = translated.substring(0, 1).toUpperCase() + translated.substring(1);
            if (isDotFlag)
                translated = translated + ".";
            newSentence += translated + " ";
        }
        return newSentence;
    }

    public static boolean validColor(String str) {
        boolean flag = false;
        if (str.contains("rgb")) {
            String[] nums = str.substring(4, str.length() - 1).split(",");
            for (int i = 0; i < 3; i++) {
                if (nums[i].equals("")) {
                    continue;
                } else {
                    int num = Integer.parseInt(nums[i]);
                    if (num < 256 && num >= 0) {
                        flag = true;
                    } else
                        flag = false;
                }
            }
        } else if (str.contains("rgba")) {
            String[] nums = str.substring(5, str.length() - 1).split(",");
            for (int i = 0; i < 3; i++) {
                if (nums[i].equals("")) {
                    continue;
                } else {
                    int num = Integer.parseInt(nums[i]);
                    if (num < 256 && num >= 0) {
                        flag = true;
                    } else
                        flag = false;
                }
            }
            if (Integer.parseInt(nums[3]) >= 0 && Integer.parseInt(nums[3]) <= 1) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    private static String stripUrlParams(String url, String[] paramsToStrip) {
        if (!url.contains("?"))
            return url;
        String[] parts = url.split("\\?");
        StringBuilder sb = new StringBuilder(parts[0]);
        String[] params = parts[1].split("&");
        HashMap<String, String> map = new HashMap();
        for (String param : params) {
            String[] parm = param.split("=");
            map.put(parm[0], parm[1]);
        }

        LinkedHashSet<String> strip = new LinkedHashSet<>();

        if (paramsToStrip != null)
            strip.addAll(Arrays.asList(paramsToStrip));

        sb.append("?");
        int k = 1;

        for (String key : map.keySet()) {
            if (!strip.contains(key)) {
                if (k > 1)
                    sb.append("&");
                sb.append(key).append("=").append(map.get(key));
                k++;
            }
        }
        return sb.toString();
    }

    private static String[] getHashtags(String str) {
        int count = 3;
        while (str.indexOf(",") != -1)
            str = str.replace(",", "");

        String[] words = str.split(" ");

        String[] toReturn = new String[3];

        for (int i = 0; i < 3; i++) {
            toReturn[i] = "#";
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > toReturn[0].length() - 1) {
                if (toReturn[0].length() > toReturn[1].length()) {
                    if (toReturn[1].length() > toReturn[2].length()) {
                        toReturn[2] = toReturn[1];
                    }
                    toReturn[1] = toReturn[0];
                }
                toReturn[0] = "#" + words[i].toLowerCase();
            } else if (words[i].length() > toReturn[1].length() - 1) {
                if (toReturn[1].length() > toReturn[2].length()) {
                    toReturn[2] = toReturn[1];
                }
                toReturn[1] = "#" + words[i].toLowerCase();
            } else if (words[i].length() > toReturn[2].length() - 1) {
                toReturn[2] = "#" + words[i].toLowerCase();
            }
        }
        return toReturn;
    }

    public static int ulam(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        int i, j;
        for (i = 3, j = 2; j < n; i++) {
            int count = 0;
            for (int k = 0; k < arr.size() - 1; k++) {
                for (int l = k + 1; l < arr.size(); l++) {
                    if (arr.get(k) + arr.get(l) == i)
                        count++;
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1) {
                arr.add(i);
                j++;
            }
        }
        return i - 1;
    }

    public static String longestNonrepeatingSubstring(String str) {
        Set<Character> chars = new HashSet<>();
        ArrayList<String> options = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        String out = "";
        int count = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (chars.contains(str.charAt(i))) {
                options.add(count, answer.toString());
                answer = new StringBuilder();
                answer.append(str.charAt(i));
                chars = new HashSet<Character>();
                chars.add(str.charAt(i));
                ++count;
            } else {
                chars.add(str.charAt(i));
                answer.append(str.charAt(i));
            }
        }

        options.add(count, answer.toString());

        for (String option : options) {
            if (option.length() > out.length()) {
                out = option;
            }
        }

        return out;
    }

    public static String convertToRoman(int num) {
        String fs = "";
        while (num != 0) {
            if (num >= 1000) {
                num -= 1000;
                fs += "M";
            } else if (num >= 900) {
                num -= 900;
                fs += "CM";
            } else if (num >= 500) {
                num -= 500;
                fs += "D";
            } else if (num >= 400) {
                num -= 400;
                fs += "CD";
            } else if (num >= 100) {
                num -= 100;
                fs += "C";
            } else if (num >= 90) {
                num -= 90;
                fs += "XC";
            } else if (num >= 50) {
                num -= 50;
                fs += "L";
            } else if (num >= 40) {
                num -= 40;
                fs += "XL";
            } else if (num >= 10) {
                num -= 10;
                fs += "X";
            } else if (num >= 9) {
                num -= 9;
                fs += "IX";
            } else if (num >= 5) {
                num -= 5;
                fs += "V";
            } else if (num >= 4) {
                num -= 4;
                fs += "IV";
            } else if (num > 0) {
                num -= 1;
                fs += "I";
            }
        }
        return fs;
    }

    public static int calc(String str) {
        str = str.replaceAll(" ", "");
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String[] tokens;
            tokens = str.split("\\*", 2);
            if (tokens.length > 1) {
                return calc(tokens[0]) * calc(tokens[1]);
            }
            tokens = str.split("/", 2);
            if (tokens.length > 1) {
                return calc(tokens[0]) / calc(tokens[1]);
            }
            tokens = str.split("\\+", 2);
            if (tokens.length > 1) {
                return calc(tokens[0]) + calc(tokens[1]);
            }
            tokens = str.split("-", 2);
            if (tokens.length > 1) {
                return calc(tokens[0]) - calc(tokens[1]);
            }
            return 0;
        }
    }

    public static boolean formula(String str) {

        String[] equations = str.split("=");
        for (int i = 0; i < equations.length - 1; i++) {
            if (calc(equations[i]) != calc(equations[i + 1])) {
                return false;
            }
        }
        return true;

    }

    // Задание №10. Палиндром
    public static boolean palindromeDescendant(int num) {
        boolean isSym = false;
        while (num > 9) {
            if (isSymmetrical(num)) {
                isSym = true;
                break;
            }
            num = getSumofDigits(num);
        }
        return isSym;
    }

    public static boolean isSymmetrical(int num) {
        int reversenum = 0, n = num;
        if (n < 0)
            n = n * -1;
        while (n != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + n % 10;
            n = n / 10;
        }
        return (reversenum == num);
    }

    public static int getSumofDigits(int n) {
        String iString = Integer.toString(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iString.length() - 1; i += 2) {
            int i1 = Integer.parseInt(Character.toString(iString.charAt(i)));
            int i2 = Integer.parseInt(Character.toString(iString.charAt(i + 1)));
            int num = i1 + i2;
            sb.append(Integer.toString(num));
        }

        return Integer.parseInt(sb.toString());
    }

}
