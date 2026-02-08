import java.util.*;
class reverse_int{
  public static int reverse_int(int n){
    int len = (int)Math.floor(Math.log10(n));
    int sum = 0;

    while(n != 0){
      sum += (n%10)*Math.pow(10,len--);
      n /= 10;
    }

    return sum;
  }
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   System.out.println("the reversed integer: -> "+reverse_int(n));
  }
}
