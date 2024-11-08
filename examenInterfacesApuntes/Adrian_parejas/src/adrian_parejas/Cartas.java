/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adrian_parejas;

/**
 *
 * @author FP
 */
public class Cartas {
    
    private int id;
    private String reverso;
    private String imgagen;

    public Cartas(int id, String reverso, String imgagen) {
        this.id = id;
        this.reverso = reverso;
        this.imgagen = imgagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReverso() {
        return reverso;
    }

    public void setReverso(String reverso) {
        this.reverso = reverso;
    }

    public String getImgagen() {
        return imgagen;
    }

    public void setImgagen(String imgagen) {
        this.imgagen = imgagen;
    }
    
    
}
