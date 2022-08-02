/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldarchallenge;

import eldarchallenge.entidad.Tarjeta;
import eldarchallenge.servicio.TarjetaServicio;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EldarChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner leer = new Scanner(System.in);
        
        TarjetaServicio TS = new TarjetaServicio();
           
        Tarjeta tarjeta1 = new Tarjeta("111111111111111", "Visa","Nahuel lambruschini", new Date(23/20));
        
        Tarjeta tarjeta2 = new Tarjeta("222222222222222","MasterCard", "Rosario Escalante", new Date(17/99));
        
        Tarjeta tarjeta3 = new Tarjeta("333333333333333","American","Emiliano Salerno",new Date(06/25));
        
       Tarjeta tarjeta4 = new Tarjeta("4444","American","Eloisa tatera",new Date(06/31));
       
          List<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();
          
          listaTarjetas.add(tarjeta1);
          listaTarjetas.add(tarjeta2);
          listaTarjetas.add(tarjeta3);
          listaTarjetas.add(tarjeta4);
        
            System.out.println("ingrese una opcion  \n 1 Mostrar Tarjeta \n 2 Validar Consumo \n 3 validar Fecha");
            
            
            String numero = leer.next();
  
         
            switch(numero)
            {
             case"1":
                   System.out.println("ingrese el numero de la tarjeta ");
                   String buscar= leer.next();
                   
                   String pos = "0";
                   
                  for (int i = 0; i < listaTarjetas.size(); i++) {
                      if (listaTarjetas.get(i).getNumeroTarjeta().equals(buscar)) {
                          System.out.println("eureca");
                          
                          System.out.println(listaTarjetas.get(i));
                          
                          pos = "1";
                      }
                 }  
                  if (pos.equals(0)) {
                      System.out.println("no se encontro tarjeta");
                 }
           
                  
            break;
               case"2":
                    System.out.println("Ingrese su consumo");
                    Double consumo = leer.nextDouble();
                    if (consumo < 1000  && consumo > 0) {
                        System.out.println("Su operacion es valida");
                   }else
                           {System.out.println("Se a excedido los limites del cosnumo");
               }
                   break;
                   
                 case"3":
                     System.out.println("Ingrese la tarjeta a validar: ");
                     
                     SimpleDateFormat sdf = new SimpleDateFormat("MM/YY");
                     
                     
                      String buscar3= leer.next();
                   
                   String pos3 = "0";
                   
                  for (int i = 0; i < listaTarjetas.size(); i++) {
                      if (listaTarjetas.get(i).getNumeroTarjeta().equals(buscar3)) {
                          System.out.println("eureca");
                          
                          
                          
                          
                          
                          
                    

                          
                          pos3 = "1";
                      }
                 }  
                  if (pos3.equals(0)) {
                      System.out.println("no se encontro tarjeta");
                 }
                     
                     
                     case"4":
            }
        
        
        
        
    }

    
    public void buscartarjeta(ArrayList<Tarjeta> listaTarjetas, String buscar){
          Scanner leer = new Scanner(System.in);
        
        TarjetaServicio TS = new TarjetaServicio();
          System.out.println("ingrese el numero de la tarjeta ");
                   String op = leer.next();
                   
                   String pos = "0";
                   
                  for (int i = 0; i < listaTarjetas.size(); i++) {
                      if (listaTarjetas.get(i).getNumeroTarjeta().equals(op)) {
                          System.out.println("eureca");
                          
                          System.out.println(listaTarjetas.get(i));
                          
                          pos = "1";
                      }
                 }  
                  if (pos.equals(0)) {
                      System.out.println("no se encontro tarjeta");
                 }
    }
    
}
