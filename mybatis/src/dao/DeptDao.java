package dao;

import entity.Dept;

import java.util.List;

public interface DeptDao {

    public void insertDept(Dept dept);

    public Dept selectById(Integer id);

    public List<Dept> selectAll();

    public void haha();

}
