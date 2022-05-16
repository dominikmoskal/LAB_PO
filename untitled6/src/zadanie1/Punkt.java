package zadanie1;

public class Punkt {
    int x;
    int y;

    public Punkt() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    void zeruj(){
       this.x=0;
       this.y=0;
    }
    void opis(){
        System.out.println("Punkt: "+getX()+","+getY());
    }
    void przesun(int x, int y){
        this.x+=x;
        this.y+=y;
    }
}
