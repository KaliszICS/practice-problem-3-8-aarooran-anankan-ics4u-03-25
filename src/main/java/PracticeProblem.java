import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {}

	public static int fib(int num) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		return fibHelper(num, map);
	}

	public static int fibHelper(int num, HashMap<Integer, Integer> map) {

		if (num < 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}

		if (map.containsKey(num)) {
			return map.get(num);
		}
		
		else {
			map.put(num, fibHelper(num - 1, map) + fibHelper(num - 2, map));
		}

		return map.get(num);
	}

	public static int minCostClimbingStairs(int[] cost) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		Stack<int[]> stack = new Stack<int[]>();

		int index = 0; 

		stack.push(new int[]{cost.length - 1, 0}); //push adds a value to the stack at the top

		int smallest = Integer.MAX_VALUE; //setting this to the highest value

		return helperMinCostClimbingStairs(cost, map, stack, smallest); //i had 2 of these for some reasn??

	}

	public static int helperMinCostClimbingStairs(int[] cost, HashMap<Integer, Integer> map, Stack<int[]> stack, int smallest) {

			int[] top = stack.pop(); //take the top value of the stack, remove it and return it.

			if (cost[top[0]]==0) { //[top[1]]
				if (top[2] < smallest) {
					smallest = top[2];
				}
			}

			//Try to go right, and try to go up

			//Up - decrease the value of the row by 1 - the row is the first index of our array
			if (top[0] > 0) {
				stack.push(new int[]{top[0] - 1, top[1], top[2] + 1});
			}

			//Right - incrase the value of the column by 1 - the col is the second index of our array

			if (top[1] < cost.length - 1) {
				stack.push(new int[]{top[0], top[1] + 1, top[2] + 1});
			}
			
		//return smallest;

		return helperMinCostClimbingStairs(cost, map, stack, smallest);

	}
}
