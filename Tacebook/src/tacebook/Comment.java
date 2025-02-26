/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;
import java.util.Date;
/**
 *
 * @author fernando.pedridomarino
 */
public class Comment {

    private String content;

    private String author;


    public Comment(String content, String author) {

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