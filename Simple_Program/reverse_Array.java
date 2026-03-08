class rev_Arr{
    public static void rev_array(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start != end) {
            // swapping method using xor , you can use any 
            arr[start] ^= arr[end];  
            arr[end]   ^= arr[start];
            arr[start] ^= arr[end];

            // steps
            start++;
            end--;
        }
    } 
    public static void main(String[] args) {
        int[] random = {32,92,11,0,19};
        rev_array(random);

        for (int i : random) {
            System.out.println(i);
        }
    }
}