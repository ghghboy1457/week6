public class Question3 {
    public static void main(String[] args) {
        int num1 [] = {10,20,30,40,50};
        int result=0;
        for (int i = 0; i < num1.length; i++) {
            result = result + num1[i];
        }
        System.out.println("10부터 50까지의 합==>"+result);
    }
}
