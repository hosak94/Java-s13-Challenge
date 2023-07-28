package com.workintech.employeeApp.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

   public Employee (int id, String fullName,String email,String password,String[] healthplans) {
    this.setId(id);
    this.setFullName(fullName);
    this.setEmail(email);
    this.setPassword(password);
    this.setHealthplans(healthplans);
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }
    public void addHealthplan (int index,String name) {
       try{
           if(healthplans[index] == null) {
               this.healthplans[index] = name;
           }else {
               System.out.println("İlgili index için atama yapılmış.");
           }
       }catch (ArrayIndexOutOfBoundsException ex) {
           System.out.println("Olmayan index için atama yapıldı.");
       }
    }

    public  String toString() {
       return "Fullname: " +fullName+" Healthplans: "+ Arrays.toString(healthplans);
    }
}
