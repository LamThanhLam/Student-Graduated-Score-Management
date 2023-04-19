/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Student implements Serializable{
    private String ID;
    private String name;
    private Double literature;
    private Double math;
    private Double english;
    private Boolean gender;
    private String bday;
    
    public Student(String ID, String name, Double literature, Double math, Double english, Boolean gender,
            String bday) {
        this.ID = ID;
        this.name = name;
        this.literature = literature;
        this.math = math;
        this.english = english;
        this.gender = gender;        
        this.bday = bday;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLiterature() {
        return literature;
    }

    public void setLiterature(Double literature) {
        this.literature = literature;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }

    public Boolean getGender() {
        return gender;
    }

  
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }
    
}
