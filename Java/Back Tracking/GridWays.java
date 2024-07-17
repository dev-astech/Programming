package back_tracking;

public class GridWays {

    public static int gridWays(char[][] grid, int i, int j) {
        if(i == grid.length-1 && j == grid[0].length-1){
            return 1;
        }
        else if(i==grid.length || j==grid[0].length){
            return 0;
        }
        return gridWays(grid, i+1, j)+gridWays(grid, i, j+1);
    }

    public static int waysFromFact(int n, int m) {
        return factorial(n+m-2)/(factorial(n-1)*factorial(m-1));
    }

    public static int factorial(int number) {
        if(number==0 || number==1){
            return 1;
        }
        return number*factorial(number-1);
    }

    public static void main(String[] args) {
        char[][] grid = new char[3][3];
        int totalWaysByBacktracking = gridWays(grid, 0, 0);
        int totalWaysByFactorial = waysFromFact(grid.length, grid[0].length);
        System.out.println(totalWaysByBacktracking);
        System.out.println(totalWaysByFactorial);
    }
}
