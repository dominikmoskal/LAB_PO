package zadanie1;

public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt(15,644);
        Punkt p2 = new Punkt(-54,64);
        Punkt p3 = new Punkt(99,63);
        p1.opis();
        p2.opis();
        Trojkat tr1 = new Trojkat(900,59);
        Figura f1 = new Figura(p1);
        Prostokat pr1 = new Prostokat(900,43);
        System.out.println(f1.opis());
        pr1.przesun(3,5);
        Kwadrat kw1 = new Kwadrat(45,64,"Zielony");
        //do 17pkt zadania1
    }
}
