package dao;

import entity.Emp;

import java.util.List;

public interface EmpDao {
    public void insertEmp(Emp emp);

    public List<Emp> selectAll();

}
