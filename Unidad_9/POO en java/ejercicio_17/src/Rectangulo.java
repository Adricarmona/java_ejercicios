public class Rectangulo {
    private static int rectanguloCreados;

    private String rectangulo = "";
    Rectangulo(int n1, int n2){
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                setRectangulo("*");
            }
            setRectangulo("\n");
        }
        setRectanguloCreados();
    }
    
    public void setRectangulo(String rectangulo) {
        this.rectangulo += rectangulo;
    }
    public String getRectangulo() {
        return rectangulo;
    }

    @Override
    public String toString() {
        return rectangulo ;
    }

    public static int getRectangulosCreados() {
        return rectanguloCreados;
    }

    public static void setRectanguloCreados() {
        Rectangulo.rectanguloCreados++;
    }
}
