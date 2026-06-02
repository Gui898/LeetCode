public class Main {

    public static void main(String[] args) {
        int[][] arr = {{0,0,0},
                       {0,0,0}};

        int[][] matrix = floodFill(arr, 1, 0, 2);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }

        helper(image, sr, sc, color, image[sr][sc]);

        return image;
    }

    public static void helper(int[][] image, int sr, int sc, int color, int initial){
        if((sr >= 0 && sr < image.length) && (sc >= 0 && sc < image[0].length)){
            if(image[sr][sc] == initial){
                image[sr][sc] = color;

                helper(image, sr, sc+1, color, initial);
                helper(image, sr+1, sc, color, initial);
                helper(image, sr, sc-1, color, initial);
                helper(image, sr-1, sc, color, initial);
            }else{
                return;
            }
        }

        return;
    }

}