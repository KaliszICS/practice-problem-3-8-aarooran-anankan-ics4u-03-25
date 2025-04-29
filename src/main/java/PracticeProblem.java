import java.util.*;
public class PracticeProblem {

	public static void main(String args[]) {
		int[] rawr = {5};
		System.out.println(minCostClimbingStairs(rawr));
	}

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

		int index = 0;
		int wallet = 0;

		if (cost.length==0) {
			return 0;
		}

		if (cost.length==1) {
			return cost[0];
		}

		int indexZero = helperMinCostClimbingStairs(cost, map, index, wallet);
		int indexOne = helperMinCostClimbingStairs(cost, map, index+1, wallet);
		
		return Math.min(indexZero, indexOne);

	}

	public static int helperMinCostClimbingStairs(int[] cost, HashMap<Integer, Integer> map, int index, int wallet) {

		if (index>cost.length-1) {

			return 0; //final step - to infinity and beyond
		}

		if (map.containsKey(index)) {
			wallet = map.get(index);
		}

		else {
			wallet = wallet + cost[index] + Math.min(helperMinCostClimbingStairs(cost, map, index+1, wallet), helperMinCostClimbingStairs(cost, map, index+2, wallet));
		}

		map.put(index, wallet);

		return map.get(index);
	}
}