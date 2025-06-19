package edu.mimo.books.repository;

import java.util.List;
import java.util.Optional;

import edu.mimo.books.model.Animal;
import edu.mimo.books.model.EtreVivant;
import edu.mimo.books.model.Fleur;
import edu.mimo.books.model.Origine;

public interface JardinRepository {
    
    List<EtreVivant> population();
    List<EtreVivant> rechercher(String espece, String variete, Origine origine);

    Optional<Animal> ficheAnimal(String id);
    
    Optional<Fleur> ficheFleur(String id);

}
