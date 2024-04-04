import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> produits = new ArrayList<>();

    @Override
    public void add(Produit o) {
        produits.add(o);
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        Iterator<Produit> iterator = produits.iterator();
        while (iterator.hasNext()) {
            Produit produit = iterator.next();
            if (produit.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }
}

