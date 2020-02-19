package login.social.sample.instagramSignIn;

/**
 * Created by krunal on 03-Nov-16.
 * This class represents instagram user profile.
 */

public class InstagramUser {

    private String accesstoken;

    private String username;

    private String bio;

    private String website;

    private String profile_picture;

    private String full_name;

    private String id;

    public String getAccesstoken() {
        return accesstoken;
    }

    void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public String getUsername() {
        return username;
    }

    void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    void setBio(String bio) {
        this.bio = bio;
    }

    public String getWebsite() {
        return website;
    }

    void setWebsite(String website) {
        this.website = website;
    }

    public String getProfile_picture() {
        return profile_picture;
    }

    void setProfile_picture(String profile_picture) {
        this.profile_picture = profile_picture;
    }

    public String getFull_name() {
        return full_name;
    }

    void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }
}
