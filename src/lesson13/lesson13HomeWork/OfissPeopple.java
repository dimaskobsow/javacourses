package lesson13.lesson13HomeWork;

import java.util.Objects;

public class OfissPeopple implements Comparable<OfissPeopple>{

    int age;
    String name;

    public OfissPeopple() {
    }

    public OfissPeopple(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfissPeopple that = (OfissPeopple) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "OfissPeopple{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(OfissPeopple o) {
        if(this.getAge()!=o.getAge()){
           return this.getAge()-o.age;
        }
        return this.getName().compareTo(o.name);
    }

}
