package soy.jperez.android.androidchat.login;

/**
 * Created by Jonatan on 23/07/2016.
 */
public interface LoginPresenter  {

    void onDestroy();
    void checkForAuthenticatedUser();
    void validateLogin(String email, String password);
    void registerNewUser(String email, String passwords);

}
