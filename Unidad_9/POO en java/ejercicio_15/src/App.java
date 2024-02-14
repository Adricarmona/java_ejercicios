public class App {
    public static void main(String[] args) throws Exception {
        FichaDomino[] listaFichas = new FichaDomino[8];

        for(int i = 0; i< 8; i++){
            listaFichas[i] =  new FichaDomino((int)(Math.random() * 7), (int)(Math.random() * 7));
        }

        for (int i = 0; i < listaFichas.length-1; i++) {
            while (listaFichas[i].getladoDerecho() != listaFichas[i+1].getladoIzquierda()) {
                listaFichas[i+1].setladoIzquierda((int)(Math.random() * 7));
                listaFichas[i+1].setladoDerecho((int)(Math.random() * 7));
            }
            System.out.print(listaFichas[i]);
        }
    }
}
