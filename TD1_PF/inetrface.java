public interface IPaire <T,U>{
T First ();
U Second ();
<V> IPaire <V,U> changefst(V u);   
<V>IPaire <T,V> changesnd (V u);

}
