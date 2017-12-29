package com.ameerhamza.contentprovider;

import java.util.ArrayList;

/**
 * Created by Ameer Hamza on 12/29/2017.
 */

public class ContactEvent {
    ArrayList<Contacts> list;

    public ContactEvent(ArrayList<Contacts> list) {
        this.list = list;
    }

    public ArrayList<Contacts> getList() {
        return list;
    }
}
