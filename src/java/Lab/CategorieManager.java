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
public class CategorieManager {
    
    private final ArrayList<Animal> animals = AnimalManager.getAllAnimal();
    private final ArrayList<Categorie> listAnimal = new ArrayList<>();
    
//    public CategorieManager(){
//        
//    }
    
    public ArrayList<Categorie> getAllCategorie(){
        listAnimal.add(new Categorie("chien", animals.get(0)));
        listAnimal.add(new Categorie("chien", animals.get(1)));
        listAnimal.add(new Categorie("chat", animals.get(2)));
        listAnimal.add(new Categorie("chat", animals.get(3)));
        listAnimal.add(new Categorie("insecte", animals.get(4)));
        listAnimal.add(new Categorie("insecte", animals.get(5)));
        listAnimal.add(new Categorie("meduse", animals.get(6)));
        listAnimal.add(new Categorie("meduse", animals.get(7)));
            return listAnimal;
    }
    public ArrayList<Categorie> getAllCategorie(String nom){
            ArrayList<Categorie> categorieAnimal = new ArrayList<>();
            for(Categorie cat : new CategorieManager().getAllCategorie()){
                if(cat.getNom().equals(nom)){
                    categorieAnimal.add(new Categorie(nom, cat.getAnimal()));
                }
            }
            return categorieAnimal;
    }
}
