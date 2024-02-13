public class CuentaCorriente {
    private long saldo, codCuenta;
    
    CuentaCorriente(){
        setSaldo(0);
        setCodCuenta();
    }

    CuentaCorriente(long d){
        setSaldo(d);
        setCodCuenta();
    }

    public void setSaldo(long d){
        saldo += d;
    }

    public long getSaldo(){
        return saldo;
    }

    public void setCodCuenta(){
        codCuenta = (long)(Math.random() * 99999) + (long)(Math.random() * 99999);
    }

    public long getCodCuenta(){
        return codCuenta;
    }

    public void ingreso(long d){
        setSaldo(d);
    }

    public void cargo(long d){
        setSaldo(-d);
    }

    public void transferencia(CuentaCorriente c, long d){
        setSaldo(-d);
        c.setSaldo(d);
    }

    @Override
    public String toString() {
        return "Número de cta: "+getCodCuenta()+" Saldo: "+getSaldo()+"€";
    }
}
