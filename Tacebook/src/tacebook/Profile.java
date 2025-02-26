/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

import java.util.ArrayList;

/**
 *
 * @author fernando.pedridomarino
 */
public class Profile {

    private String name;

    private String password;

    private String status; // Añadido para almacenar el estado

    private ArrayList<Post> posts;


    public Profile(String name, String password) {

        this.name = name;

        this.password = password;

        this.posts = new ArrayList<>();

    }


    // Getters y Setters

    public String getName() {

        return name;

    }


    public String getPassword() {

        return password;

    }


    public String getStatus() {

        return status; // Método para obtener el estado

    }


    public void setStatus(String status) {

        this.status = status; // Método para establecer el estado

    }


    public ArrayList<Post> getPosts() {

        return posts;

    }


    public void addPost(Post post) {

        posts.add(post);

    }

}
