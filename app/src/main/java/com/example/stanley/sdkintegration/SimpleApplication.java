package com.example.stanley.sdkintegration;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Stanley on 2015-08-13.
 */
public class SimpleApplication extends Application {
    public void onCreate(){
        Parse.initialize(this, "JMJDotDGIVG8ECltLVg1CxIRZD66nGMTUPz79gDJ", "Xk62WxP4THgzGomfJvQzfaIhvP3tzMkyzZ8sjANw");
    }
}
