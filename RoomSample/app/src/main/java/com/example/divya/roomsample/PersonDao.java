package com.example.divya.roomsample;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by divya on 12/7/2017.
 */
@Dao
public interface PersonDao {

    @Insert
    void InsertPerson(Person password);

    @Query("SELECT * FROM Person")
    List<Person> getAll();
}
