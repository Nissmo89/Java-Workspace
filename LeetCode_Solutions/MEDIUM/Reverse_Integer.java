class Solution {
    public int reverse(int x) {
         if(x >= 2147483647 || x <= -2147483648){
            return 0;
        }
        boolean was_negative = false;
        int i = (int)Math.floor(Math.log10(Math.absExact(x)));
        int num = 0; 
        if (x < 0){
            x*= -1;
            was_negative = true;
        }

        while(x != 0){
            num += (x%10)*Math.pow(10,i);
            i--;
            x = x/10;
        }

        if(was_negative){
            num *= -1;
        }

        if(num >= 2147483647 || num <= -2147483647){
            return 0;
        }

        return num;


    }
}