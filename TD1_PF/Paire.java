
public class Paire <T,U> implements IPaire <T,U> {
private T First;
private U Second;
public Paire (T myObj1, U myObj2){
      this.First = myObj1;
        this.Second = myObj2;

    }

@override 
T First (){
    return myObj1;
}

@override 

T Second (){
    return myObj2;
}
@override
public <V>IPaire <V,U> changefst(V u){
    return new Paire <V,U> (u, myObj2);
}   

@override
public <V>IPaire <V,U> changefst(V u){
    return new Paire <T,U> (myObj1, u);
}  

public String toString() {
     return  "(" + this.First()+ "," + this.Second()+ ")";
}
public static void main(String[] args) {
       Paire  <Integer, String> a = new Paire <> (8,"LAMIA");
        Paire <Double, String> b = new Paire <> (2.0, "Deux");
        Paire <Double, Paire <Integer, String>> c = new Paire<>(2.0, a);
        System.out.println(a.changeFst("Quatro"));
        System.out.println(a.toString()); 
        System.out.println(b.toString());
        System.out.println(c.toString());
}


}
