/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook2;

/**
 *
 * @author fernando.pedridomarino
 */

public class ProfileController {

    private ProfileView profileView;

    private Profile sessionProfile;


    public ProfileController() {

        this.profileView = new ProfileView(this);

    }


    public Profile getSessionProfile() {

        return sessionProfile;

    }


    public void openSession(Profile sessionProfile) {

        this.sessionProfile = sessionProfile;

        profileView.showProfileMenu(sessionProfile);

    }


    public void updateProfileStatus(String newStatus) {

        sessionProfile.setStatus(newStatus);

        ProfileDB.update(sessionProfile);

        reloadProfile();

    }


    public void reloadProfile() {

        profileView.showProfileMenu(sessionProfile);

    }


    public int getPostsShowed() {

        return profileView.getPostsShowed();

    }

}
