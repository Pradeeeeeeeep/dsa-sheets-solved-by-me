package Search;

public class pb1 {
    public static void main(String[] args) {
        int[] nums = {18, 12, 9, 14, 77, 50};
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 14){
                flag = false;
            }
        }
        if (flag){
            System.out.printf("Number is not present");
        } else {
            System.out.printf("Number is present");
        }
    }
}
