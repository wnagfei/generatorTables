package com.example.bean;


import javax.persistence.*;

@Entity
@Table(name = "suggest")
public class Suggest {

    String name;
    String suggest;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String time;

    public Suggest() {
    }

    public Suggest(String name, String suggest, String time) {
        this.name = name;
        this.suggest = suggest;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

