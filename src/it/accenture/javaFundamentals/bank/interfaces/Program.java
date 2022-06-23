package it.accenture.javaFundamentals.bank.interfaces;

public class Program {
    public static void main(String[] args) {
        Person d1 = new Developer(); // inutile praticamente ma permette di aumentare la generalità
        Hero h1 = new Hero();

        listenTo(d1);   // possibile grazie al polimorfismo
        listenTo(h1);

        Developer d2 = new Developer();
        Iterable<Developer> devs = d2.recruit();
    }
    public static void listenTo(Person p){
        p.speak();
    }
}
