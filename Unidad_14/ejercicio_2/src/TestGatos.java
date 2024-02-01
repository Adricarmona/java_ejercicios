public class TestGatos {
    public static void main(String[] args) {
        Gato mujerGato = new Gato(Sexo.HEMBRA);
        Gato hombreGato = new Gato(Sexo.MACHO);
        try {
            hombreGato.apareaCon(mujerGato);
            //hombreGato.apareaCon(hombreGato);
            System.out.println("funciona");
        } catch (ExcepcionApareamientoImposible EAI) {
            System.out.println("EAI:"+EAI);
        }
    }
}

