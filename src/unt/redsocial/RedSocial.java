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
    
    
    
    public void registrar(Usuario usr){  // cargo un nuevo usuario(usr) a la red social
        usr.setSiguiente(this.primero);
        this.primero=usr;
    }
    
    
    public boolean esVacia(){  // retorna verdadero o falso si la lista(red social) está vacía o no
        if(this.primero==null){
            return true;
        }else return false;
    }
    
    
    public void verUsuarios(){   // veo los usuarios cargados en la red social
        Usuario aux=this.primero;
        System.out.print("Usuarios cargados en esta red social: ");
        while(aux!=null){
            System.out.print("->"+aux.getUsuario());
            aux=aux.getSiguiente();
        }
        System.out.println();
    }
    
    public boolean estaUsuario(Usuario usr){ // ver si el usuario enviado por parametro está en la red social
        Usuario aux=this.primero;    
            while(aux!=null){
                if(usr.equals(aux)){
                    return true;}
            aux=aux.getSiguiente();
            }
        return false;
    }
    
    
    
    public void echarUsuario(Usuario usr){  //elimina el usuario enviado por parametro de la red social
        if(esVacia()){
            System.out.println("No se pudo echar al usuario, la Red Social no tiene usuarios");
        }else{
            Usuario aux=this.primero;
                while(aux!=null){
                    if(aux.getSiguiente().equals(usr)){
                        aux.setSiguiente(aux.getSiguiente().getSiguiente());
                        System.out.println("El usuario : "+usr.getUsuario()+" fue echado exitosamente");
                    }
                aux=aux.getSiguiente();
                }
        }
    }
    
}
