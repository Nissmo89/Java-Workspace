import java.util.*;

class MathDivision { 
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        
        
        double logX = Math.log10(x);
        double logY = Math.log10(y);
        
        
        double difference = logX - logY;
        
        
        double result = Math.pow(10, difference);
        
        System.out.println("Result: " + result);
    }
}

//     x / y = base ^ ( log_base(x) - log_base(y) )
