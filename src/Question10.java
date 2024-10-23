public class Question10 {
    public static void main(String[] args) {
        int num1[]={20,30,50,70,90};
        int sum=0;
        double avg;

        for(int num:num1){
            sum+=num;
        }
        avg=sum/num1.length;
        System.out.println(avg);
    }
}
