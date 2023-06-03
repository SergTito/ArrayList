package arr;

import java.util.ArrayList;

public class Main02 {
    //Implement a function that removes all duplicate elements from the ArrayList,
    // leaving only unique values.
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(9);
        nums.add(5);
        nums.add(9);
        nums.add(7);
        nums.add(6);
        nums.add(2);
        nums.add(3);
        ArrayList<Integer> unicNums = new ArrayList<>();
        for (int unicNum : nums){
            if (!unicNums.contains(unicNum)){
                unicNums.add(unicNum);
            }
        }
        nums.clear();
        nums.addAll(unicNums);
        System.out.println("Unique numbers " + unicNums);
    }
}
