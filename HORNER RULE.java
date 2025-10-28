// HORNER'S RULE IMPLEMENTATION IN JAVA
// ------------------------------------
// This program converts a binary string to its decimal equivalent
// using Horner’s Rule.

public class HornerBinaryToDecimal {

    // Function to convert binary string to decimal using Horner's rule
    public static int hornerBinaryToDecimal(String binaryStr) {
        binaryStr = binaryStr.trim();  // Remove leading/trailing spaces
        int result = 0;

        for (int i = 0; i < binaryStr.length(); i++) {
            int digit = Character.getNumericValue(binaryStr.charAt(i));
            result = result * 2 + digit;
        }

        return result;
    }

    public static void main(String[] args) {
        String binaryNum = " 1011";
        int decimalNum = hornerBinaryToDecimal(binaryNum);
        System.out.println("Binary " + binaryNum.trim() + " to decimal is " + decimalNum);
    }
}
