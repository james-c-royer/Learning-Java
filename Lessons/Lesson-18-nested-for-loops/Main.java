
public class Main {

// I already know this so as an example for the lesson I thought I would be cheeky and do the brute force approach for two-sum
    public static void main(String[] args) {
        // I did definitely have to look up the syntax for arrays in Java since I haven't gotten that far... 
        int[] nums = {1, 5, 3, 10};
        int target = 13;

        // .length returns the 
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.printf("[%d, %d]", i, j);
                    break;
                }
            }
            if (i == nums.length - 2) {
                System.out.println("No solution");
            }
        }

    }
}
