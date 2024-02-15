/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author isi
 */
public class Categorie{
    private final String nom;
    private final Animal animal;
    
    public Categorie(String nom, Animal animal){
        this.nom = nom;
        this.animal = animal;
    }
    public Animal getAnimal(){
        return this.animal;
    }
    public String getNom(){
        return this.nom;
    }
    
//    public void setCategorie(Animal animal){
//        this.animal = animal;
//    }
}
