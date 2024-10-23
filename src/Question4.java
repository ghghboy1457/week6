public class Question4 {
    public static void main(String[] args) {
        int num1[] ={3,7,2,9,4};
        int max = num1[0];

        for (int i = 1; i < num1.length; i++) {
            if (num1[i] > max) {
                max = num1[i];
            }
        }
        System.out.println("{3,7,2,9,4} 이 배열의 가장 큰 값 >>>"+max);
    }
}
