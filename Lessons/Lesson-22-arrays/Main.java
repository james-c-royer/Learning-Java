// this provides really helpful array methods

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // arrays in Java may only contain values of the same data type
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // this is how you declare them in Java: Type[] varName = {elements}
        int[] nums = {num1, num2, num3};

        /* an array is a reference type, so it points a to memory address, not to a value. In the memory address is the start of the array. Pretend this memory address is 0x0001 (it isn't)
         */
        System.out.println(nums);

        /* the Java Virtual Machine (JVM) then  allocates 12-16 bytes of object header info for an array (we will pretend we have 12 here), and integers contain 4 bytes. This means we have the following memory addresses:
        0x0001 (start of array)
        0x000d (nums[0])
        0x0011 (nums[1])
        0x0015 (nums[2])
         */
        // what are some implications? Take this for example:
        int[] a = {1, 2, 3};
        int[] b = a;

        // we have declared that b and a are references to the same array object in heap memory. That means these have the same values:
        System.out.println(b[0]); // 1
        System.out.println(a[0]); // 1

        // it also means that if we overwrite b[0] it will overwrite a[0], since they are in the same location in memory
        b[0] = 4;
        System.out.println(a[0]); // this is now 4

        /* now for stack vs heap: 
        stack: contains variables that stores references to objects 
        1. nums points (->) to 0x0001
        
        heap: contains the primitive elements and their actual data
        1. address 0x0001 through address 0x000c contains array header metadata
        2. address 0x000d through address 0x0010 contains nums[0] which is 1
        3. address 0x0011 through address 0x0014 contains nums[1] which is 2
        4. address 0x0015 through address 0x0018 contains nums[2] which is 3
         */
        // all this is cool but Java doesn't support memory address manipulation like c++ so you can't actually directly access the memory address of nums[0]
        // practical stuff below:
        // accessing array elements:
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("nums[%d] is: %d\n", i, nums[i]); // 1, 2, 3
        }

        //overwriting a specific element:
        nums[0] = 5;
        System.out.printf("nums[0] is now: %d\n", nums[0]); // 5

        // if you try to access an array element that does not exist the program will cause an out of bounds exception:
        // System.out.println(nums[4]);
        // enhanced for loop that runs once for each element in an array, and has a variable set to the current element's value
        for (int number : nums) {
            System.out.printf("Number is: %d\n", number); // 5, 2, 3
        }
        Arrays.sort(nums); // sort nums in ascending order. Strings would be sorted alphabetically
        for (int number : nums) {
            System.out.printf("Number is: %d\n", number); // 2, 3, 5
        }
        // set all elements in an array to a certain value. Also works with strings
        Arrays.fill(nums, 5);
        for (int number : nums) {
            System.out.printf("Number is: %d\n", number); // 5, 5, 5
        }
    }
}
