package recursion;

public class MergeSort {


    public static void merge(int[] array, int si, int ei, int mid) {

        int i = si, j = mid+1;
        int[] tempArray = new int[ei-si+1];
        int k = 0;
        while ( i <= mid && j<=ei){
            if(array[i]<array[j]){
                tempArray[k] = array[i];
                i++;
            }else{
                tempArray[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid){
            tempArray[k] = array[i];
            i++;
            k++;
        }
        while (j <= ei){
            tempArray[k] = array[j];
            j++;
            k++;
        }

        for(k=0, i = si; k < tempArray.length; k++, i++){
            array[i] = tempArray[k];
        }
    }

    public static void mergeSort(int[] array, int si, int ei) {
        if (si>=ei){
            return;
        }
        int mid = si+((ei-si)/2);
        mergeSort(array, si, mid);
        mergeSort(array, mid+1, ei);
        merge(array, si, ei, mid);
    }



    public static void main(String[] args) {
        int[] array = {1, 6, 5, 4, 8, 2, 3};

        for(int number: array){
            System.out.print(number+" ");
        }

        System.out.println();

        mergeSort(array, 0, array.length-1);

        for(int number: array){
            System.out.print(number+" ");
        }

    }

}
