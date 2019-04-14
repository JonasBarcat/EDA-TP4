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
public class Principal {
    
    public static void main(String[] args){
    
        Usuario usr1=new Usuario(1);
        Usuario usr2=new Usuario(2);
        Usuario usr3=new Usuario(3);
        Usuario usr4=new Usuario(4);
        
        
        RedSocial Facebook=new RedSocial();
        Facebook.registrar(usr1);
        Facebook.registrar(usr2);
        Facebook.registrar(usr3);
        Facebook.registrar(usr4);
        Facebook.verUsuarios();
        
        if(Facebook.estaUsuario(usr3)){
         System.out.println("El usuario "+usr3.getUsuario()+" si se encuantra en el sistema");
        }else System.out.println("El usuario no se encuentra en el sistema");
        
        Facebook.echarUsuario(usr2);
        
    }
    
}
