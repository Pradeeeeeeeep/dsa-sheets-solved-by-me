package Arrays;

public class majorityElement {
    public static int majorityElement(int[] nums) {
       
        for(int i=0; i<nums.length; i++){
            int times = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    times++;
                }
            }
            if(times>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}

