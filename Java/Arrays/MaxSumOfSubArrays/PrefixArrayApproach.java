package MaxSumOfSubArrays;

// Complexity will be O(n^2)

public class PrefixArrayApproach {

    public static int maxSum(int []numbers) {
        int []prefixArray = new int[numbers.length];

        prefixArray[0] = numbers[0];

        for(int i=1;i<numbers.length;i++){
            prefixArray[i] = prefixArray[i-1]+numbers[i];
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                if(i==0){
                    sum = prefixArray[j];
                }else {
                    sum = prefixArray[j] - prefixArray[i - 1];
                }
                System.out.println("sum of sub-array from index "+i+" to "+j+" = "+sum);
                if(sum>maxSum){
                    maxSum = sum;
                }
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
