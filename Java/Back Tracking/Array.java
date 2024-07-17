package back_tracking;

public class Array {

    public static void fillArray(int[] array, int i) {
        if(i == array.length){
            printArray(array);
            return;
        }
        array[i] = i+1;
        fillArray(array, i+1);
        array[i] -= 2;
    }

    public static void main(String[] args) {
        int []array = new int[5];
        fillArray(array, 0);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for(int element:array){
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
