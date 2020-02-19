package login.social.sample.googleSignIn;

import com.google.android.gms.plus.model.people.Person;

/**
 * Created by multidots on 6/16/2016.
 */
public interface GoogleResponseListener {
    void onGSignInFail();

    void onGSignInSuccess(Person personData);
}
