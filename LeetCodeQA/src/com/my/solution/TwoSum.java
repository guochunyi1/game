package com.my.solution;

import java.lang.reflect.Array;
import java.util.HashMap;

public class TwoSum {
	
//	Given nums = [2, 7, 11, 15], target = 9,
//
//			Because nums[0] + nums[1] = 2 + 7 = 9,
//			return [0, 1].
	
	public static void main(String[] args) {
		int[] input = new int[]{2,7,11,15};
		int sum = 22;
		int[] result = solution(input, sum);
		System.out.println("[" + result[0] + "," + result[1] + "]");
	}
	
	public static int[] solution(int[] input, int sum) {
		
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < input.length; i ++) {
			int first = input[i];
			if(map.containsKey(sum - first)) {
				result[1] = i;
				result[0] = map.get(sum - first);
				return result;
			}
			map.put(first, i);
		}
		System.out.println("no solution");
		return new int[]{-1, -1};
	}
}
