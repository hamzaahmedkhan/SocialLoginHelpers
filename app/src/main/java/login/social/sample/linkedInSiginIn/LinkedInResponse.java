package login.social.sample.linkedInSiginIn;

/**
 * Created by multidots on 6/17/2016.<p>
 * This is response listener for linked in profile calls.
 */
public interface LinkedInResponse {

    /**
     * This method will call when linked in sign in fails.
     */
    void onLinkedInSignInFail();

    /**
     * This method will execute when linked in app is authorized by the user and access token is received.
     *
     * @param accessToken linked in api access token.
     */
    void onLinkedInSignInSuccess(String accessToken);

    /**
     * This method will execute when user profile is received.
     *
     * @param user {@link LinkedInUser} profile.
     */
    void onLinkedInProfileReceived(LinkedInUser user);
}
