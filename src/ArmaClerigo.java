/*
 * Criamos uma classe abstrata ArmaClerigo que é uma subclasse de Arma, herdando os atributos de arma. 
 * Essa classe é responsável por criar uma ArmaClerigo do tipo Arma.
 * Dentro dessa classe, temos o construtor da classe ArmaClerigo que recebe o nome e o modificador de dano.
 * Utilizamos o construtor da superclasse para inicializar os atributos de arma.
*/
public abstract class ArmaClerigo extends Arma{
    public ArmaClerigo(String nome, double modDano){
        super(nome, modDano);
    }
}
