package edu.mimo.books;

import java.util.List;
import java.util.Optional;

import edu.mimo.books.model.Animal;
import edu.mimo.books.model.EtreVivant;
import edu.mimo.books.repository.InMemoryJardinRepository;
import edu.mimo.books.repository.JardinRepository;

public class App {

    public static void main(String[] args) {

        
        JardinRepository jardinRepository = new InMemoryJardinRepository();

        List<EtreVivant> lesEtresVivants = jardinRepository.population();

        for (EtreVivant etreVivant : lesEtresVivants) {
            System.out.println("Espèce " + etreVivant.getEspece() 
            + ", de variété: " + etreVivant.getVariete()
            + ", vivant en: " + etreVivant.getOrigine().getPays()
            + " dans un climat: " + etreVivant.getOrigine().getClimat());
        }

        lesEtresVivants.forEach(etreVivant -> {
            System.out.println("Espèce " + etreVivant.getEspece() 
            + ", de variété: " + etreVivant.getVariete()
            + ", vivant en: " + etreVivant.getOrigine().getPays()
            + " dans un climat: " + etreVivant.getOrigine().getClimat());
        });

        Optional<Animal> ficheAnimal = jardinRepository.ficheAnimal("test-not-found");

    }


}
