package com.udacity.firebase.shoppinglistplusplus;

import com.firebase.client.Firebase;

import java.util.logging.Logger;

/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /* Initialize Firebase */
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setLogLevel(com.firebase.client.Logger.Level.DEBUG);
    }

}