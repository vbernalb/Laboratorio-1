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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car[] car = new Car[20];
        Store tienda = new Store(car);
        Scanner In = new Scanner (System.in);
        
        int a = 0;
        while (a!=5){
            System.out.println(
            "\n" +
            "\n" +
            "¿Que desea hacer?\n" + 
            "1. Establecer datos de ubicacion de la tienda\n" +
            "2. Agregar un carro a la tienda\n" +
            "3. Obtener la informacion de todos los carros de la tienda\n" +
            "4. Obtener informacion de la tienda\n" +
            "5. Salir\n" +
            "\n" 
            );
            a = In.nextInt();
            switch (a){
                case 1:
                    System.out.println("Usted eligio establecer datos de ubicacion de la tienda" );
                    System.out.println("Ingrese la direccion" );
                    String house = In.next();
                    System.out.println("Ingrese el pais" );
                    String pais = In.next();
                    System.out.println("Ingrese el codigo postal" );
                    String codp = In.next();
                    Address direccion = new Address(house,pais,codp);
                    tienda.setAddress(direccion);
                    break;
                case 2:
                    System.out.println( "Usted eligio agregar un carro a la tienda" );
                    System.out.println("Ingrese la categoria del carro" );
                    String Name = In.next();
                    System.out.println( "Ingrese el modelo" );
                    String Modelo = In.next();
                    System.out.println("Ingrese el precio" );
                    int Precio = In.nextInt();
                    System.out.println("Ingrese el kilometraje" );
                    int kil = In.nextInt();
                    
                    Category categoria = new Category(Name);
                    CarModel modelo = new CarModel(categoria,Modelo,Precio);
                    Car carro = new Car(modelo,kil);
                    tienda.addCar(carro);
                    break;
                case 3:
                    System.out.println("Usted eligio obtener la informacion de todos los carros" );
                    tienda.getCarros();
                    break;
                case 4:
                    System.out.println("Usted eligio obtener informacion de la tienda" ); 
                    tienda.getDireccion();
                    break;
                case 5:
                    System.out.println("Gracias por utilizar el programa. Adios" );
                    break;
                default:
                    System.out.println("Opcion no implementada, intente de nuevo" );
                    break;
                    
            }
            
            
        }
        
    }
    
}
