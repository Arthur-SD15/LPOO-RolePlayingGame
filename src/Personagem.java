public abstract class Personagem{
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;

    public Personagem(String nomeTipo, double saude, double forca, double destreza){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
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