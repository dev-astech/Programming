package recursion;

public class InversionCount {

//    public static int inversionCount(int[] array) {
//        int count = 0;
//        for(int i=0; i<array.length; i++){
//            for(int j=i+1; j< array.length; j++){
//                if(array[i]>array[j]){
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public static int inversionCount(int[] array, int i, int j) {
//        if(i == array.length-2){
//            return 0;
//        }
//        if(j == array.length){
//            i++;
//            j=i+1;
//        }
//        if(array[i]>array[j]){
//            return inversionCount(array, i, j+1)+1;
//        }
//        return inversionCount(array, i, j+1);
//    }

    public static int invCount(int[] array, int si, int mid, int ei) {
        int i = si, j = mid;
        int invCount = 0;
        int[] tempArray = new int[ei-si+1];
        int k = 0;
        while ( i < mid && j<=ei){
            if(array[i]<=array[j]){
                tempArray[k] = array[i];
                i++;
            }else{
                tempArray[k] = array[j];
                j++;
                invCount += mid-i;
            }
            k++;
        }

        while (i < mid){
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
        return invCount;
    }

    public static int divide(int[] array, int si, int ei) {
       int invCount = 0;
       if(ei>si){
           int mid = si+(ei-si)/2;
           invCount = divide(array, si, mid);
           invCount += divide(array, mid+1, ei);
           invCount += invCount(array, si, mid+1, ei);
       }
       return invCount;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 1, 3, 9, 6};
//        System.out.println(inversionCount(array));
//        System.out.println(inversionCount(array, 0, 1));
        int result = divide(array, 0, array.length-1);
        System.out.println(result);
    }
}
