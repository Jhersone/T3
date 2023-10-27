/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author Proyector
 */
public class Chompa {
    
    private String modelo;
    private String precio;
    
      public Chompa() {
        
      }

    public Chompa(String modelo, String precio) {
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    public String getTexto(){
    return "Chompa :" + this.modelo +"| S/. " + this.precio;
    }
    
    
}
