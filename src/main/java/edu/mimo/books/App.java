package edu.mimo.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import edu.mimo.books.model.Animal;
import edu.mimo.books.model.EtreVivant;
import edu.mimo.books.model.Fleur;
import edu.mimo.books.repository.InMemoryJardinRepository;
import edu.mimo.books.repository.JardinRepository;

public class App {

    public static void main(String[] args) {

        
        JardinRepository jardinRepository = new InMemoryJardinRepository();

        List<EtreVivant> lesEtresVivants = jardinRepository.population();

        lesEtresVivants.forEach(etreVivant -> {
            System.out.println("Espèce " + etreVivant.getEspece() 
            + ", de variété: " + etreVivant.getVariete()
            + ", vivant en: " + etreVivant.getOrigine().getPays()
            + " dans un climat: " + etreVivant.getOrigine().getClimat());
        });

        Optional<Animal> ficheAnimal = jardinRepository.ficheAnimal("test-not-found");
        ficheAnimal.ifPresent(animal -> {
            System.out.println("Animal trouvé: " + animal.getEspece());
        });

        ficheAnimal.ifPresentOrElse(animal -> {
            System.out.println("Animal trouvé: " + animal.getEspece());
        }, () -> {
            System.out.println("Animal non trouvé pour id: test-not-found");
        });

        System.out.println("-------------------------");


        jardinRepository.ficheFleur("F004")
        .map(fleur -> fleur.getVariete().toUpperCase())
        .ifPresent(variete -> {
            System.out.println("Variété: " + variete);
        });

        //Alternative classique
        Optional<Fleur> fleur = jardinRepository.ficheFleur("F004");
        if(fleur.isPresent()) {
            Fleur laFleur = fleur.get();
            String variete = laFleur.getVariete().toUpperCase();
            System.out.println("Variété: " + variete);
        }

        
    }


}
