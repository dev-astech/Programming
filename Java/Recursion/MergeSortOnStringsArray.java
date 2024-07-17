package recursion;

public class MergeSortOnStringsArray {


    public static void merge(String[] array, int si, int ei, int mid) {

        int i = si, j = mid+1;
        String[] tempArray = new String[ei-si+1];
        int k = 0;
        while ( i <= mid && j<=ei){
            if(array[i].compareTo(array[j])<0){
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

    public static void mergeSort(String[] array, int si, int ei) {
        if (si>=ei){
            return;
        }
        int mid = si+((ei-si)/2);
        mergeSort(array, si, mid);
        mergeSort(array, mid+1, ei);
        merge(array, si, ei, mid);
    }



    public static void main(String[] args) {
        String[] array = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};

        for(String str: array){
            System.out.print(str+" ");
        }

        System.out.println();

        mergeSort(array, 0, array.length-1);

        for(String str: array){
            System.out.print(str+" ");
        }

    }

}
