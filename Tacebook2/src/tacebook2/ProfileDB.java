/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook2;

/**
 *
 * @author fernando.pedridomarino
 */
public class ProfileDB {

    public static Profile findByName(String name) {

        for (Profile profile : TacebookDB.profiles) {

            if (profile.getName().equals(name)) {

                return profile;

            }

        }

        return null;

    }


    public static Profile findByNameAndPassword(String name, String password) {

        for (Profile profile : TacebookDB.profiles) {

            if (profile.getName().equals(name) && profile.getPassword().equals(password)) {

                return profile;

            }

        }

        return null;

    }


    public static void save(Profile profile) {

        TacebookDB.profiles.add(profile);

    }


    public static void update(Profile profile) {

        // No action needed for this phase

    }

}
