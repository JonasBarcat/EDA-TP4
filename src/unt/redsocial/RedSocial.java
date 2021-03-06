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
            Usuario user=usr;
            return esta(user,aux);
    }
    private boolean esta(Usuario usr,Usuario aux){
        if(aux==null){
            return false;
        }else if(aux.equals(usr)){
            return true;
        }
        else{
            return esta(usr,aux.getSiguiente());
        }
    }
    
    
    

    public void echarUsuario(Usuario usr){  //elimina el usuario enviado por parametro de la red social
       Usuario aux=this.primero;
       if(esVacia()){
           System.out.println("Red social vacía");
       }else{
           if(this.primero.getUsuario()==usr.getUsuario()){
               this.primero=this.primero.getSiguiente();
           }else{
               while(aux.getSiguiente()!=null){
                   if(aux.getSiguiente().getUsuario()==usr.getUsuario()){
                       aux.setSiguiente(aux.getSiguiente().getSiguiente());
                   }else aux=aux.getSiguiente();
               }
           }
       }
       
       
    }
    
    
    public Usuario ultimoUsuario(){  // este metodo me devueve el ultimo usuario 
           Usuario aux=this.primero; 
           if(esVacia()){return null;}
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            return aux;
    }
    
    
    public int cantidadUsuarios(){
        Usuario aux=this.primero;
        int cantidad=0;
            while(aux!=null){
                cantidad++;
            aux=aux.getSiguiente();
            }
    return cantidad;
    }
    
    
    
    
}
