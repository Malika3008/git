package com.company;

public class Book {
    int id;
    String name;
    String author;


    public Book(int id, String name,String author){
        this.id = id;
        this.name=name;
        this.author=author;
    }

    public String toString(){
        return  +id+ ") " +"Name: "+name+" "+"Author: "+author;
    }
}
