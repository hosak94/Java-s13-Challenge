package com.workintech.employeeApp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developersName;
    private void checkGiro (double giro) {
        if(giro < 0) {
            this.giro =0;
        }else {
            this.giro=giro;
        }
    }

    public Company(int id, String name, double giro, String[] developersName) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developersName = developersName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        checkGiro(giro);
    }

    public String[] getDevelopersName() {
        return developersName;
    }

    public void setDevelopersName(String[] developersName) {
        this.developersName = developersName;
    }
    public void addEmployee(int index, String name) {
       try {
           if(developersName[index]==null) {
               developersName[index] = name;
           }else {
               System.out.println("İlgili indexte developer mevcut");
           }
       }catch (ArrayIndexOutOfBoundsException ex) {
           System.out.println("Olmayan index için atama yapıldı.");
       }
    }

    public String toString() {
        return "Name: " + name + " Giro: " + giro + " developers: " + Arrays.toString(developersName);
    }
}

