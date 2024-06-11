package MaxSumOfSubArrays;

// Complexity will be O(n)

public class KadanesApproach {

    public static int getMax(int []numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        if(!isNegative(numbers)){
            for (int number : numbers) {
                currentSum = Math.max((currentSum + number), 0);
                maxSum = Math.max(maxSum, currentSum);
            }
        }else {
            for(int number: numbers){
                if(number>maxSum){
                    maxSum = number;
                }
            }
        }
        return maxSum;
    }

    public static boolean isNegative(int []numbers) {
        for(int number: numbers){
            if(number>0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []numbers = {-4,-1,-2,-3,-5};
        int maxSum = getMax(numbers);
        System.out.println("\nThe maximum sum of all sub-arrays: "+maxSum);
    }
}
