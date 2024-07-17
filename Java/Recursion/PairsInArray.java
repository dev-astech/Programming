package recursion;

public class PairsInArray {
    public static void printPairs(int[] numbers, int i, int j) { // J is used as parameter if using only recursion

        // Using recursion with loop

//        if(i== numbers.length){
//            return;
//        }
//        int j = i+1;
//        while (j< numbers.length){
//            System.out.print("(" + numbers[i] + ", " + numbers[j] + "), ");
//            j++;
//        }
//        System.out.println();
//        printPairs(numbers, i+1);


        // Using Recursion only

        if(i == numbers.length-2){
            return;
        }
        if(j == numbers.length-1){
            i++;
            j = i+1;
            System.out.println();
        }else {
            j++;
        }
        System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
        printPairs(numbers, i, j);

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printPairs(numbers, 0, 0);
    }
}
