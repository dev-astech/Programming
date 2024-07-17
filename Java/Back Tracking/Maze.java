package back_tracking;

public class Maze {

    //Print path in matrix form
    public static void solveMaze(int[][] maze, int i, int j, int[][] outputMaze) {
        if( i<0 || j<0 || i == maze.length || j == maze[0].length || maze[i][j]==0){
            return;
        }

        if(i==maze.length-1 && j== maze[0].length-1){
            outputMaze[i][j] = 1;
            print(outputMaze);
        }

        maze[i][j] = 0;
        outputMaze[i][j] = 1;
        solveMaze(maze, i+1, j, outputMaze);
        solveMaze(maze, i-1, j, outputMaze);
        solveMaze(maze, i, j+1, outputMaze);
        solveMaze(maze, i, j-1, outputMaze);
        maze[i][j] = 1;
        outputMaze[i][j] = 0;
    }

    //Print path in String Form
    public static void printMazePath(int[][] maze, int i, int j, String path) {
        if( i<0 || j<0 || i == maze.length || j == maze[0].length || maze[i][j]==0){
            return;
        }

        if(i==maze.length-1 && j== maze[0].length-1){
            System.out.println(path);
        }

        maze[i][j] = 0;
        printMazePath(maze, i+1, j, path+'D');
        printMazePath(maze, i-1, j, path+'U');
        printMazePath(maze, i, j+1, path+'R');
        printMazePath(maze, i, j-1, path+'L');
        maze[i][j] = 1;
    }


    //print matrix
    public static void print(int[][] maze) {
        for(int []row : maze){
            for(int col: row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] maze = {
            { 1, 0, 0, 0 },
            { 1, 1, 1, 1 },
            { 0, 1, 0, 1 },
            { 1, 1, 1, 1 }
        };

        int[][] outputMaze = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };

        printMazePath(maze, 0, 0, "");

        System.out.println();

        solveMaze(maze, 0, 0, outputMaze);
    }
}
