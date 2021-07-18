package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dept implements Serializable {
    private Integer id;
    private String name;
    private List<Emp> emps=new ArrayList<>(); // 对象集合

    public Dept() {
    }

    public Dept(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emps=" + emps +
                "}\n";
    }
}
