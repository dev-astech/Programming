package MaxSumOfSubArrays;

// Complexity will be O(n^3)

public class Bruteforce {

    public static int maxSum(int []numbers) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for (int j = i; j<numbers.length; j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=numbers[k];
                }
                if(maxSum<sum){
                    maxSum = sum;
                }
                System.out.println("sum of sub-array from index "+i+" to "+j+" = "+sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int []numbers = {1,5,4,3,2,8,-7,6,-9};
        int maxSum = maxSum(numbers);
        System.out.println("\nThe maximum sum of all sub-arrays: "+maxSum);
    }
}
