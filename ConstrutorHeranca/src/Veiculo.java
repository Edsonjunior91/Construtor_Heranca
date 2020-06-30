
public class Veiculo {
	protected String marca;
	
//	public Veiculo() {
//		super();
//		System.out.println("Veiculo ()");// na classe pai quando você chama o super() você quer que o 
//	}	                                 // construtor de object seja chamado nesse caso não é preciso
		                                 // especificar super() porque o java sabe que ele tem que chamar
		                                 // o construtor da classe
	public Veiculo (String marca) {
		this.marca = marca;
		System.out.println("Veiculo(String)");
	}
}
