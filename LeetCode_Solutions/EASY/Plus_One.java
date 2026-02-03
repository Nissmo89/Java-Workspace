import java.util.Arrays;

class Plus_One{
    public static int[] plusOne(int[] digits) {
        // handle if first digit isnt 9 
        int carry = 1;
        int is_nine = 0;
        int index;
        
            index = digits.length-1;
            while (index > -1) {
                if(Math.floor(Math.log10(digits[index]+carry)) >= 1){ // 1,9 
                    digits[index] = 0;
                    is_nine ++;
                }else{
                    digits[index] = digits[index]+carry;
                    carry = 0;
                }
                index --;
            }

            if (is_nine == digits.length) {
                return Arrays.copyOf(new int[] {1}, digits.length+1); 
            }
        
        return digits;
    }

    public static void main(String[] arg){
        int[] data = {};
        for (int i : plusOne(data)) {
            System.out.println(i);
        }
    }
}