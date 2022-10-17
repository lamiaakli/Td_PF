package td3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Noeud<T extends Sommable<T>> implements Arbre<T> {
    private List<Arbre<T>> fils;

    public Noeud(List<Arbre<T>> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille() {
        return fils;
    }

    @Override
    public boolean contient(T val) {
        for (Arbre<T> a : fils) {
            if (a.contient(val))
                return true;
        }
        return false;
    }

    @Override
    public Set<T> valeurs() {

    }

    @Override
    public T somme() {

    }

    @Override
    public T min() {

    }

    @Override
    public T max() {

    }

    @Override
    public boolean estTrie() {

    }

}