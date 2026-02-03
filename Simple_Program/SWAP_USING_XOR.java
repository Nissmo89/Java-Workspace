import java.util.*;
public class SWAP_USING_XOR {
    public static void main(String[] arg){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("input for a:");
        a = scanner.nextInt();
        System.out.print("input for b:");
        b = scanner.nextInt();

        // the Xor swap 
        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("Value of a: "+a+", Value of b: "+b);
    }
    
}