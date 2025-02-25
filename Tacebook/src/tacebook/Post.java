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
    private String contido;
    private Date creacionDate;
    private List<Comment> comentarios;
    
    public Post(String contido){
        this.contido = contido;
        this.creacionDate = new Date();
        this.comentarios = new ArrayList<>();
    }

    public String getContido() {
        return contido;
    }

    public void setContido(String contido) {
        this.contido = contido;
    }

    public Date getCreacionDate() {
        return creacionDate;
    }

    public void setCreacionDate(Date creacionDate) {
        this.creacionDate = creacionDate;
    }

    public List<Comment> getComentario() {
        return comentarios;
    }

    public void setComentario(List<Comment> comentario) {
        this.comentarios = comentario;
    }
      public void addComment(Comment comentario){
          comentarios.add(comentario);
      }     
}
