package recursion;

public class MajorityElement {

    public static int findMajorityElement(int[] array) {
        int count = 0, majorityCount = 0, majorityIndex = 0;
        for(int i = 0; i< array.length; i++){
            count = countOf(array, array[i]);
            if(count>majorityCount && count> array.length/2){
                majorityCount = count;
                majorityIndex = i;
            }
        }
        return majorityIndex;
    }

    public static int countOf(int[] array, int element) {
        int count = 0;
        for (int j : array) {
            if (j == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 3};
        int majorityIndex = findMajorityElement(array);
        System.out.println(array[majorityIndex]);
    }
}
