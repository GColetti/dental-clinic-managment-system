package com.example;

public class Parent {
   
    private int ChildId;
    private int ParentId;

    public void setChildId(int ChildId) {
        this.ChildId = ChildId;
    }

    public void setParentId(int ParentId) {
        this.ParentId = ParentId;
    }

    public Parent() {}
    public Parent(int ChildId, int ParentId) {
        super();
        this.ChildId = ChildId;
        this.ParentId = ParentId;
       
    }

    public int getChildId() {
        return this.ChildId;
    }

    public int getParentId() {
        return this.ParentId;
    }
}
