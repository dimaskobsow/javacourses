package Lesson6;

public class TestMainString {
    public static void main(String[] args) {
        String name ="Dima Hello";
        String name2="Dima Hello";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.endsWith(".zip"));
        System.out.println(name.startsWith("D"));
        System.out.println(name.split(" H"));


        System.out.println("1-ое случайное число: " + Math.random());
        System.out.println("2-ое случайное число: " + Math.random());
        System.out.println("3-е случайное число: " + Math.random());

        System.out.println(name.trim());
        System.out.println("    ");
        System.out.println(name2.equals(name));



//
//        String s1 = new String("hello");
//        String s2 = new String("hello");
//        System.out.println(s1 == s2);// false
//        System.out.println(s1.equals(s2));// true
//        String s3 = new String("hello");
//        String s4 = "hello";
//        System.out.println(s3 == s4);// false
//        System.out.println(s3.equals(s4));// true
//        String s5 = "hello";
//        String s6 = "hello";
//        System.out.println(s5 == s6);// true
//        System.out.println(s5.equals(s6));// true
    }
}
