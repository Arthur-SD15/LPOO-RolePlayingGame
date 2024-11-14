/*
 *  Criamos a classe Mago que é uma subclasse de Personagem, herdando os atributos e métodos de personagem.
 *  Essa classe é responsável por criar um personagem do tipo Mago.
 *  Dentro dessa classe, temos o construtor da classe Mago que recebe os valores de saúde, força, destreza e a arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de personagem.
*/
public class Mago extends Personagem{
    public Mago(double saude, double forca, double destreza, ArmaMago arma){
        super("Mago", saude, forca, destreza, arma);
    }
}
