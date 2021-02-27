package com.svs.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;

/**
 * Description: Class of user entity for store data into database
 * @autor Denys Shabelnyk
 * @since 0.3.1.4
 */
@Entity
@Table(name = "testtable")
public class User {

    public User() { }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;

    public User(int id,String name) {
        this.id = id;
        this.name = name;
    }

    @Setter
    public void setId(int id) {
        this.id = id;
    }

    @Getter
    public int getId() {
        return this.id;
    }

    @Setter
    public void setName(String name) {
        this.name = name;
    }

    @Getter
    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d,name=%s]",id,name);
    }
}
