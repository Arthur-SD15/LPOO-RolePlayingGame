// Classe abstrata Arma.
public abstract class Arma{
    // Atributos da classe Arma.
    private String nome;
    private double modDano;

    // Construtor da classe Arma.
    public Arma(String nome, double modDano){
        this.nome = nome;
        this.modDano = modDano;
    }

    // Métodos getters da classe Arma.
    public String getNome(){
        return this.nome;
    }

    public double getModDano(){
        return this.modDano;
    }
}
