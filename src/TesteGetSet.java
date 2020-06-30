
public class TesteGetSet {
	public static void main(String[] args) {
		Conta contaUsuario = new Conta(7154, 5004);
		
		Cliente Matheus = new Cliente();
		Matheus.setNome("Matheus Ferreira");
		
		contaUsuario.setTitular(Matheus);
		
		System.out.println("Usuario da Conta " + contaUsuario.getTitular().getNome());
	}
}