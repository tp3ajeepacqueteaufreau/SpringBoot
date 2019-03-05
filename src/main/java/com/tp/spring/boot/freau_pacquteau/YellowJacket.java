package com.tp.spring.boot.freau_pacquteau;


public class YellowJacket {
    private String country;
    private int numberYellowJacket;
    
    public YellowJacket(String country, int numberYellowJacket) {
        this.country = country;
        this.numberYellowJacket = numberYellowJacket;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public int getNumberYellowJacket() {
        return numberYellowJacket;
    }
    
    public void setNumberYellowJacket(int numberYellowJacket) {
        this.numberYellowJacket = numberYellowJacket;
    }
}
