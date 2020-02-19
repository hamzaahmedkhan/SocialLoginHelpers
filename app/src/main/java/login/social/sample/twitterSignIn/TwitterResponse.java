package login.social.sample.twitterSignIn;

import android.support.annotation.NonNull;

/**
 * Created by multidots on 6/17/2016.<p>
 * This is response listener for twitter profile calls.
 */
public interface TwitterResponse {
    /**
     * This method will call when twitter sign in fails.
     */
    void onTwitterError();

    /**
     * This method will execute when twitter app is authorized by the user and access token is received.
     *
     * @param userId   twitter user id.
     * @param userName twitter user name
     */
    void onTwitterSignIn(@NonNull String userId, @NonNull String userName);

    /**
     * This method will execute when user profile is received.
     *
     * @param user {@link TwitterUser} profile.
     */
    void onTwitterProfileReceived(TwitterUser user);
}
