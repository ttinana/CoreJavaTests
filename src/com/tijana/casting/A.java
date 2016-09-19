package com.tijana.casting;

public class A {
    String name;
    public A(){}
    public A(String name){
	this();
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void test(){
	System.out.println("A");
    }

}
