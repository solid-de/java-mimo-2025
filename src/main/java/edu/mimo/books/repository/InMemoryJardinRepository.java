package edu.mimo.books.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import edu.mimo.books.model.Animal;
import edu.mimo.books.model.Climat;
import edu.mimo.books.model.Couleur;
import edu.mimo.books.model.EtreVivant;
import edu.mimo.books.model.Fleur;
import edu.mimo.books.model.Origine;

public class InMemoryJardinRepository implements JardinRepository {

    @Override
    public List<EtreVivant> population() {
        
        List<EtreVivant> etresVivants = new ArrayList<>();
        tousLesAnimaux().forEach(animal -> {
            etresVivants.add(animal);
        });
        for(Fleur fleur: toutesLesFleurs()) {
            etresVivants.add(fleur);
        }
        return etresVivants;
    }

    @Override
    public List<EtreVivant> rechercher(String espece, String variete, Origine origine) {
        return population().stream()
        .filter(etreVivant -> {
            if(espece != null && !espece.equalsIgnoreCase(etreVivant.getEspece())) {
                return false;
            }
            if(variete != null && !variete.equalsIgnoreCase(etreVivant.getVariete())) {
                return false;
            }
            if(origine == null) {
                return true;
            }
            if(origine.getClimat() != null && !origine.getClimat().equals(etreVivant.getOrigine().getClimat())) {
                return false;
            }
            List<String> paysDeRecherche = origine.getPays();
            for (String pays: paysDeRecherche) {
                if(etreVivant.getOrigine().getPays().contains(pays)) {
                    return true;
                }
            }
            return false;
        }).toList();
    }

