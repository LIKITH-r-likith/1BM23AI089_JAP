public class p3{
    public static boolean compareStrings(String str1 , String str2 ){
        return str1.equals(str2);
    }
    public static String copyString(String original ){
        return new String(original);

    }
    public static String concatenate(String str1 , String str2){
        return str1+str2;

    }
    public static void main(String[] args){
        String s1 = "Hello";
        String s2 = "pavan";
        String s3 = "world";
        System.out.println(compareStrings(s1 , s2));
        String s4 = copyString(s2);
        System.out.println(concatenate(s3,s4));
    }
}
