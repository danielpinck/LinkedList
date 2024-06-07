public class Person {
    private String name;
    private int jahr;
    private Person nachfolger;

    public Person(String name, int jahr, Person nachfolger) {
        this.name = name;
        this.nachfolger = nachfolger;
        this.jahr = jahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public Person getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Person nachfolger) {
        this.nachfolger = nachfolger;
    }


    @Override
    public String toString() {
        return "Name: " + name + " Jahr: " + jahr;
    }

    public void anzeigen() {
        System.out.println(this);
        if (nachfolger != null) {
            nachfolger.anzeigen();

            }


        }
    }


