/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook2;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;


public class ProfileView {

    private int postsShowed = 10;

    private ProfileController profileController;


    public ProfileView(ProfileController profileController) {
        
        

        this.profileController = profileController;

    }


    public int getPostsShowed() {

        return postsShowed;

    }


    private void showProfileInfo(boolean ownProfile, Profile profile) {

        System.out.println("Nome: " + profile.getName());

        System.out.println("Estado: " + profile.getStatus());

    }


    private void changeStatus(boolean ownProfile, Scanner scanner, Profile profile) {

        if (ownProfile) {

            System.out.print("Introduza o novo estado: ");

            String newStatus = scanner.nextLine();

            profileController.updateProfileStatus(newStatus);

        } else {

            System.out.println("Esta opción só é válida na propia biografía.");

            showProfileMenu(profile);

        }

    }


    public void showProfileMenu(Profile profile) {

        showProfileInfo(true, profile);

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Cambiar estado");

        System.out.println("2. Pechar sesión");

        System.out.print("Seleccione unha opción: ");

        int option = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer


        switch (option) {

            case 1:

                changeStatus(true, scanner, profile);

                break;

            case 2:

                return; // Salir del menú

            default:

                System.out.println("Opción non válida.");

                showProfileMenu(profile); // Volver a mostrar el menú

        }

    }

}
    