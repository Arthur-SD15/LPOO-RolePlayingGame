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

    public void printStatus(){
    }

    public void atacar(Personagem b){
    }

    private double calculaDano(){
        return 0;
    }

    public double receberDano(double pontosDano){
        this.saude -= pontosDano;
        return this.saude;
    }

    private boolean estaMorto() {
        return this.saude < 1;
    }
}
