
public class Veiculo {
	protected String marca;
	
//	public Veiculo() {
//		super();
//		System.out.println("Veiculo ()");// na classe pai quando voc� chama o super() voc� quer que o 
//	}	                                 // construtor de object seja chamado nesse caso n�o � preciso
		                                 // especificar super() porque o java sabe que ele tem que chamar
		                                 // o construtor da classe
	public Veiculo (String marca) {
		this.marca = marca;
		System.out.println("Veiculo(String)");
	}
}
