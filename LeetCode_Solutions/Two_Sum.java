import java.lang.reflect.Array;
import java.util.*;
class trySum{

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer , Integer> pair = new HashMap<Integer,Integer>(); // store value and its index
    
    for (int i = 0; i < nums.length; i++) {
      int compliment = target - nums[i];
      if (pair.containsKey(compliment)){
          return new int[] {pair.get(compliment),i};
      }
      pair.put(nums[i], i);
    }

    
    return new int[]{-1,-1};
  }

  public static void main(String[] args) {
    int target = 6;
    int[] arr = {3,2,4}; // {0,1}
    int[] result = twoSum(arr,target);
    for (int x : result){
      System.out.println(x);
    }
  }
}
