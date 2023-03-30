/*Nama : Juita Mandasari
  Stambuk : 13020210094*/

public class Test0094 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // (a) buat instansi objek bernama balok1 dari Class Balok() →default const.
        Balok balok1 = new Balok();
        
        // (b) buat instansi objek bernama balok2 dari Class Balok(20,35, 15)→param const.
        Balok balok2 = new Balok(20, 35, 15);
        
        // (c) setter → set nilai l = 5 dari konstruktor Balok()
        Balok balok3 = new Balok();
        balok3.setL(5);
        
        // (d) setter → set nilai p = 25 dari konstruktor Balok()
        Balok balok4 = new Balok();
        balok4.setP(25);
        
        // (e) setter → set nilai t = 10 dari konstruktor Balok(20,35, 15)
        Balok balok5 = new Balok(20, 35, 15);
        balok5.setT(10);
        
        // (f) panggil method info dari konstruktor Balok ()
        balok1.info();
        
        // (g) panggil method info dari konstruktor Balok(20,35, 15)
        balok2.info();
    }
}

//class Balok
class Balok extends PersegiPanjang{
    int t;
    
    public Balok() {
        // (h) berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass persegi panjang serta tinggi=15
        super();
        this.t = 15;
    }
    
    public Balok(int p, int l, int t) {
        // (i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass persegi panjang t t;
        super(p, l);
        this.t = t;
    }
    
    // (j) buat getter setter class balok
    public int getT() {
        return t;
    }
    
    public void setT(int t) {
        this.t = t;
    }
    
    public int volume(){
        // (k) fungsi untuk menghitung volume balok : p x l x t
        return super.luas() * t;
    }
    
    public void info(){
        // (l)fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok 
        System.out.println("Panjang: " + super.getP());
        System.out.println("Lebar: " + super.getL());
        System.out.println("Tinggi: " + t);
        System.out.println("Luas: " + super.luas());
        System.out.println("Volume: " + volume());
    }
}

// class Persegi Panjang
class PersegiPanjang {
    int p, l;

    public PersegiPanjang() {
        // berisi nilai panjang=30 & lebar=20
        this.p = 30;
        this.l = 20;
    }

    public PersegiPanjang(int p, int l) {
        // berisi nilai pada saat runtime p <- p, l <- l
        this.p = p;
        this.l = l;
    }

    // buat getter setter class Persegi Panjang
    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int luas() {
        // fungsi untuk menghitung luas persegi panjang: p x l
        return p * l;
    }

    public int keliling() {
        // fungsi untuk menghitung keliling persegi panjang: 2x (p+l)
        return 2 * (p + l);
    }
}
