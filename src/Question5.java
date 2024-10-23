public class Question5 {
    public static void main(String[] args) {

        int num1[] ={12, 3, 19, 7, 5};
        int min = num1[0];

        for (int i = 1; i < num1.length; i++) {
            if (num1[i] < min) {
                min = num1[i];
            }
        }
        System.out.println("{12, 3, 19, 7, 5} 이 배열의 가장 작은 값 >>>"+min);
    }
}
