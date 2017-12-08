package com.example.divya.roomsample;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by divya on 12/7/2017.
 */
@Entity
public class Person {

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @PrimaryKey @NonNull
    public String name;

    public int age;

}
