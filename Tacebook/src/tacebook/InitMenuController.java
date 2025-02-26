/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author fernando.pedridomarino
 */
public class InitMenuController {
    private InitMenuView initMenuView; // Vista asociada

    public InitMenuController() {
        this.initMenuView = new InitMenuView(this); // Inicializa la vista
    }

    public static void main(String[] args) {
        InitMenuController controller = new InitMenuController();
        controller.init(); // Inicia la aplicación
    }

    private void init() {
        boolean exit = false;
        while (!exit) {
            exit = initMenuView.showLoginMenu(); // Muestra el menú de inicio de sesión
        }
    }

    void login(String name, String password) {
        Profile profile = ProfileDB.findByNameAndPassword(name, password);
        if (profile == null) {
            initMenuView.showLoginErrorMessage(); // Muestra mensaje de error
        } else {
            ProfileController profileController = new ProfileController();
            profileController.openSession(profile); // Abre sesión con el perfil
        }
    }

    private void register() {
        initMenuView.showRegisterMenu(); // Muestra el menú de registro
    }

    private void createProfile(String name, String password, String status) {
        Profile existingProfile = ProfileDB.findByName(name);
        if (existingProfile == null) {
            Profile newProfile = new Profile(name, password);
            newProfile.setStatus(status); // Establece el estado
            ProfileDB.save(newProfile); // Guarda el nuevo perfil
            ProfileController profileController = new ProfileController();
            profileController.openSession(newProfile); // Abre sesión con el nuevo perfil
        } else {
            String newName = initMenuView.showNewNameMenu(); // Pide un nuevo nombre
            createProfile(newName, password, status); // Intenta crear el perfil de nuevo
        }
    }
}