import java.io.*;

public class MultiplicationTable {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = Integer.parseInt(br.readLine());
        System.out.println("x");
        int column = Integer.parseInt(br.readLine());

        int[][] data = timesTable(row, column);


        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                System.out.printf(" "+"%3d"+" "+"|", data[r][c]);
            }
            System.out.println();

        }
    }

    public static int[][] timesTable(int r, int c) {
        int[][] yes = new int[r][c];
        for (int rw = 0; rw < yes.length; rw++) {
            for (int col = 0; col < yes[rw].length; col++) {
                yes[rw][col] = (rw + 1) * (col + 1);
            }

        }
        return yes;
    }
}