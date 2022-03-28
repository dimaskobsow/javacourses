package lesson19;

import java.util.Objects;

public class XMLHandler {
    private String name;
    private String job;

    public XMLHandler() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XMLHandler that = (XMLHandler) o;
        return Objects.equals(name, that.name) && Objects.equals(job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job);
    }

    @Override
    public String toString() {
        return "XMLHandler{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
