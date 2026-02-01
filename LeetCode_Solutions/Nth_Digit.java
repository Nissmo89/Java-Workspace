class Solution {
    public int findNthDigit(int n) {
        long len = 1;
        long count = 9;
        long start = 1;

        // get right tier for number like if N = 180
        // its Under 2nd tier with max 180 and min of 10
        while (n > len * count){
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }

        // get actual number 
        long num = start + (n-1) / len; // 95 if N = 180

        long digit_index = (n-1) % len; // using 10^(len - digitIndex - 1)  get 

        long div = 1;
        for (int i=0;i< len - digit_index - 1 ; i++){
            div *= 10;
        }

        return (int)(num / div ) % 10;
    }
}
