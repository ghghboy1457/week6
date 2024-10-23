public class Question9 {
    public static void main(String[] args) {
        int num1[]={1,2,3,4,5};

        int[] copied = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            copied[i] = num1[i];
        }

        System.out.print("복사 배열:");
        for (int i = 0; i < num1.length; i++) {
            System.out.print(copied[i] + " ");
        }
    }
}
