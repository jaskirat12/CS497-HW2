package HW2;
import java.util.HashMap;

public class MajorityElement {
	private static void findMajor(int[] nums) {
		HashMap<Integer, Integer> dupCount = new HashMap<Integer, Integer>();
		int c=0;
		for(int i=0; i<nums.length; i++) {
			if(dupCount.containsKey(nums[i])) {
				c = dupCount.get(nums[i]);
				c++;
				dupCount.put(nums[i], c);
			}
			else {
				dupCount.put(nums[i], 1);
			}
			if(dupCount.get(nums[i]) > nums.length/2) {
				System.out.println(nums[i]);			
				return;									//You can return nums[i] here.
			}
		}
		System.out.println("No Majority Element found.");
	}

	public static void main(String[] args) {
		int[] nums = new int[] {3, 2, 3};
		findMajor(nums);
		int[] nums2 = new int[] {2, 2, 1, 1, 1, 2, 2};
		findMajor(nums2);
		int[] nums3 = new int[] {};
		findMajor(nums3);
	}

}
