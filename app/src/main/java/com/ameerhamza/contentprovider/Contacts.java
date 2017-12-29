package com.ameerhamza.contentprovider;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ameer Hamza on 12/29/2017.
 */

public class Contacts {
    @SerializedName("name")
    String name;

    @SerializedName("number")
    String number;

    public Contacts(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
