     public static void main(String[] args) {
        Paire  <Integer, String> a = new Paire <> (5,"DODO");
        Paire <Double, String> b = new Paire <> (1.0, "un");
        Paire <Double, Paire <Integer, String>> c = new Paire<>(1.0, a);
        System.out.println(a.changeFst("quatre"));
        System.out.println(a.toString()); 
        System.out.println(b.toString());
        System.out.println(c.toString());
    }

