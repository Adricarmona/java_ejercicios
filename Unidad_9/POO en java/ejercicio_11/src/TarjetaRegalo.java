public class TarjetaRegalo {
    private float saldo;
    private int codigo;

    TarjetaRegalo(float dinero){
        saldo = dinero;
        codigo = (int)(Math.random()*99999 + 1);
    }

    public void gasta(double d){
        if ((saldo - d) >= 0) {
            saldo -= d;
        } else {
            System.out.println("No tiene suficiente saldo para gastar "+String.format("%.2f", d)+"€");
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo targeta){
        return new TarjetaRegalo(saldo + targeta.saldo);
    }

    public String toString() {
        return "Tarjeta nº"+String.format("%5d", codigo)+" - Saldo "+String.format("%.2f", saldo)+"€";
    }
}
