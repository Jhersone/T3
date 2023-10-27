/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author Proyector
 */
public class Polo {
    
    private String color;
    private String precio;
    
     public Polo() {
        
      }

    public Polo(String color, String precio) {
        this.color = color;
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public String getTexto(){
    return "Polo :"+ this.color +"| S/. " + this.precio;
    }
    
    
    
}
