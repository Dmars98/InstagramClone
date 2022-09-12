package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("wBzTZn0FDxix5Dz1UABMEo0TEHBiFlArB4b8zOZI")
                .clientKey("eARnw03bxWhsTHafjnw9QmMWuTCiAxVGeCmw36m6")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
