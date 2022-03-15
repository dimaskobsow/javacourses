package lesson11;

public class Student {
    private String name;
    private int age;
    private boolean gender;

    public Student() {
    }

    public Student(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    //        public void printToConsole(){
//            System.out.println(name + " , " + age + ", " + gender);
//        }
    public void printToConsole(){
        System.out.println(name);
    }
}






