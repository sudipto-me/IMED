package com.example.android.imed.Model;

import java.io.Serializable;

/**
 * Created by Android on 10/10/2017.
 */

public class Seba implements Serializable {

    public String name;

    public Seba(){}
    public Seba(String name){this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
