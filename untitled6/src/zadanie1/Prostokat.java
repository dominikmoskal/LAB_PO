package zadanie1;

class Prostokat extends Figura {
	double wys=0, szer=0;
	
	Prostokat(double wys,double szer){
		this.wys = wys;
		this.szer = szer;
			
	}
	Prostokat(float wys,float szer, String kolor){
		this.wys = wys;
		this.szer = szer;
		super.kolor=kolor;

	}

    double getPowierzchnia() {
        return (szer * wys);
    }
	public void przesun(int x, int y){
		super.punkt.przesun(x,y);
	}
    
}