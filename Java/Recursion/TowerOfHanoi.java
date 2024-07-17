package recursion;

public class TowerOfHanoi {

    public static void towerOfHanoi(char source, char destination, char auxiliary, int numberOfDiscs) {

        if(numberOfDiscs==0){
            return;
        }

        towerOfHanoi(source, auxiliary, destination, numberOfDiscs-1);

        System.out.println("Disc "+numberOfDiscs+" moved from "+source+" to "+destination);

        towerOfHanoi(auxiliary, destination, source, numberOfDiscs-1);
    }

    public static void main(String[] args) {
        towerOfHanoi('A', 'C', 'B', 3);
    }
}
