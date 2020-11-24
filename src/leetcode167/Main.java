package leetcode167;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {2,7,11,14};
		
		int target = 21;
		
		System.out.println("Input: " + Arrays.toString(numbers) + " target: " + target);
		
		FindSumOfTwo solution = new FindSumOfTwo();
		
		System.out.println("Solution: " + Arrays.toString(solution.twoSum(numbers, target)));
	}
}
