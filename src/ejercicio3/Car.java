/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author familia
 */
public class Car {
   private CarModel carmodel;
   private int traveled;

    public Car(CarModel carmodel, int traveled) {
        this.carmodel = carmodel;
        this.traveled = traveled;
    }

    public CarModel getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(CarModel carmodel) {
        this.carmodel = carmodel;
    }

    public int getTraveled() {
        return traveled;
    }

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }
   
   
   
}
