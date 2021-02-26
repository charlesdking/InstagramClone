package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oz1sH6cPBNUBgFXibXCO7OdI6xR9VwGoD8cgenZV")
                .clientKey("48sUVcCu1Z6IRqaXKhN814TUeqEYqhCMib54anLv")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
