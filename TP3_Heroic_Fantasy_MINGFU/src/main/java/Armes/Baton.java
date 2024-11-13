package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnderBown
 */
public class Baton extends Arme {
    int age; 


    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); 
        setAge(age);
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age < 100) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("L'age doit etre < 100.");
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}
