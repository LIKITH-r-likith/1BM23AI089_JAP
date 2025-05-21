import java.util.Scanner;
public class p4b {
    public static void main(String[] args){
        final int students = 5;
        int[] exam = new int[students];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of students");
        for(int i=0 ; i<5 ; i++){
            System.out.println("enter marks of the student"+(i+1)+":");
            exam[i] = sc.nextInt();


        }
        int sum=0;
        int highscore = exam[0];
        for (int i :exam){
            sum+=i;
            if(i>highscore){
                highscore = i;

            }
        }
        System.out.println("THe total score of all students is " + sum);
        System.out.println("The highest score scored is"  + highscore);

    }

}
