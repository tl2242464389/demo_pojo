package com.test.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-28 10:43
 * @Version: 1.0
 */
public class Menu implements Serializable{
    private int id;
    private String name;
    private int pid;
    private Menu parent;
    private List<Menu> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getParent() {
        return parent;
    }

    public void setParent(Menu parent) {
        this.parent = parent;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
