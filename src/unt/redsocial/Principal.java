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
    
        RedSocial Facebook=new RedSocial();
        Facebook.registrar(1);
        Facebook.registrar(2);
        Facebook.verUsuarios();
    }
    
}
