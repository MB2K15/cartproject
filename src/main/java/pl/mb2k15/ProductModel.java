/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.mb2k15;

import javax.persistence.*;


/**
 * @author Matt
 */
@Table(name = "produkty")
@Entity
public class ProductModel {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String category;

    private float price;

    private int number;

    private String file;

    public ProductModel() {
    }

    public ProductModel(String name, String category, float price, int number) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.number = number;
    }

    public ProductModel(String name, String category, float price, int number , String file) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.number = number;
        this.file = file;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", file='" + file + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
