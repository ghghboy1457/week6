public class ArrayPractice {
    public static void main(String[] args) {
        int[] number ={10,20,30,40,50};
        int max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.println(max);
    }
}
