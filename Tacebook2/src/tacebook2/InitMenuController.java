/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook2;

/**
 *
 * @author fernando.pedridomarino
 */
public class InitMenuController {

    private InitMenuView initMenuView;


    public InitMenuController() {

        this.initMenuView = new InitMenuView(this);

    }


    public void init() {

        boolean exit = false;

        while (!exit) {

            exit = initMenuView.showLoginMenu();

        }

    }


    public void login(String name, String password) {

        Profile profile = ProfileDB.findByNameAndPassword(name, password);

        if (profile == null) {

            initMenuView.showLoginErrorMessage();

        } else {

            ProfileController profileController = new ProfileController();

            profileController.openSession(profile);

        }

    }


    public void createProfile(String name, String password, String status) {

        if (ProfileDB.findByName(name) != null) {

            String newName = initMenuView.showNewNameMenu();

            createProfile(newName, password, status);

        } else {

            Profile profile = new Profile(name, password, status);

            ProfileDB.save(profile);

            ProfileController profileController = new ProfileController();

            profileController.openSession(profile);

        }

    }
    public static void main(String[] args) {
        InitMenuController controller = new InitMenuController();
        controller.init();
    }
}