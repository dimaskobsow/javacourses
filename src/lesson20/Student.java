package lesson20;

import java.sql.Date;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private int id;
    private String group;
    private Date date;

    public Student() {
    }

    public Student(String name, String surname, int id, String group, Date date) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.group = group;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(group, student.group) && Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, group, date);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", group='" + group + '\'' +
                ", date=" + date +
                '}';
    }
}
