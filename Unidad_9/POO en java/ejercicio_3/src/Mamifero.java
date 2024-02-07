public class Mamifero extends Animal {
    
    private String Sexo;

    Mamifero(String nombre){
        super(nombre);
    }

    // Reproducirse
    public boolean Reproducirse(Mamifero Otro){
        if (this.getSexo() != Otro.getSexo() && this.getClass().equals(Otro.getClass())) {
            return true;
        }
        return false;
    }


    /// devuelve el sexo o la indica ///
    public void setSexo(String sexo){
        Sexo = sexo;
    }

    public String getSexo(){
        return Sexo;
    }
}
