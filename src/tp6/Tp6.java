/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Pablo
 */
public class Tp6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c;
        HashMap<Integer, Cliente> daux;
        Directorio d = new Directorio();
        d.agregarCliente(865514, new Cliente("Pablo", "Lopez", "San Luis", "Lavalle 345", 32358963));
        d.agregarCliente(999455, new Cliente("Belen", "Lopez", "Villa Mercedes", "Lavalle 999", 12357896));
        d.agregarCliente(238888, new Cliente("Pia", "Rivero", "Cordoba", "Colon 567", 50354895));
        d.agregarCliente(655677, new Cliente("Pablo", "Bangho", "San Luis", "Av. Centenario 6", 32895455));
        
        //Probando metodo buscarCliente
        c = d.buscarCliente(238888);
        if (c != null){
            System.out.println("Apellido del cliente asociado al numero de telefono 238888: " + c.getApellido());
        }else{
            System.out.println("El cliente no existe");
        }
        
        System.out.println("");
        
         //Probando metodo buscarTelefono
        ArrayList<Integer> bt=d.buscarTelefono("Lopez");
        System.out.println("Numeros asociados al apellido Lopez:");
        for (Integer nro : bt){
            System.out.println(nro);
        }
        
        System.out.println("");
        
         //Probando metodo buscarClientes
        daux = d.buscarClientes("San Luis");
        Set s = daux.keySet();
        Iterator it = s.iterator();
        Integer aux;
        System.out.println("Clientes asociados a la ciudad de San Luis");
        
        while (it.hasNext()){
           aux = (Integer) it.next();
           System.out.println("telefono: " + aux + " Nombre: "+daux.get(aux).getNombre()+ " Apellido: "+ daux.get(aux).getApellido() + " DNI: " + daux.get(aux).getDni());
           }
        
        System.out.println("");
        
         //Probando metodo borrarCliente
        d.borrarCliente(12357896);
        bt=d.buscarTelefono("Lopez");
        System.out.println("Numeros asociados al apellido Lopez:");
        for (Integer nro : bt){
            System.out.println(nro);
        }
    }

}
