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


public class InitMenuView {

    private InitMenuController initMenuController;


    public InitMenuView(InitMenuController initMenuController) {

        this.initMenuController = initMenuController;

    }


    public boolean showLoginMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Iniciar sesión");

        System.out.println("2. Crear un novo perfil");

        System.out.println("3. Saír");

        System.out.print("Seleccione unha opción: ");

        int option = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer


        switch (option) {

            case 1:

                System.out.print("Nome de usuario: ");

                String name = scanner.nextLine();

                System.out.print("Contrasinal: ");

                String password = scanner.nextLine();

                initMenuController.login(name, password);

                break;

            case 2:

                showRegisterMenu();

                break;

            case 3:

                return true; // Salir de la aplicación

            default:

                System.out.println("Opción non válida.");

        }

        return false; // No se ha salido

    }


    public void showLoginErrorMessage() {

        System.out.println("Usuario ou contrasinal incorrectos.");

    }


    public void showRegisterMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome de usuario: ");

        String name = scanner.nextLine();

        System.out.print("Contrasinal: ");

        String password = scanner.nextLine();

        System.out.print("Repita o contrasinal: ");

        String confirmPassword = scanner.nextLine();

        System.out.print("Estado: ");

        String status = scanner.nextLine();


        if (!password.equals(confirmPassword)) {

            System.out.println("Os contrasinais non coinciden.");

            return;

        }


        initMenuController.createProfile(name, password, status);

    }


    public String showNewNameMenu() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("O nome de usuario introducido xa estaba en uso. Introduza un novo nome: ");

        return scanner.nextLine(); // Devolverá el nuevo nombre introducido por el usuario

    }

}
