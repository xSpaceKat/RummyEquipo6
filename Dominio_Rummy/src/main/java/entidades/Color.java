/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;

/**
 *
 * @author galan
 */
public class Color implements Serializable{
    private String hexadecimalColor;

    // Constructor
    public Color(String hexadecimalColor) {
        this.hexadecimalColor = hexadecimalColor;
    }

    public String getHexadecimalColor() {
        return hexadecimalColor;
    }

    public void setHexadecimalColor(String hexadecimalColor) {
        this.hexadecimalColor = hexadecimalColor;
    }
    
    
}
