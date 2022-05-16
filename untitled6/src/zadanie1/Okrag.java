package zadanie1;

public class Okrag {
    Punkt srodekOkregu;
    double promien;
    double srednica;
    double powierzchnia;

    public Okrag() {
        this.srodekOkregu = new Punkt(0,0);
        this.promien = 0;
    }

    public Okrag(Punkt srodekOkregu, double promien) {
        this.srodekOkregu = srodekOkregu;
        this.promien = promien;
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPowierzchnia() {
        powierzchnia=Math.PI*Math.pow(promien,2);
        return powierzchnia;
    }

    public double getSrednica() {
        srednica=2*promien;
        return srednica;
    }
    public boolean wSrodku(Punkt p){
        if((Math.pow(p.x-srodekOkregu.getX(),2)+Math.pow(p.y-srodekOkregu.getY(),2))<=Math.pow(promien,2)){
            return true;
        }
        else return false;
    }
}
