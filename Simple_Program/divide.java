import java.util.*;
class main{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int Dividend = sc.nextInt();
    int Divisor = sc.nextInt();
    
    double result = Math.pow(10,Math.log10(Dividend)-Math.log10(Divisor));

    System.out.print(result);
}
}


