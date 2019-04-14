/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.redsocial;

/**
 *
 * @author jonas
 */
public class Usuario {
    
    private int usuario;
    private Usuario siguiente;

    public Usuario(int usuario) {
        this.usuario = usuario;
        this.siguiente=null;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
