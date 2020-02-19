package login.social.sample.facebookSignIn;

import org.json.JSONObject;

/**
 * Created by multidots on 6/16/2016.
 * This class represents facebook user profile.
 */
public class FacebookUser {
    public String name;

    public String email;

    public String facebookID;

    public String gender;

    public String about;

    public String bio;

    public String coverPicUrl;

    public String profilePic;

    /**
     * JSON response received. If you want to parse more fields.
     */
    public JSONObject response;

}
