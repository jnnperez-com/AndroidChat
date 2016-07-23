package soy.jperez.android.androidchat.login;

/**
 * Created by Jonatan on 23/07/2016.
 */
public interface LoginRepository {
    void signUp(String email, String password);
    void signIp(String email, String password);
    void checkSession();
}
