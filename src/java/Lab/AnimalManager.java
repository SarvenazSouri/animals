/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

import java.util.ArrayList;

/**
 *
 * @author isi
 */
public class AnimalManager {
    public static ArrayList<Animal> getAllAnimal(){
        ArrayList<Animal> animals = new ArrayList<>();
        Animal chien1 = new Animal();
        chien1.setNom("Toutou Mira");
        animals.add(chien1);
        
        Animal chien2 = new Animal();
        chien2.setNom("Toutou RotVeiler");
        animals.add(chien2);
        
        Animal chat1 = new Animal();
        chat1.setNom("Grisou");
        animals.add(chat1);
        
        Animal chat2 = new Animal();
        chat2.setNom("Chatounet");
        animals.add(chat2);
        
        Animal insect1 = new Animal();
        insect1.setNom("Pinl Jellifish");
        animals.add(insect1);
        
        Animal insect2 = new Animal();
        insect2.setNom("Blue Yellow");
        animals.add(insect2);
        
        Animal meduse1 = new Animal();
        meduse1.setNom("Green Chenille");
        animals.add(meduse1);
        
        Animal meduse2 = new Animal();
        meduse2.setNom("Old Ant");
        animals.add(meduse2);
        
        
        return animals;
    }
}
