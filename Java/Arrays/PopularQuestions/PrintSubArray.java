public class PrintSubArray {
    public static void printSubArrays(int []numbers) {
        int totalSubArrays = 0;
        for(int i=0;i<numbers.length;i++){
            int minSum = Integer.MAX_VALUE;
            int maxSum = Integer.MIN_VALUE;
            for (int j = i; j<numbers.length; j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                if(minSum>sum){
                    minSum = sum;
                }
                if(maxSum<sum){
                    maxSum = sum;
                }
                totalSubArrays++;
                System.out.println(" sum = "+sum);
            }
            System.out.println("\nmin sum = "+minSum+" max sum = "+maxSum);
        }
        System.out.println("no. of sub-arrays are: "+totalSubArrays+"\n");
    }

    public static void main(String[] args) {
        int []numbers = {5, 4, 3, 2, 1};
        printSubArrays(numbers);
    }
}
