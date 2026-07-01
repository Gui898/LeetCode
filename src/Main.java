import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},
                       {0,0,0}};

        boolean[][] maze = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int[][] pathMaze = new int[maze.length][maze[0].length];

        path("", maze, 0, 0, pathMaze, 1);
    }

    static void path(String p, boolean[][] maze, int r, int c, int[][] pathM, int step){

        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            pathM[r][c] = step;
            for (int[] line : pathM){
                for(int a : line){
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        pathM[r][c] = step;

        if(r < maze.length - 1){
            path(p + "D", maze, r + 1, c, pathM, step+1);
        }

        if(c < maze.length - 1){
            path(p + "R", maze, r, c + 1, pathM, step+1);
        }

        if(r > 0){
            path(p + "U", maze, r - 1, c, pathM, step+1);
        }

        if(c > 0){
            path(p + "L", maze, r, c - 1, pathM, step+1);
        }

        pathM[r][c] = 0;
        maze[r][c] = true;
    }

}