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
public class Address {
    private String House;
    private String Country;
    private String Postcode;

    public Address(String House, String Country, String Postcode) {
        this.House = House;
        this.Country = Country;
        this.Postcode = Postcode;
    }

   

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPostcode() {
        return Postcode;
    }

    public void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }
    
    
}
