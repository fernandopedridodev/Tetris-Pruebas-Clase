/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author fernando.pedridomarino
 */
public class ProfileController {

    private ProfileView profileView; // Vista asociada

    private Profile sessionProfile; // Perfil de la sesión


    public ProfileController() {

        this.profileView = new ProfileView(this); // Inicializa la vista

    }


    public Profile getSessionProfile() {

        return sessionProfile; // Getter para el perfil de la sesión

    }


    public int getPostsShowed() {

        return profileView.getPostsShowed(); // Obtiene el número de publicaciones a mostrar

    }


    public void reloadProfile() {

        sessionProfile = ProfileDB.findByName(sessionProfile.getName()); // Obtiene el perfil de la sesión

        profileView.showProfileMenu(sessionProfile); // Muestra el menú del perfil

    }


    public void openSession(Profile sessionProfile) {

        this.sessionProfile = sessionProfile; // Almacena el perfil de la sesión

        profileView.showProfileMenu(sessionProfile); // Muestra el menú del perfil

    }


    public void updateProfileStatus(String newStatus) {

        sessionProfile.setStatus(newStatus); // Actualiza el estado del perfil

        ProfileDB.update(sessionProfile); // Guarda el cambio en la base de datos

        reloadProfile(); // Recarga el perfil y muestra el menú

    }

   

}