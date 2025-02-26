/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author fernando.pedridomarino
 */
public class ProfileDB {

    public static Profile findByName(String name) {

        for (Profile profile : TacebookDB.profiles) {

            if (profile.getName().equals(name)) {

                return profile; // Devuelve el perfil si se encuentra

            }

        }

        return null; // Devuelve null si no se encuentra

    }


    public static Profile findByNameAndPassword(String name, String password) {

        for (Profile profile : TacebookDB.profiles) {

            if (profile.getName().equals(name) && profile.getPassword().equals(password)) {

                return profile; // Devuelve el perfil si se encuentra

            }

        }

        return null; // Devuelve null si no se encuentra

    }


    public static void save(Profile profile) {

        TacebookDB.profiles.add(profile); // Almacena el perfil en la colección

    }


    public static void update(Profile profile) {

        // En este caso, no se necesita implementar nada

    }

}