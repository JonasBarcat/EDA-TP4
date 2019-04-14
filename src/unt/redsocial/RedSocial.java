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
public class RedSocial {
    
    Usuario primero;
    
    public RedSocial(){
    }
    
    
    
    public void registrar(int numerodeusuario){ 
        Usuario nuevo=new Usuario(numerodeusuario);
        nuevo.setSiguiente(this.primero);
        this.primero=nuevo;
    }
    
    
    public boolean esVacia(){
        if(this.primero==null){
            return true;
        }else return false;
    }
    
    
    public void verUsuarios(){
        Usuario aux=this.primero;
        System.out.print("Usuarios cargados en esta red social: ");
        while(aux!=null){
            System.out.print("->"+aux.getUsuario());
            aux=aux.getSiguiente();
        }
    }
    
}
