package lesson19;

import java.util.List;

public class Root {
    private String name ;
    private List<People> peopleList;

    public Root() {
    }

    public Root(String name, List<People> peopleList) {
        this.name = name;
        this.peopleList = peopleList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<People> peopleList) {
        this.peopleList = peopleList;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", peopleList=" + peopleList +
                '}';
    }
}
