/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author fernando.pedridomarino
 */
public class Post {

    private String content;

    private String author;


    public Post(String content, String author) {

        this.content = content;

        this.author = author;

    }


    // Getters

    public String getContent() {

        return content;

    }


    public String getAuthor() {

        return author;

    }

}