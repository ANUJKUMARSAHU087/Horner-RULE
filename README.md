# Horner’s Rule — Binary to Decimal Conversion (Java)

## Overview
This Java program demonstrates Horner’s Rule to efficiently convert a binary string into its decimal equivalent.

Horner’s Rule is a mathematical technique used to evaluate polynomials efficiently.  
For binary numbers, it can be applied to evaluate the polynomial form:

bₙ × 2ⁿ + bₙ₋₁ × 2ⁿ⁻¹ + ... + b₁ × 2 + b₀

Instead of using powers of 2, Horner’s method simplifies this as:

result = (((b₀ × 2) + b₁) × 2 + b₂) × 2 + ...

This reduces the number of operations and improves performance.

## Example
Binary Input: 1011  
Computation:
((1 × 2 + 0) × 2 + 1) × 2 + 1 = 11

Output:
Binary 1011 to decimal is 11

## Code Explanation

### hornerBinaryToDecimal(String binaryStr)
- Removes leading and trailing spaces.  
- Iterates through each binary digit from left to right.  
- Updates the result using:
  result = result * 2 + digit;
- Returns the decimal integer equivalent.

### main(String[] args)
- Defines a sample binary number.  
- Calls the conversion function.  
- Prints the result.

## How to Run

1. Save the code as HornerBinaryToDecimal.java
2. Compile the program:
   javac HornerBinaryToDecimal.java
3. Run the compiled program:
   java HornerBinaryToDecimal

Expected Output:
Binary 1011 to decimal is 11

## Example Usage (Custom Input)
To modify the input, change this line in main:
String binaryNum = " 1011";
You can replace "1011" with any binary number.

## Optional: Add User Input
To allow user input, use the following code:
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
System.out.print("Enter a binary number: ");
String binaryNum = sc.nextLine();

## License
This project is released under the MIT License and is free to use, modify, and share.
