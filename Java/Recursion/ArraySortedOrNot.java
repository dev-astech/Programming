package recursion;


public class ArraySortedOrNot {

    public static boolean isSorted(int[] array, int indices) {
        if (indices == array.length - 1) {
            return true;
        }
        if(array[0]<array[array.length-1]){
            return array[indices]<=array[indices+1] && isSorted(array, indices+1);
        }else if(array[0]>array[array.length-1]) {
            return array[indices]>=array[indices+1] && isSorted(array, indices+1);
        }else {
            return array[indices]==array[indices+1] && isSorted(array, indices+1);
        }
    }

    public static void main(String[] args) {
        int[] array = {9,9,9,9,10,11,12};
        if(isSorted(array, 0)){
            System.out.print("Array is Sorted");
        }else {
            System.out.print("Array is not Sorted");
        }
    }
}
