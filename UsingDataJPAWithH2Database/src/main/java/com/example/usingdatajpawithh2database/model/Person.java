package com.example.usingdatajpawithh2database.model;

import javax.persistence.Id;

public class Person {

    @Id
    private int pid;
    private String pname;
    private String language;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
