public class StringArray {
    public static void main(String[] args) {
        String[] fruits = new String[3];  // String 배열 선언 및 생성
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Orange";

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        System.out.println(chars);  // Hello 출력
        System.out.println(chars.length);
    }
}
