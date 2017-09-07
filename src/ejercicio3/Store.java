/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.*;

/**
 *
 * @author familia
 */
public class Store {
    private Address address;
    private final Car[] car;
    private int ac;

    public Store(Car[] car) {
        this.car = car;
        this.ac = 0;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    
    public boolean addCar (Car carro){
        if(ac<20){
            this.car[ac] = carro;
            ac++;
            System.out.println("Carro agregado exitosamente");
            return true;
        }else{
            System.out.println("Ha sobrepasado el limite de carros admitidos en la tienda");
            return false;
        }
    }
    
    public Car getCarros (){
        for(int i=0; i<ac; i++){
            int f = i+1;
            System.out.println("\n Carro " + f);
            System.out.println("Categoria:" + car[i].getCarmodel().getCategory().getName());
            System.out.println("Modelo: " + car[i].getCarmodel().getModelNumber());
            System.out.println("Precio: " + car[i].getCarmodel().getPrice());
            System.out.println("Kilometraje: " + car[i].getTraveled());
            
        }
        return null;
    }
     
    public Address getDireccion (){
  
            System.out.println("Direccion: " + address.getHouse());
            System.out.println("Pais:" + address.getCountry());
            System.out.println("Codigo postal: " + address.getPostcode());
            
        return null;
    }
}
