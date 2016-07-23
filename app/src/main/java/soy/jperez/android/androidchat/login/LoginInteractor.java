package soy.jperez.android.androidchat.login;

/**
 * Created by Jonatan on 23/07/2016.
 */
public interface LoginInteractor {
    void checlSession();
    void doSignUp(String email, String password);
    void doSignIn(String email, String password);
}
