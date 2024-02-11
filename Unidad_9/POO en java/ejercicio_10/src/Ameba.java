public class Ameba {
    private int peso;

    public Ameba() {
        peso = 3;
    }

    public int getPeso() {
        return peso;
    }

    public void come(int comida){
        if (comida > 0) {
            peso += comida - 1;
        }
    }

    public void come(Ameba bicho){
        peso += bicho.peso - 1;
        bicho.peso = 0;
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso "+peso+" microgramos.";
    }
}
