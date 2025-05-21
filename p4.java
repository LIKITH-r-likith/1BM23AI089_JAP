import java.util.Scanner;

public class p4 {
    public enum daysofweek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;


        public boolean isworking(){
            return (this!=SATURDAY && this!=SUNDAY);

        }



    }
    public static void main(String[] args){
        System.out.println(daysofweek.MONDAY.isworking());
        System.out.println(daysofweek.SUNDAY.isworking());
    }
}
