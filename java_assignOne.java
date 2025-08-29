import java.util.Scanner;

public class java_assignOne {

    public static int naturalSum(int n) {
        if (n <= 1) {
            return n;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void table() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static int facrorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void palindromeNum(int n){
        int original = n;
        int newNum = 0;
        while(n != 0){
            int digit = n % 10;
            newNum = newNum * 10 + digit;
            n /= 10;
        }
        if(original == newNum){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void fibonacci_Till_n(int n){
        if (n <= 0) { 
            return; 
        } 
        int FTerm = 0; 
        int STerm = 1; 
        if (n == 1) { 
            System.out.println(FTerm); 
        }
        else{
            System.out.format("%d %d ", FTerm, STerm); 
            for (int i = 3; i <= n; i++) { 
                int curTerm = FTerm + STerm; 
                System.out.format("%d ", curTerm); 
                FTerm = STerm; 
                STerm = curTerm; 
            } 
        }
        System.out.println();
    }

    public static void primeCheck(int n){
        if(n <= 1){
            System.out.println("Not Prime");
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Not Prime");
            }
        }
        System.out.println("Prime");
    }

    public static void armstrongCheck(int n){
        int original = n;
        int sum = 0;
        int power = countDigits(n);
        while(n != 0){
            int digit = n % 10;
            sum += Math.pow(digit, power);
            n /= 10;
        }
        if(original == sum){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }

    public static void isStrong(int n){
        int original = n;
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += facrorial(digit);
            n /= 10;
        }
        if(original == sum){
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }

    public static void pythagoreanTriplets(int limit){
        for(int a = 1; a <= limit; a++) {
            for(int b = a; b <= limit; b++) {
                for(int c = b; c <= limit; c++) {
                    if(a * a + b * b == c * c) {
                        System.out.println("("+a + " " + b + " " + c+")");
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        // Q1.
        System.out.println(naturalSum(5));
        // Q2.
        table();
        // Q3.
        System.out.println(facrorial(5));
        // Q4.
        System.out.println(countDigits(12345));
        // Q5.
        System.out.println(sumOfDigits(12345));
        // Q6.
        palindromeNum(12321);
        // Q7.
        fibonacci_Till_n(7);
        // Q8.
        primeCheck(29);
        // Q9.
        armstrongCheck(153);
        // Q10.
        isStrong(145);
        // Q11.
        pythagoreanTriplets(20);



    }
    
}
