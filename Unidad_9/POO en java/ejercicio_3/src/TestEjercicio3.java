public class TestEjercicio3 {
    public static void main(String[] args) throws Exception {
        Perro buldog = new Perro("komanche");
        Perro borderColey = new Perro("Colegiala");
        Gato naranja = new Gato("Putero");
        buldog.ladra();
        buldog.setEdad(20);
        borderColey.setEdad(16);
        System.out.println(buldog.getEdad());
        System.out.println(borderColey.getEdad());
        System.out.println(buldog.getNombre());
        System.out.println(borderColey.getNombre());
        buldog.setSexo("Macho");
        borderColey.setSexo("Hembra");
        naranja.setSexo("Hembra");
        System.out.println(buldog.getSexo());
        System.out.println(borderColey.getSexo());
        System.out.println(buldog.Reproducirse(borderColey));
        System.out.println(buldog.Reproducirse(naranja));

        Pinguino manolo = new Pinguino("manolo");
        manolo.volar();
        Canario juan = new Canario("JUAN");
        juan.volar();

        Lagarto paco = new Lagarto("null");
        paco.reptar();
    }
}
