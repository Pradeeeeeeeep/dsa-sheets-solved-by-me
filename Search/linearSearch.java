package Search;

public class linearSearch {
    static void main(String[] args) {
        int[] nums = {23, 45, 2, 6, 42, 33, 78, 99, 35, 60};
        for  (int i = 0; i < nums.length; i++) {
            if (nums[i] == 35) {
                System.out.println(i);
            }
        }
    }
}
