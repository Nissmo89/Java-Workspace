import java.util.*;
class square{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            System.out.print("*");
            for (int j=1;j<=n;j++){
                System.out.print(i==1 || i==n ? "*":" ");
            }
            System.out.println("*");
        }
    }
}