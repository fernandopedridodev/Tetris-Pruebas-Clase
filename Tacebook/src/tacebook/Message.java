/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tacebook;

/**
 *
 * @author fernando.pedridomarino
 */
public class Message {

    private String content;

    private String sender;

    private String receiver;


    public Message(String content, String sender, String receiver) {

        this.content = content;

        this.sender = sender;

        this.receiver = receiver;

    }


    // Getters

    public String getContent() {

        return content;

    }


    public String getSender() {

        return sender;

    }


    public String getReceiver() {

        return receiver;

    }

}