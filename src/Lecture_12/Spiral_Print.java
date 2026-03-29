package Lecture_12;

public class Spiral_Print {
    static void main(String[] args) {
        int [][]matrix = {{1,4,7,11,15},
                            {2,5,8,12,19},
                           {3,6,9,16,22},
                           {10,13,14,17,24},
                            {18,21,23,26,30}};
        PrintSprial(matrix);

    }
    public static void  PrintSprial(int[][] arr) {
        int minr = 0, minc = 0, maxr = arr.length - 1, maxc = arr[0].length - 1;
        int te=arr.length * arr[0].length;
        int c=0;
        while (c<te) {
        for (int i = minc; i <= maxc && c<te; i++) {
            System.out.print(arr[minr][i] + " ");
        }
        minr++;
        for (int i = minr; i <= maxr && c<te; i++) {
            System.out.print(arr[i][maxc] + " ");
        }
        maxc--;
        for (int i = maxc; i >= minc && c<te; i--) {
            System.out.print(arr[maxr][i] + " ");
        }
        maxr--;
        for (int i = maxr; i >= minr && c<te; i--) {
            System.out.print(arr[i][minc] + " ");
        }
        minc++;
    }

    }
}
