public class Linea {

    private Punto p1,p2;
    
    Linea(Punto p1, Punto p2){
        setP1(p1);
        setP2(p2);
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    
    @Override
    public String toString() {
        return "Línea formada por los puntos ("+getP1().getN1()+", "+getP1().getN2()+") y ("+getP2().getN1()+", "+getP2().getN2()+")";
    }
}
