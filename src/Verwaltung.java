public class Verwaltung {
    private Person anfang;


    public Person addFirst(String n, int j) {
        anfang = new Person(n, j, anfang);
        return anfang;
    }



    public void add(Person p) {
        // Wenn die Liste leer ist, wird das Person object p das 1. Element "anfang"
        if (anfang == null){
            anfang = p;
        // Vergleicht das 1. Person-Objekt mit dem neuen Person-Objekt alphabetisch. Wenn das neue Objekt vor dem 1. kommt, ist der Wert > 0
        } else if (anfang.getName().compareTo(p.getName()) > 0) {
            // Das neue Person-Objekt wird auf das derzeit 1. Person-Objekt gesetzt
            p.setNachfolger(anfang);
            // Das neue Person-Objekt p ist jetzt das 1. Element der Liste (anfang)
            anfang = p;
        // Das neue Person-Objekt soll der Liste an einer bestimmten Stelle hinzugefügt werden
        } else {
                // Eine Person Referenz wird auf den Anfang der Liste gesetzt, um die Liste von Anfang an zu durchlaufen
                Person zeiger = anfang;
                // Überprüfung, ob eine nächste Person existiert, ob die nächste Person alphabetisch vor der neuen Person ist
                while (zeiger.getNachfolger() != null && zeiger.getNachfolger().getName().compareTo(p.getName()) < 0) {
                    // Der Zeiger wird auf die nächste Person in der Liste gesetzt
                    zeiger = zeiger.getNachfolger();
                }
                // der Nachfolger der neuen Person wird zum jetzigen Nachfolger von zeiger
                p.setNachfolger(zeiger.getNachfolger());
                // Nachfolger von zeiger wird auf das neue Person-Objekt p gesetzt damit p an die korrekte Stelle in der Liste eingefügt wird
                zeiger.setNachfolger(p);

                }

            }

    public Person getAnfang() {
        return anfang;
    }
}






