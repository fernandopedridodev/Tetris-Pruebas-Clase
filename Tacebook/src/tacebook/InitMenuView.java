/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author fernando.pedridomarino
 */
import java.util.Scanner;


public class InitMenuView {

    private InitMenuController initMenuController; // Controlador asociado


    public InitMenuView(InitMenuController initMenuController) {

        this.initMenuController = initMenuController;

    }
    public void login(String username, String password) {

        Profile profile = ProfileDB.findByNameAndPassword(username, password);

        if (profile != null) {

            System.out.println("Inicio de sesión exitoso. Benvido, " + profile.getName() + "!");

            // Aquí puedes redirigir al usuario a su perfil o al menú principal

        } else {

            System.out.println("Usuario ou contrasinal incorrectos.");

            // Aquí puedes invocar el método para mostrar el mensaje de error en la vista

        }

    }


    public void createProfile(String name, String password, String status) {

        Profile existingProfile = ProfileDB.findByName(name);

        if (existingProfile == null) {

            Profile newProfile = new Profile(name, password);

            newProfile.setStatus(status); // Asumiendo que hay un método setStatus en Profile

            ProfileDB.save(newProfile);

            System.out.println("Perfil creado exitosamente.");

        } else {

            System.out.println("O nome de usuario xa está en uso. Tente de novo.");

            // Aquí puedes invocar el método para solicitar un nuevo nombre en la vista

        }

    }

    public boolean showLoginMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Menú de Inicio -----");

        System.out.println("1. Iniciar sesión");

        System.out.println("2. Crear un novo perfil");

        System.out.println("3. Sair da aplicación");

        System.out.print("Elige unha opción: ");

        

        int option = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer


        switch (option) {

            case 1:

                System.out.print("Nome de usuario: ");

                String username = scanner.nextLine();

                System.out.print("Contrasinal: ");

                String password = scanner.nextLine();

                initMenuController.login(username, password);

                break;

            case 2:

                showRegisterMenu();

                break;

            case 3:

                return true; // Salir de la aplicación

            default:

                System.out.println("Opción non válida. Tente de novo.");

        }

        return false; // No se quiere salir

    }


    public void showLoginErrorMessage() {

        System.out.println("Usuario ou contrasinal incorrectos. Tente de novo.");

    }


    public void showRegisterMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome para o perfil: ");

        String newName = scanner.nextLine();

        System.out.print("Contrasinal: ");

        String password1 = scanner.nextLine();

        System.out.print("Repita o contrasinal: ");

        String password2 = scanner.nextLine();


        if (password1.equals(password2)) {

            System.out.print("Estado: ");

            String status = scanner.nextLine();

            initMenuController.createProfile(newName, password1, status);

        } else {

            System.out.println("Os contrasinais non coinciden. Tente de novo.");

        }

    }


    public String showNewNameMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O nome de usuario introducido xa estaba en uso. Introduza un novo nome: ");

        return scanner.nextLine();

    }

    private static class InitMenuController {

        public InitMenuController() {
        }

        private void login(String username, String password) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void createProfile(String newName, String password1, String status) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

}