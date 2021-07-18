package entity;

import java.io.Serializable;

public class Emp implements Serializable {
    private Integer id;
    private String name;
    private Double salary;
    private Dept dept; // 对象属性

    public Emp() {
    }

    public Emp(String name, Double salary, Dept dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                "}\n";
    }
}
