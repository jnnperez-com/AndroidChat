package soy.jperez.android.androidchat;

import android.app.Application;
import android.renderscript.Script;

import com.firebase.client.Firebase;

/**
 * Created by Jonatan on 23/07/2016.
 */
public class AndroidChatAplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        setupFirebase();
    }

    private void setupFirebase() {
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }
}
