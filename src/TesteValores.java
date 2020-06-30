
public class TesteValores {
	public static void main(String[] args) {
		Conta conta = new Conta(7125, 5004);
		
		System.out.println("Agencia: " + conta.getAgencia());
		
		Conta conta1 = new Conta(7125, 5004);
		
		System.out.println("Agencia: " + conta1.getAgencia());
	}
}
