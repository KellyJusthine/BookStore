package com.bookStore.bookStore.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "MyBooks")
public class MyBookList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    private int id;
    private String name;
    private String author;
    private String price; // Mantendo o preço como String

    // Construtor com todos os parâmetros
    public MyBookList(String author, String name, String price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    // Construtor padrão
    public MyBookList() {
        super();
    }

    // Construtor sem o parâmetro price
    public MyBookList(int id, String name, String author, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
