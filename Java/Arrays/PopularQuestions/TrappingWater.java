package Array.PopularQuestions;

public class TrappingWater {

    public static int storedWater(int[] buildingHeights) {
        int len = buildingHeights.length;
        int[] leftMax = new int[len];
        int[] rightMax = new int[len];
        int[] waterLevel = new int[len];
        int storedWater = 0;

        if (len < 2 || isSortedArray(buildingHeights)) {
            return 0;
        }

        for (int i = 0; i < buildingHeights.length; i++) {
            if (i == 0) {
                leftMax[i] = buildingHeights[i];
                rightMax[len - 1] = buildingHeights[len - 1];
            } else {
                leftMax[i] = Math.max(buildingHeights[i], leftMax[i - 1]);
                rightMax[len - 1 - i] = Math.max(rightMax[len - i], buildingHeights[len - 1 - i]);
            }
        }

        for (int i = 0; i < buildingHeights.length; i++) {
            waterLevel[i] = Math.min(leftMax[i], rightMax[i]) - buildingHeights[i];
            if (waterLevel[i] > 0) storedWater += waterLevel[i];
        }

        printArray(leftMax);
        printArray(rightMax);

        return storedWater;
    }

    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static boolean isSortedArray(int[] buildingHeights) {
        int len = buildingHeights.length;
        int first = buildingHeights[0], last = buildingHeights[len - 1];
        if (first < last) {
            for (int i = 1; i < len; i++) {
                if (buildingHeights[i] < buildingHeights[i - 1]) {
                    return false;
                }
            }
        } else if (first > last) {
            for (int i = 1; i < len; i++) {
                if (buildingHeights[i] > buildingHeights[i - 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < len; i++) {
                if (buildingHeights[i] != buildingHeights[i - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] buildingHeights = {4, 2, 0, 6, 3, 2, 5};
        int storedWater = storedWater(buildingHeights);
        System.out.println("Stored water = " + storedWater);
    }

}
