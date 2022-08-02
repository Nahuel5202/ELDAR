/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eldarchallenge.entidad;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Tarjeta {
    
    
    
        

    private String NumeroTarjeta;
    
    private String Marca;
    
    private String CardHolder;

 
    private Date FechaVencimiento;

    public Tarjeta() {
    }

    public Tarjeta(String NumeroTarjeta, String Marca, String CardHolder, Date FechaVencimiento) {
        this.NumeroTarjeta = NumeroTarjeta;
        this.Marca = Marca;
        this.CardHolder = CardHolder;
        this.FechaVencimiento = FechaVencimiento;
    }


       public String getNumeroTarjeta() {
        return NumeroTarjeta;
    }

    public void setNumeroTarjeta(String NumeroTarjeta) {
        this.NumeroTarjeta = NumeroTarjeta;
    }
    
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getCardHolder() {
        return CardHolder;
    }

    public void setCardHolder(String CardHolder) {
        this.CardHolder = CardHolder;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "NumeroTarjeta=" + NumeroTarjeta + ", Marca=" + Marca + ", CardHolder=" + CardHolder + ", FechaVencimiento=" + FechaVencimiento + '}';
    }
        
        
    
    
    
    
}
