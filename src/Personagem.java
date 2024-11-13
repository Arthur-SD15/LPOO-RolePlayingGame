import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Personagem{
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    public String getNomeTipo(){
        return this.nomeTipo;
    }

    public double getSaude(){
        return this.saude;
    }

    public double getForca(){
        return this.forca;
    }

    public double getDestreza(){
        return this.destreza;
    }

    public Arma getArma(){
        return this.arma;
    }

    public void setNomeTipo(String nomeTipo){
        this.nomeTipo = nomeTipo;
    }

    public void setSaude(double saude){
        this.saude = saude;
    }

    public void setForca(double forca){
        this.forca = forca;
    }

    public void setDestreza(double destreza){
        this.destreza = destreza;
    }

    public void setArma(Arma arma){
        this.arma = arma;
    }

    // testar, morto e vivo
    public void printStatus(){
        if(estaMorto()){
            System.out.printf(getNomeTipo() + " [Saúde: %.1f, Força: %.1f, Destreza: %.1f, %s]\n", getSaude(), getForca(), getDestreza(), getArma());
        } else {
            System.out.printf(getNomeTipo() + " [Morreu, Força: %.1f, Destreza: %.1f, %s]\n", getForca(), getDestreza(), getArma());
        }
    }

    public void atacar(Personagem b){
        if(estaMorto()){
            System.out.println("O " + getNomeTipo() + " não consegue atacar, pois está morto e não pode atacar.");
            return;
        } else {
            System.out.println("O " + getNomeTipo() + " ataca o " + b.getNomeTipo() + " com " + getArma().getNome() + ".");
        }

        if(b.estaMorto()){
            System.err.println("Pare! O " + b.getNomeTipo() + " já está morto!");
            return;
        }
    }

    // testar, dano
    private double calculaDano(){
        BigDecimal dano = new BigDecimal(getForca() * getArma().getModDano());
        return dano.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    public double receberDano(double pontosDano){
        this.saude -= pontosDano;
        return this.saude;
    }

    private boolean estaMorto() {
        return this.saude < 1;
    }
}
