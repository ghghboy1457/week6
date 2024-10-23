import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        int num1[]={2,4,6,8,10};

        Scanner sc = new Scanner(System.in);
        System.out.print("1~10이 배열에 있는 숫자를 확인: ");
        int i = sc.nextInt();

        boolean exists = false;
        for (int num : num1) {
            if (num == i) {
                exists = true;
                break;
            }
        }

        if ( exists ) {
            System.out.println("배열에 있습니다.");
        }
        else {
            System.out.println("배열에 없습니다.");
        }
    }
}
