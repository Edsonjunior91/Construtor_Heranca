
public class Aplicacao {

	public static void main(String[] args) {
		Carro c = new Carro("Ferrari"); // o Java constroi na memoria heap um objeto da classe carro
							   // na hora que esse objeto é construido o construtor de carro é chamado
							   // Quando instancia um carro primeiro é chamado construtor
							   // de veiculo e depois foi chamado construtor de carro
							   // quando voce constroi um carro ele primeiro tem que construir um 
							   // veiculo, só que pra construir um veiculo precisa construir um
		                       // Object
		                       // o Java sempre chama o construtor que tem os mesmos parametros
	}

}
