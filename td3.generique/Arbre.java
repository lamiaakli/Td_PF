package td3.generique;
public interface Arbre<T extends Sommable<T>> {
    int taille();

    boolean contient(final T val);

    Set<T> valeurs();

    T somme();

    T min();

    T max();

    boolean estTrie();

}
