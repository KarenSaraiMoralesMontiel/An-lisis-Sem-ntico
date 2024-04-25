/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package traducoresfinal;

import java.util.Objects;

/**
 *
 * @author Karen Sarai
 */
public class Simbolo {
    public String nombre;
    public String tipo;
    
    @Override
    public String toString() {
       String s = nombre+"\t"+tipo;
       return s;
    }
    
    @Override
    public boolean equals(Object o) {
       if (o instanceof Simbolo) {
           Simbolo t = (Simbolo)o;
           if (this.nombre.equals(t.nombre)){
               return true;
           }
           return false;
       } 
       return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        return hash;
    }
    
    
}
