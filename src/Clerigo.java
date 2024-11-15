/*
 *  Criamos a classe Clerigo que é uma subclasse de Personagem, herdando os atributos e métodos de personagem.
 *  Essa classe é responsável por criar um personagem do tipo Clerigo.
 *  Dentro dessa classe, temos o construtor da classe Clerigo que recebe os valores de saúde, força, destreza e a arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de personagem.
*/
public class Clerigo extends Personagem{
    public Clerigo(double saude, double forca, double destreza, ArmaClerigo arma){
        super("Clérigo", saude, forca, destreza, arma);
    }
}
