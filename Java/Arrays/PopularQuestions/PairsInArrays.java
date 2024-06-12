public class PairsInArrays {

    public static void printPairs(int []numbers) {
        int totalPairs = 0;
        for (int i=0; i<numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                System.out.print("("+numbers[i]+", "+numbers[j]+"), ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.print("total number of pairs: "+totalPairs);
    }

    public static void main(String[] args) {
        int []numbers = {1, 2, 3, 4, 5};
        printPairs(numbers);
    }
}
