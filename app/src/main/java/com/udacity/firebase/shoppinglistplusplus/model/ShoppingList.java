package com.udacity.firebase.shoppinglistplusplus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.firebase.client.ServerValue;
import com.udacity.firebase.shoppinglistplusplus.utils.Constants;

import java.util.HashMap;

/**
<<<<<<< HEAD
 * Created by c4q-john on 3/25/16.
 * From Udacity.
 * Class Defines the data structure for both Active and Archived ShoppingList objects.
 */
public class ShoppingList {
    String listName;
    String owner;

    private HashMap<String, Object> timestampLastChanged;

    //Required public constructor
    public ShoppingList() {
    }

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;
        HashMap<String, Object> dateLastChangedObj = new HashMap<String, Object>();
        dateLastChangedObj.put(Constants.FIREBASE_PROPERTY_TIMESTAMP, ServerValue.TIMESTAMP);
        this.timestampLastChanged = dateLastChangedObj;

    }

    public String getListName() {
        return listName;
    }

    public String getOwner() {
        return owner;
    }


    public HashMap<String, Object> getTimestampLastChanged() {
        return timestampLastChanged;
    }


    @JsonIgnore
    public long getTimestampLastChangedLong() {

        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }

}
