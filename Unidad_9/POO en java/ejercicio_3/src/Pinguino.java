public class Pinguino  extends Ave{

    Pinguino(String nombre) {
        super(nombre);
    }

    @Override
    public void volar(){
        System.out.println("no puedo volar");
    }
}
