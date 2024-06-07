public class Main {
    public static void main(String[] args) {

        
        Verwaltung verwaltung = new Verwaltung();
        verwaltung.addFirst("Kaido", 2040);
        verwaltung.add(new Person("Clara", 1994, null));
        verwaltung.add(new Person("Ali", 1999, null));
        verwaltung.add(new Person("Zutroi", 1921, null));
        verwaltung.add(new Person("Vivi", 2003, null));
        verwaltung.getAnfang().anzeigen();

    }

}