    @Override
    public Optional<Animal> ficheAnimal(String id) {
        for (Animal animal : tousLesAnimaux()) {
            if(id.equals(animal.getId())) {
                return Optional.of(animal);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Fleur> ficheFleur(String id) {
        return toutesLesFleurs().stream()
        .filter(fleur -> id.equals(fleur.getId()))
        .findFirst();
    }

    private List<Animal> tousLesAnimaux() {
        // Animal 1 - Lion
        Animal lion = new Animal();
        lion.setId("A001");
        lion.setEspece("Panthera leo");
        lion.setVariete("Lion d'Afrique");
        lion.setEsperanceDeVie(15);
        lion.setTaille(120); // en cm (hauteur au garrot)
        lion.setOrigine(new Origine(Arrays.asList("Kenya", "Tanzanie", "Afrique du Sud"), Climat.ARIDE));
        lion.setVertebre(true);
        lion.setNbrPattes(4);

        // Animal 2 - Aigle royal
        Animal aigle = new Animal();
        aigle.setId("A002");
        aigle.setEspece("Aquila chrysaetos");
        aigle.setVariete("Aigle royal européen");
        aigle.setEsperanceDeVie(25);
        aigle.setTaille(85); // envergure en cm
        aigle.setOrigine(new Origine(Arrays.asList("France", "Espagne", "Suisse"), Climat.TEMPERE));
        aigle.setVertebre(true);
        aigle.setNbrPattes(2);

        // Animal 3 - Pieuvre
        Animal pieuvre = new Animal();
        pieuvre.setId("A003");
        pieuvre.setEspece("Octopus vulgaris");
        pieuvre.setVariete("Pieuvre commune");
        pieuvre.setEsperanceDeVie(2);
        pieuvre.setTaille(60); // en cm (longueur totale)
        pieuvre.setOrigine(new Origine(Arrays.asList("Grèce", "Italie", "Espagne"), Climat.MEDITERRANEEN));
        pieuvre.setVertebre(false);
        pieuvre.setNbrPattes(8);

        // Animal 4 - Perroquet
        Animal perroquet = new Animal();
        perroquet.setId("A004");
        perroquet.setEspece("Ara macao");
        perroquet.setVariete("Ara rouge");
        perroquet.setEsperanceDeVie(50);
        perroquet.setTaille(85); // en cm (longueur)
        perroquet.setOrigine(new Origine(Arrays.asList("Brésil", "Pérou", "Colombie"), Climat.TROPICAL));
        perroquet.setVertebre(true);
        perroquet.setNbrPattes(2);

        return List.of(lion, aigle, pieuvre, perroquet);
    }

    private List<Fleur> toutesLesFleurs() {

        // Fleur 1 - Rose rouge
        Fleur rose = new Fleur();
        rose.setId("F001");
        rose.setEspece("Rosa gallica");
        rose.setVariete("Rose de France");
        rose.setEsperanceDeVie(20);
        rose.setTaille(150); // en cm
        rose.setOrigine(new Origine(Arrays.asList("France", "Bulgarie"), Climat.TEMPERE));
        rose.setCouleur(Couleur.ROUGE);
        rose.setNbrPetales(20);

        // Fleur 2 - Tournesol
        Fleur tournesol = new Fleur();
        tournesol.setId("F002");
        tournesol.setEspece("Helianthus annuus");
        tournesol.setVariete("Tournesol géant");
        tournesol.setEsperanceDeVie(1);
        tournesol.setTaille(300); // en cm
        tournesol.setOrigine(new Origine(Arrays.asList("Ukraine", "Russie", "Argentine"), Climat.TEMPERE));
        tournesol.setCouleur(Couleur.JAUNE);
        tournesol.setNbrPetales(34);

        // Fleur 3 - Lavande
        Fleur lavande = new Fleur();
        lavande.setId("F003");
        lavande.setEspece("Lavandula angustifolia");
        lavande.setVariete("Lavande vraie");
        lavande.setEsperanceDeVie(15);
        lavande.setTaille(80); // en cm
        lavande.setOrigine(new Origine(Arrays.asList("France", "Espagne", "Italie"), Climat.MEDITERRANEEN));
        lavande.setCouleur(Couleur.BLEU);
        lavande.setNbrPetales(4);

        // Fleur 4 - Tulipe
        Fleur tulipe = new Fleur();
        tulipe.setId("F004");
        tulipe.setEspece("Tulipa gesneriana");
        tulipe.setVariete("Tulipe de Darwin");
        tulipe.setEsperanceDeVie(5);
        tulipe.setTaille(40); // en cm
        tulipe.setOrigine(new Origine(Arrays.asList("Pays-Bas", "Turquie"), Climat.TEMPERE));
        tulipe.setCouleur(Couleur.ROSE);
        tulipe.setNbrPetales(6);

        // Fleur 5 - Lys blanc
        Fleur lys = new Fleur();
        lys.setId("F005");
        lys.setEspece("Lilium candidum");
        lys.setVariete("Lys de la Madone");
        lys.setEsperanceDeVie(10);
        lys.setTaille(120); // en cm
        lys.setOrigine(new Origine(Arrays.asList("Liban", "Syrie", "Grèce"), Climat.MEDITERRANEEN));
        lys.setCouleur(Couleur.BLANC);
        lys.setNbrPetales(6);

        // Fleur 6 - Souci
        Fleur souci = new Fleur();
        souci.setId("F006");
        souci.setEspece("Calendula officinalis");
        souci.setVariete("Souci des jardins");
        souci.setEsperanceDeVie(1);
        souci.setTaille(50); // en cm
        souci.setOrigine(new Origine(Arrays.asList("Egypte", "Maroc", "Iran"), Climat.ARIDE));
        souci.setCouleur(Couleur.ORANGE);
        souci.setNbrPetales(13);

        // Fleur 7 - Orchidée
        Fleur orchidee = new Fleur();
        orchidee.setId("F007");
        orchidee.setEspece("Phalaenopsis amabilis");
        orchidee.setVariete("Orchidée papillon");
        orchidee.setEsperanceDeVie(7);
        orchidee.setTaille(60); // en cm
        orchidee.setOrigine(new Origine(Arrays.asList("Thaïlande", "Malaisie", "Philippines"), Climat.TROPICAL));
        orchidee.setCouleur(Couleur.BLANC);
        orchidee.setNbrPetales(5);
        
        return List.of(
            rose, tournesol, lavande, tulipe, lys, souci, orchidee
        );

    }
    
}
