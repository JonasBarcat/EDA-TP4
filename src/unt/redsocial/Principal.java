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
        
        System.out.println("::::::::::::::::::  Facebook :::::::::::::::::::: ");
        System.out.println();
    
        Usuario usr1=new Usuario(1);
        Usuario usr2=new Usuario(2);
        Usuario usr3=new Usuario(3);
        Usuario usr4=new Usuario(4);
        Usuario usr5=new Usuario(5);
        
        
        RedSocial Facebook=new RedSocial();
        Facebook.registrar(usr1);
        Facebook.registrar(usr2);
        Facebook.registrar(usr3);
        Facebook.registrar(usr4);
        Facebook.verUsuarios();
        
        if(Facebook.esVacia()){System.out.println("Facebook no tiene usuarios");
        }else System.out.println("Facebook tiene usuarios registrados");
        
        if(Facebook.estaUsuario(usr3)){
         System.out.println("El usuario si "+usr3.getUsuario()+" se encuantra en el sistema");
        }else System.out.println("El usuario "+usr3.getUsuario()+" no se encuentra en el sistema");
        
        Facebook.echarUsuario(usr4);
        System.out.println("Se ha borrado el usuario: "+usr4.getUsuario() );
        Facebook.verUsuarios();

        System.out.println("El ultimo usuario es: "+Facebook.ultimoUsuario().getUsuario());
        
        int numerousuariosFace=Facebook.cantidadUsuarios();
        System.out.println("La cantidad de usuarios en la red es: "+numerousuariosFace);
        
        System.out.println();
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////
        
        System.out.println("::::::::::::::::::  Instagram :::::::::::::::::::: ");
        System.out.println();
        
        RedSocial Instagram=new RedSocial();
        
        Usuario usr6=new Usuario(6);
        Usuario usr7=new Usuario(7);
        Usuario usr8=new Usuario(8);
        Usuario usr9=new Usuario(9);
        
        Instagram.registrar(usr6);
        Instagram.registrar(usr7);
        Instagram.registrar(usr8);
        Instagram.registrar(usr5);
        Instagram.registrar(usr9);
        
        Instagram.verUsuarios();
        
        if(Instagram.esVacia()){
            System.out.println("Instagram no contiene usuarios");
        }else System.out.println("Instagram tiene usuarios registrados");
        
        if(Instagram.estaUsuario(usr9)){
            System.out.println("El usuario "+usr9.getUsuario()+" se encuentra registrado en Instagram");
        }else System.out.println("El usuario "+usr9.getUsuario()+" no se encuentra en Instagram");
        
        Instagram.echarUsuario(usr8);
        System.out.println("Se ha borrado el usuario: "+usr8.getUsuario() );
        Instagram.verUsuarios();
        
        System.out.println("El ultimo usuario es: "+Instagram.ultimoUsuario().getUsuario());
        
        int numerousuariosIns=Instagram.cantidadUsuarios();
        System.out.println("La cantidad de usuarios registrados en Instagram es: "+numerousuariosIns);
        
    System.out.println();
    System.out.println();
    
    /////////////////////////////////////////////////////////////////////////////////////77
    
    System.out.println("::::::::::::::::::  Twitch :::::::::::::::::::: ");
    System.out.println();
    
    RedSocial Twitch=union(Facebook, Instagram);
    
    
    }
    
    
    
    
    
    
    
    public static RedSocial union(RedSocial red1,RedSocial red2){
        RedSocial nueva=new RedSocial();
        
             nueva.registrar(red1.ultimoUsuario()); // registro usuario1
             red1.echarUsuario(red1.ultimoUsuario()); //borrar ultimo usuario de red1
           
   
            
      return nueva;
    }
 
    
    
    
}
