/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tacebook2;

/**
 *
 * @author fernando.pedridomarino
 */
public class Profile {

    private String name;

    private String password;

    private String status;


    public Profile(String name, String password, String status) {

        this.name = name;

        this.password = password;

        this.status = status;

    }


    public String getName() {

        return name;

    }


    public String getPassword() {

        return password;

    }


    public String getStatus() {

        return status;

    }


    public void setStatus(String status) {

        this.status = status;

    }

}
