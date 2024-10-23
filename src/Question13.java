public class Question13 {
    public static void main(String[] args) {

        int[][] number = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < number.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < number[i].length; j++) {
                rowSum += number[i][j];
            }
            System.out.println("행 " + (i + 1) + "의 합: " + rowSum);
        }

        for (int i = 0; i < number[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < number.length; j++) {
                colSum += number[j][i];
            }
            System.out.println("열 " + (i + 1) + "의 합: " + colSum);
        }
    }
}
