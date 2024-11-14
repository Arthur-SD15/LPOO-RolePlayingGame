/*
 *  Criamos a classe Maca que é uma subclasse de ArmaClerigo, herdando os atributos de ArmaClerigo.
 *  Essa classe é responsável por criar uma Arma de Clerigo do tipo Maca.
 *  Dentro dessa classe, temos o construtor da classe Maca que recebe o nome e o dano da arma.
 *  Utilizamos o construtor da superclasse para inicializar os atributos de ArmaClerigo.
*/
public class Maca extends ArmaClerigo {
    public Maca(){
        super("Maça", 0.4);
    }
}
