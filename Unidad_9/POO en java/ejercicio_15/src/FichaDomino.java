public class FichaDomino {
    private int ladoIzquierda, ladoDerecho;
    
    FichaDomino(int n1, int n2){
        setladoIzquierda(n1);
        setladoDerecho(n2);
    }

    public void setladoIzquierda(int n){
        ladoIzquierda = n;
    }

    public void setladoDerecho(int n){
        ladoDerecho = n;
    }

    public int getladoIzquierda(){
        return ladoIzquierda;
    }

    public int getladoDerecho(){
        return ladoDerecho;
    }

    public String voltea(){
        int tmp = getladoIzquierda();
        setladoIzquierda(getladoDerecho());
        setladoDerecho(tmp);
        return pintar();
    }

    public String pintar(){
        String frase;
        if (getladoIzquierda() == 0) {
            frase = "[" + " " + "|";
        } else {
            frase = "[" + getladoIzquierda() + "|";
        }

        if (getladoDerecho() == 0) {
            frase += " " + "]";
        } else {
            frase += getladoDerecho() + "]";
        }
        return frase;
    }

    public boolean encaja(FichaDomino f){
        if (getladoIzquierda() == f.getladoIzquierda()) {
            return true;
        }

        if (getladoDerecho() == f.getladoDerecho()) {
            return true;
        }

        if (getladoDerecho() == f.getladoIzquierda()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String frase;
        if (getladoIzquierda() == 0) {
            frase = "[" + " " + "|";
        } else {
            frase = "[" + getladoIzquierda() + "|";
        }

        if (getladoDerecho() == 0) {
            frase += " " + "]";
        } else {
            frase += getladoDerecho() + "]";
        }
        return frase;
    }
}
