/*
 *  Criamos a classe Paladino que é uma subclasse de Personagem, herdando os atributos e métodos de personagem.
 *  Essa classe é responsável por criar um personagem do tipo Paladino.
 *  Dentro dessa classe, temos o construtor da classe Paladino que recebe os valores de saúde, força, destreza e a arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de personagem.
*/
public class Paladino extends Personagem {
    public Paladino(double saude, double forca, double destreza, ArmaPaladino arma) {
        super("Paladino", saude, forca, destreza, arma);
    }
}
