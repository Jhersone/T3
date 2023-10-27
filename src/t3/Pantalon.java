/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author Proyector
 */
public class Pantalon {
    
    private String diseño;
    private String precio;
    
     public Pantalon() {
        
      }

    public Pantalon(String diseño, String precio) {
        this.diseño = diseño;
        this.precio = precio;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public String getTexto(){
    return "Pantalon: " +this.diseño +"| S/. " + this.precio;
    }
    
    
}
