import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);

        int choix;
        do {
            System.out.println("Menu:");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter ce programme.");
            System.out.print("Choix: ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                case 1:
                    afficherProduits(metier);
                    break;
                case 2:
                    // Implémentez la recherche d'un produit par id
                    break;
                case 3:
                    // Implémentez l'ajout d'un nouveau produit
                    break;
                case 4:
                    // Implémentez la suppression d'un produit par id
                    break;
                case 5:
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 5);
    }

    private static void afficherProduits(MetierProduitImpl metier) {
        List<Produit> produits = metier.getAll();
        System.out.println("Liste des produits:");
        for (Produit produit : produits) {
            System.out.println("ID: " + produit.getId() + ", Nom: " + produit.getNom() + ", Marque: " + produit.getMarque() +
                    ", Prix: " + produit.getPrix() + ", Description: " + produit.getDescription() + ", Nombre en stock: " + produit.getNombreEnStock());
        }
    }
}
