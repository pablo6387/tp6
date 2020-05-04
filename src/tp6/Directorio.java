/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.*;
/**
 *
 * @author Pablo
 */
public class Directorio {
   HashMap<Integer, Cliente> directorio = new HashMap();
   
   public void agregarCliente(int telefono, Cliente cliente){
       directorio.put(telefono, cliente);
   }
   
   public Cliente buscarCliente(int telefono){
       Set s = directorio.keySet();
       Iterator it = s.iterator();
       while (it.hasNext()){
           Integer aux = (Integer) it.next();
           if (aux.equals(telefono)){
               return (directorio.get(aux));
           }
       }
       return null;
   }
   
   public ArrayList<Integer> buscarTelefono(String apellido){
       ArrayList<Integer> telefonos = new ArrayList<>();
       Set s = directorio.keySet();
       Iterator it = s.iterator();
       Integer aux;
       while (it.hasNext()){
           aux = (Integer) it.next();
           if (directorio.get(aux).getApellido().equals(apellido)){
               telefonos.add(aux);
           }
       }
       return telefonos;
   }
   
   public HashMap<Integer, Cliente> buscarClientes(String ciudad){
       HashMap<Integer, Cliente> clientes = new HashMap();
       Set s = directorio.keySet();
       Iterator it = s.iterator();
       Integer aux;
       
       while (it.hasNext()){
           aux = (Integer) it.next();
           if (directorio.get(aux).getCiudad().equals(ciudad)){
               clientes.put(aux,directorio.get(aux));
           }
       }
        return clientes;
   }
   
   public void borrarCliente(int dni){
       Set s = directorio.keySet();
       Iterator it = s.iterator();
       Integer aux;
       while (it.hasNext()){
           aux = (Integer) it.next();
           if (directorio.get(aux).getDni() == dni){
               it.remove();
           }
       }
    }
   
   
}
