package com.example.usingdatajpawithh2database.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    private int pid;
    private String pname;
    private String planguage;

    public int getpid() {
        return pid;
    }

    public void setpid(int pid) {
        this.pid = pid;
    }

    public String getpname() {
        return pname;
    }

    public void setpname(String pname) {
        this.pname = pname;
    }

    public String getplanguage() {
        return planguage;
    }

    public void setplanguage(String language) {
        this.planguage = language;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", language='" + planguage + '\'' +
                '}';
    }
}
