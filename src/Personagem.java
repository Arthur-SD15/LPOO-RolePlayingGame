/*
 * Importamos as classes necessárias, sendo elas: BigDecimal e RoundingMode.
 * BigDecimal: classe que permite trabalhar com números decimais com precisão.
 * RoundingMode: classe que permite trabalhar com arredondamento dos números decimais.
*/
import java.math.BigDecimal;
import java.math.RoundingMode;

// Classe abstrata Personagem.
public abstract class Personagem{
    // Atributos da classe Personagem.
    private String nomeTipo;
    private double saude;
    private double forca;
    private double destreza;
    private Arma arma;

    // Construtor da classe Personagem.
    public Personagem(String nomeTipo, double saude, double forca, double destreza, Arma arma){
        this.nomeTipo = nomeTipo;
        this.saude = saude;
        this.forca = forca;
        this.destreza = destreza;
        this.arma = arma;
    }

    // Métodos getters e setters da classe Personagem.
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

    /*
     * Método printStatus que imprime o status do personagem.
     * Para imprimir o status, com as infomrações necessárias, utilizamos os métodos getters para melhor encapsulamento, já que esses atributos são privados.
    */
    public void printStatus(){
        if(estaMorto()){
            System.out.printf(getNomeTipo() + " [Morto, Forca: %.1f, Destreza: %.1f, %s]\n", getForca(), getDestreza(), getArma().getNome());
        } else {
            System.out.printf(getNomeTipo() + " [Saude: %.1f, Forca: %.1f, Destreza: %.1f, %s]\n", getSaude(), getForca(), getDestreza(), getArma().getNome());
        }
    }

    /*
     * Método atacar que ataca um personagem, o personagem que ira sofrer o ataque é passado como parâmetro.
     * Para o ataque ocorrer, existem algumas condições:
     * - Se o personagem atacante estiver morto, ele não consegue atacar.
     * - Se o personagem defensor estiver morto, ele não pode ser atacado pois já esta morto.
     * 
     * - Caso ambos os personagens estejam vivos, o ataque ocorre, com as seguintes condições:
     *   - Se a destreza do personagem atacante for maior que a destreza do personagem defensor, o ataque é efetivo.
     *   - Se a destreza do personagem atacante for menor que a destreza do personagem defensor, o ataque é inefetivo e toma um contra ataque.
     *   - Se a destreza do personagem atacante for igual a destreza do personagem defensor, o ataque é defendido.
     * 
     * Para imprimir, as infomrações necessárias, sobre o ataque utilizamos os métodos getters para melhor encapsulamento, já que esses atributos são privados.
     * Também utilizamos os métodos getters, nas condições, que se fazem necessário o valor de destreza do personagem.
    */
    public void atacar(Personagem b){
        if(estaMorto()){
            System.out.println("O " + getNomeTipo() + " não consegue atacar, pois está morto e não pode atacar.");
            return;
        } else {
            System.out.println("O " + getNomeTipo() + " ataca o " + b.getNomeTipo() + " com " + getArma().getNome() + ".");
        }

        if(b.estaMorto()){
            System.out.println("Pare! O " + b.getNomeTipo() + " já está morto!");
            return;
        }

        if(getDestreza() > b.getDestreza()){
            double auxDanoSofrido = calculaDano();
            System.out.printf("O ataque foi efetivo com %.1f pontos de dano!\n", auxDanoSofrido);
            b.receberDano(auxDanoSofrido);
        } else if (getDestreza() < b.getDestreza()){
            double auxDanoSofrido = b.calculaDano();
            System.out.printf("O ataque foi inefetivo e revidado com %.1f pontos de dano!\n", auxDanoSofrido);
            receberDano(auxDanoSofrido);
        } else {
            System.out.println("O ataque foi defendido, ninguem se machucou!");
        }
    }    

    /*
     * Método privado calculaDano que calcula o dano do personagem.
     * O dano é calculado multiplicando a força do personagem pelo modificador de dano da arma.
     * Utilizamos os métodos getters para melhor encapsulamento, já que esses atributos de força e modificador são privados.
     * Instanciamos um objeto BigDecimal com o valor do dano e após isso arredondamos para cima com o método setScale, para que possua apenas 1 casa decimal.
    */
    private double calculaDano(){
        BigDecimal dano = new BigDecimal(getForca() * getArma().getModDano());
        return dano.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

    /*
     * Método privado receberDano que calcula o dano recebido.
     * Recebe um valor de pontosDano e retorna um double, que é a saúde subtraída pelos pontosDano.
    */
    private double receberDano(double pontosDano){
        this.saude -= pontosDano;
        return this.saude;
    }

    /*
     * Método privado estaMorto que verifica se o personagem está morto.
     * Se a saúde do personagem for menor que 1, ele está morto.
     * Utilizamos o método getter para melhor encapsulamento, já que esse atributo de saúde é privado.
     * Caso ele esteja morto, o método retorna true, caso contrário, retorna false.
    */
    private boolean estaMorto() {
        return getSaude() < 1;
    }
}
