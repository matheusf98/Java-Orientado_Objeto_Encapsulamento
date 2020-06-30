public class Conta{
	
	private double Saldo;
	private int Agencia;
	private int Numero;
	private Cliente Titular;
	private static int Total;

	public Conta(int Agencia, int Numero) {
		Total++;
		System.out.println("Total De Contas Abertas: " + Total);
		this.Agencia = Agencia;
		this.Numero = Numero;
	}
	
	void deposita(double valor) {
		this.Saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.Saldo >= valor) {
			this.Saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.Saldo;
	}
	
	public int getNumero() {
		return this.Numero;
	}
	
	public void setNumero(int numero){
		if(numero <= 0) {
			System.out.println("Não Foi Possivel Cadastrar Seu Numero");
			return;
		}
		this.Numero = numero;
	}
	
	public int getAgencia() {
		return this.Agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não Foi Possivel Cadastrar Sua Agencia");
			return;
		}
		Agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		Titular = titular;
	}
	
	public Cliente getTitular() {
		return Titular;
	}
	
	public static int getTotal() {
		return Conta.Total;
	}
}